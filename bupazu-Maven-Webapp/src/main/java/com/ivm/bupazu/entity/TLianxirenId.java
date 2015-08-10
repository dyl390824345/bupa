package com.ivm.bupazu.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TLianxirenId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class TLianxirenId implements java.io.Serializable {

	// Fields

	private Long zhurenId;
	private Long lxrid;

	// Constructors

	/** default constructor */
	public TLianxirenId() {
	}

	/** full constructor */
	public TLianxirenId(Long zhurenId, Long lxrid) {
		this.zhurenId = zhurenId;
		this.lxrid = lxrid;
	}

	// Property accessors

	@Column(name = "ZhurenID", nullable = false)
	public Long getZhurenId() {
		return this.zhurenId;
	}

	public void setZhurenId(Long zhurenId) {
		this.zhurenId = zhurenId;
	}

	@Column(name = "LXRID", nullable = false)
	public Long getLxrid() {
		return this.lxrid;
	}

	public void setLxrid(Long lxrid) {
		this.lxrid = lxrid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TLianxirenId))
			return false;
		TLianxirenId castOther = (TLianxirenId) other;

		return ((this.getZhurenId() == castOther.getZhurenId()) || (this
				.getZhurenId() != null && castOther.getZhurenId() != null && this
				.getZhurenId().equals(castOther.getZhurenId())))
				&& ((this.getLxrid() == castOther.getLxrid()) || (this
						.getLxrid() != null && castOther.getLxrid() != null && this
						.getLxrid().equals(castOther.getLxrid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getZhurenId() == null ? 0 : this.getZhurenId().hashCode());
		result = 37 * result
				+ (getLxrid() == null ? 0 : this.getLxrid().hashCode());
		return result;
	}

}