package ch.zhaw.projectX_fopmaluk.entities;

import javax.persistence.*;


@Entity
public class Provision{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
	protected Long id;
	
	
}