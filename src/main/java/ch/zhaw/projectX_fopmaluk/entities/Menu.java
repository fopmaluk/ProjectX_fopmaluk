package ch.zhaw.projectX_fopmaluk.entities;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Menu extends Navigation {

	private boolean root;
	
	@ManyToMany
	@JoinTable(name="sub_menu")
	private Set<Menu> menus = new LinkedHashSet<>();

	public Menu() {
	}
	
		public Menu(String name, boolean root) {
		super(name);
		this.root = root;
	}

	public boolean isRoot() {
		return root;
	}

	public void setRoot(boolean root) {
		this.root = root;
	}
}