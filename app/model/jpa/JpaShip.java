package model.jpa;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.Table;

import model.AbstractModel;
import model.Game;
import model.RaceType;
import model.Ship;
import model.ShipHull;
import model.ShipMission;

@Entity
@Table(name = "ship")
public class JpaShip extends JpaAbstractModel<JpaShip> implements Ship {

	@ManyToOne (
			targetEntity = JpaGame.class,
			cascade = {CascadeType.PERSIST}
			)
	public Game game;
	
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setHull(ShipHull hull) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ShipHull getHull() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCoordinates(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Integer> getCoordinates() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDestination(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Integer> getDestination() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDamage(int damage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getDamage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setShield(int shield) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getShield() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setMission(ShipMission mission) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ShipMission getMission() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFriendlyCode(String fc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getFriendlyCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEnemy(RaceType enemy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public RaceType getEnemy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEngines(int engineTech) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getEngines() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setBeams(int beamTech) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getBeams() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setBeamCount(int beamNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getBeamCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTubes(int tubeTech) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getTubes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTubeCount(int tubeNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getTubeCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTorpedoes(int torpedoes) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTorpedoes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFighters(int fighters) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getFighters() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSupply(int supply) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getSupply() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNeutronium(int neutronium) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getNeutronium() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setColonists(int colonists) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getColonists() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMolybdenum(int molybdenum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getMolybdenum() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDuranium(int duranium) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getDuranium() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTritanium(int tritanium) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTritanium() {
		// TODO Auto-generated method stub
		
	}

}
