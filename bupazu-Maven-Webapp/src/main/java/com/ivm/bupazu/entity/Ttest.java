package com.ivm.bupazu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

/**
 * Ttest entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "Ttest", schema = "dbo", catalog = "qds120817210_db")
public class Ttest implements java.io.Serializable {

	// Fields
	
	private Long id;
	@NotNull(message="{username.not.empty}") 
	private String name;
	@Length(min=5, max=20, message="{username.not.empty}")
	private String password;

	// Constructors

	/** default constructor */
	public Ttest() {
	}

	/** full constructor */
	public Ttest(String name, String password) {
		this.name = name;
		this.password = password;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "name", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "password", length = 50)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}