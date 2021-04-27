package com.mgr.kgu.VO;

import java.text.SimpleDateFormat;
import java.util.Date;

//공지사항(ANNOUNCE)
public class ANN_VO {
	private int ANN_NUM; //공지 번호
	private String ANN_TITLE; //공지 제목
	private String ADM_NUM; //공지 작성자
	private String ADM_NAME; //공지 작성자
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
	public String getADM_NUM() {
		return ADM_NUM;
	}
	public void setADM_NUM(String aDM_NUM) {
		ADM_NUM = aDM_NUM;
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

	public String getADM_NAME() {
		return ADM_NAME;
	}

	public void setADM_NAME(String aDM_NAME) {
		ADM_NAME = aDM_NAME;
	}
	
}
