package model;

public enum Government {
	
	ANARCHY (1),
	PRE_TRIBAL (2),
	EARLY_TRIBAL (3),
	TRIBAL (4),
	FEUDAL (5),
	MONARCHY (6),
	REPRESENTATIVE (7),
	PARTICIPATORY (8),
	UNITY (9);
	
	int level;
	
	Government(int level) {
		this.level = level;
	}
	
	public int getLevel() {
		return this.level;
	}	
	
}
