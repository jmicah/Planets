package model.jpa;

import model.Player;
import model.RaceType;
import model.User;

public class JpaPlayer extends JpaAbstractModel<JpaPlayer> implements Player {

	public RaceType race;
	
	protected JpaPlayer(RaceType race){
		this.race = race;
	}
	
	@Override
	public void setUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return null;
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
