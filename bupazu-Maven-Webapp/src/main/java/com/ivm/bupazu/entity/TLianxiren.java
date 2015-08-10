package com.ivm.bupazu.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TLianxiren entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_Lianxiren", schema = "dbo", catalog = "qds120817210_db")
public class TLianxiren implements java.io.Serializable {

	// Fields

	private TLianxirenId id;
	private String lxrleixing;

	// Constructors

	/** default constructor */
	public TLianxiren() {
	}

	/** full constructor */
	public TLianxiren(TLianxirenId id, String lxrleixing) {
		this.id = id;
		this.lxrleixing = lxrleixing;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "zhurenId", column = @Column(name = "ZhurenID", nullable = false)),
			@AttributeOverride(name = "lxrid", column = @Column(name = "LXRID", nullable = false)) })
	public TLianxirenId getId() {
		return this.id;
	}

	public void setId(TLianxirenId id) {
		this.id = id;
	}

	@Column(name = "LXRLeixing", nullable = false, length = 50)
	public String getLxrleixing() {
		return this.lxrleixing;
	}

	public void setLxrleixing(String lxrleixing) {
		this.lxrleixing = lxrleixing;
	}

}