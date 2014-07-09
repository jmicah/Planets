import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import model.Game;
import model.Government;
import model.Native;
import model.Planet;
import model.Player;
import model.RaceType;
import model.User;
import model.jpa.JpaGameRepo;
import model.jpa.JpaPlanetRepo;
import model.jpa.JpaPlayerRepo;
import model.jpa.JpaUserRepo;
import play.Logger;
import play.jobs.Job;
import play.jobs.OnApplicationStart;
import play.modules.spring.Spring;
import utilities.MapTools;


@OnApplicationStart
public class TestDataLoader extends Job {

	public static JpaUserRepo users = Spring.getBeanOfType(JpaUserRepo.class);
	public static JpaGameRepo games = Spring.getBeanOfType(JpaGameRepo.class);
	public static JpaPlayerRepo players = Spring.getBeanOfType(JpaPlayerRepo.class);
	public static JpaPlanetRepo planets = Spring.getBeanOfType(JpaPlanetRepo.class);
	
	/**
	 * The main method for creating the test data. 
	 */
	@Override
	public void doJob() {
		Logger.info("Making Test Game Data");
		long startTime = new Date().getTime();
		User aggiejack = users.createUser("Jack", "Daniels", "aggiejack@mailinator.com").save();
		
		Game testGame = games.createGame(aggiejack).save();		
		
		Logger.info("Creating Users.");
		long taskStart = new Date().getTime();
		for(RaceType race : RaceType.values()) {
			int i = race.getOrder()-1;
			User user = users.createUser(testUsers[i].firstName, testUsers[i].lastName, testUsers[i].email).save();
			Player player = players.createPlayer(race, user).save();
			Logger.info("Player " + player.getUser().getFirstName() + " " + player.getUser().getLastName() + ": " + player.getRaceType()+ " created.");
			testGame.addPlayer(player);
			testGame.save();
		}
		long taskEnd = new Date().getTime();
		Logger.info("Users created in " + (taskEnd-taskStart)/1000 + " seconds.");
		
		Random random = new Random(123456789);
		
		Logger.info("Generating Planets.");
		taskStart = new Date().getTime();
		for(int i = 0; i < testGame.getPlanetLimit(); i++) {
			testGame.addPlanet(generateRandomPlanet(random, PlanetNames, testGame));
			Logger.debug("Total Planets: " + (i+1));
		}
		taskEnd = new Date().getTime();
		Logger.info("Planets generated in " + (taskEnd-taskStart)/1000 + " seconds.");
		
		Logger.info("Making Planet Connections.");
		taskStart = new Date().getTime();
		setConnections(testGame);		
		taskEnd = new Date().getTime();
		Logger.info("Connections made in " + (taskEnd-taskStart)/1000 + " seconds.");
		
		testGame.save();
		
		Logger.info("Setting Home Worlds.");
		taskStart = new Date().getTime();
		setHomeWorldsDoubleCircle(random, testGame);
		taskEnd = new Date().getTime();
		Logger.info("Home Worlds set in " + (taskEnd-taskStart)/1000 + " seconds.");
		
		Logger.info("Spreading Players.");
		taskStart = new Date().getTime();
		spreadPlayers(random, testGame);
		taskEnd = new Date().getTime();
		Logger.info("Players spread in " + (taskEnd-taskStart)/1000 + " seconds.");
				
		testGame.save();
		
		long endTime = new Date().getTime();
		Logger.info("Test Game Data finished in " + (endTime-startTime)/1000 + " seconds.");
	}
	
