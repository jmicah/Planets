package models;

public enum ShipList {

	ANNIHILATION_CLASS_BATTLESHIP(6, 10, 10, 0, 1260, 320, 2910, 960, 10, 343, 340, 550, 910),
	ARIES_CLASS_TRANSPORT(2, 2, 0, 0, 260, 260, 226, 69, 5, 12, 14, 25, 65),
	ARKHAM_CLASS_FRIGATE(2, 6, 4, 0, 180, 90, 328, 160, 8, 43, 12, 67, 70);
		
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
	
	ShipList(
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
	
	ShipList(
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
