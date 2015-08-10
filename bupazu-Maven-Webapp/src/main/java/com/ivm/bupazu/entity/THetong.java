package com.ivm.bupazu.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * THetong entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_Hetong", schema = "dbo", catalog = "qds120817210_db")
public class THetong implements java.io.Serializable {

	// Fields

	private Long htid;
	private TFangyuan TFangyuan;
	private String jiafangName;
	private String yifangName;
	private String jiafangShenfenzheng;
	private String yifangShenfenzheng;
	private String htfangchanDizhi;
	private String htfangchanZhushi;
	private Timestamp htqiandingShijian;
	private Double fangzuJiage;
	private Double yajinE;
	private Short fangzuFukuanZhouqi;
	private String yanggouTiaokuan;
	private String xiyanTiaokuan;
	private Short maxJuzhurenshu;
	private String otherTiaokuan;
	private String shuifeiTiaokuan;
	private String dianfeiTiaokuan;
	private String qifeiTiaokuan;
	private String wangfeiTiaokuan;
	private String wuyeFei;
	private String youxiandianshiFei;
	private String jiaofeiFangshi;
	private String xieyiFuBingfangTiaokuan;
	private Double xieyiFuBingfangJinE;
	private String qiangzhiJieyuefang;
	private String qiangjieFufeiTiaokuan;
	private Double qiangjieFufeiJinE;
	private String qiangjieFubingTiaokuan;
	private Double qiangjieFubingJinE;
	private String url;
	private String sign;
	private Timestamp signTime;
	private String heying;
	private String htshengchengBiaozhi;
	private Timestamp zuqiKaishiShijian;
	private Timestamp zuqiJieshuShijian;
	private Timestamp htdaoqiShijian;
	private Timestamp htxuyuehouShijian;
	private String htxuyueBiaozhi;
	private Short htzhuangtai;
	private Timestamp htjieshuShijian;
	private String htjieshuYuanyin;
	private String htjieshuBeizhu;
	private String note;

	// Constructors

	/** default constructor */
	public THetong() {
	}

	/** minimal constructor */
	public THetong(TFangyuan TFangyuan, String jiafangName, String yifangName,
			String jiafangShenfenzheng, String yifangShenfenzheng,
			String htfangchanDizhi, Timestamp htqiandingShijian,
			Double fangzuJiage, Double yajinE, Short fangzuFukuanZhouqi,
			String yanggouTiaokuan, String xiyanTiaokuan, Short maxJuzhurenshu,
			String otherTiaokuan, String shuifeiTiaokuan,
			String dianfeiTiaokuan, String qifeiTiaokuan,
			String wangfeiTiaokuan, String wuyeFei, String youxiandianshiFei,
			String jiaofeiFangshi, String xieyiFuBingfangTiaokuan,
			Double xieyiFuBingfangJinE, String url, String sign,
			Timestamp signTime, String heying, String htshengchengBiaozhi,
			Timestamp zuqiKaishiShijian, Timestamp zuqiJieshuShijian,
			Timestamp htdaoqiShijian, String htxuyueBiaozhi, Short htzhuangtai) {
		this.TFangyuan = TFangyuan;
		this.jiafangName = jiafangName;
		this.yifangName = yifangName;
		this.jiafangShenfenzheng = jiafangShenfenzheng;
		this.yifangShenfenzheng = yifangShenfenzheng;
		this.htfangchanDizhi = htfangchanDizhi;
		this.htqiandingShijian = htqiandingShijian;
		this.fangzuJiage = fangzuJiage;
		this.yajinE = yajinE;
		this.fangzuFukuanZhouqi = fangzuFukuanZhouqi;
		this.yanggouTiaokuan = yanggouTiaokuan;
		this.xiyanTiaokuan = xiyanTiaokuan;
		this.maxJuzhurenshu = maxJuzhurenshu;
		this.otherTiaokuan = otherTiaokuan;
		this.shuifeiTiaokuan = shuifeiTiaokuan;
		this.dianfeiTiaokuan = dianfeiTiaokuan;
		this.qifeiTiaokuan = qifeiTiaokuan;
		this.wangfeiTiaokuan = wangfeiTiaokuan;
		this.wuyeFei = wuyeFei;
		this.youxiandianshiFei = youxiandianshiFei;
		this.jiaofeiFangshi = jiaofeiFangshi;
		this.xieyiFuBingfangTiaokuan = xieyiFuBingfangTiaokuan;
		this.xieyiFuBingfangJinE = xieyiFuBingfangJinE;
		this.url = url;
		this.sign = sign;
		this.signTime = signTime;
		this.heying = heying;
		this.htshengchengBiaozhi = htshengchengBiaozhi;
		this.zuqiKaishiShijian = zuqiKaishiShijian;
		this.zuqiJieshuShijian = zuqiJieshuShijian;
		this.htdaoqiShijian = htdaoqiShijian;
		this.htxuyueBiaozhi = htxuyueBiaozhi;
		this.htzhuangtai = htzhuangtai;
	}

