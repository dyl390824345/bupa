package com.ivm.bupazu.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TLishiId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class TLishiId implements java.io.Serializable {

	// Fields

	private Long yhid;
	private Long fyid;
	private String liulanShijian;
	private String note;

	// Constructors

	/** default constructor */
	public TLishiId() {
	}

	/** minimal constructor */
	public TLishiId(Long yhid, Long fyid, String liulanShijian) {
		this.yhid = yhid;
		this.fyid = fyid;
		this.liulanShijian = liulanShijian;
	}

	/** full constructor */
	public TLishiId(Long yhid, Long fyid, String liulanShijian, String note) {
		this.yhid = yhid;
		this.fyid = fyid;
		this.liulanShijian = liulanShijian;
		this.note = note;
	}

	// Property accessors

	@Column(name = "YHID", nullable = false)
	public Long getYhid() {
		return this.yhid;
	}

	public void setYhid(Long yhid) {
		this.yhid = yhid;
	}

	@Column(name = "FYID", nullable = false)
	public Long getFyid() {
		return this.fyid;
	}

	public void setFyid(Long fyid) {
		this.fyid = fyid;
	}

	@Column(name = "LiulanShijian", nullable = false)
	public String getLiulanShijian() {
		return this.liulanShijian;
	}

	public void setLiulanShijian(String liulanShijian) {
		this.liulanShijian = liulanShijian;
	}

	@Column(name = "Note", length = 500)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TLishiId))
			return false;
		TLishiId castOther = (TLishiId) other;

		return ((this.getYhid() == castOther.getYhid()) || (this.getYhid() != null
				&& castOther.getYhid() != null && this.getYhid().equals(
				castOther.getYhid())))
				&& ((this.getFyid() == castOther.getFyid()) || (this.getFyid() != null
						&& castOther.getFyid() != null && this.getFyid()
						.equals(castOther.getFyid())))
				&& ((this.getLiulanShijian() == castOther.getLiulanShijian()) || (this
						.getLiulanShijian() != null
						&& castOther.getLiulanShijian() != null && this
						.getLiulanShijian()
						.equals(castOther.getLiulanShijian())))
				&& ((this.getNote() == castOther.getNote()) || (this.getNote() != null
						&& castOther.getNote() != null && this.getNote()
						.equals(castOther.getNote())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getYhid() == null ? 0 : this.getYhid().hashCode());
		result = 37 * result
				+ (getFyid() == null ? 0 : this.getFyid().hashCode());
		result = 37
				* result
				+ (getLiulanShijian() == null ? 0 : this.getLiulanShijian()
						.hashCode());
		result = 37 * result
				+ (getNote() == null ? 0 : this.getNote().hashCode());
		return result;
	}

}