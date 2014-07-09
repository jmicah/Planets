package controllers;

import play.*;
import play.modules.spring.Spring;
import play.mvc.*;

import java.util.*;

import model.*;
import model.jpa.JpaGameRepo;

import flexjson.JSON;
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
    	serializer = serializer.include("players");
    	serializer = serializer.include("planets");
    	
    	String json = "{\n\"game\": ";
    	json += serializer.serialize(game);
    	json += ",\n\"connections\": {\n";
    	
    	for(Iterator<Planet> iter = game.getPlanets().iterator(); iter.hasNext();) {
    		Planet planet = iter.next();
    		if(planet.getConnectingPlanets().size()!=0) {
    			json += "\""+planet.getId()+"\": [\n";
    			
    			for(Iterator<Planet> cIter = planet.getConnectingPlanets().iterator(); cIter.hasNext();) {
    				Planet conn = cIter.next();
    				json += ""+conn.getId()+"";
    				
    				if(cIter.hasNext())
    					json += ",\n";
    				else
    					json +="\n";
    			}
    			if(iter.hasNext())
    				json += "],\n";
    			else
    				json += "]\n";
    		}
    		
    	}    	
    	json += "},\n";
    	
json += "\"gravatonic-connections\": {\n";
    	
    	for(Iterator<Planet> iter = game.getPlanets().iterator(); iter.hasNext();) {
    		Planet planet = iter.next();
    		if(planet.getConnectingGravatonicPlanets().size()!=0) {
    			json += "\""+planet.getId()+"\": [\n";
    			
    			for(Iterator<Planet> cIter = planet.getConnectingGravatonicPlanets().iterator(); cIter.hasNext();) {
    				Planet conn = cIter.next();
    				json += ""+conn.getId()+"";
    				
    				if(cIter.hasNext())
    					json += ",\n";
    				else
    					json +="\n";
    			}
    			if(iter.hasNext())
    				json += "],\n";
    			else
    				json += "]\n";
    		}
    		
    	}    	
    	json += "},\n";
    	
    	json += "\"hyp-connections\": {\n";
    	
    	for(Iterator<Planet> iter = game.getPlanets().iterator(); iter.hasNext();) {
    		Planet planet = iter.next();
    		if(planet.getConnectingJumpPlanets().size()!=0) {
    			json += "\""+planet.getId()+"\": [\n";
    			
    			for(Iterator<Planet> cIter = planet.getConnectingJumpPlanets().iterator(); cIter.hasNext();) {
    				Planet conn = cIter.next();
    				json += ""+conn.getId()+"";
    				
    				if(cIter.hasNext())
    					json += ",\n";
    				else
    					json +="\n";
    			}
    			if(iter.hasNext())
    				json += "],\n";
    			else
    				json += "]\n";
    		}
    		
    	}    	
    	json += "}\n}";
    	
    	renderJSON(json);
    }

}