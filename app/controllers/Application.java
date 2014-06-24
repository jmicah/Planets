package controllers;

import play.*;
import play.modules.spring.Spring;
import play.mvc.*;

import java.util.*;

import model.*;
import model.jpa.JpaGameRepo;

import flexjson.JSONSerializer;

public class Application extends Controller {
	
    public static void index(Long id) {    	
    	
    	JpaGameRepo games = Spring.getBeanOfType(JpaGameRepo.class);
    	
    	Game game = games.findGame(id);
    	List<Planet> planets = game.getPlanets();
    	
    	Logger.info("Game found with " + planets.size() + " planets.");
    	
    	render(planets);
    }
    
    public static void gameJSON(Long id) {
    	
    	JpaGameRepo games = Spring.getBeanOfType(JpaGameRepo.class);
    	
    	Game game = games.findGame(id);
    	
    	JSONSerializer serializer = new JSONSerializer();
    	serializer = serializer.prettyPrint(true);
    	renderJSON(serializer.include("planets").serialize(game));
    }

}