	/** full constructor */
	public THetong(TFangyuan TFangyuan, String jiafangName, String yifangName,
			String jiafangShenfenzheng, String yifangShenfenzheng,
			String htfangchanDizhi, String htfangchanZhushi,
			Timestamp htqiandingShijian, Double fangzuJiage, Double yajinE,
			Short fangzuFukuanZhouqi, String yanggouTiaokuan,
			String xiyanTiaokuan, Short maxJuzhurenshu, String otherTiaokuan,
			String shuifeiTiaokuan, String dianfeiTiaokuan,
			String qifeiTiaokuan, String wangfeiTiaokuan, String wuyeFei,
			String youxiandianshiFei, String jiaofeiFangshi,
			String xieyiFuBingfangTiaokuan, Double xieyiFuBingfangJinE,
			String qiangzhiJieyuefang, String qiangjieFufeiTiaokuan,
			Double qiangjieFufeiJinE, String qiangjieFubingTiaokuan,
			Double qiangjieFubingJinE, String url, String sign,
			Timestamp signTime, String heying, String htshengchengBiaozhi,
			Timestamp zuqiKaishiShijian, Timestamp zuqiJieshuShijian,
			Timestamp htdaoqiShijian, Timestamp htxuyuehouShijian,
			String htxuyueBiaozhi, Short htzhuangtai,
			Timestamp htjieshuShijian, String htjieshuYuanyin,
			String htjieshuBeizhu, String note) {
		this.TFangyuan = TFangyuan;
		this.jiafangName = jiafangName;
		this.yifangName = yifangName;
		this.jiafangShenfenzheng = jiafangShenfenzheng;
		this.yifangShenfenzheng = yifangShenfenzheng;
		this.htfangchanDizhi = htfangchanDizhi;
		this.htfangchanZhushi = htfangchanZhushi;
		this.htqiandingShijian = htqiandingShijian;
		this.fangzuJiage = fangzuJiage;
		this.yajinE = yajinE;
		this.fangzuFukuanZhouqi = fangzuFukuanZhouqi;
		this.yanggouTiaokuan = yanggouTiaokuan;
		this.xiyanTiaokuan = xiyanTiaokuan;
		this.maxJuzhurenshu = maxJuzhurenshu;
		this.otherTiaokuan = otherTiaokuan;
		this.shuifeiTiaokuan = shuifeiTiaokuan;
		this.dianfeiTiaokuan = dianfeiTiaokuan;
		this.qifeiTiaokuan = qifeiTiaokuan;
		this.wangfeiTiaokuan = wangfeiTiaokuan;
		this.wuyeFei = wuyeFei;
		this.youxiandianshiFei = youxiandianshiFei;
		this.jiaofeiFangshi = jiaofeiFangshi;
		this.xieyiFuBingfangTiaokuan = xieyiFuBingfangTiaokuan;
		this.xieyiFuBingfangJinE = xieyiFuBingfangJinE;
		this.qiangzhiJieyuefang = qiangzhiJieyuefang;
		this.qiangjieFufeiTiaokuan = qiangjieFufeiTiaokuan;
		this.qiangjieFufeiJinE = qiangjieFufeiJinE;
		this.qiangjieFubingTiaokuan = qiangjieFubingTiaokuan;
		this.qiangjieFubingJinE = qiangjieFubingJinE;
		this.url = url;
		this.sign = sign;
		this.signTime = signTime;
		this.heying = heying;
		this.htshengchengBiaozhi = htshengchengBiaozhi;
		this.zuqiKaishiShijian = zuqiKaishiShijian;
		this.zuqiJieshuShijian = zuqiJieshuShijian;
		this.htdaoqiShijian = htdaoqiShijian;
		this.htxuyuehouShijian = htxuyuehouShijian;
		this.htxuyueBiaozhi = htxuyueBiaozhi;
		this.htzhuangtai = htzhuangtai;
		this.htjieshuShijian = htjieshuShijian;
		this.htjieshuYuanyin = htjieshuYuanyin;
		this.htjieshuBeizhu = htjieshuBeizhu;
		this.note = note;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "HTID", unique = true, nullable = false)
	public Long getHtid() {
		return this.htid;
	}

