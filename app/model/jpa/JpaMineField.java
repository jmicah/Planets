package model.jpa;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.Table;

import model.AbstractModel;
import model.Game;
import model.MineField;
import model.Player;

@Entity
@Table(name = "minefield")
public class JpaMineField extends JpaAbstractModel<JpaMineField> implements MineField {

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
	public void setRadius(Long radius) {
		// TODO Auto-generated method stub

	}

	@Override
	public Long getRadius() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setOwner(Player player) {
		// TODO Auto-generated method stub

	}

	@Override
	public Player getOwner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isWebMine() {
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

}
