package com.ivm.bupazu.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TXuqiu entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_Xuqiu", schema = "dbo", catalog = "qds120817210_db")
public class TXuqiu implements java.io.Serializable {

	// Fields

	private Long xqid;
	private Long yhid;
	private String gps;
	private Double qzjuli;
	private Double qiwangZujin;
	private Short qiwangMianji;
	private String fangwuChaoxiang;
	private String qiwangHuxing;
	private String xqmiaoshu;
	private Timestamp fabuShijian;
	private String xqzhuangtai;
	private String note;

	// Constructors

	/** default constructor */
	public TXuqiu() {
	}

	/** minimal constructor */
	public TXuqiu(Long yhid) {
		this.yhid = yhid;
	}

	/** full constructor */
	public TXuqiu(Long yhid, String gps, Double qzjuli, Double qiwangZujin,
			Short qiwangMianji, String fangwuChaoxiang, String qiwangHuxing,
			String xqmiaoshu, Timestamp fabuShijian, String xqzhuangtai,
			String note) {
		this.yhid = yhid;
		this.gps = gps;
		this.qzjuli = qzjuli;
		this.qiwangZujin = qiwangZujin;
		this.qiwangMianji = qiwangMianji;
		this.fangwuChaoxiang = fangwuChaoxiang;
		this.qiwangHuxing = qiwangHuxing;
		this.xqmiaoshu = xqmiaoshu;
		this.fabuShijian = fabuShijian;
		this.xqzhuangtai = xqzhuangtai;
		this.note = note;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "XQID", unique = true, nullable = false)
	public Long getXqid() {
		return this.xqid;
	}

	public void setXqid(Long xqid) {
		this.xqid = xqid;
	}

	@Column(name = "YHID", nullable = false)
	public Long getYhid() {
		return this.yhid;
	}

	public void setYhid(Long yhid) {
		this.yhid = yhid;
	}

	@Column(name = "GPS")
	public String getGps() {
		return this.gps;
	}

	public void setGps(String gps) {
		this.gps = gps;
	}

	@Column(name = "QZJuli", precision = 53, scale = 0)
	public Double getQzjuli() {
		return this.qzjuli;
	}

	public void setQzjuli(Double qzjuli) {
		this.qzjuli = qzjuli;
	}

	@Column(name = "QiwangZujin", scale = 4)
	public Double getQiwangZujin() {
		return this.qiwangZujin;
	}

	public void setQiwangZujin(Double qiwangZujin) {
		this.qiwangZujin = qiwangZujin;
	}

	@Column(name = "QiwangMianji")
	public Short getQiwangMianji() {
		return this.qiwangMianji;
	}

	public void setQiwangMianji(Short qiwangMianji) {
		this.qiwangMianji = qiwangMianji;
	}

	@Column(name = "FangwuChaoxiang", length = 10)
	public String getFangwuChaoxiang() {
		return this.fangwuChaoxiang;
	}

	public void setFangwuChaoxiang(String fangwuChaoxiang) {
		this.fangwuChaoxiang = fangwuChaoxiang;
	}

	@Column(name = "QiwangHuxing", length = 50)
	public String getQiwangHuxing() {
		return this.qiwangHuxing;
	}

	public void setQiwangHuxing(String qiwangHuxing) {
		this.qiwangHuxing = qiwangHuxing;
	}

	@Column(name = "XQMiaoshu")
	public String getXqmiaoshu() {
		return this.xqmiaoshu;
	}

	public void setXqmiaoshu(String xqmiaoshu) {
		this.xqmiaoshu = xqmiaoshu;
	}

	@Column(name = "FabuShijian", length = 23)
	public Timestamp getFabuShijian() {
		return this.fabuShijian;
	}

	public void setFabuShijian(Timestamp fabuShijian) {
		this.fabuShijian = fabuShijian;
	}

	@Column(name = "XQZhuangtai", length = 10)
	public String getXqzhuangtai() {
		return this.xqzhuangtai;
	}

	public void setXqzhuangtai(String xqzhuangtai) {
		this.xqzhuangtai = xqzhuangtai;
	}

	@Column(name = "Note", length = 500)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}