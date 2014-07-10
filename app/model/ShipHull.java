package model;

public enum ShipHull {

	ANNIHILATION_CLASS_BATTLESHIP(6, 10, 10, 0, 1260, 320, 2910, 960, 10, 343, 340, 550, 910),
	ARIES_CLASS_TRANSPORT(2, 2, 0, 0, 260, 260, 226, 69, 5, 12, 14, 25, 65, ShipAbility.ADVANCED_REFINERY, null, null),
	ARKHAM_CLASS_FRIGATE(2, 6, 4, 0, 180, 90, 328, 160, 8, 43, 12, 67, 70),
	ARMORED_TRANSPORT(2, 1, 0, 0, 280, 520, 126, 68, 4, 17, 20, 23, 35),
	AUTOMA_CLASS_BASESHIP(6, 4, 0, 8, 1480, 200, 1258, 560, 9, 131, 242, 45, 690),
	B200_CLASS_PROBE(1, 2, 0, 0, 80, 15, 6, 30, 1, 17, 12, 7, 30, ShipAbility.HYPERDRIVE, null, null),
	B222_DESTROYER(2, 7, 3, 0, 160, 40, 265, 156, 5, 83, 62, 85, 230),
	B41_EXPLORER(2, 4, 0, 0, 270, 70, 38, 35, 2, 20, 6, 15, 40),
	BANSHEE_CLASS_DESTROYER(2, 10, 1, 0, 140, 60, 336, 120, 6, 47, 22, 53, 110),
	BIOCIDE_CLASS_CARRIER(6, 10, 0, 10, 1260, 320, 2810, 860, 9, 343, 340, 550, 910),
	BLOODFANG_CLASS_CARRIER(2, 8, 0, 5, 190, 80, 222, 220, 10, 61, 42, 133, 480),
	BOHEMIAN_CLASS_SURVEY_SHIP(2, 2, 0, 0, 180, 30, 70, 32, 3, 25, 15, 3, 40, ShipAbility.HEATER, null, null),
	BR4_CLASS_GUNSHIP(1, 5, 0, 0, 80, 40, 95, 55, 1, 17, 12, 35, 60, ShipAbility.CLOAK, ShipAbility.GRAVATONIC, null),
	BR5_KAYE_CLASS_TORPEDO_BOAT(2, 4, 1, 0, 110, 50, 50, 57, 3, 17, 32, 15, 70, ShipAbility.CLOAK, ShipAbility.GRAVATONIC, null),
	BRIGHT_HEART_CLASS_DESTROYER(1, 2, 4, 0, 90, 40, 122, 80, 3, 43, 22, 15, 140, ShipAbility.CLOAK, null, null),
	BRYNHILD_CLASS_ESCORT(1, 4, 0, 0, 140, 120, 162, 90, 7, 45, 5, 35, 100, ShipAbility.BIOSCAN, null, null),
	CATS_PAW_CLASS_DESTROYER(2, 4, 2, 0, 300, 300, 258, 120, 2, 61, 32, 5, 120),
	COBOL_CLASS_RESEARCH_CRUISER(2, 4, 2, 0, 450, 250, 286, 115, 4, 37, 32, 23, 150, ShipAbility.RAMSCOOP, null, null),
	CRYSTAL_THUNDER_CLASS_CARRIER(4, 6, 0, 8, 290, 80, 422, 320, 10, 61, 42, 233, 480),
	CYBERNAUT_CLASS_BASESHIP(3, 3, 0, 5, 980, 150, 558, 340, 4, 33, 292, 5, 250),
	CYGNUS_CLASS_DESTROYER(1, 4, 4, 0, 130, 50, 190, 90, 1, 50, 25, 7, 70),
	D19B_NEFARIOUS_CLASS_DESTROYER(1, 7, 0, 0, 160, 40, 265, 96, 6, 53, 32, 65, 180, ShipAbility.ADVANCED_GLORY_DEVICE, null, null),
	D3_THORN_CLASS_DESTROYER(2, 3, 5, 0, 250, 80, 222, 130, 5, 43, 32, 25, 110, ShipAbility.CLOAK, null, null),
	D7_COLDPAIN_CLASS_CRUISER(2, 4, 2, 0, 430, 100, 373, 175, 4, 71, 42, 63, 120, ShipAbility.CLOAK, null, null),
	D7A_PAINMAKER_CLASS_CRUISER(2, 4, 0, 0, 400, 320, 352, 170, 2, 81, 42, 43, 90),
	DARK_WING_CLASS_BATTLESHIP(2, 10, 8, 0, 390, 150, 910, 491, 10, 183, 170 ,110, 450, ShipAbility.ADVANCED_CLOAK, null, null),
	DEEP_SPACE_SCOUT(1, 4, 0, 0, 450 ,220, 10, 30, 3, 5, 5, 35, 190),
	DETH_SPECULA_CLASS_FRIGATE(2, 4, 6, 0, 180, 50, 240, 153, 6, 50, 30, 89, 280, ShipAbility.CLOAK, null, null),
	DIAMOND_FLAME_CLASS_BATTLESHIP(2, 10, 6, 0, 400, 110, 560, 499, 9, 93, 70, 350, 410),
	DIPLOMACY_CLASS_CRUISER(2, 6, 6, 0, 350, 95, 328, 205, 9, 63, 53, 89, 410),
	DWARFSTAR_CLASS_TRANSPORT(2, 6, 1, 0, 180, 220, 122, 110, 3, 43, 62, 15, 280, ShipAbility.CLOAK, null, null),
	EMERALD_CLASS_BATTLECRUISER(2, 8, 3, 0, 480, 510, 258, 180, 6, 71, 52, 93, 390),
	EROS_CLASS_RESEARCH_VESSEL(2, 2, 0, 0, 110, 30, 78, 35, 4, 3, 4, 33, 30, ShipAbility.COOLER, null, null),
	FALCON_CLASS_ESCORT(1, 2, 0, 0, 150, 120, 27, 30, 2, 5, 5, 12, 50, ShipAbility.HYPERDRIVE, null, null),
	FEARLESS_WING_CRUISER(2, 6, 1, 0, 360, 240, 300, 150, 5, 81, 52, 43, 180, ShipAbility.CLOAK, null, null),
	FIRECLOAD_CLASS_CRUISER(2, 6, 2, 0, 440, 60, 236, 120, 6, 77, 62, 114, 290, ShipAbility.CHUNNEL, null, null),
	GAURDIAN_CLASS_DESTROYER(1, 3, 6, 0, 120, 40, 275, 80, 4, 60, 10, 11, 180),
	GEMINI_CLASS_TRANSPORT(2, 4, 0, 1, 350, 400, 326, 140, 6, 42, 14, 48, 145),
	GOLEM_CLASS_BATTLESHIP(8, 6, 0, 10, 2000, 300, 1958, 850, 10, 171, 442, 32, 990),
	GORBIE_CLASS_BATTLECARRIER(6, 10, 0, 10, 1760, 250, 2287, 980, 10, 471, 142, 442, 790),
	H_ROSS_CLASS_LIGHT_CARRIER(2, 2, 0, 2, 230, 220, 252, 170, 2, 91, 42, 53, 120),
	ILL_WIND_CLASS_BATTLECRUISER(2, 10, 3, 0, 480, 260, 525, 275, 5, 91, 82, 93, 320),
	INSTRUMENTALITY_CLASS_BASESHIP(4, 4, 0, 7, 980, 80, 958, 350, 6, 71, 242, 12, 390),
	IRON_LADY_CLASS_FRIGATE(2, 8, 2, 0, 210, 60, 99, 150, 9, 33, 32, 47, 290),
	IRON_SLAVE_CLASS_BASESHIP(1, 1, 0, 3, 320, 70, 258, 60, 2, 23, 22, 10, 80),
	KITTYHAWK_CLASS_CARRIER(2, 4, 0, 6, 280, 65, 370, 173, 9, 45, 25, 49, 195),
	LADY_ROYALE_CLASS_CRUISER(2, 4, 1, 0, 670, 160, 270, 130, 5, 61, 52, 83, 250, ShipAbility.GAMBLE, null, null),
	LARGE_DEEP_SPACE_FREIGHTER(2, 0, 0, 0, 600, 1200, 102, 130, 6, 7, 85, 8, 160),
	LITTLE_JOE_CLASS_ESCORT(1, 6, 0, 0, 95, 100, 175, 65, 2, 26, 22, 15, 50),
	LITTLE_PEST_CLASS_ESCORT(1, 6, 0, 0, 280, 180, 175, 45, 2, 27, 12, 25, 60),
	LIZARD_CLASS_CRUISER(2, 4, 3, 0, 330, 290, 430, 160, 4, 81, 42, 30, 190, ShipAbility.CLOAK, null, null),
	LOKI_CLASS_DESTROYER(2, 2, 4, 0, 140, 80, 265, 101, 8, 20, 10, 43, 170, ShipAbility.ANTICLOAK, null, null),
	MADONNZILA_CLASS_CARRIER(2, 4, 0, 5, 290, 150, 910, 331, 9, 123, 110, 90, 420),
	MEDIUM_DEEP_SPACE_FREIGHTER(1, 0, 0, 0, 250, 300, 6, 60, 3, 8, 8, 14, 65),
	MERLIN_CLASS_ALCHEMY_SHIP(10, 8, 0, 0, 450, 2700, 120, 920, 10, 250, 625, 134, 840, ShipAbility.ALCHEMY, null, null),
	METEOR_CLASS_BLOCKADE_RUNNER(2, 4, 4, 0, 285, 120, 102, 90, 5, 17, 22, 55, 250, ShipAbility.CLOAK, ShipAbility.GRAVATONIC, null),
	MIG_CLASS_SCOUT(1, 2, 0, 0, 270, 180, 10, 37, 1, 25, 6, 5, 50),
	MISSOURI_CLASS_BATTLESHIP(2, 8, 6, 0, 260, 170, 810, 395, 8, 143, 150, 150, 510),
	MOSCOW_CLASS_START_ESCORT(1, 4, 0, 4, 140, 65, 370, 173, 3, 55, 25, 89, 285),
	NEBULA_CLASS_CRUISER(2, 4, 4, 0, 470, 350, 430, 170, 6, 61, 42, 73, 390),
	NEUTRONIC_FUEL_CARRIER(2, 0, 0, 0, 900, 2, 2, 10, 3, 2, 10, 20, 20),
	NEUTRONIC_REFINERY_SHIP(10, 6, 0, 0, 800, 1050, 190, 712, 9, 150, 125, 527, 970, ShipAbility.REFINERY, null, null),
	NOCTURNE_CLASS_DESTROYER(1, 4, 2, 0, 180, 60, 190, 90, 2, 10, 25, 7, 70),
	NOVA_CLASS_SUPER_DREADNOUGHT(4, 10, 10, 0, 560, 320, 1810, 650, 10, 343, 240, 350, 810),
	ONYX_CLASS_FRIGATE(2, 4, 1, 0, 150, 32, 320, 153, 8, 35, 25, 55, 280, ShipAbility.ADVANCED_HEATER, null, null),
	OPAL_CLASS_TORPEDO_BOAT(1, 1, 1, 0, 55, 39, 25, 55, 2, 17, 12, 20, 60),
	OUTRIDER_CLASS_SCOUT(1, 1, 0, 0, 260, 90, 180, 75, 1, 30, 10, 5, 50),
	PATRIOT_CLASS_LIGHT_CARRIER(1, 2, 0, 6, 140, 30, 172, 90, 6, 45, 5, 35, 90),
	PAWN_CLASS_BASESHIP(2, 2, 0, 2, 720, 40, 358, 260, 3, 23, 242, 10, 130, ShipAbility.ADVANCED_BIOSCAN, null, null),
	PL21_PROBE(1, 1, 0, 0, 180, 20, 1, 24, 1, 1, 1, 25, 30, ShipAbility.HYPERDRIVE, null, null),
	Q_TANKER(2, 0, 0, 1, 600, 120, 2, 80, 3, 2, 10, 20, 50),
	QUIETUS_CLASS_CRUISER(2, 4, 1, 0, 470, 250, 170, 130, 5, 61, 52, 73, 120),
	RED_WIND_CLASS_CARRIER(2, 2, 0, 4, 145, 80, 98, 105, 8, 57, 35, 25, 150, ShipAbility.CLOAK, null, null),
	REPTILE_CLASS_DESTROYER(1, 4, 0, 0, 120, 50, 45, 60, 3, 33, 22, 15, 50, ShipAbility.CLOAK, null, null),
	RESOLUTE_CLASS_BATTLECRUISER(2, 8, 3, 0, 480, 280, 348, 180, 7, 71, 52, 93, 380, ShipAbility.ADVANCED_CLOAK, null, null),
	RU25_GUNBOAT(1, 4, 1, 0, 90, 30, 60, 65, 1, 27, 12, 25, 60),
	RUBY_CLASS_LIGHT_CRUISER(2, 4, 2, 0, 390, 370, 136, 120, 3, 47, 32, 43, 95),
	RUSH_CLASS_HEAVY_CARRIER(6, 5, 0, 10, 1550, 390, 1858, 645, 10, 171, 242, 242, 987),
	SABER_CLASS_FRIGATE(2, 10, 0, 0, 150, 25, 420, 153, 8, 35, 25, 95, 280, ShipAbility.GLORY_DEVICE, null, null),
	SAGE_CLASS_FRIGATE(2, 4, 5, 0, 180, 110, 109, 285, 5, 88, 25, 47, 170),
	SAGITARIUS_CLASS_TRANSPORT(1, 2, 0, 1, 450, 300, 226, 99, 5, 12, 14, 38, 75),
	SAURIAN_CLASS_LIGHT_CRUISER(2, 9, 2, 0, 260, 120, 336, 120, 7, 47, 32, 23, 85, ShipAbility.CLOAK, null, null),
	SCORPIUS_CLASS_LIGHT_CARRIER(3, 6, 0, 5, 250, 90, 958, 315, 6, 171, 72, 62, 387),
	SERPENT_CLASS_ESCORT(1, 1, 0, 0, 160, 10, 35, 35, 1, 18, 10, 5, 40),
	SKY_GARNET_CLASS_DESTROYER(2, 7, 1, 0, 180, 100, 80, 250, 5, 43, 32, 25, 110),
	SKYFIRE_CLASS_CRUISER(2, 4, 4, 0, 270, 250, 270, 300, 5, 71, 52, 93, 250),
	SMALL_DEEP_SPACE_FREIGHTER(1, 0, 0, 0, 200, 150, 2, 30, 1, 2, 2, 3, 10),
	SMALL_TRANSPORT(1, 2, 0, 0, 180, 200, 15, 30, 4, 8, 8, 25, 25),
	SUPER_STAR_CARRIER(2, 6, 0, 4, 350, 180, 452, 250, 5, 91, 42, 113, 320),
	SUPER_STAR_CRUISER(3, 8, 0, 5, 450, 110, 578, 300, 9, 91, 42, 172, 490),
	SUPER_STAR_DESTROYER(2, 8, 0, 3, 180, 80, 458, 250, 6, 71, 42, 92, 390, ShipAbility.IMPERIAL_ASSAULT, null, null),
	SUPER_STAR_FRIGATE(2, 5, 3, 0, 180, 80, 102, 150, 4, 51, 32, 62, 140),
	SUPER_TRANSPORT_FREIGHTER(4, 0, 0, 0, 1200, 2600, 202, 160, 10, 13, 125, 18, 220),
	SWIFT_HEART_CLASS_SCOUT(1, 2, 0, 0, 170, 20, 126, 45, 1, 20, 6, 5, 60, ShipAbility.CLOAK, null, null),
	TAURUS_CLASS_SCOUT(1, 2, 0, 0, 590, 120, 180, 50, 1, 20, 20, 5, 50),
	THOR_CLASS_FRIGATE(2, 1, 8, 0, 160, 95, 370, 193, 9, 60, 40, 99, 130),
	TOPAZ_CLASS_GUNBOAT(1, 3, 1, 0, 160, 69, 48, 88, 3, 27, 12, 25, 60),
	TRANQUILITY_CLASS_CRUISER(2, 4, 2, 0, 460, 380, 330, 160, 6, 71, 42, 43, 140),
	TREX_CLASS_BATTLESHIP(2, 10, 5, 0, 490, 190, 810, 421, 10, 153, 140, 100, 350),
	VALIANT_WIND_CLASS_CARRIER(2, 7, 0, 5, 190, 80, 322, 180, 6, 61, 42, 113, 380),
	VENDETTA_CLASS_FRIGATE(1, 4, 4, 0, 140, 30, 99, 100, 5, 23, 12, 47, 170),
	VICTORIOUS_CLASS_BATTLESHIP(2, 10, 8, 0, 290, 150, 810, 451, 10, 193, 170, 100, 410),
	VIRGO_CLASS_BATTLESTAR(8, 10, 0, 8, 1550, 290, 1858, 655, 10, 371, 142, 142, 887),
	WATCHER_CLASS_SCOUT(1, 2, 0, 0, 170, 50, 86, 47, 1, 25, 6, 5, 50),
	WHITE_FALCON_CLASS_CRUISER(1, 4, 1, 0, 430, 140, 150, 120, 3, 61, 32, 33, 110, ShipAbility.CLOAK, null, null);
		