	/**
	 * Create planets
	 */
	public static Planet generateRandomPlanet(Random random, String[] listOfPlanetNames, Game game) {
		
		Logger.debug("Creating Planet");
		
		String name = listOfPlanetNames[random.nextInt(listOfPlanetNames.length-1)];
		while(game.findPlanetByName(name) != null)
			name = listOfPlanetNames[random.nextInt(listOfPlanetNames.length-1)];
		
		int temp = random.nextInt(100);
		int x = random.nextInt(game.getMapHeight());
		int y = random.nextInt(game.getMapWidth());
		
		Native natives = Native.NONE;
		int luck = random.nextInt(100);
		int nativeNum = random.nextInt(7);
		if(luck > 90) {
			natives = Native.BOVINOIDS;
		} else if(luck > 60) {
			switch(nativeNum) {
				case (1):
					natives = Native.INSECTOIDS;
					break;
				case (2):
					natives = Native.AVIANS;
					break;
				case (3):
					natives = Native.AMPHIBIANS;
					break;
				case (4):
					natives = Native.GHIPSOLDALS;
					break;
				case (5):
					natives = Native.HUMANOIDS;
					break;
				case (6):
					natives = Native.REPTILIANS;
					break;
				case (7):
					natives = Native.SILICONOIDS;
					break;
			}
		} else if(luck > 50) {
			natives = Native.AMORPHOUS;
		}
		
		int gov = 0;
		if(natives != Native.NONE) {
			gov = random.nextInt(8) + 1;
		}
		
		Logger.debug("Planet " + name + " with tempurature " + temp + " at location " + x + "," + y + " now exists with " + natives + " natives on it.");
		
		Planet planet = planets.createPlanet(name, temp, x, y, natives).save();
		
		boolean isGood = goodLocation(planet, game);
		int tempSeed = 500;
		while (!isGood) {
			tempSeed++;
			Random tempRandom = new Random(tempSeed);
			planet.setCoordinates(tempRandom.nextInt(game.getMapHeight()), tempRandom.nextInt(game.getMapWidth()));
			planet.save();
			Logger.debug("Bad Location. Trying again at " + planet.getCoordinates().get("x") + ", " + planet.getCoordinates().get("y") + " with seed " + tempSeed + ".");
			isGood = goodLocation(planet, game);
		}
		
		int nativesPop = random.nextInt(999000) + 1000;
		
		int molyGrnd = random.nextInt(10000);
		int molySurf = random.nextInt(300);
		int molyRate = random.nextInt(100);
		
		int durGrnd = random.nextInt(10000);
		int durSurf = random.nextInt(300);
		int durRate = random.nextInt(100);
		
		int tritGrnd = random.nextInt(10000);
		int tritSurf = random.nextInt(300);
		int tritRate = random.nextInt(100);
		
		int neutGrnd = random.nextInt(10000);
		int neutSurf = random.nextInt(300);
		int neutRate = random.nextInt(100);
		
		if(natives != Native.NONE) {
			planet.setNativesPopulation(nativesPop);
			planet.setNativesHappiness(80);
			planet.setNativesGovernment(findByLevel(gov));
		}
		
		planet.setMolybdenumInGround(molyGrnd);
		planet.setMolybdenumOnSurface(molySurf);
		planet.setMolybdenumRate(molyRate);
		
		planet.setDuraniumInGround(durGrnd);
		planet.setDuraniumOnSurface(durSurf);
		planet.setDuraniumRate(durRate);
		
		planet.setTritaniumInGround(tritGrnd);
		planet.setTritaniumOnSurface(tritSurf);
		planet.setTritaniumRate(tritRate);
		
		planet.setNeutroniumInGround(neutGrnd);
		planet.setNeutroniumOnSurface(neutSurf);
		planet.setNeutroniumRate(neutRate);
		
		planet.save();
		
		return planet;
	}
	
	public static Government findByLevel(int level) {
		for(Government government : Government.values())
			if(level == government.getLevel())
				return government;
		
		return null;
	}
	
