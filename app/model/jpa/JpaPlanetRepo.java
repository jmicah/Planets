package model.jpa;

import java.util.List;

import play.Logger;

import model.Native;
import model.Planet;
import model.PlanetRepo;

public class JpaPlanetRepo implements PlanetRepo {

	@Override
	public Planet createPlanet(String name, int temp, int x, int y,
			Native natives) {
		return new JpaPlanet(name, temp, x, y, natives);
	}

	@Override
	public Planet findPlanet(Long id) {
		return (Planet) JpaPlanet.findById(id);
	}

	@Override
	public List<Planet> findAll() {
		return (List) JpaPlanet.findAll();
	}

}
