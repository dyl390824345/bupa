package com.ivm.bupazu.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TYonghu entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_Yonghu", schema = "dbo", catalog = "qds120817210_db")
public class TYonghu implements java.io.Serializable {

	// Fields

	private Long yhid;
	private String yhname;
	private String yhzhenshiXingming;
	private String yhmima;
	private String yhxingbie;
	private String yhtouXiang;
	private String yhzhuShouji;
	private String yhbeiyongShouji;
	private String yhzhuYouxiang;
	private String yhbeiyongYouxiang;
	private String yhshenfenzheng;
	private String yhqq;
	private String yhweibo;
	private String yhweixin;
	private String yhqianming;
	private String note;
	private Double yhxinyongDengji;
	private Double yhzijinYuE;
	private Double yhkequZijinYuE;
	private Double yhdongjieZijinYuE;
	private Double yhyajinJinE;
	private String yhzhifubaoZhanghao;
	private String yhmorenbiaozhi;
	private String yhcaifutongZhanghao;
	private String yhyinlianZhanghao;
	private String yhshouzuYinhangka;
	private String yhshouzuKaihuhang;
	private Short yhdengluShenfen;
	private Timestamp yhzhuceShijian;
	private Timestamp yhshangciDengluShijian;

	// Constructors

	/** default constructor */
	public TYonghu() {
	}

	/** minimal constructor */
	public TYonghu(String yhmima, String yhzhuShouji, Double yhzijinYuE,
			Double yhkequZijinYuE, Double yhdongjieZijinYuE,
			Double yhyajinJinE, Short yhdengluShenfen,
			Timestamp yhzhuceShijian, Timestamp yhshangciDengluShijian) {
		this.yhmima = yhmima;
		this.yhzhuShouji = yhzhuShouji;
		this.yhzijinYuE = yhzijinYuE;
		this.yhkequZijinYuE = yhkequZijinYuE;
		this.yhdongjieZijinYuE = yhdongjieZijinYuE;
		this.yhyajinJinE = yhyajinJinE;
		this.yhdengluShenfen = yhdengluShenfen;
		this.yhzhuceShijian = yhzhuceShijian;
		this.yhshangciDengluShijian = yhshangciDengluShijian;
	}

	/** full constructor */
	public TYonghu(String yhname, String yhzhenshiXingming, String yhmima,
			String yhxingbie, String yhtouXiang, String yhzhuShouji,
			String yhbeiyongShouji, String yhzhuYouxiang,
			String yhbeiyongYouxiang, String yhshenfenzheng, String yhqq,
			String yhweibo, String yhweixin, String yhqianming, String note,
			Double yhxinyongDengji, Double yhzijinYuE, Double yhkequZijinYuE,
			Double yhdongjieZijinYuE, Double yhyajinJinE,
			String yhzhifubaoZhanghao, String yhmorenbiaozhi,
			String yhcaifutongZhanghao, String yhyinlianZhanghao,
			String yhshouzuYinhangka, String yhshouzuKaihuhang,
			Short yhdengluShenfen, Timestamp yhzhuceShijian,
			Timestamp yhshangciDengluShijian) {
		this.yhname = yhname;
		this.yhzhenshiXingming = yhzhenshiXingming;
		this.yhmima = yhmima;
		this.yhxingbie = yhxingbie;
		this.yhtouXiang = yhtouXiang;
		this.yhzhuShouji = yhzhuShouji;
		this.yhbeiyongShouji = yhbeiyongShouji;
		this.yhzhuYouxiang = yhzhuYouxiang;
		this.yhbeiyongYouxiang = yhbeiyongYouxiang;
		this.yhshenfenzheng = yhshenfenzheng;
		this.yhqq = yhqq;
		this.yhweibo = yhweibo;
		this.yhweixin = yhweixin;
		this.yhqianming = yhqianming;
		this.note = note;
		this.yhxinyongDengji = yhxinyongDengji;
		this.yhzijinYuE = yhzijinYuE;
		this.yhkequZijinYuE = yhkequZijinYuE;
		this.yhdongjieZijinYuE = yhdongjieZijinYuE;
		this.yhyajinJinE = yhyajinJinE;
		this.yhzhifubaoZhanghao = yhzhifubaoZhanghao;
		this.yhmorenbiaozhi = yhmorenbiaozhi;
		this.yhcaifutongZhanghao = yhcaifutongZhanghao;
		this.yhyinlianZhanghao = yhyinlianZhanghao;
		this.yhshouzuYinhangka = yhshouzuYinhangka;
		this.yhshouzuKaihuhang = yhshouzuKaihuhang;
		this.yhdengluShenfen = yhdengluShenfen;
		this.yhzhuceShijian = yhzhuceShijian;
		this.yhshangciDengluShijian = yhshangciDengluShijian;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "YHID", unique = true, nullable = false)
	public Long getYhid() {
		return this.yhid;
	}

