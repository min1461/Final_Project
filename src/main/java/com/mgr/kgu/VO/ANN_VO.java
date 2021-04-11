package com.mgr.kgu.VO;

import java.util.Date;

//공지사항(ANNOUNCE)
public class ANN_VO {
	private int ANN_NUM; //공지 번호
	private String ANN_TITLE; //공지 제목
	private String ANN_HEAD; //공지 작성자
	private Date ANN_DATE; //공지 작성일
	private String ANN_CONT; //공지 내용
	
	public ANN_VO() {
	}
	
	public int getANN_NUM() {
		return ANN_NUM;
	}
	public void setANN_NUM(int aNN_NUM) {
		ANN_NUM = aNN_NUM;
	}
	public String getANN_TITLE() {
		return ANN_TITLE;
	}
	public void setANN_TITLE(String aNN_TITLE) {
		ANN_TITLE = aNN_TITLE;
	}
	public String getANN_HEAD() {
		return ANN_HEAD;
	}
	public void setANN_HEAD(String aNN_HEAD) {
		ANN_HEAD = aNN_HEAD;
	}
	public Date getANN_DATE() {
		return ANN_DATE;
	}
	public void setANN_DATE(Date aNN_DATE) {
		ANN_DATE = aNN_DATE;
	}
	public String getANN_CONT() {
		return ANN_CONT;
	}
	public void setANN_CONT(String aNN_CONT) {
		ANN_CONT = aNN_CONT;
	}
	
}
