package ch.zhaw.projectX_fopmaluk.entities;

import java.sql.Date;

import javax.persistence.*;


@Entity
public class Provision{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
	private Long id;
	
	private java.sql.Date startDate;
	private java.sql.Date endDate;
	private String customerId;
	
	@ManyToOne
	private Page page;
	
	@ManyToOne
	private Menu menu;
	
	public Provision() {
	}
	
	public Provision(Long id, Date startDate, Date endDate, String customerId, Page page, Menu menu) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.customerId = customerId;
		this.page = page;
		this.menu = menu;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public java.sql.Date getStartDate() {
		return startDate;
	}

	public void setStartDate(java.sql.Date startDate) {
		this.startDate = startDate;
	}

	public java.sql.Date getEndDate() {
		return endDate;
	}

	public void setEndDate(java.sql.Date endDate) {
		this.endDate = endDate;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	
}