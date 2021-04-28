package com.mgr.kgu.VO;

import java.util.Date;

//시험일정(TESTSCHE)
public class TSCD_VO {
	private int TSCD_NUM; //시험일정 번호
	private String TSCD_TITLE; //시험일정 제목
	private String TSCD_CONT; //시험일정 작성자
	private Date TSCD_DATE; //시험일정 작성일
	private String PROF_NUM; //공지 작성자
	private String PROF_NAME; //공지 작성자
	
	
	public TSCD_VO() {
	}


	public int getTSCD_NUM() {
		return TSCD_NUM;
	}


	public void setTSCD_NUM(int tSCD_NUM) {
		TSCD_NUM = tSCD_NUM;
	}


	public String getTSCD_TITLE() {
		return TSCD_TITLE;
	}


	public void setTSCD_TITLE(String tSCD_TITLE) {
		TSCD_TITLE = tSCD_TITLE;
	}


	public String getTSCD_CONT() {
		return TSCD_CONT;
	}


	public void setTSCD_CONT(String tSCD_CONT) {
		TSCD_CONT = tSCD_CONT;
	}


	public Date getTSCD_DATE() {
		return TSCD_DATE;
	}


	public void setTSCD_DATE(Date tSCD_DATE) {
		TSCD_DATE = tSCD_DATE;
	}


	public String getPROF_NUM() {
		return PROF_NUM;
	}


	public void setPROF_NUM(String pROF_NUM) {
		PROF_NUM = pROF_NUM;
	}


	public String getPROF_NAME() {
		return PROF_NAME;
	}


	public void setPROF_NAME(String pROF_NAME) {
		PROF_NAME = pROF_NAME;
	}
	

}
