package com.mgr.kgu.VO;

import java.util.Date;

public class STU_VO {

	// 학번
	private int STU_NUM;
	// 입학일
	private Date STU_ADMDAY;
	// 졸업일
	private Date STU_GRADAY;
	// 이름
	private String STU_NAME;
	// 영문이름
	private String STU_NAME_ENG;
	// 비밀번호
	private String STU_PW;
	// 생일
	private Date STU_BIRTH;
	// ??
	private String STU_NAT;
	// ??
	private String STU_UNI;
	// 전공
	private String STU_MAJOR;
	// ??
	private int STU_APPCRE;
	// ??
	private int STU_GRACRE;
	// ??
	private int STU_TOTALGPA;
	// ??
	private int STU_TOTALAVE;
	// ??
	private int STU_PRECE;
	// 상태
	private String STU_STATE;
	// 주소
	private String STU_ADDRESS;
	// 계좌번호
	private String STU_BANKACC;
	// 휴대폰번호
	private String STU_PHONENUM;
	// 이메일주소
	private String STU_EMAIL;
	// 사진?
	private String STU_PHOTO;
	
	private String STU_BANKNAME;
	
	public STU_VO() {
	}
	
	public STU_VO(int STU_NUM, String STU_PW) {
		this.STU_NUM = STU_NUM;
		this.STU_PW = STU_PW;
	}

	public int getSTU_NUM() {
		return STU_NUM;
	}

	public void setSTU_NUM(int STU_NUM) {
		this.STU_NUM = STU_NUM;
	}

	public Date getSTU_ADMDAY() {
		return STU_ADMDAY;
	}

	public void setSTU_ADMDAY(Date STU_ADMDAY) {
		this.STU_ADMDAY = STU_ADMDAY;
	}

	public Date getSTU_GRADAY() {
		return STU_GRADAY;
	}

	public void setSTU_GRADAY(Date STU_GRADAY) {
		this.STU_GRADAY = STU_GRADAY;
	}

	public String getSTU_NAME() {
		return STU_NAME;
	}

	public void setSTU_NAME(String STU_NAME) {
		this.STU_NAME = STU_NAME;
	}

	public String getSTU_NAME_ENG() {
		return STU_NAME_ENG;
	}

	public void setSTU_NAME_ENG(String STU_NAME_ENG) {
		this.STU_NAME_ENG = STU_NAME_ENG;
	}

	public String getSTU_PW() {
		return STU_PW;
	}

	public void setSTU_PW(String STU_PW) {
		this.STU_PW = STU_PW;
	}

	public Date getSTU_BIRTH() {
		return STU_BIRTH;
	}

	public void setSTU_BIRTH(Date STU_BIRTH) {
		this.STU_BIRTH = STU_BIRTH;
	}

	public String getSTU_NAT() {
		return STU_NAT;
	}

	public void setSTU_NAT(String STU_NAT) {
		this.STU_NAT = STU_NAT;
	}

	public String getSTU_UNI() {
		return STU_UNI;
	}

	public void setSTU_UNI(String STU_UNI) {
		this.STU_UNI = STU_UNI;
	}

	public String getSTU_MAJOR() {
		return STU_MAJOR;
	}

	public void setSTU_MAJOR(String STU_MAJOR) {
		this.STU_MAJOR = STU_MAJOR;
	}

	public int getSTU_APPCRE() {
		return STU_APPCRE;
	}

	public void setSTU_APPCRE(int STU_APPCRE) {
		this.STU_APPCRE = STU_APPCRE;
	}

	public int getSTU_GRACRE() {
		return STU_GRACRE;
	}

	public void setSTU_GRACRE(int STU_GRACRE) {
		this.STU_GRACRE = STU_GRACRE;
	}

	public int getSTU_TOTALGPA() {
		return STU_TOTALGPA;
	}

	public void setSTU_TOTALGPA(int STU_TOTALGPA) {
		this.STU_TOTALGPA = STU_TOTALGPA;
	}

	public int getSTU_TOTALAVE() {
		return STU_TOTALAVE;
	}

	public void setSTU_TOTALAVE(int STU_TOTALAVE) {
		this.STU_TOTALAVE = STU_TOTALAVE;
	}

	public int getSTU_PRECE() {
		return STU_PRECE;
	}

	public void setSTU_PRECE(int STU_PRECE) {
		this.STU_PRECE = STU_PRECE;
	}

	public String getSTU_STATE() {
		return STU_STATE;
	}

	public void setSTU_STATE(String STU_STATE) {
		this.STU_STATE = STU_STATE;
	}

	public String getSTU_ADDRESS() {
		return STU_ADDRESS;
	}

	public void setSTU_ADDRESS(String STU_ADDRESS) {
		this.STU_ADDRESS = STU_ADDRESS;
	}

	public String getSTU_BANKACC() {
		return STU_BANKACC;
	}

	public void setSTU_BANKACC(String STU_BANKACC) {
		this.STU_BANKACC = STU_BANKACC;
	}

	public String getSTU_PHONENUM() {
		return STU_PHONENUM;
	}

	public void setSTU_PHONENUM(String STU_PHONENUM) {
		this.STU_PHONENUM = STU_PHONENUM;
	}

	public String getSTU_EMAIL() {
		return STU_EMAIL;
	}

	public void setSTU_EMAIL(String STU_EMAIL) {
		this.STU_EMAIL = STU_EMAIL;
	}

	public String getSTU_PHOTO() {
		return STU_PHOTO;
	}

	public void setSTU_PHOTO(String STU_PHOTO) {
		this.STU_PHOTO = STU_PHOTO;
	}

	public String getSTU_BANKNAME() {
		return STU_BANKNAME;
	}

	public void setSTU_BANKNAME(String STU_BANKNAME) {
		this.STU_BANKNAME = STU_BANKNAME;
	}
}