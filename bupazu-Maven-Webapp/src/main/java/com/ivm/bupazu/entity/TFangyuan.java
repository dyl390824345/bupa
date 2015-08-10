package com.ivm.bupazu.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TFangyuan entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_Fangyuan", schema = "dbo", catalog = "qds120817210_db")
public class TFangyuan implements java.io.Serializable {

	// Fields

	private Long fyid;
	private Long yhid;
	private String gps;
	private String fangchanSuozaisheng;
	private String fangchanSuozaishi;
	private String fangchanSuozaiqu;
	private String fangchanDizhi;
	private String fyleixing;
	private Short fylouceng;
	private String fychuzuFangshi;
	private String yjjiaoyi;
	private String jiadianShebei;
	private String jiajuSheshi;
	private Short fymianji;
	private String fyzhuangxiu;
	private String fychaoxiang;
	private String fyjieshaoBiaoti;
	private String fymiaoshu;
	private String fytupian;
	private String fybiaoqian;
	private Double yuqiJiage;
	private String fyzhuangtai;
	private Timestamp fyfabuShijian;
	private String note;
	private Set<THetong> THetongs = new HashSet<THetong>(0);

	// Constructors

	/** default constructor */
	public TFangyuan() {
	}

	/** minimal constructor */
	public TFangyuan(Long yhid) {
		this.yhid = yhid;
	}

	/** full constructor */
	public TFangyuan(Long yhid, String gps, String fangchanSuozaisheng,
			String fangchanSuozaishi, String fangchanSuozaiqu,
			String fangchanDizhi, String fyleixing, Short fylouceng,
			String fychuzuFangshi, String yjjiaoyi, String jiadianShebei,
			String jiajuSheshi, Short fymianji, String fyzhuangxiu,
			String fychaoxiang, String fyjieshaoBiaoti, String fymiaoshu,
			String fytupian, String fybiaoqian, Double yuqiJiage,
			String fyzhuangtai, Timestamp fyfabuShijian, String note,
			Set<THetong> THetongs) {
		this.yhid = yhid;
		this.gps = gps;
		this.fangchanSuozaisheng = fangchanSuozaisheng;
		this.fangchanSuozaishi = fangchanSuozaishi;
		this.fangchanSuozaiqu = fangchanSuozaiqu;
		this.fangchanDizhi = fangchanDizhi;
		this.fyleixing = fyleixing;
		this.fylouceng = fylouceng;
		this.fychuzuFangshi = fychuzuFangshi;
		this.yjjiaoyi = yjjiaoyi;
		this.jiadianShebei = jiadianShebei;
		this.jiajuSheshi = jiajuSheshi;
		this.fymianji = fymianji;
		this.fyzhuangxiu = fyzhuangxiu;
		this.fychaoxiang = fychaoxiang;
		this.fyjieshaoBiaoti = fyjieshaoBiaoti;
		this.fymiaoshu = fymiaoshu;
		this.fytupian = fytupian;
		this.fybiaoqian = fybiaoqian;
		this.yuqiJiage = yuqiJiage;
		this.fyzhuangtai = fyzhuangtai;
		this.fyfabuShijian = fyfabuShijian;
		this.note = note;
		this.THetongs = THetongs;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "FYID", unique = true, nullable = false)
	public Long getFyid() {
		return this.fyid;
	}

