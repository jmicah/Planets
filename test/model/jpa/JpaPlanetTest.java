package model.jpa;

import java.util.List;

import org.junit.Test;

import model.Native;
import model.Planet;
import model.Player;
import model.RaceType;
import model.User;

import play.Logger;
import play.db.jpa.JPA;
import play.modules.spring.Spring;
import play.test.UnitTest;

public class JpaPlanetTest extends UnitTest {

	public static JpaPlanetRepo planets = Spring.getBeanOfType(JpaPlanetRepo.class);
	public static JpaPlayerRepo players = Spring.getBeanOfType(JpaPlayerRepo.class);
	public static JpaUserRepo users = Spring.getBeanOfType(JpaUserRepo.class);
	
	/**
	 * Test creating a planet.
	 */
	@Test
	public void testCreatePlanet() {
		Planet planet = planets.createPlanet("Earth", 50, 1500, 1700, Native.HUMANOIDS);
		
		assertEquals(1,planets.findAll().size());
		
		assertEquals("Earth",planet.getName());
		assertEquals(50,planet.getTemp());
		assertEquals(1500,planet.getCoordinates().get("x").intValue());
		assertEquals(1700,planet.getCoordinates().get("y").intValue());
		assertEquals(Native.HUMANOIDS,planet.getNatives());
		
		planet.delete();
		assertEquals(0,planets.findAll().size());
		
	}
	
	/**
	 * Test persistence.
	 */
	@Test
	public void testPlanetPersistence() {
		
		Planet planet = planets.createPlanet("Earth", 50, 1500, 1700, Native.HUMANOIDS);
				
		assertEquals("Earth",planet.getName());
		assertEquals(50,planet.getTemp());
		assertEquals(1500,planet.getCoordinates().get("x").intValue());
		assertEquals(1700,planet.getCoordinates().get("y").intValue());
		assertEquals(Native.HUMANOIDS,planet.getNatives());
		
		User user = users.createUser("James", "Kirk", "kirk@planets.com").save();
		Player player = players.createPlayer(RaceType.FEDERATION, user);
		
		planet.setColonistsHappiness(80);
		planet.setColonistsTaxRate(10);
		planet.setCoordinates(1000, 1000);
		planet.setDefenses(20);
		planet.setDuraniumInGround(1000);
		planet.setDuraniumOnSurface(100);
		planet.setDuraniumRate(10);
		planet.setFactories(100);
		planet.setMines(100);
		planet.setMolybdenumInGround(2000);
		planet.setMolybdenumOnSurface(200);
		planet.setMolybdenumRate(20);
		planet.setMoney(10000);
		planet.setName("Mars");
		planet.setNatives(Native.BOVINOIDS);
		planet.setNativesHappiness(90);
		planet.setNativesPopulation(20000);
		planet.setNativesTaxRate(100);
		planet.setNeutroniumInGround(3000);
		planet.setNeutroniumOnSurface(300);
		planet.setNeutroniumRate(30);
		planet.setColonistPopulation(10000);
		planet.setPlayer(player);
		planet.setSupplies(500);
		planet.setTemp(0);
		planet.setTritaniumInGround(4000);
		planet.setTritaniumOnSurface(400);
		planet.setTritaniumRate(40);
		
		planet.save();
		Long planetId = planet.getId();
		Long playerId = player.getId();
		Long userId = user.getId();
		
		JPA.em().flush();
		JPA.em().clear();
		
		planet = planets.findPlanet(planetId);
		player = players.findPlayer(playerId);
		user = users.findUser(userId);
		
		assertEquals(80,planet.getColonistsHappiness());
		assertEquals(10,planet.getColonistsTaxRate());
		assertEquals(1000,planet.getCoordinates().get("y").intValue());
		assertEquals(1000,planet.getCoordinates().get("x").intValue());
		assertEquals(20,planet.getDefenses());
		assertEquals(1000,planet.getDuraniumInGround());
		assertEquals(100,planet.getDuraniumOnSurface());
		assertEquals(10,planet.getDuraniumRate());
		assertEquals(100,planet.getFactories());
		assertEquals(100,planet.getMines());
		assertEquals(2000,planet.getMolybdenumInGround());
		assertEquals(200,planet.getMolybdenumOnSurface());
		assertEquals(20,planet.getMolybdenumRate());
		assertEquals(10000,planet.getMoney());
		assertEquals("Mars",planet.getName());
		assertEquals(Native.BOVINOIDS,planet.getNatives());
		assertEquals(90,planet.getNativesHappiness());
		assertEquals(20000,planet.getNativesPopulation());
		assertEquals(100,planet.getNativesTaxRate());
		assertEquals(3000,planet.getNeutroniumInGround());
		assertEquals(300,planet.getNeutroniumOnSurface());
		assertEquals(30,planet.getNeutroniumRate());
		assertEquals(10000,planet.getColonistPopulation());
		assertEquals(player,planet.getPlayer());
		assertEquals(500,planet.getSupplies());
		assertEquals(0,planet.getTemp());
		assertEquals(4000,planet.getTritaniumInGround());
		assertEquals(400,planet.getTritaniumOnSurface());
		assertEquals(40,planet.getTritaniumRate());
		
		planet.delete();
		player.delete();
		user.delete();
		
		assertEquals(0,planets.findAll().size());
		assertEquals(0,players.findAll().size());
		assertEquals(0,users.findAll().size());
		
	}
	
	
}
