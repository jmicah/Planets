package model.jpa;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.Table;

import model.AbstractModel;
import model.Game;
import model.Ship;

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

}
