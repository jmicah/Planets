package model;

import java.util.List;

public interface PlayerRepo {

	public Player createPlayer(RaceType race, User user);
	
	public Player findPlayer(Long id);
	
	public List<Player> findAll();
	
}
