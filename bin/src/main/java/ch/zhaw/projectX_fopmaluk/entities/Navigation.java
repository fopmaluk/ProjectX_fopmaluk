package ch.zhaw.projectX_fopmaluk.entities;

import javax.persistence.*;

@MappedSuperclass
public class Navigation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	protected Long id;
	
	protected String name;

	public Navigation() {
	}

	public Navigation(String name) {
		this.name = name;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}