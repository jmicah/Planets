package model.jpa;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import model.Game;
import model.Player;
import model.RaceType;
import model.User;

@Entity
@Table(name = "player")
public class JpaPlayer extends JpaAbstractModel<JpaPlayer> implements Player {

	public RaceType raceType;
	
	@ManyToOne(
			targetEntity = JpaUser.class,
			cascade = {CascadeType.PERSIST}
			)
	public User user;
	
	@ManyToOne(
			targetEntity = JpaGame.class,
			cascade = {CascadeType.PERSIST}
			)
	public Game game;
	
	protected JpaPlayer(RaceType race, User user){
		this.raceType = race;
		this.user = user;
	}
	
	@Override
	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public User getUser() {
		return this.user;
	}
	
	@Override
	public void setRaceType(RaceType race) {
		this.raceType = race;
	}

	@Override
	public RaceType getRaceType() {
		return this.raceType;
	}
}
