package com.ivm.bupazu.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TLishi entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_Lishi", schema = "dbo", catalog = "qds120817210_db")
public class TLishi implements java.io.Serializable {

	// Fields

	private TLishiId id;

	// Constructors

	/** default constructor */
	public TLishi() {
	}

	/** full constructor */
	public TLishi(TLishiId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "yhid", column = @Column(name = "YHID", nullable = false)),
			@AttributeOverride(name = "fyid", column = @Column(name = "FYID", nullable = false)),
			@AttributeOverride(name = "liulanShijian", column = @Column(name = "LiulanShijian", nullable = false)),
			@AttributeOverride(name = "note", column = @Column(name = "Note", length = 500)) })
	public TLishiId getId() {
		return this.id;
	}

	public void setId(TLishiId id) {
		this.id = id;
	}

}