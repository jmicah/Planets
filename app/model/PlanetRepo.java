package model;

import java.util.List;

public interface PlanetRepo {

	public Planet createPlanet(String name, Integer temp, Integer x, Integer y, Native natives);
	
	public Planet findPlanet(Long id);
	
	public List<Planet> findAll();
	
}
