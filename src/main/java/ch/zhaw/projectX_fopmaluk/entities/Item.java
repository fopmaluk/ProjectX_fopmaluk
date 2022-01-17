package ch.zhaw.projectX_fopmaluk.entities;

import javax.persistence.*;

@Entity
public class Item extends Navigation {

	private String link;
	
	@ManyToOne
	private Menu menu;
	
	public Item() {
	}
	
	public Item(String name, String link) {
		super(name);
		this.link = link;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
}