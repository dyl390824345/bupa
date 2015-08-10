package com.ivm.bupazu.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TXiaoxi entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_Xiaoxi", schema = "dbo", catalog = "qds120817210_db")
public class TXiaoxi implements java.io.Serializable {

	// Fields

	private Long msgid;
	private Long msgfasongzheId;
	private Long msgjieshouzheId;
	private String msgneirong;
	private String msgzhuangtai;
	private Timestamp msgfabuShijian;
	private String note;

	// Constructors

	/** default constructor */
	public TXiaoxi() {
	}

	/** minimal constructor */
	public TXiaoxi(Long msgfasongzheId, Long msgjieshouzheId, String msgneirong) {
		this.msgfasongzheId = msgfasongzheId;
		this.msgjieshouzheId = msgjieshouzheId;
		this.msgneirong = msgneirong;
	}

	/** full constructor */
	public TXiaoxi(Long msgfasongzheId, Long msgjieshouzheId,
			String msgneirong, String msgzhuangtai, Timestamp msgfabuShijian,
			String note) {
		this.msgfasongzheId = msgfasongzheId;
		this.msgjieshouzheId = msgjieshouzheId;
		this.msgneirong = msgneirong;
		this.msgzhuangtai = msgzhuangtai;
		this.msgfabuShijian = msgfabuShijian;
		this.note = note;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "MSGID", unique = true, nullable = false)
	public Long getMsgid() {
		return this.msgid;
	}

	public void setMsgid(Long msgid) {
		this.msgid = msgid;
	}

	@Column(name = "MSGFasongzheID", nullable = false)
	public Long getMsgfasongzheId() {
		return this.msgfasongzheId;
	}

	public void setMsgfasongzheId(Long msgfasongzheId) {
		this.msgfasongzheId = msgfasongzheId;
	}

	@Column(name = "MSGJieshouzheID", nullable = false)
	public Long getMsgjieshouzheId() {
		return this.msgjieshouzheId;
	}

	public void setMsgjieshouzheId(Long msgjieshouzheId) {
		this.msgjieshouzheId = msgjieshouzheId;
	}

	@Column(name = "MSGNeirong", nullable = false)
	public String getMsgneirong() {
		return this.msgneirong;
	}

	public void setMsgneirong(String msgneirong) {
		this.msgneirong = msgneirong;
	}

	@Column(name = "MSGZhuangtai", length = 10)
	public String getMsgzhuangtai() {
		return this.msgzhuangtai;
	}

	public void setMsgzhuangtai(String msgzhuangtai) {
		this.msgzhuangtai = msgzhuangtai;
	}

	@Column(name = "MSGFabuShijian", length = 23)
	public Timestamp getMsgfabuShijian() {
		return this.msgfabuShijian;
	}

	public void setMsgfabuShijian(Timestamp msgfabuShijian) {
		this.msgfabuShijian = msgfabuShijian;
	}

	@Column(name = "Note", length = 500)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}