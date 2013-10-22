package model.jpa;

import java.util.List;

import model.Game;
import model.GameRepo;
import model.User;

public class JpaGameRepo implements GameRepo {

	@Override
	public Game createGame(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Game findGame(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Game> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Game> findAll(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Game> findActiveGames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Game> findActiveGames(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Game> findClosedGames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Game> findClosedGames(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Game> findByOwner(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
