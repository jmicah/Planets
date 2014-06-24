package model.jpa;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.Table;

import model.AbstractModel;
import model.Game;
import model.IonStorm;
import model.StormStatus;
import model.StormStrength;

@Entity
@Table(name = "storm")
public class JpaIonStorm extends JpaAbstractModel<JpaIonStorm> implements IonStorm {

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
	public void setStrength(StormStrength strength) {
		// TODO Auto-generated method stub

	}

	@Override
	public StormStrength getStrength() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setHeading(Long x, Long y) {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, Long> getHeading() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCoordinates(Long x, Long y) {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, Long> getCoordinates() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRadius(Long radius) {
		// TODO Auto-generated method stub

	}

	@Override
	public Long getRadius() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setStatus(StormStatus status) {
		// TODO Auto-generated method stub

	}

	@Override
	public StormStatus getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

}