	public void setHtid(Long htid) {
		this.htid = htid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FYID", nullable = false)
	public TFangyuan getTFangyuan() {
		return this.TFangyuan;
	}

	public void setTFangyuan(TFangyuan TFangyuan) {
		this.TFangyuan = TFangyuan;
	}

	@Column(name = "JiafangName", nullable = false, length = 50)
	public String getJiafangName() {
		return this.jiafangName;
	}

	public void setJiafangName(String jiafangName) {
		this.jiafangName = jiafangName;
	}

	@Column(name = "YifangName", nullable = false, length = 50)
	public String getYifangName() {
		return this.yifangName;
	}

	public void setYifangName(String yifangName) {
		this.yifangName = yifangName;
	}

	@Column(name = "JiafangShenfenzheng", nullable = false, length = 50)
	public String getJiafangShenfenzheng() {
		return this.jiafangShenfenzheng;
	}

	public void setJiafangShenfenzheng(String jiafangShenfenzheng) {
		this.jiafangShenfenzheng = jiafangShenfenzheng;
	}

	@Column(name = "YifangShenfenzheng", nullable = false, length = 50)
	public String getYifangShenfenzheng() {
		return this.yifangShenfenzheng;
	}

	public void setYifangShenfenzheng(String yifangShenfenzheng) {
		this.yifangShenfenzheng = yifangShenfenzheng;
	}

	@Column(name = "HTFangchanDizhi", nullable = false, length = 500)
	public String getHtfangchanDizhi() {
		return this.htfangchanDizhi;
	}

	public void setHtfangchanDizhi(String htfangchanDizhi) {
		this.htfangchanDizhi = htfangchanDizhi;
	}

	@Column(name = "HTFangchanZhushi", length = 50)
	public String getHtfangchanZhushi() {
		return this.htfangchanZhushi;
	}

	public void setHtfangchanZhushi(String htfangchanZhushi) {
		this.htfangchanZhushi = htfangchanZhushi;
	}

	@Column(name = "HTQiandingShijian", nullable = false, length = 23)
	public Timestamp getHtqiandingShijian() {
		return this.htqiandingShijian;
	}

	public void setHtqiandingShijian(Timestamp htqiandingShijian) {
		this.htqiandingShijian = htqiandingShijian;
	}

	@Column(name = "FangzuJiage", nullable = false, scale = 4)
	public Double getFangzuJiage() {
		return this.fangzuJiage;
	}

	public void setFangzuJiage(Double fangzuJiage) {
		this.fangzuJiage = fangzuJiage;
	}

	@Column(name = "YajinE", nullable = false, scale = 4)
	public Double getYajinE() {
		return this.yajinE;
	}

	public void setYajinE(Double yajinE) {
		this.yajinE = yajinE;
	}

	@Column(name = "FangzuFukuanZhouqi", nullable = false)
	public Short getFangzuFukuanZhouqi() {
		return this.fangzuFukuanZhouqi;
	}

	public void setFangzuFukuanZhouqi(Short fangzuFukuanZhouqi) {
		this.fangzuFukuanZhouqi = fangzuFukuanZhouqi;
	}

	@Column(name = "YanggouTiaokuan", nullable = false, length = 500)
	public String getYanggouTiaokuan() {
		return this.yanggouTiaokuan;
	}

	public void setYanggouTiaokuan(String yanggouTiaokuan) {
		this.yanggouTiaokuan = yanggouTiaokuan;
	}

	@Column(name = "XiyanTiaokuan", nullable = false, length = 500)
	public String getXiyanTiaokuan() {
		return this.xiyanTiaokuan;
	}

	public void setXiyanTiaokuan(String xiyanTiaokuan) {
		this.xiyanTiaokuan = xiyanTiaokuan;
	}

	@Column(name = "MaxJuzhurenshu", nullable = false)
	public Short getMaxJuzhurenshu() {
		return this.maxJuzhurenshu;
	}

	public void setMaxJuzhurenshu(Short maxJuzhurenshu) {
		this.maxJuzhurenshu = maxJuzhurenshu;
	}

	@Column(name = "OtherTiaokuan", nullable = false)
	public String getOtherTiaokuan() {
		return this.otherTiaokuan;
	}

	public void setOtherTiaokuan(String otherTiaokuan) {
		this.otherTiaokuan = otherTiaokuan;
	}

	@Column(name = "ShuifeiTiaokuan", nullable = false, length = 500)
	public String getShuifeiTiaokuan() {
		return this.shuifeiTiaokuan;
	}

	public void setShuifeiTiaokuan(String shuifeiTiaokuan) {
		this.shuifeiTiaokuan = shuifeiTiaokuan;
	}

	@Column(name = "DianfeiTiaokuan", nullable = false, length = 500)
	public String getDianfeiTiaokuan() {
		return this.dianfeiTiaokuan;
	}

	public void setDianfeiTiaokuan(String dianfeiTiaokuan) {
		this.dianfeiTiaokuan = dianfeiTiaokuan;
	}

	@Column(name = "QifeiTiaokuan", nullable = false, length = 500)
	public String getQifeiTiaokuan() {
		return this.qifeiTiaokuan;
	}

	public void setQifeiTiaokuan(String qifeiTiaokuan) {
		this.qifeiTiaokuan = qifeiTiaokuan;
	}

	@Column(name = "WangfeiTiaokuan", nullable = false, length = 500)
	public String getWangfeiTiaokuan() {
		return this.wangfeiTiaokuan;
	}

	public void setWangfeiTiaokuan(String wangfeiTiaokuan) {
		this.wangfeiTiaokuan = wangfeiTiaokuan;
	}

	@Column(name = "WuyeFei", nullable = false, length = 500)
	public String getWuyeFei() {
		return this.wuyeFei;
	}

	public void setWuyeFei(String wuyeFei) {
		this.wuyeFei = wuyeFei;
	}

	@Column(name = "YouxiandianshiFei", nullable = false, length = 500)
	public String getYouxiandianshiFei() {
		return this.youxiandianshiFei;
	}

	public void setYouxiandianshiFei(String youxiandianshiFei) {
		this.youxiandianshiFei = youxiandianshiFei;
	}

	@Column(name = "JiaofeiFangshi", nullable = false, length = 10)
	public String getJiaofeiFangshi() {
		return this.jiaofeiFangshi;
	}

	public void setJiaofeiFangshi(String jiaofeiFangshi) {
		this.jiaofeiFangshi = jiaofeiFangshi;
	}

	@Column(name = "XieyiFuBingfangTiaokuan", nullable = false, length = 500)
	public String getXieyiFuBingfangTiaokuan() {
		return this.xieyiFuBingfangTiaokuan;
	}

	public void setXieyiFuBingfangTiaokuan(String xieyiFuBingfangTiaokuan) {
		this.xieyiFuBingfangTiaokuan = xieyiFuBingfangTiaokuan;
	}

	@Column(name = "XieyiFuBingfangJinE", nullable = false, scale = 4)
	public Double getXieyiFuBingfangJinE() {
		return this.xieyiFuBingfangJinE;
	}

	public void setXieyiFuBingfangJinE(Double xieyiFuBingfangJinE) {
		this.xieyiFuBingfangJinE = xieyiFuBingfangJinE;
	}

	@Column(name = "QiangzhiJieyuefang", length = 10)
	public String getQiangzhiJieyuefang() {
		return this.qiangzhiJieyuefang;
	}

	public void setQiangzhiJieyuefang(String qiangzhiJieyuefang) {
		this.qiangzhiJieyuefang = qiangzhiJieyuefang;
	}

	@Column(name = "QiangjieFufeiTiaokuan", length = 500)
	public String getQiangjieFufeiTiaokuan() {
		return this.qiangjieFufeiTiaokuan;
	}

	public void setQiangjieFufeiTiaokuan(String qiangjieFufeiTiaokuan) {
		this.qiangjieFufeiTiaokuan = qiangjieFufeiTiaokuan;
	}

	@Column(name = "QiangjieFufeiJinE", scale = 4)
	public Double getQiangjieFufeiJinE() {
		return this.qiangjieFufeiJinE;
	}

	public void setQiangjieFufeiJinE(Double qiangjieFufeiJinE) {
		this.qiangjieFufeiJinE = qiangjieFufeiJinE;
	}

	@Column(name = "QiangjieFubingTiaokuan", length = 500)
	public String getQiangjieFubingTiaokuan() {
		return this.qiangjieFubingTiaokuan;
	}

	public void setQiangjieFubingTiaokuan(String qiangjieFubingTiaokuan) {
		this.qiangjieFubingTiaokuan = qiangjieFubingTiaokuan;
	}

	@Column(name = "QiangjieFubingJinE", scale = 4)
	public Double getQiangjieFubingJinE() {
		return this.qiangjieFubingJinE;
	}

	public void setQiangjieFubingJinE(Double qiangjieFubingJinE) {
		this.qiangjieFubingJinE = qiangjieFubingJinE;
	}

	@Column(name = "URL", nullable = false, length = 500)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "Sign", nullable = false, length = 50)
	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	@Column(name = "SignTime", nullable = false, length = 23)
	public Timestamp getSignTime() {
		return this.signTime;
	}