	public static void setConnections(Game game) {
		for(Planet origin : game.getPlanets()) {
			double warpRadius = 6561;
			double gravRadius= 26244;
			for(Planet destination : game.getPlanets()) {
				// Get Warp 9 connections
				if(MapTools.isWithinRange(
						destination.getCoordinates().get("x"), 
						destination.getCoordinates().get("y"), 
						origin.getCoordinates().get("x"), 
						origin.getCoordinates().get("y"), 
						warpRadius) && origin != destination) {
					origin.addConnectingPlanet(destination);
				}
				// Get Gravatonic Warp 9 connections
				if(MapTools.isWithinRange(
						destination.getCoordinates().get("x"), 
						destination.getCoordinates().get("y"), 
						origin.getCoordinates().get("x"), 
						origin.getCoordinates().get("y"), 
						gravRadius) && origin != destination) {
					origin.addConnectingGravatonicPlanet(destination);
				}
				// Get Jump connections
				if(MapTools.isWithinJumpRange(
						destination.getCoordinates().get("x"), 
						destination.getCoordinates().get("y"), 
						origin.getCoordinates().get("x"), 
						origin.getCoordinates().get("y")) && origin != destination) {
					origin.addConnectingJumpPlanet(destination);
				}
			}
			origin.save();
		}
		
	}
	
	public static boolean goodLocation(Planet planet, Game game){
		double minDis = 900;//361;
		double clusterDis = 6561;
		double generalDis = 122500;
		
		int c = 0;
		int g = 0;			
			for(Planet destination : game.getPlanets()) {
				// Check Minimum Distance. There should be 0.
				if(MapTools.isWithinRange(
						destination.getCoordinates().get("x"), 
						destination.getCoordinates().get("y"), 
						planet.getCoordinates().get("x"), 
						planet.getCoordinates().get("y"), 
						minDis) && planet != destination) {
					Logger.debug("Too close.");
					return false;
				}
				// Check cluster. There should be no more than 4 connections.
				if(MapTools.isWithinRange(
						destination.getCoordinates().get("x"), 
						destination.getCoordinates().get("y"), 
						planet.getCoordinates().get("x"), 
						planet.getCoordinates().get("y"), 
						clusterDis) && planet != destination) {
					c++;
				}
				// Check general planet density. There should be no more than 55 planets in a 350ly radius.
				if(MapTools.isWithinRange(
						destination.getCoordinates().get("x"), 
						destination.getCoordinates().get("y"), 
						planet.getCoordinates().get("x"), 
						planet.getCoordinates().get("y"), 
						generalDis) && planet != destination) {
					g++;
				}
			}
			if (c > 4 || g > 55) {
				Logger.debug("Planet " + planet.getId() + ": " + planet.getName() + " is bad with " + c + " connections and " + g + " planets nearby.");
				return false;
			}
		Logger.debug("Planet " + planet.getId() + ": " + planet.getName() + " is good with " + c + " connections and " + g + " planets nearby.");
		return true;
	}
	
