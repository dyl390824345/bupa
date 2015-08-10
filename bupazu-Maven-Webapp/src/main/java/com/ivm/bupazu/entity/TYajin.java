package com.ivm.bupazu.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TYajin entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_Yajin", schema = "dbo", catalog = "qds120817210_db")
public class TYajin implements java.io.Serializable {

	// Fields

	private Long yjid;
	private Long jiafangId;
	private String jiafangName;
	private Long htid;
	private String fangchanDizhi;
	private Long yifangId;
	private String yifangName;
	private String hetongZhongzhiZhuangtai;
	private String hetongZhongzhiNote;
	private Double yuanshiYajinE;
	private Double yjkouchuJinE;
	private Double fanhuanYajinE;
	private Timestamp gongQianJieshuShijian;
	private String gongQianName;
	private Timestamp yjjiedongRiqi;
	private Timestamp yjfanhuanRiqi;
	private String yaFanName;
	private String yaFanBiaozhi;
	private String note;

	// Constructors

	/** default constructor */
	public TYajin() {
	}

	/** minimal constructor */
	public TYajin(Long jiafangId, Long yifangId,
			String hetongZhongzhiZhuangtai, Double yuanshiYajinE,
			Double yjkouchuJinE, Double fanhuanYajinE) {
		this.jiafangId = jiafangId;
		this.yifangId = yifangId;
		this.hetongZhongzhiZhuangtai = hetongZhongzhiZhuangtai;
		this.yuanshiYajinE = yuanshiYajinE;
		this.yjkouchuJinE = yjkouchuJinE;
		this.fanhuanYajinE = fanhuanYajinE;
	}

	/** full constructor */
	public TYajin(Long jiafangId, String jiafangName, Long htid,
			String fangchanDizhi, Long yifangId, String yifangName,
			String hetongZhongzhiZhuangtai, String hetongZhongzhiNote,
			Double yuanshiYajinE, Double yjkouchuJinE, Double fanhuanYajinE,
			Timestamp gongQianJieshuShijian, String gongQianName,
			Timestamp yjjiedongRiqi, Timestamp yjfanhuanRiqi, String yaFanName,
			String yaFanBiaozhi, String note) {
		this.jiafangId = jiafangId;
		this.jiafangName = jiafangName;
		this.htid = htid;
		this.fangchanDizhi = fangchanDizhi;
		this.yifangId = yifangId;
		this.yifangName = yifangName;
		this.hetongZhongzhiZhuangtai = hetongZhongzhiZhuangtai;
		this.hetongZhongzhiNote = hetongZhongzhiNote;
		this.yuanshiYajinE = yuanshiYajinE;
		this.yjkouchuJinE = yjkouchuJinE;
		this.fanhuanYajinE = fanhuanYajinE;
		this.gongQianJieshuShijian = gongQianJieshuShijian;
		this.gongQianName = gongQianName;
		this.yjjiedongRiqi = yjjiedongRiqi;
		this.yjfanhuanRiqi = yjfanhuanRiqi;
		this.yaFanName = yaFanName;
		this.yaFanBiaozhi = yaFanBiaozhi;
		this.note = note;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "YJID", unique = true, nullable = false)
	public Long getYjid() {
		return this.yjid;
	}

	public void setYjid(Long yjid) {
		this.yjid = yjid;
	}

	@Column(name = "JiafangID", nullable = false)
	public Long getJiafangId() {
		return this.jiafangId;
	}

	public void setJiafangId(Long jiafangId) {
		this.jiafangId = jiafangId;
	}

	@Column(name = "JiafangName", length = 50)
	public String getJiafangName() {
		return this.jiafangName;
	}

	public void setJiafangName(String jiafangName) {
		this.jiafangName = jiafangName;
	}

	@Column(name = "HTID")
	public Long getHtid() {
		return this.htid;
	}

	public void setHtid(Long htid) {
		this.htid = htid;
	}

	@Column(name = "FangchanDizhi", length = 500)
	public String getFangchanDizhi() {
		return this.fangchanDizhi;
	}

