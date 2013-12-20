package model.jpa;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import model.Player;
import model.RaceType;
import model.User;

@Entity
@Table(name = "player")
public class JpaPlayer extends JpaAbstractModel<JpaPlayer> implements Player {

	public RaceType race;
	
	@ManyToOne(
			targetEntity = JpaUser.class,
			cascade = {CascadeType.PERSIST}
			)
	public User user;
	
	protected JpaPlayer(RaceType race, User user){
		this.race = race;
		this.user = user;
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
	public void setRaceType(RaceType race) {
		// TODO Auto-generated method stub

	}

	@Override
	public RaceType getRaceType() {
		// TODO Auto-generated method stub
		return null;
	}
}
