package com.ivm.bupazu.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TJiaoyi entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_Jiaoyi", schema = "dbo", catalog = "qds120817210_db")
public class TJiaoyi implements java.io.Serializable {

	// Fields

	private Long jyid;
	private Long htid;
	private Long jyjiafangId;
	private String jyjiafangName;
	private Long jyyifangId;
	private String jyyifangName;
	private Timestamp jyshijian;
	private String shiyongPingtai;
	private String sanfangJyid;
	private String sanfangXiaoxiQuanwen;
	private Double jinE;
	private String sanfangJiaoyiZhuangtai;
	private String jyfuyan;
	private String note;

	// Constructors

	/** default constructor */
	public TJiaoyi() {
	}

	/** minimal constructor */
	public TJiaoyi(Long htid, Long jyjiafangId, String jyjiafangName,
			Long jyyifangId, String jyyifangName, Timestamp jyshijian,
			String shiyongPingtai, String sanfangJyid,
			String sanfangXiaoxiQuanwen, Double jinE,
			String sanfangJiaoyiZhuangtai) {
		this.htid = htid;
		this.jyjiafangId = jyjiafangId;
		this.jyjiafangName = jyjiafangName;
		this.jyyifangId = jyyifangId;
		this.jyyifangName = jyyifangName;
		this.jyshijian = jyshijian;
		this.shiyongPingtai = shiyongPingtai;
		this.sanfangJyid = sanfangJyid;
		this.sanfangXiaoxiQuanwen = sanfangXiaoxiQuanwen;
		this.jinE = jinE;
		this.sanfangJiaoyiZhuangtai = sanfangJiaoyiZhuangtai;
	}

	/** full constructor */
	public TJiaoyi(Long htid, Long jyjiafangId, String jyjiafangName,
			Long jyyifangId, String jyyifangName, Timestamp jyshijian,
			String shiyongPingtai, String sanfangJyid,
			String sanfangXiaoxiQuanwen, Double jinE,
			String sanfangJiaoyiZhuangtai, String jyfuyan, String note) {
		this.htid = htid;
		this.jyjiafangId = jyjiafangId;
		this.jyjiafangName = jyjiafangName;
		this.jyyifangId = jyyifangId;
		this.jyyifangName = jyyifangName;
		this.jyshijian = jyshijian;
		this.shiyongPingtai = shiyongPingtai;
		this.sanfangJyid = sanfangJyid;
		this.sanfangXiaoxiQuanwen = sanfangXiaoxiQuanwen;
		this.jinE = jinE;
		this.sanfangJiaoyiZhuangtai = sanfangJiaoyiZhuangtai;
		this.jyfuyan = jyfuyan;
		this.note = note;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "JYID", unique = true, nullable = false)
	public Long getJyid() {
		return this.jyid;
	}

	public void setJyid(Long jyid) {
		this.jyid = jyid;
	}

	@Column(name = "HTID", nullable = false)
	public Long getHtid() {
		return this.htid;
	}

	public void setHtid(Long htid) {
		this.htid = htid;
	}

	@Column(name = "JYJiafangID", nullable = false)
	public Long getJyjiafangId() {
		return this.jyjiafangId;
	}

	public void setJyjiafangId(Long jyjiafangId) {
		this.jyjiafangId = jyjiafangId;
	}

	@Column(name = "JYJiafangName", nullable = false, length = 50)
	public String getJyjiafangName() {
		return this.jyjiafangName;
	}

	public void setJyjiafangName(String jyjiafangName) {
		this.jyjiafangName = jyjiafangName;
	}

	@Column(name = "JYYifangID", nullable = false)
	public Long getJyyifangId() {
		return this.jyyifangId;
	}

	public void setJyyifangId(Long jyyifangId) {
		this.jyyifangId = jyyifangId;
	}

	@Column(name = "JYYifangName", nullable = false, length = 50)
	public String getJyyifangName() {
		return this.jyyifangName;
	}

	public void setJyyifangName(String jyyifangName) {
		this.jyyifangName = jyyifangName;
	}

	@Column(name = "JYShijian", nullable = false, length = 16)
	public Timestamp getJyshijian() {
		return this.jyshijian;
	}

	public void setJyshijian(Timestamp jyshijian) {
		this.jyshijian = jyshijian;
	}

	@Column(name = "ShiyongPingtai", nullable = false, length = 50)
	public String getShiyongPingtai() {
		return this.shiyongPingtai;
	}

	public void setShiyongPingtai(String shiyongPingtai) {
		this.shiyongPingtai = shiyongPingtai;
	}

	@Column(name = "SanfangJYID", nullable = false, length = 500)
	public String getSanfangJyid() {
		return this.sanfangJyid;
	}

	public void setSanfangJyid(String sanfangJyid) {
		this.sanfangJyid = sanfangJyid;
	}

	@Column(name = "SanfangXiaoxiQuanwen", nullable = false)
	public String getSanfangXiaoxiQuanwen() {
		return this.sanfangXiaoxiQuanwen;
	}

	public void setSanfangXiaoxiQuanwen(String sanfangXiaoxiQuanwen) {
		this.sanfangXiaoxiQuanwen = sanfangXiaoxiQuanwen;
	}

	@Column(name = "JinE", nullable = false, scale = 4)
	public Double getJinE() {
		return this.jinE;
	}

	public void setJinE(Double jinE) {
		this.jinE = jinE;
	}

	@Column(name = "SanfangJiaoyiZhuangtai", nullable = false, length = 500)
	public String getSanfangJiaoyiZhuangtai() {
		return this.sanfangJiaoyiZhuangtai;
	}

	public void setSanfangJiaoyiZhuangtai(String sanfangJiaoyiZhuangtai) {
		this.sanfangJiaoyiZhuangtai = sanfangJiaoyiZhuangtai;
	}

	@Column(name = "JYFuyan", length = 500)
	public String getJyfuyan() {
		return this.jyfuyan;
	}

	public void setJyfuyan(String jyfuyan) {
		this.jyfuyan = jyfuyan;
	}

	@Column(name = "Note")
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}