	public void setSignTime(Timestamp signTime) {
		this.signTime = signTime;
	}

	@Column(name = "Heying", nullable = false)
	public String getHeying() {
		return this.heying;
	}

	public void setHeying(String heying) {
		this.heying = heying;
	}

	@Column(name = "HTShengchengBiaozhi", nullable = false, length = 10)
	public String getHtshengchengBiaozhi() {
		return this.htshengchengBiaozhi;
	}

	public void setHtshengchengBiaozhi(String htshengchengBiaozhi) {
		this.htshengchengBiaozhi = htshengchengBiaozhi;
	}

	@Column(name = "ZuqiKaishiShijian", nullable = false, length = 16)
	public Timestamp getZuqiKaishiShijian() {
		return this.zuqiKaishiShijian;
	}

	public void setZuqiKaishiShijian(Timestamp zuqiKaishiShijian) {
		this.zuqiKaishiShijian = zuqiKaishiShijian;
	}

	@Column(name = "ZuqiJieshuShijian", nullable = false, length = 16)
	public Timestamp getZuqiJieshuShijian() {
		return this.zuqiJieshuShijian;
	}

	public void setZuqiJieshuShijian(Timestamp zuqiJieshuShijian) {
		this.zuqiJieshuShijian = zuqiJieshuShijian;
	}

