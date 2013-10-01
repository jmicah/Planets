package models.jpa;

import models.Player;
import models.RaceType;

public class JpaPlayer implements Player {

	public RaceType race;
	
	protected JpaPlayer(RaceType race){
		this.race = race;
	}
	
	@Override
	public void setRaceType(RaceType raceType) {
		// TODO Auto-generated method stub

	}

	@Override
	public RaceType getRaceType() {
		// TODO Auto-generated method stub
		return null;
	}

}
