package model;

import java.util.List;

public interface PlanetRepo {

	public Planet createPlanet(String name, int temp, int x, int y, Native natives);
	
	public Planet findPlanet(Long id);
	
	public List<Planet> findAll();
	
}
