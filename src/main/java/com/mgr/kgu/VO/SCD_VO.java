package com.mgr.kgu.VO;

import java.util.Date;

//학교일정(SCHEDULE)
public class SCD_VO {
	private int SCD_NUM; //일정번호
	private String SCD_TITLE; //일정 제목
	private String SCD_HEAD; //일정 작성자
	private Date SCD_DATE; //일정 작성일
	private String SCD_COUNT; //일정 내용
	
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
	public String getSCD_HEAD() {
		return SCD_HEAD;
	}
	public void setSCD_HEAD(String sCD_HEAD) {
		SCD_HEAD = sCD_HEAD;
	}
	public Date getSCD_DATE() {
		return SCD_DATE;
	}
	public void setSCD_DATE(Date sCD_DATE) {
		SCD_DATE = sCD_DATE;
	}
	public String getSCD_COUNT() {
		return SCD_COUNT;
	}
	public void setSCD_COUNT(String sCD_COUNT) {
		SCD_COUNT = sCD_COUNT;
	}
}