	@Column(name = "HTDaoqiShijian", nullable = false, length = 16)
	public Timestamp getHtdaoqiShijian() {
		return this.htdaoqiShijian;
	}

	public void setHtdaoqiShijian(Timestamp htdaoqiShijian) {
		this.htdaoqiShijian = htdaoqiShijian;
	}

	@Column(name = "HTXuyuehouShijian", length = 16)
	public Timestamp getHtxuyuehouShijian() {
		return this.htxuyuehouShijian;
	}

	public void setHtxuyuehouShijian(Timestamp htxuyuehouShijian) {
		this.htxuyuehouShijian = htxuyuehouShijian;
	}

	@Column(name = "HTXuyueBiaozhi", nullable = false, length = 10)
	public String getHtxuyueBiaozhi() {
		return this.htxuyueBiaozhi;
	}

	public void setHtxuyueBiaozhi(String htxuyueBiaozhi) {
		this.htxuyueBiaozhi = htxuyueBiaozhi;
	}

	@Column(name = "HTZhuangtai", nullable = false)
	public Short getHtzhuangtai() {
		return this.htzhuangtai;
	}

	public void setHtzhuangtai(Short htzhuangtai) {
		this.htzhuangtai = htzhuangtai;
	}

	@Column(name = "HTJieshuShijian", length = 16)
	public Timestamp getHtjieshuShijian() {
		return this.htjieshuShijian;
	}

	public void setHtjieshuShijian(Timestamp htjieshuShijian) {
		this.htjieshuShijian = htjieshuShijian;
	}

	@Column(name = "HTJieshuYuanyin", length = 500)
	public String getHtjieshuYuanyin() {
		return this.htjieshuYuanyin;
	}

	public void setHtjieshuYuanyin(String htjieshuYuanyin) {
		this.htjieshuYuanyin = htjieshuYuanyin;
	}

	@Column(name = "HTjieshuBeizhu")
	public String getHtjieshuBeizhu() {
		return this.htjieshuBeizhu;
	}

	public void setHtjieshuBeizhu(String htjieshuBeizhu) {
		this.htjieshuBeizhu = htjieshuBeizhu;
	}

	@Column(name = "Note")
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}