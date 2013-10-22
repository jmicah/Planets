package model.jpa;

import model.AbstractModel;

import javax.persistence.MappedSuperclass;

import play.db.jpa.Model;

public abstract class JpaAbstractModel<T extends JpaAbstractModel> extends Model implements AbstractModel {

	
	
	@Override
	public T save() {
		T result = super.save();
		return result;
	}

	@Override
	public T delete() {
		T result = super.delete();
		return result;
	}

}
