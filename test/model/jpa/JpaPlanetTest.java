package model.jpa;

import java.util.List;

import org.junit.Test;

import model.Native;
import model.Planet;

import play.Logger;
import play.db.jpa.JPA;
import play.modules.spring.Spring;
import play.test.UnitTest;

public class JpaPlanetTest extends UnitTest {

	public static JpaPlanetRepo planets = Spring.getBeanOfType(JpaPlanetRepo.class);
	
	/**
	 * Test creating a planet.
	 */
	@Test
	public void testCreatePlanet() {
		Planet planet = planets.createPlanet("Earth", 50, 1500, 1700, Native.HUMANOIDS);
		
		assertEquals(1,planets.findAll().size());
		
		assertEquals("Earth",planet.getName());
		assertEquals(Integer.valueOf(50),planet.getTemp());
		assertEquals(Integer.valueOf(1500),planet.getCoordinates().get("x"));
		assertEquals(Integer.valueOf(1700),planet.getCoordinates().get("y"));
		assertEquals(Native.HUMANOIDS,planet.getNatives());
		
		planet.delete();
		
	}
	
}
