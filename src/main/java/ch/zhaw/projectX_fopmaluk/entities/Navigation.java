package ch.zhaw.projectX_fopmaluk.entities;

import javax.persistence.*;

@MappedSuperclass
public class Navigation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	protected Long id;

}