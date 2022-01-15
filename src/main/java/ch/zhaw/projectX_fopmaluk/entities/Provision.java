package ch.zhaw.projectX_fopmaluk.entities;

import javax.persistence.*;


@Entity
public class Provision{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
	protected Long id;
	
	protected java.sql.Date startDate;
	protected java.sql.Date endDate;
	protected String customerId;
	
	@ManyToOne
	protected Page page;
	
	@ManyToOne
	private Navigation navigation;
}