	public void setFyid(Long fyid) {
		this.fyid = fyid;
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

	@Column(name = "FangchanSuozaisheng", length = 50)
	public String getFangchanSuozaisheng() {
		return this.fangchanSuozaisheng;
	}

	public void setFangchanSuozaisheng(String fangchanSuozaisheng) {
		this.fangchanSuozaisheng = fangchanSuozaisheng;
	}

	@Column(name = "FangchanSuozaishi", length = 50)
	public String getFangchanSuozaishi() {
		return this.fangchanSuozaishi;
	}

	public void setFangchanSuozaishi(String fangchanSuozaishi) {
		this.fangchanSuozaishi = fangchanSuozaishi;
	}

	@Column(name = "FangchanSuozaiqu", length = 50)
	public String getFangchanSuozaiqu() {
		return this.fangchanSuozaiqu;
	}

	public void setFangchanSuozaiqu(String fangchanSuozaiqu) {
		this.fangchanSuozaiqu = fangchanSuozaiqu;
	}

	@Column(name = "FangchanDizhi", length = 500)
	public String getFangchanDizhi() {
		return this.fangchanDizhi;
	}

	public void setFangchanDizhi(String fangchanDizhi) {
		this.fangchanDizhi = fangchanDizhi;
	}

	@Column(name = "FYLeixing", length = 50)
	public String getFyleixing() {
		return this.fyleixing;
	}

	public void setFyleixing(String fyleixing) {
		this.fyleixing = fyleixing;
	}

	@Column(name = "FYLouceng")
	public Short getFylouceng() {
		return this.fylouceng;
	}

	public void setFylouceng(Short fylouceng) {
		this.fylouceng = fylouceng;
	}

	@Column(name = "FYChuzuFangshi", length = 10)
	public String getFychuzuFangshi() {
		return this.fychuzuFangshi;
	}

	public void setFychuzuFangshi(String fychuzuFangshi) {
		this.fychuzuFangshi = fychuzuFangshi;
	}

	@Column(name = "YJJiaoyi", length = 10)
	public String getYjjiaoyi() {
		return this.yjjiaoyi;
	}

	public void setYjjiaoyi(String yjjiaoyi) {
		this.yjjiaoyi = yjjiaoyi;
	}

	@Column(name = "JiadianShebei", length = 100)
	public String getJiadianShebei() {
		return this.jiadianShebei;
	}

	public void setJiadianShebei(String jiadianShebei) {
		this.jiadianShebei = jiadianShebei;
	}

	@Column(name = "JiajuSheshi", length = 100)
	public String getJiajuSheshi() {
		return this.jiajuSheshi;
	}

	public void setJiajuSheshi(String jiajuSheshi) {
		this.jiajuSheshi = jiajuSheshi;
	}

	@Column(name = "FYMianji")
	public Short getFymianji() {
		return this.fymianji;
	}

	public void setFymianji(Short fymianji) {
		this.fymianji = fymianji;
	}

	@Column(name = "FYZhuangxiu", length = 10)
	public String getFyzhuangxiu() {
		return this.fyzhuangxiu;
	}

	public void setFyzhuangxiu(String fyzhuangxiu) {
		this.fyzhuangxiu = fyzhuangxiu;
	}

	@Column(name = "FYChaoxiang", length = 50)
	public String getFychaoxiang() {
		return this.fychaoxiang;
	}

	public void setFychaoxiang(String fychaoxiang) {
		this.fychaoxiang = fychaoxiang;
	}

	@Column(name = "FYJieshaoBiaoti", length = 50)
	public String getFyjieshaoBiaoti() {
		return this.fyjieshaoBiaoti;
	}

	public void setFyjieshaoBiaoti(String fyjieshaoBiaoti) {
		this.fyjieshaoBiaoti = fyjieshaoBiaoti;
	}

	@Column(name = "FYMiaoshu")
	public String getFymiaoshu() {
		return this.fymiaoshu;
	}

	public void setFymiaoshu(String fymiaoshu) {
		this.fymiaoshu = fymiaoshu;
	}

	@Column(name = "FYTupian")
	public String getFytupian() {
		return this.fytupian;
	}

	public void setFytupian(String fytupian) {
		this.fytupian = fytupian;
	}

	@Column(name = "FYBiaoqian", length = 50)
	public String getFybiaoqian() {
		return this.fybiaoqian;
	}

	public void setFybiaoqian(String fybiaoqian) {
		this.fybiaoqian = fybiaoqian;
	}

	@Column(name = "YuqiJiage", scale = 4)
	public Double getYuqiJiage() {
		return this.yuqiJiage;
	}

	public void setYuqiJiage(Double yuqiJiage) {
		this.yuqiJiage = yuqiJiage;
	}

	@Column(name = "FYZhuangtai", length = 10)
	public String getFyzhuangtai() {
		return this.fyzhuangtai;
	}

	public void setFyzhuangtai(String fyzhuangtai) {
		this.fyzhuangtai = fyzhuangtai;
	}

	@Column(name = "FYFabuShijian", length = 23)
	public Timestamp getFyfabuShijian() {
		return this.fyfabuShijian;
	}

	public void setFyfabuShijian(Timestamp fyfabuShijian) {
		this.fyfabuShijian = fyfabuShijian;
	}

	@Column(name = "Note", length = 500)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "TFangyuan")
	public Set<THetong> getTHetongs() {
		return this.THetongs;
	}

	public void setTHetongs(Set<THetong> THetongs) {
		this.THetongs = THetongs;
	}

}