package com.ivm.bupazu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TYuangong entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_Yuangong", schema = "dbo", catalog = "qds120817210_db")
public class TYuangong implements java.io.Serializable {

	// Fields

	private Long ygid;
	private String ygname;
	private String ygmima;
	private String ygshouji;
	private String ygshouxiang;
	private String ygdizhi;
	private String ygzhibie;
	private String ygzhuangtai;
	private String note;

	// Constructors

	/** default constructor */
	public TYuangong() {
	}

	/** full constructor */
	public TYuangong(String ygname, String ygmima, String ygshouji,
			String ygshouxiang, String ygdizhi, String ygzhibie,
			String ygzhuangtai, String note) {
		this.ygname = ygname;
		this.ygmima = ygmima;
		this.ygshouji = ygshouji;
		this.ygshouxiang = ygshouxiang;
		this.ygdizhi = ygdizhi;
		this.ygzhibie = ygzhibie;
		this.ygzhuangtai = ygzhuangtai;
		this.note = note;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "YGID", unique = true, nullable = false)
	public Long getYgid() {
		return this.ygid;
	}

	public void setYgid(Long ygid) {
		this.ygid = ygid;
	}

	@Column(name = "YGName", length = 50)
	public String getYgname() {
		return this.ygname;
	}

	public void setYgname(String ygname) {
		this.ygname = ygname;
	}

	@Column(name = "YGMima", length = 50)
	public String getYgmima() {
		return this.ygmima;
	}

	public void setYgmima(String ygmima) {
		this.ygmima = ygmima;
	}

	@Column(name = "YGShouji", length = 50)
	public String getYgshouji() {
		return this.ygshouji;
	}

	public void setYgshouji(String ygshouji) {
		this.ygshouji = ygshouji;
	}

	@Column(name = "YGShouxiang", length = 50)
	public String getYgshouxiang() {
		return this.ygshouxiang;
	}

	public void setYgshouxiang(String ygshouxiang) {
		this.ygshouxiang = ygshouxiang;
	}

	@Column(name = "YGDizhi", length = 250)
	public String getYgdizhi() {
		return this.ygdizhi;
	}

	public void setYgdizhi(String ygdizhi) {
		this.ygdizhi = ygdizhi;
	}

	@Column(name = "YGZhibie", length = 50)
	public String getYgzhibie() {
		return this.ygzhibie;
	}

	public void setYgzhibie(String ygzhibie) {
		this.ygzhibie = ygzhibie;
	}

	@Column(name = "YGZhuangtai", length = 10)
	public String getYgzhuangtai() {
		return this.ygzhuangtai;
	}

	public void setYgzhuangtai(String ygzhuangtai) {
		this.ygzhuangtai = ygzhuangtai;
	}

	@Column(name = "Note", length = 500)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}