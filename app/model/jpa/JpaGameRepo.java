package model.jpa;

import java.util.List;

import play.db.jpa.JPA;

import model.Game;
import model.GameRepo;
import model.User;

public class JpaGameRepo implements GameRepo {

	@Override
	public Game createGame(User owner) {
		return new JpaGame(owner, 2000, 2000, 500);
	}
	
	@Override 
	public Game createGame(User owner, int height, int width) {
		
		int planetLimit = 500;
		//TODO Calculate planet limit based on height and width of map.
		
		return new JpaGame(owner, height, width, planetLimit);
	}
	
	@Override
	public Game createGame(User owner, int planetLimit) {
		
		int height = 2000;
		int width = 2000;
		//TODO Calculate height and width of map based on planet limit.
		
		return new JpaGame(owner, height, width, planetLimit);
	}

	@Override
	public Game findGame(Long id) {
		return (Game) JpaGame.findById(id);
	}

	@Override
	public List<Game> findAll() {
		return (List) JpaGame.findAll();
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
