package model.jpa;

import java.util.List;

import model.Player;
import model.PlayerRepo;
import model.RaceType;
import model.User;

public class JpaPlayerRepo implements PlayerRepo {

	@Override
	public Player createPlayer(RaceType race, User user) {
			return new JpaPlayer(race, user);
	}

	@Override
	public Player findPlayer(Long id) {
		return (Player) JpaPlayer.findById(id);
	}

	@Override
	public List<Player> findAll() {
		return (List) JpaPlayer.findAll();
	}	
}
