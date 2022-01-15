package ch.zhaw.projectX_fopmaluk.entities;

import javax.persistence.*;

@Entity
public class Menu extends Navigation {

	protected boolean root;
	
	@ManyToOne
	private Menu menu;

	public Menu() {
		super();
	}
}