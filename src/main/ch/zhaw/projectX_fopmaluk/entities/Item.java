package ch.zhaw.projectX_fopmaluk.entities;

import javax.persistence.*;


@Entity
public class Item{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
	protected Long id;
	
	
}