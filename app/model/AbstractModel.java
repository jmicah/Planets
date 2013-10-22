package model;

import play.db.jpa.Model;

public abstract interface AbstractModel {

	public <T extends AbstractModel> T save();
	
	public <T extends AbstractModel> T delete();
	
	public Long getId();
	
}