	public void setYhid(Long yhid) {
		this.yhid = yhid;
	}

	@Column(name = "YHName", length = 50)
	public String getYhname() {
		return this.yhname;
	}

	public void setYhname(String yhname) {
		this.yhname = yhname;
	}

	@Column(name = "YHZhenshiXingming", length = 50)
	public String getYhzhenshiXingming() {
		return this.yhzhenshiXingming;
	}

	public void setYhzhenshiXingming(String yhzhenshiXingming) {
		this.yhzhenshiXingming = yhzhenshiXingming;
	}

	@Column(name = "YHMima", nullable = false, length = 50)
	public String getYhmima() {
		return this.yhmima;
	}

	public void setYhmima(String yhmima) {
		this.yhmima = yhmima;
	}

	@Column(name = "YHXingbie", length = 10)
	public String getYhxingbie() {
		return this.yhxingbie;
	}

	public void setYhxingbie(String yhxingbie) {
		this.yhxingbie = yhxingbie;
	}

	@Column(name = "YHTouXiang")
	public String getYhtouXiang() {
		return this.yhtouXiang;
	}

	public void setYhtouXiang(String yhtouXiang) {
		this.yhtouXiang = yhtouXiang;
	}

	@Column(name = "YHZhuShouji", nullable = false, length = 50)
	public String getYhzhuShouji() {
		return this.yhzhuShouji;
	}

	public void setYhzhuShouji(String yhzhuShouji) {
		this.yhzhuShouji = yhzhuShouji;
	}

	@Column(name = "YHBeiyongShouji", length = 50)
	public String getYhbeiyongShouji() {
		return this.yhbeiyongShouji;
	}

	public void setYhbeiyongShouji(String yhbeiyongShouji) {
		this.yhbeiyongShouji = yhbeiyongShouji;
	}

	@Column(name = "YHZhuYouxiang", length = 50)
	public String getYhzhuYouxiang() {
		return this.yhzhuYouxiang;
	}

	public void setYhzhuYouxiang(String yhzhuYouxiang) {
		this.yhzhuYouxiang = yhzhuYouxiang;
	}

	@Column(name = "YHBeiyongYouxiang", length = 50)
	public String getYhbeiyongYouxiang() {
		return this.yhbeiyongYouxiang;
	}

	public void setYhbeiyongYouxiang(String yhbeiyongYouxiang) {
		this.yhbeiyongYouxiang = yhbeiyongYouxiang;
	}

	@Column(name = "YHShenfenzheng", length = 50)
	public String getYhshenfenzheng() {
		return this.yhshenfenzheng;
	}

	public void setYhshenfenzheng(String yhshenfenzheng) {
		this.yhshenfenzheng = yhshenfenzheng;
	}

	@Column(name = "YHQQ", length = 50)
	public String getYhqq() {
		return this.yhqq;
	}

	public void setYhqq(String yhqq) {
		this.yhqq = yhqq;
	}

	@Column(name = "YHWeibo", length = 50)
	public String getYhweibo() {
		return this.yhweibo;
	}

	public void setYhweibo(String yhweibo) {
		this.yhweibo = yhweibo;
	}

	@Column(name = "YHWeixin", length = 50)
	public String getYhweixin() {
		return this.yhweixin;
	}

	public void setYhweixin(String yhweixin) {
		this.yhweixin = yhweixin;
	}

	@Column(name = "YHQianming", length = 500)
	public String getYhqianming() {
		return this.yhqianming;
	}

	public void setYhqianming(String yhqianming) {
		this.yhqianming = yhqianming;
	}

	@Column(name = "Note", length = 500)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Column(name = "YHXinyongDengji", precision = 18, scale = 4)
	public Double getYhxinyongDengji() {
		return this.yhxinyongDengji;
	}