	int engines;
	int beams;
	int tubes;
	int bays;
	int fuel;
	int cargo;
	int crew;
	int mass;
	int tech;
	int tritanium;
	int duranium;
	int molybdenum;
	int megacredits;
	ShipAbility primaryAbility;
	ShipAbility secondaryAbility;
	ShipAbility tertiaryAbility;
	
	ShipHull(
			int engines,
			int beams,
			int tubes,
			int bays,
			int fuel,
			int cargo,
			int crew,
			int mass,
			int tech,
			int tritanium,
			int duranium,
			int molybdenum,
			int megacredits) {
		
		this(engines, beams, tubes, bays, fuel, cargo, crew, mass, tech, tritanium, duranium, molybdenum, megacredits, null, null, null);
		
	}
	
	ShipHull(
			int engines,
			int beams,
			int tubes,
			int bays,
			int fuel,
			int cargo,
			int crew,
			int mass,
			int tech,
			int tritanium,
			int duranium,
			int molybdenum,
			int megacredits,
			ShipAbility primaryAbility,
			ShipAbility secondaryAbility,
			ShipAbility tertiaryAbility) {
		
		this.engines = engines;
		this.beams = beams;
		this.tubes = tubes;
		this.bays = bays;
		this.fuel = fuel;
		this.cargo = cargo;
		this.crew = crew;
		this.mass = mass;
		this.tech = tech;
		this.tritanium = tritanium;
		this.duranium = duranium;
		this.molybdenum = molybdenum;
		this.megacredits = megacredits;
		this.primaryAbility = primaryAbility;
		this.secondaryAbility = secondaryAbility;
		this.tertiaryAbility = tertiaryAbility;
		
	}
				
			
}
