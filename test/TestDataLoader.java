import java.util.Random;

import model.Game;
import model.Native;
import model.Planet;
import model.User;
import model.jpa.JpaGameRepo;
import model.jpa.JpaPlanetRepo;
import model.jpa.JpaPlayerRepo;
import model.jpa.JpaUserRepo;
import play.Logger;
import play.jobs.Job;
import play.jobs.OnApplicationStart;
import play.modules.spring.Spring;


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
		User kirk = users.createUser("James", "Kirk", "captainslog@mailinator.com").save();
		Game testGame = games.createGame(kirk).save();
		
		Random random = new Random(123456789);
		
		for(int i = 0; i < testGame.getPlanetLimit(); i++) {
			testGame.addPlanet(generateRandomPlanet(random, PlanetNames, testGame));
		}
		testGame.save();		
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
		if(luck > 95) {
			natives = Native.BOVINOIDS;
		} else if(luck > 75) {
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
		} else if(luck > 65) {
			natives = Native.AMORPHOUS;
		}
		
		Logger.debug("Planet " + name + " with tempurature " + temp + " at location " + x + "," + y + " now exists with " + natives + " natives on it.");
		
		Planet planet = planets.createPlanet(name, temp, x, y, natives).save();
		
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
		
		planet.setNativesPopulation(nativesPop);
		planet.setNativesHappiness(80);
		
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
	
}