	public void setHomeWorldsDoubleCircle(Random random, Game game) {
		List<Player> players = new ArrayList(game.getPlayers());
		Player player = null;
		
		//Position 1
		Logger.info("Num Players: " + players.size() + " vs " + game.getPlayers().size());
		player = players.get(random.nextInt(players.size()));
		setHomeWorld(1000, 1750, random, game, player);
		Logger.info("Set home world for " + player.getRaceType());
		players.remove(random.nextInt(players.size()));
		
		//Position 2
		Logger.info("Num Players: " + players.size() + " vs " + game.getPlayers().size());
		player = players.get(random.nextInt(players.size()));
		setHomeWorld(1520, 1520, random, game, player);	
		Logger.info("Set home world for " + player.getRaceType());
		players.remove(random.nextInt(players.size()));
		
		//Position 3
		Logger.info("Num Players: " + players.size() + " vs " + game.getPlayers().size());
		player = players.get(random.nextInt(players.size()));
		setHomeWorld(1750, 1000, random, game, player);	
		Logger.info("Set home world for " + player.getRaceType());
		players.remove(random.nextInt(players.size()));
		
		//Position 4
		Logger.info("Num Players: " + players.size() + " vs " + game.getPlayers().size());
		player = players.get(random.nextInt(players.size()));
		setHomeWorld(1520, 520, random, game, player);	
		Logger.info("Set home world for " + player.getRaceType());
		players.remove(random.nextInt(players.size()));
		
		//Position 5
		Logger.info("Num Players: " + players.size() + " vs " + game.getPlayers().size());
		player = players.get(random.nextInt(players.size()));
		setHomeWorld(1000, 250, random, game, player);	
		Logger.info("Set home world for " + player.getRaceType());
		players.remove(random.nextInt(players.size()));
		
		//Position 6
		Logger.info("Num Players: " + players.size() + " vs " + game.getPlayers().size());
		player = players.get(random.nextInt(players.size()));
		setHomeWorld(520, 520, random, game, player);	
		Logger.info("Set home world for " + player.getRaceType());
		players.remove(random.nextInt(players.size()));
		
		//Position 7
		Logger.info("Num Players: " + players.size() + " vs " + game.getPlayers().size());
		player = players.get(random.nextInt(players.size()));
		setHomeWorld(250, 1000, random, game, player);
		Logger.info("Set home world for " + player.getRaceType());
		players.remove(random.nextInt(players.size()));
		
		//Position 8
		Logger.info("Num Players: " + players.size() + " vs " + game.getPlayers().size());
		player = players.get(random.nextInt(players.size()));
		setHomeWorld(520, 1520, random, game, player);
		Logger.info("Set home world for " + player.getRaceType());
		players.remove(random.nextInt(players.size()));
		
		//Position 9
		Logger.info("Num Players: " + players.size() + " vs " + game.getPlayers().size());
		player = players.get(random.nextInt(players.size()));
		setHomeWorld(700, 1100, random, game, player);
		Logger.info("Set home world for " + player.getRaceType());
		players.remove(random.nextInt(players.size()));
		
		//Position 10
		Logger.info("Num Players: " + players.size() + " vs " + game.getPlayers().size());
		player = players.get(random.nextInt(players.size()));
		setHomeWorld(1300, 1100, random, game, player);
		Logger.info("Set home world for " + player.getRaceType());
		players.remove(random.nextInt(players.size()));
		
		//Position 11
		Logger.info("Num Players: " + players.size() + " vs " + game.getPlayers().size());
		player = players.get(random.nextInt(players.size()));
		setHomeWorld(1000, 700, random, game, player);
		Logger.info("Set home world for " + player.getRaceType());
		
	}
	
	public void setHomeWorld(int x, int y, Random random, Game game, Player player) {
		Planet homeworld = null;
		
		int temp = 50;
		double range = 14400;
		double distance = range;
		
		for (Planet planet : game.getPlanets()) {
			if (1 < planet.getConnectingPlanets().size() && planet.getConnectingPlanets().size() < 4) {
				if (MapTools.isWithinRange(planet.getCoordinates().get("x"), planet.getCoordinates().get("y"), x, y, range)) {				
					double tempDis = (Math.pow((planet.getCoordinates().get("x")-x),2) + Math.pow((planet.getCoordinates().get("y")-y),2));
					if(tempDis < distance)
						homeworld = planet;
				}
			}
		}
		
		if (homeworld!=null) {
			homeworld.setPlayer(player);
			if(player.getRaceType()==RaceType.CRYSTALS)
				temp = 100;
			basicHomeWorld(temp, homeworld);
		} else {
			Logger.info("Unable to find sutable planet near " + x +", " +y);
		}
	}
	
