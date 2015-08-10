package com.ivm.bupazu.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TZhangdan entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_Zhangdan", schema = "dbo", catalog = "qds120817210_db")
public class TZhangdan implements java.io.Serializable {

	// Fields

	private Long zdid;
	private Long fufangId;
	private Long shoufangId;
	private Long htid;
	private Timestamp kaishiRiqi;
	private Timestamp jieshuRiqi;
	private String zdfeiyongMingcheng;
	private String zdfeiyongBeizhu;
	private Double jinE;
	private Double yifukuanJinE;
	private Long jiaoyiBianhao1;
	private Long jiaoyiBianhao2;
	private Long jiaoyiBianhao3;
	private Long jiaoyiBianhao4;
	private Long jiaoyiBianhao5;
	private String note;

	// Constructors

	/** default constructor */
	public TZhangdan() {
	}

	/** minimal constructor */
	public TZhangdan(Long fufangId, Long shoufangId, Long htid,
			Timestamp kaishiRiqi, Timestamp jieshuRiqi,
			String zdfeiyongMingcheng, Double jinE, Double yifukuanJinE,
			Long jiaoyiBianhao1, Long jiaoyiBianhao2, Long jiaoyiBianhao3,
			Long jiaoyiBianhao4, Long jiaoyiBianhao5) {
		this.fufangId = fufangId;
		this.shoufangId = shoufangId;
		this.htid = htid;
		this.kaishiRiqi = kaishiRiqi;
		this.jieshuRiqi = jieshuRiqi;
		this.zdfeiyongMingcheng = zdfeiyongMingcheng;
		this.jinE = jinE;
		this.yifukuanJinE = yifukuanJinE;
		this.jiaoyiBianhao1 = jiaoyiBianhao1;
		this.jiaoyiBianhao2 = jiaoyiBianhao2;
		this.jiaoyiBianhao3 = jiaoyiBianhao3;
		this.jiaoyiBianhao4 = jiaoyiBianhao4;
		this.jiaoyiBianhao5 = jiaoyiBianhao5;
	}

	/** full constructor */
	public TZhangdan(Long fufangId, Long shoufangId, Long htid,
			Timestamp kaishiRiqi, Timestamp jieshuRiqi,
			String zdfeiyongMingcheng, String zdfeiyongBeizhu, Double jinE,
			Double yifukuanJinE, Long jiaoyiBianhao1, Long jiaoyiBianhao2,
			Long jiaoyiBianhao3, Long jiaoyiBianhao4, Long jiaoyiBianhao5,
			String note) {
		this.fufangId = fufangId;
		this.shoufangId = shoufangId;
		this.htid = htid;
		this.kaishiRiqi = kaishiRiqi;
		this.jieshuRiqi = jieshuRiqi;
		this.zdfeiyongMingcheng = zdfeiyongMingcheng;
		this.zdfeiyongBeizhu = zdfeiyongBeizhu;
		this.jinE = jinE;
		this.yifukuanJinE = yifukuanJinE;
		this.jiaoyiBianhao1 = jiaoyiBianhao1;
		this.jiaoyiBianhao2 = jiaoyiBianhao2;
		this.jiaoyiBianhao3 = jiaoyiBianhao3;
		this.jiaoyiBianhao4 = jiaoyiBianhao4;
		this.jiaoyiBianhao5 = jiaoyiBianhao5;
		this.note = note;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ZDID", unique = true, nullable = false)
	public Long getZdid() {
		return this.zdid;
	}

	public void setZdid(Long zdid) {
		this.zdid = zdid;
	}

	@Column(name = "FufangID", nullable = false)
	public Long getFufangId() {
		return this.fufangId;
	}

	public void setFufangId(Long fufangId) {
		this.fufangId = fufangId;
	}

	@Column(name = "ShoufangID", nullable = false)
	public Long getShoufangId() {
		return this.shoufangId;
	}

	public void setShoufangId(Long shoufangId) {
		this.shoufangId = shoufangId;
	}

	@Column(name = "HTID", nullable = false)
	public Long getHtid() {
		return this.htid;
	}

	public void setHtid(Long htid) {
		this.htid = htid;
	}

	@Column(name = "KaishiRiqi", nullable = false, length = 16)
	public Timestamp getKaishiRiqi() {
		return this.kaishiRiqi;
	}

	public void setKaishiRiqi(Timestamp kaishiRiqi) {
		this.kaishiRiqi = kaishiRiqi;
	}

	@Column(name = "JieshuRiqi", nullable = false, length = 16)
	public Timestamp getJieshuRiqi() {
		return this.jieshuRiqi;
	}

	public void setJieshuRiqi(Timestamp jieshuRiqi) {
		this.jieshuRiqi = jieshuRiqi;
	}

	@Column(name = "ZDFeiyongMingcheng", nullable = false, length = 50)
	public String getZdfeiyongMingcheng() {
		return this.zdfeiyongMingcheng;
	}

	public void setZdfeiyongMingcheng(String zdfeiyongMingcheng) {
		this.zdfeiyongMingcheng = zdfeiyongMingcheng;
	}

	@Column(name = "ZDFeiyongBeizhu", length = 50)
	public String getZdfeiyongBeizhu() {
		return this.zdfeiyongBeizhu;
	}

	public void setZdfeiyongBeizhu(String zdfeiyongBeizhu) {
		this.zdfeiyongBeizhu = zdfeiyongBeizhu;
	}

	@Column(name = "JinE", nullable = false, scale = 4)
	public Double getJinE() {
		return this.jinE;
	}

	public void setJinE(Double jinE) {
		this.jinE = jinE;
	}

	@Column(name = "YifukuanJinE", nullable = false, scale = 4)
	public Double getYifukuanJinE() {
		return this.yifukuanJinE;
	}

	public void setYifukuanJinE(Double yifukuanJinE) {
		this.yifukuanJinE = yifukuanJinE;
	}

	@Column(name = "JiaoyiBianhao1", nullable = false)
	public Long getJiaoyiBianhao1() {
		return this.jiaoyiBianhao1;
	}

	public void setJiaoyiBianhao1(Long jiaoyiBianhao1) {
		this.jiaoyiBianhao1 = jiaoyiBianhao1;
	}

	@Column(name = "JiaoyiBianhao2", nullable = false)
	public Long getJiaoyiBianhao2() {
		return this.jiaoyiBianhao2;
	}

	public void setJiaoyiBianhao2(Long jiaoyiBianhao2) {
		this.jiaoyiBianhao2 = jiaoyiBianhao2;
	}

	@Column(name = "JiaoyiBianhao3", nullable = false)
	public Long getJiaoyiBianhao3() {
		return this.jiaoyiBianhao3;
	}

	public void setJiaoyiBianhao3(Long jiaoyiBianhao3) {
		this.jiaoyiBianhao3 = jiaoyiBianhao3;
	}

	@Column(name = "JiaoyiBianhao4", nullable = false)
	public Long getJiaoyiBianhao4() {
		return this.jiaoyiBianhao4;
	}

	public void setJiaoyiBianhao4(Long jiaoyiBianhao4) {
		this.jiaoyiBianhao4 = jiaoyiBianhao4;
	}

	@Column(name = "JiaoyiBianhao5", nullable = false)
	public Long getJiaoyiBianhao5() {
		return this.jiaoyiBianhao5;
	}

	public void setJiaoyiBianhao5(Long jiaoyiBianhao5) {
		this.jiaoyiBianhao5 = jiaoyiBianhao5;
	}

	@Column(name = "Note")
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}