	public void setYhxinyongDengji(Double yhxinyongDengji) {
		this.yhxinyongDengji = yhxinyongDengji;
	}

	@Column(name = "YHZijinYuE", nullable = false, scale = 4)
	public Double getYhzijinYuE() {
		return this.yhzijinYuE;
	}

	public void setYhzijinYuE(Double yhzijinYuE) {
		this.yhzijinYuE = yhzijinYuE;
	}

	@Column(name = "YHKequZijinYuE", nullable = false, scale = 4)
	public Double getYhkequZijinYuE() {
		return this.yhkequZijinYuE;
	}

	public void setYhkequZijinYuE(Double yhkequZijinYuE) {
		this.yhkequZijinYuE = yhkequZijinYuE;
	}

	@Column(name = "YHDongjieZijinYuE", nullable = false, scale = 4)
	public Double getYhdongjieZijinYuE() {
		return this.yhdongjieZijinYuE;
	}

	public void setYhdongjieZijinYuE(Double yhdongjieZijinYuE) {
		this.yhdongjieZijinYuE = yhdongjieZijinYuE;
	}

	@Column(name = "YHYajinJinE", nullable = false, scale = 4)
	public Double getYhyajinJinE() {
		return this.yhyajinJinE;
	}

	public void setYhyajinJinE(Double yhyajinJinE) {
		this.yhyajinJinE = yhyajinJinE;
	}

	@Column(name = "YHZhifubaoZhanghao", length = 50)
	public String getYhzhifubaoZhanghao() {
		return this.yhzhifubaoZhanghao;
	}

	public void setYhzhifubaoZhanghao(String yhzhifubaoZhanghao) {
		this.yhzhifubaoZhanghao = yhzhifubaoZhanghao;
	}

	@Column(name = "YHMorenbiaozhi", length = 10)
	public String getYhmorenbiaozhi() {
		return this.yhmorenbiaozhi;
	}

	public void setYhmorenbiaozhi(String yhmorenbiaozhi) {
		this.yhmorenbiaozhi = yhmorenbiaozhi;
	}

	@Column(name = "YHCaifutongZhanghao", length = 50)
	public String getYhcaifutongZhanghao() {
		return this.yhcaifutongZhanghao;
	}

	public void setYhcaifutongZhanghao(String yhcaifutongZhanghao) {
		this.yhcaifutongZhanghao = yhcaifutongZhanghao;
	}

	@Column(name = "YHYinlianZhanghao", length = 50)
	public String getYhyinlianZhanghao() {
		return this.yhyinlianZhanghao;
	}

	public void setYhyinlianZhanghao(String yhyinlianZhanghao) {
		this.yhyinlianZhanghao = yhyinlianZhanghao;
	}

	@Column(name = "YHShouzuYinhangka", length = 50)
	public String getYhshouzuYinhangka() {
		return this.yhshouzuYinhangka;
	}

	public void setYhshouzuYinhangka(String yhshouzuYinhangka) {
		this.yhshouzuYinhangka = yhshouzuYinhangka;
	}

	@Column(name = "YHShouzuKaihuhang", length = 50)
	public String getYhshouzuKaihuhang() {
		return this.yhshouzuKaihuhang;
	}

	public void setYhshouzuKaihuhang(String yhshouzuKaihuhang) {
		this.yhshouzuKaihuhang = yhshouzuKaihuhang;
	}

	@Column(name = "YHDengluShenfen", nullable = false)
	public Short getYhdengluShenfen() {
		return this.yhdengluShenfen;
	}

	public void setYhdengluShenfen(Short yhdengluShenfen) {
		this.yhdengluShenfen = yhdengluShenfen;
	}

	@Column(name = "YHZhuceShijian", nullable = false, length = 23)
	public Timestamp getYhzhuceShijian() {
		return this.yhzhuceShijian;
	}

	public void setYhzhuceShijian(Timestamp yhzhuceShijian) {
		this.yhzhuceShijian = yhzhuceShijian;
	}

	@Column(name = "YHShangciDengluShijian", nullable = false, length = 23)
	public Timestamp getYhshangciDengluShijian() {
		return this.yhshangciDengluShijian;
	}

	public void setYhshangciDengluShijian(Timestamp yhshangciDengluShijian) {
		this.yhshangciDengluShijian = yhshangciDengluShijian;
	}

}