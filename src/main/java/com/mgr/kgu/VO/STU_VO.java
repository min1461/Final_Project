package com.mgr.kgu.VO;

import java.util.Date;

public class STU_VO {

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
	private Integer STU_APPCRE;
	// ??
	private Integer STU_GRACRE;
	// ??
	private Integer STU_TOTALGPA;
	// ??
	private Integer STU_TOTALAVE;
	// ??
	private Integer STU_PRECE;
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
	// 학번
	private Integer STU_NUM;
	
	public STU_VO(Integer id, String pw) {
		STU_NUM = id;
		STU_PW = pw;
	}
	
	public Integer getSTU_NUM() {
		return STU_NUM;
	}

	public void setSTU_NUM(Integer sTU_NUM) {
		STU_NUM = sTU_NUM;
	}

	public Date getSTU_ADMDAY() {
		return STU_ADMDAY;
	}

	public void setSTU_ADMDAY(Date sTU_ADMDAY) {
		STU_ADMDAY = sTU_ADMDAY;
	}

	public Date getSTU_GRADAY() {
		return STU_GRADAY;
	}

	public void setSTU_GRADAY(Date sTU_GRADAY) {
		STU_GRADAY = sTU_GRADAY;
	}

	public String getSTU_NAME() {
		return STU_NAME;
	}

	public void setSTU_NAME(String sTU_NAME) {
		STU_NAME = sTU_NAME;
	}

	public String getSTU_NAME_ENG() {
		return STU_NAME_ENG;
	}

	public void setSTU_NAME_ENG(String sTU_NAME_ENG) {
		STU_NAME_ENG = sTU_NAME_ENG;
	}

	public String getSTU_PW() {
		return STU_PW;
	}

	public void setSTU_PW(String sTU_PW) {
		STU_PW = sTU_PW;
	}

	public Date getSTU_BIRTH() {
		return STU_BIRTH;
	}

	public void setSTU_BIRTH(Date sTU_BIRTH) {
		STU_BIRTH = sTU_BIRTH;
	}

	public String getSTU_NAT() {
		return STU_NAT;
	}

	public void setSTU_NAT(String sTU_NAT) {
		STU_NAT = sTU_NAT;
	}

	public String getSTU_UNI() {
		return STU_UNI;
	}

	public void setSTU_UNI(String sTU_UNI) {
		STU_UNI = sTU_UNI;
	}

	public String getSTU_MAJOR() {
		return STU_MAJOR;
	}

	public void setSTU_MAJOR(String sTU_MAJOR) {
		STU_MAJOR = sTU_MAJOR;
	}

	public Integer getSTU_APPCRE() {
		return STU_APPCRE;
	}

	public void setSTU_APPCRE(Integer sTU_APPCRE) {
		STU_APPCRE = sTU_APPCRE;
	}

	public Integer getSTU_GRACRE() {
		return STU_GRACRE;
	}

	public void setSTU_GRACRE(Integer sTU_GRACRE) {
		STU_GRACRE = sTU_GRACRE;
	}

	public Integer getSTU_TOTALGPA() {
		return STU_TOTALGPA;
	}

	public void setSTU_TOTALGPA(Integer sTU_TOTALGPA) {
		STU_TOTALGPA = sTU_TOTALGPA;
	}

	public Integer getSTU_TOTALAVE() {
		return STU_TOTALAVE;
	}

	public void setSTU_TOTALAVE(Integer sTU_TOTALAVE) {
		STU_TOTALAVE = sTU_TOTALAVE;
	}

	public Integer getSTU_PRECE() {
		return STU_PRECE;
	}

	public void setSTU_PRECE(Integer sTU_PRECE) {
		STU_PRECE = sTU_PRECE;
	}

	public String getSTU_STATE() {
		return STU_STATE;
	}

	public void setSTU_STATE(String sTU_STATE) {
		STU_STATE = sTU_STATE;
	}

	public String getSTU_ADDRESS() {
		return STU_ADDRESS;
	}

	public void setSTU_ADDRESS(String sTU_ADDRESS) {
		STU_ADDRESS = sTU_ADDRESS;
	}

	public String getSTU_BANKACC() {
		return STU_BANKACC;
	}

	public void setSTU_BANKACC(String sTU_BANKACC) {
		STU_BANKACC = sTU_BANKACC;
	}

	public String getSTU_PHONENUM() {
		return STU_PHONENUM;
	}

	public void setSTU_PHONENUM(String sTU_PHONENUM) {
		STU_PHONENUM = sTU_PHONENUM;
	}

	public String getSTU_EMAIL() {
		return STU_EMAIL;
	}

	public void setSTU_EMAIL(String sTU_EMAIL) {
		STU_EMAIL = sTU_EMAIL;
	}

	public String getSTU_PHOTO() {
		return STU_PHOTO;
	}

	public void setSTU_PHOTO(String sTU_PHOTO) {
		STU_PHOTO = sTU_PHOTO;
	}
}
