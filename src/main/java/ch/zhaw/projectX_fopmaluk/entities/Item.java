package ch.zhaw.projectX_fopmaluk.entities;

import javax.persistence.*;

@Entity
public class Item extends Navigation {

	protected String link;
	
	@ManyToOne
	private Menu menu;
}