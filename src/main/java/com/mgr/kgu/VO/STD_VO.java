package com.mgr.kgu.VO;

import java.util.Date;

public class STD_VO {
	// 학번
	private Integer STD_NUM;
	// 입학일
	private Date STD_ADMDAY;
	// 졸업일
	private Date STD_GRADAY;
	// 이름
	private String STD_NAME;
	// 영문이름
	private String STD_NAME_ENG;
	// 비밀번호
	private String STD_PW;
	// 생일
	private Date STD_BIRTH;
	// ??
	private String STD_NAT;
	// ??
	private String STD_UNI;
	// 전공
	private String STD_MAJOR;
	// ??
	private Integer STD_APPCRE;
	// ??
	private Integer STD_GRACRE;
	// ??
	private Integer STD_TOTALGPA;
	// ??
	private Integer STD_TOTALAVE;
	// ??
	private Integer STD_PRECE;
	// 상태
	private String STD_STATE;
	// 주소
	private String STD_ADDRESS;
	// 계좌번호
	private String STD_BANKACC;
	// 휴대폰번호
	private String STD_PHONENUM;
	// 이메일주소
	private String STD_EMAIL;
	// 사진?
	private String STD_PHOTO;
	
	public STD_VO(Integer id, String pw) {
		STD_NUM = id;
		STD_PW = pw;
	}

	public Integer getSTD_NUM() {
		return STD_NUM;
	}

	public void setSTD_NUM(Integer sTD_NUM) {
		STD_NUM = sTD_NUM;
	}

	public Date getSTD_ADMDAY() {
		return STD_ADMDAY;
	}

	public void setSTD_ADMDAY(Date sTD_ADMDAY) {
		STD_ADMDAY = sTD_ADMDAY;
	}

	public Date getSTD_GRADAY() {
		return STD_GRADAY;
	}

	public void setSTD_GRADAY(Date sTD_GRADAY) {
		STD_GRADAY = sTD_GRADAY;
	}

	public String getSTD_NAME() {
		return STD_NAME;
	}

	public void setSTD_NAME(String sTD_NAME) {
		STD_NAME = sTD_NAME;
	}

	public String getSTD_NAME_ENG() {
		return STD_NAME_ENG;
	}

	public void setSTD_NAME_ENG(String sTD_NAME_ENG) {
		STD_NAME_ENG = sTD_NAME_ENG;
	}

	public String getSTD_PW() {
		return STD_PW;
	}

	public void setSTD_PW(String sTD_PW) {
		STD_PW = sTD_PW;
	}

	public Date getSTD_BIRTH() {
		return STD_BIRTH;
	}

	public void setSTD_BIRTH(Date sTD_BIRTH) {
		STD_BIRTH = sTD_BIRTH;
	}

	public String getSTD_NAT() {
		return STD_NAT;
	}

	public void setSTD_NAT(String sTD_NAT) {
		STD_NAT = sTD_NAT;
	}

	public String getSTD_UNI() {
		return STD_UNI;
	}

	public void setSTD_UNI(String sTD_UNI) {
		STD_UNI = sTD_UNI;
	}

	public String getSTD_MAJOR() {
		return STD_MAJOR;
	}

	public void setSTD_MAJOR(String sTD_MAJOR) {
		STD_MAJOR = sTD_MAJOR;
	}

	public Integer getSTD_APPCRE() {
		return STD_APPCRE;
	}

	public void setSTD_APPCRE(Integer sTD_APPCRE) {
		STD_APPCRE = sTD_APPCRE;
	}

	public Integer getSTD_GRACRE() {
		return STD_GRACRE;
	}

	public void setSTD_GRACRE(Integer sTD_GRACRE) {
		STD_GRACRE = sTD_GRACRE;
	}

	public Integer getSTD_TOTALGPA() {
		return STD_TOTALGPA;
	}

	public void setSTD_TOTALGPA(Integer sTD_TOTALGPA) {
		STD_TOTALGPA = sTD_TOTALGPA;
	}

	public Integer getSTD_TOTALAVE() {
		return STD_TOTALAVE;
	}

	public void setSTD_TOTALAVE(Integer sTD_TOTALAVE) {
		STD_TOTALAVE = sTD_TOTALAVE;
	}

	public Integer getSTD_PRECE() {
		return STD_PRECE;
	}

	public void setSTD_PRECE(Integer sTD_PRECE) {
		STD_PRECE = sTD_PRECE;
	}

	public String getSTD_STATE() {
		return STD_STATE;
	}

	public void setSTD_STATE(String sTD_STATE) {
		STD_STATE = sTD_STATE;
	}

	public String getSTD_ADDRESS() {
		return STD_ADDRESS;
	}

	public void setSTD_ADDRESS(String sTD_ADDRESS) {
		STD_ADDRESS = sTD_ADDRESS;
	}

	public String getSTD_BANKACC() {
		return STD_BANKACC;
	}

	public void setSTD_BANKACC(String sTD_BANKACC) {
		STD_BANKACC = sTD_BANKACC;
	}

	public String getSTD_PHONENUM() {
		return STD_PHONENUM;
	}

	public void setSTD_PHONENUM(String sTD_PHONENUM) {
		STD_PHONENUM = sTD_PHONENUM;
	}

	public String getSTD_EMAIL() {
		return STD_EMAIL;
	}

	public void setSTD_EMAIL(String sTD_EMAIL) {
		STD_EMAIL = sTD_EMAIL;
	}

	public String getSTD_PHOTO() {
		return STD_PHOTO;
	}

	public void setSTD_PHOTO(String sTD_PHOTO) {
		STD_PHOTO = sTD_PHOTO;
	}
	
}