	public void basicHomeWorld(int temp, Planet planet){
		planet.setTemp(temp);
		planet.setColonistPopulation(10000);
		planet.setColonistsHappiness(100);
		planet.setColonistsTaxRate(0);
		planet.setNatives(null);
		planet.setNativesHappiness(0);
		planet.setNativesPopulation(0);
		planet.setNativesGovernment(null);
		planet.setNativesTaxRate(0);
		
		//Structures and Money
		planet.setDefenses(100);
		planet.setFactories(100);
		planet.setMines(100);
		planet.setSupplies(500);
		planet.setMoney(10000);
		
		//Minerals
		planet.setMolybdenumInGround(1000);
		planet.setMolybdenumOnSurface(300);
		planet.setMolybdenumRate(95);
		
		planet.setDuraniumInGround(1000);
		planet.setDuraniumOnSurface(300);
		planet.setDuraniumRate(15);
		
		planet.setTritaniumInGround(1000);
		planet.setTritaniumOnSurface(300);
		planet.setTritaniumRate(30);
		
		planet.setNeutroniumInGround(3000);
		planet.setNeutroniumOnSurface(500);
		planet.setNeutroniumRate(20);
		
		planet.save();		
	}
	
	public void spreadPlayers(Random random, Game game) {
		for (Player player : game.getPlayers()) {
			int numPlanets = random.nextInt(12) + 5;
			
			while(numPlanets > 0) {
				boolean found = false;
				for (Planet planet : game.getPlanets()) {					
					if (player == planet.getPlayer()) {						
						for (Planet conn :  planet.getConnectingPlanets()) {
							if (conn.getPlayer()==null && !found) {
								populatePlanet(random, conn, player);
								found = true;
								numPlanets--;
							}
						}
						if(!found) {
							for (Planet distantPlanet : game.getPlanets()) {
								if (MapTools.isWithinRange(distantPlanet.getCoordinates().get("x"), distantPlanet.getCoordinates().get("y"), planet.getCoordinates().get("x"), planet.getCoordinates().get("y"), 162) && !found) {
									populatePlanet(random, distantPlanet, player);
									numPlanets--;
									found = true;
								}
							}
						}
					}
				}
				if (!found) {
					Logger.info("There are no planets near by to populate.");
					break;	
				}
			}
		}
	}
	
	public void populatePlanet(Random random, Planet planet, Player player) {
		planet.setPlayer(player);
		planet.setColonistPopulation(random.nextInt(1000)+200);
		planet.setColonistsHappiness(random.nextInt(50)+50);
		planet.setColonistsTaxRate(0);
		
		planet.setSupplies(random.nextInt(200));
		planet.setMoney(random.nextInt(400));
		planet.setDefenses(random.nextInt(100));
		planet.setFactories(random.nextInt(150)+10);
		planet.setMines(random.nextInt(120)+20);
		
		planet.save();
	}
		
	private static final PersonArray[] testUsers = {
		new PersonArray("James", "Kirk", "kirk@mailinator.com"),
		new PersonArray("Jean", "Picard", "picard@mailinator.com"),
		new PersonArray("Sally", "Summers", "summers@mailinator.com"),
		new PersonArray("John", "Doe", "doe@mailinator.com"),
		new PersonArray("Billy", "Thorton", "thorton@mailinator.com"),
		new PersonArray("Claire", "Danes", "danes@mailinator.com"),
		new PersonArray("Reece", "Witherspoon", "witherspoon@mailinator.com"),
		new PersonArray("Bruce", "Willis", "willis@mailinator.com"),
		new PersonArray("George", "Martin", "martin@mailinator.com"),
		new PersonArray("John", "Candy", "candy@mailinator.com"),
		new PersonArray("Charlie", "Chaplin", "chaplin@mailinator.com")
	};
	
