package com.mgr.kgu.VO;

import java.util.Date;

//시험일정(TESTSCHE)
public class TSCD_VO {
	private int TSCD_NUM; //시험일정 번호
	private String TSCD_TITLE; //시험일정 제목
	private String TSCD_HEAD; //시험일정 작성자
	private Date TSCD_DATE; //시험일정 작성일
	
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
	public String getTSCD_HEAD() {
		return TSCD_HEAD;
	}
	public void setTSCD_HEAD(String tSCD_HEAD) {
		TSCD_HEAD = tSCD_HEAD;
	}
	public Date getTSCD_DATE() {
		return TSCD_DATE;
	}
	public void setTSCD_DATE(Date tSCD_DATE) {
		TSCD_DATE = tSCD_DATE;
	}
}
