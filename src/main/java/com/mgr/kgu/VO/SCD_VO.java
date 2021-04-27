package com.mgr.kgu.VO;

import java.util.Date;

//학교일정(SCHEDULE)
public class SCD_VO {
	private int SCD_NUM; //공지 번호
	private String SCD_TITLE; //공지 제목
	private String ADM_NUM; //공지 작성자
	private String ADM_NAME; //공지 작성자
	private Date SCD_DATE; //공지 작성일
	private String SCD_CONT; //공지 내용
	
	public SCD_VO() {
	}

	public int getSCD_NUM() {
		return SCD_NUM;
	}

	public void setSCD_NUM(int sCD_NUM) {
		SCD_NUM = sCD_NUM;
	}

	public String getSCD_TITLE() {
		return SCD_TITLE;
	}

	public void setSCD_TITLE(String sCD_TITLE) {
		SCD_TITLE = sCD_TITLE;
	}

	public String getADM_NUM() {
		return ADM_NUM;
	}

	public void setADM_NUM(String aDM_NUM) {
		ADM_NUM = aDM_NUM;
	}

	public String getADM_NAME() {
		return ADM_NAME;
	}

	public void setADM_NAME(String aDM_NAME) {
		ADM_NAME = aDM_NAME;
	}

	public Date getSCD_DATE() {
		return SCD_DATE;
	}

	public void setSCD_DATE(Date sCD_DATE) {
		SCD_DATE = sCD_DATE;
	}

	public String getSCD_CONT() {
		return SCD_CONT;
	}

	public void setSCD_CONT(String sCD_CONT) {
		SCD_CONT = sCD_CONT;
	}
	

}