	public void setFangchanDizhi(String fangchanDizhi) {
		this.fangchanDizhi = fangchanDizhi;
	}

	@Column(name = "YifangID", nullable = false)
	public Long getYifangId() {
		return this.yifangId;
	}

	public void setYifangId(Long yifangId) {
		this.yifangId = yifangId;
	}

	@Column(name = "YifangName", length = 50)
	public String getYifangName() {
		return this.yifangName;
	}

	public void setYifangName(String yifangName) {
		this.yifangName = yifangName;
	}

	@Column(name = "HetongZhongzhiZhuangtai", nullable = false, length = 10)
	public String getHetongZhongzhiZhuangtai() {
		return this.hetongZhongzhiZhuangtai;
	}

	public void setHetongZhongzhiZhuangtai(String hetongZhongzhiZhuangtai) {
		this.hetongZhongzhiZhuangtai = hetongZhongzhiZhuangtai;
	}

	@Column(name = "HetongZhongzhiNote", length = 500)
	public String getHetongZhongzhiNote() {
		return this.hetongZhongzhiNote;
	}

	public void setHetongZhongzhiNote(String hetongZhongzhiNote) {
		this.hetongZhongzhiNote = hetongZhongzhiNote;
	}

	@Column(name = "YuanshiYajinE", nullable = false, scale = 4)
	public Double getYuanshiYajinE() {
		return this.yuanshiYajinE;
	}

	public void setYuanshiYajinE(Double yuanshiYajinE) {
		this.yuanshiYajinE = yuanshiYajinE;
	}

	@Column(name = "YJKouchuJinE", nullable = false, scale = 4)
	public Double getYjkouchuJinE() {
		return this.yjkouchuJinE;
	}

	public void setYjkouchuJinE(Double yjkouchuJinE) {
		this.yjkouchuJinE = yjkouchuJinE;
	}

	@Column(name = "FanhuanYajinE", nullable = false, scale = 4)
	public Double getFanhuanYajinE() {
		return this.fanhuanYajinE;
	}

	public void setFanhuanYajinE(Double fanhuanYajinE) {
		this.fanhuanYajinE = fanhuanYajinE;
	}

	@Column(name = "GongQianJieshuShijian", length = 23)
	public Timestamp getGongQianJieshuShijian() {
		return this.gongQianJieshuShijian;
	}

	public void setGongQianJieshuShijian(Timestamp gongQianJieshuShijian) {
		this.gongQianJieshuShijian = gongQianJieshuShijian;
	}

	@Column(name = "GongQianName", length = 50)
	public String getGongQianName() {
		return this.gongQianName;
	}

	public void setGongQianName(String gongQianName) {
		this.gongQianName = gongQianName;
	}

	@Column(name = "YJJiedongRiqi", length = 23)
	public Timestamp getYjjiedongRiqi() {
		return this.yjjiedongRiqi;
	}

	public void setYjjiedongRiqi(Timestamp yjjiedongRiqi) {
		this.yjjiedongRiqi = yjjiedongRiqi;
	}

	@Column(name = "YJFanhuanRiqi", length = 23)
	public Timestamp getYjfanhuanRiqi() {
		return this.yjfanhuanRiqi;
	}

	public void setYjfanhuanRiqi(Timestamp yjfanhuanRiqi) {
		this.yjfanhuanRiqi = yjfanhuanRiqi;
	}

	@Column(name = "YaFanName", length = 50)
	public String getYaFanName() {
		return this.yaFanName;
	}

	public void setYaFanName(String yaFanName) {
		this.yaFanName = yaFanName;
	}

	@Column(name = "YaFanBiaozhi", length = 10)
	public String getYaFanBiaozhi() {
		return this.yaFanBiaozhi;
	}

	public void setYaFanBiaozhi(String yaFanBiaozhi) {
		this.yaFanBiaozhi = yaFanBiaozhi;
	}

	@Column(name = "Note", length = 500)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}