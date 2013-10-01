package models;

public enum RaceType {

	FEDERATION (1),
	LIZARDS (2),
	BIRDMEN (3),
	FASCISTS (4),
	PRIVATEERS (5),
	CYBORG (6),
	CRYSTALS (7),
	EMPIRE (8),
	ROBOTS (9),
	REBELS (10),
	COLONIES (11);
	
	int order;
	
	RaceType(int order) {
		this.order = order;
	}
	
}