	private static final String[] PlanetNames = {
		"Abarat",
		"Abeir-Toril",
		"Abydos",
		"Aebrynis",
		"Aegis VII",
		"Aereth",
		"Alagaesia",
		"Albion",
		"Aldea",
		"Aldebaran",
		"Aldrazar",
		"All-World",
		"Altair IV",
		"Alternia",
		"Alvin",
		"Amber",
		"Amel",
		"Amtor",
		"Anarres",
		"Andalasia",
		"Angeous",
		"Antaloor",
		"Antar",
		"Arazon",
		"Arborea",
		"Arcadia",
		"Arcanis",
		"Archaeus",
		"Arda",
		"Argus",
		"Arrakis",
		"Asgard",
		"Ashan",
		"Athas",
		"Athena",
		"Atlantika",
		"Atlantis",
		"Atreia",
		"Auldurant",
		"Aurbis",
		"Aurelia",
		"Avalar",
		"Avalon",
		"Averoigne",
		"Avila",
		"Azeroth",
		"Ballybran",
		"Bara Magna",
		"Barsoom",
		"Bas-Lag",
		"Beachworld",
		"Bedrock",
		"Bellezza",
		"Belzagor",
		"Berge",
		"Big Planet",
		"Blackmoor",
		"Blest",
		"Blue Moon",
		"Boletaria",
		"Botany",
		"Bronson Alpha",
		"Bronson Beta",
		"Byss",
		"Caelestia",
		"Calaspia",
		"Camelot",
		"Camp Half-Blood",
		"Canopus III",
		"Caprica",
		"Cardassia IV",
		"Ceti Alpha V",
		"Charn",
		"Chiron",
		"Chthon",
		"Cittagazze",
		"City of Bones",
		"Cloud",
		"Corneria",
		"Corona",
		"Creation",
		"Crematoria",
		"Cronos",
		"Cuckoo Land",
		"Cybertron",
		"Cyteen",
		"Dalemark",
		"Damar",
		"Darkover",
		"Darwin IV",
		"Dave",
		"Davy Jones' Locker",
		"Deltora",
		"Demacia",
		"Demeter",
		"Demiplane of Dread",
		"Demonata",
		"Dereth",
		"Deucalion",
		"Dinotopia",
		"Discworld",
		"Disney",
		"Dominaria",
		"Dorvan V",
		"Dosadi",
		"Downbelow",
		"Dozaria",
		"Draenor",
		"Dragon's Egg",
		"Drakan",
		"Dreamlands",
		"Drool",
		"Druidia",
		"Duloc",
		"Dune",
		"Dying Earth",
		"Dyson Sphere",
		"Earth",
		"Earthsea",
		"Earwa",
		"Eberron",
		"Edenia",
		"Eidolon",
		"Ellesmera",
		"Elrios",
		"Ember",
		"Emelan",
		"Emm Luther",
		"Empire of the Celestial Dragons",
		"Encantadia",
		"Equestria",
		"Erde",
		"Erna",
		"Erythro",
		"Essos",
		"Eternia",
		"Etheria",
		"Ethra",
		"Everworld",
		"Fairyland",
		"Faltha",
		"Fantastica",
		"Far Away",
		"Far Far Away",
		"Fhloston Paradise",
		"Finisterre",
		"Fionavar",
		"Fiorinia 'Fury' 161",
		"Fire",
		"Forgotten Realms",
		"Freeport",
		"Freleng",
		"Fyrine IV",
		"G889",
		"Gaea",
		"Gaia",
		"Gallifrey",
		"Gamma X",
		"Gehenna",
		"Gensokyo",
		"Geonosis",
		"Gezeitenwelt",
		"Gielinor",
		"Globus Cassus",
		"Glorantha",
		"Glorianna",
		"Golarion",
		"Gondwane",
		"Gor",
		"Gordon",
		"Gorta",
		"Gran Pulse",
		"Green-sky",
		"Guk",
		"Gunsmoke",
		"Gurun",
		"Halla",
		"Halvmork",
		"He",
		"Hegira",
		"Helghan",
		"Helion Prime",
		"Helliconia",
		"Hesikos",
		"Hideaway",
		"Hiigara",
		"Hilys",
		"Hocotate",
		"Hoenn",
		"Hogwarts",
		"Htrae",
		"Hyborian Age",
		"Hydaelyn",
		"Hydros",
		"Hyrule",
		"Iberia",
		"Idris",
		"Imecka",
		"Inkworld",
		"Ireta",
		"Irk",
		"Ishtar",
		"Iszm",
		"Ithania",
		"Ivalice",
		"Jade Empire",
		"Johto",
		"Jorune",
		"Jund",
		"Jupiter Two",
		"K-PAX",
		"K'aresh",
		"Kalos",
		"Kamigawa",
		"Kanto",
		"Kelestia",
		"Kelewan",
		"Keltia",
		"Kerbal Space Program",
		"Kerona",
		"Kharak",
		"Khemti",
		"Khoros",
		"Klendathu",
		"Kobol",
		"Kobold",
		"Kohal",
		"Kolarus III",
		"Koozebane",
		"Korriban",
		"Krankor",
		"Kregen",
		"Kromagg Prime",
		"Krull",
		"Krynn",
		"Kukurikabu",
		"Kulthea",
		"Kyralia",
		"La Maetelle",
		"Lagash",
		"Lamarckia",
		"Land and Overland",
		"Land of Shadow",
		"Landover",
		"Layonara",
		"Leera",
		"Legend",
		"Lithia",
		"Little Big Planet",
		"Lodoss",
		"Lordran",
		"Lore",
		"Lumen",
		"LV-1201",
		"LV-223",
		"LV-426",
		"M6-1117",
		"Mad Lands",
		"Magic Moon",
		"Magnamund",
		"Magrathea",
		"Majipoor",
		"Malazan World",
		"Marak's World",
		"Marklar",
		"Medea",
		"Mejare",
		"Melancholia",
		"Melmac",
		"Metaluna",
		"Mid-World",
		"Midcyru",
		"Middle-earth",
		"MiddleGate",
		"Midkemia",
		"Midnight",
		"Minerva",
		"Mirkwood",
		"Miron",
		"Mirrodin",
		"Mistmantle Island",
		"Mithgar",
		"Mobius",
		"Mongo",
		"Moonacre Valley",
		"Mor-Tax",
		"Morthrai",
		"Muddle Earth",
		"Mushroom Kingdom",
		"Myrthana",
		"Mystara",
		"Naboo",
		"Nacre",
		"Naranjan",
		"Narnia",
		"Nehwon",
		"Netherrealm",
		"Neverland",
		"Neveryon",
		"New Earth",
		"New Eden",
		"New Europa",
		"New Terra",
		"New Texas",
		"Nexus",
		"Nidor",
		"Nihil",
		"Nirn",
		"Norrath",
		"Nosgoth",
		"Nyambe-Tanda",
		"Nyumbani",
		"Nyusigrube",
		"Oa the Living Planet",
		"Obelisk Planet",
		"Ocampa",
		"Oddworld",
		"Oerth",
		"Og",
		"Old World",
		"Omega",
		"Omicron Persei 8",
		"Onyx",
		"Oompa",
		"Ooo",
		"Optera",
		"Orbital",
		"Orience",
		"Ork",
		"Orthe",
		"Osiris IV",
		"Osten Ard",
		"Outworld",
		"Oz",
		"Pandarve",
		"Pandora",
		"Panem",
		"Parthorus",
		"Peaceland",
		"Pegana",
		"Pellucidar",
		"Pendor",
		"Perdide",
		"Pern",
		"Petaybee",
		"Pharagos",
		"Placet",
		"Planet Bob",
		"Planet Claire",
		"Planet X",
		"Plyuk",
		"Polyphemus",
		"Pop Star",
		"Prydain",
		"Prysmos",
		"Pylea",
		"Pyrrhia",
		"Pyrrus",
		"Qar'To",
		"Quahog",
		"Ragnarok",
		"Randland",
		"Rapture",
		"Ravnica",
		"Reach",
		"Regis III",
		"Remulak",
		"Requiem",
		"Resurgam",
		"Reverie",
		"Rigel IV",
		"Rimmerworld",
		"Ringworld",
		"Riverdale",
		"Riverworld",
		"Rocheworld",
		"Rondo",
		"Rosetta",
		"Rubanis",
		"Runeterra",
		"Rylos",
		"Sacred Realm",
		"Salt",
		"San RiCardo",
		"Sanctuary",
		"Sangre",
		"Sartorias-deles",
		"Sauria",
		"Scythae",
		"Secilia",
		"Seiren",
		"Septerra",
		"Sera",
		"Seven Realms",
		"Shandalar",
		"Shannara",
		"Shell World",
		"Shikasta",
		"Shora",
		"Shroob",
		"Sinnoh",
		"Skaro",
		"Skyrim",
		"Skyron",
		"Smoke Ring",
		"Socorro",
		"Solaris",
		"Soror",
		"Space",
		"Space Base Bullamanka",
		"Spaceball",
		"Spiderwick",
		"Spira",
		"Springfield",
		"Starbuck",
		"Stark",
		"Stormhold",
		"Strangereal",
		"Strata",
		"Stroggos",
		"Sushi",
		"Sylvarant",
		"Syrnia",
		"Takis",
		"Tallarn",
		"Tallon IV",
		"Tamriel",
		"Tanis",
		"Tarak",
		"Targ",
		"Tarth",
		"Tatooine",
		"Tekumel",
		"Tellene",
		"Tencton",
		"Terabithia",
		"Terca Lumireis",
		"Termina",
		"Terminus",
		"Terra de Santa Cruz",
		"Terra Obscura",
		"Tethe'alla",
		"Thalassa",
		"Thargoidia",
		"The Culture",
		"The Dream Archipelago",
		"The Edge Chronicles",
		"The Enchanted Forest",
		"The Final Empire",
		"The Four Lands",
		"The Hidden Land",
		"The Key of Destiny",
		"The Multiverse",
		"The Realm",
		"The Realm of Elderlings",
		"The Shivering Isles",
		"The Uncharted Territories",
		"The Wizarding World",
		"Thedas",
		"Thieves World",
		"Third Earth",
		"Thra",
		"Thribb",
		"Thundera",
		"Thyrion",
		"Tiamat",
		"Tir",
		"Tirol",
		"Titan",
		"Titania",
		"Toontown",
		"Tophet",
		"Torga IV",
		"Tormance",
		"Toroth",
		"Tortall",
		"Tralfamadore",
		"Tran",
		"Tranai",
		"Trantor",
		"Trisol",
		"Troas",
		"Tschai",
		"Twilight Realm",
		"Twinsun",
		"Tyree",
		"Tyria",
		"Underland",
		"Unnamed Planet",
		"Unova",
		"Urak",
		"Uresia",
		"Uriel",
		"Utopia",
		"Valdemar",
		"Valoran",
		"Vana'diel",
		"Vega",
		"Vekta",
		"Velgarth",
		"Vhilinyar",
		"Videlectrix",
		"Videssos",
		"Vinea",
		"Viriconium",
		"Vulcan",
		"Wait-Your-Turn",
		"Warhammer",
		"Water-O",
		"Westeros",
		"Weyard",
		"Whandoodleland",
		"Wheelie World",
		"Whoville",
		"Wilderlands",
		"Wonderland",
		"World of the Three Moons",
		"Worlorn",
		"Wormwood",
		"Xanadu",
		"Xanth",
		"Xcrawl",
		"Xen",
		"Xenon",
		"Xoroth",
		"Yekok",
		"Ynev",
		"Yrth",
		"Yugopotamia",
		"Zahir",
		"Zamonia",
		"ZanZarah",
		"Zarathustra",
		"Zarkon",
		"Zavron",
		"Zeelich",
		"Zeist",
		"Zendikar",
		"Zillikian",
		"Zimiamvia",
		"Zothique",
		"Zyrgon"		
	};
	
	private static class PersonArray {
		String firstName;
		String lastName;
		String email;
		
		PersonArray(String firstName, String lastName, String email) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
		}
	}
}

