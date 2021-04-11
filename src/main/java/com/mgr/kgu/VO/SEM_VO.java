package com.mgr.kgu.VO;

import java.util.Date;

//학기(SEMETER)
public class SEM_VO {
	private int SEM_NUM; //학기코드
	private Date SEM_STARTDAY; //시작날짜
	private Date SEM_ENDDAY; //종료날짜
	private int SEM_COUNT; //학기숫자
	private int SEM_PRICE; //등록금
	
	public SEM_VO() {
	}
	
	public int getSEM_NUM() {
		return SEM_NUM;
	}
	public void setSEM_NUM(int sEM_NUM) {
		SEM_NUM = sEM_NUM;
	}
	public Date getSEM_STARTDAY() {
		return SEM_STARTDAY;
	}
	public void setSEM_STARTDAY(Date sEM_STARTDAY) {
		SEM_STARTDAY = sEM_STARTDAY;
	}
	public Date getSEM_ENDDAY() {
		return SEM_ENDDAY;
	}
	public void setSEM_ENDDAY(Date sEM_ENDDAY) {
		SEM_ENDDAY = sEM_ENDDAY;
	}
	public int getSEM_COUNT() {
		return SEM_COUNT;
	}
	public void setSEM_COUNT(int sEM_COUNT) {
		SEM_COUNT = sEM_COUNT;
	}
	public int getSEM_PRICE() {
		return SEM_PRICE;
	}
	public void setSEM_PRICE(int sEM_PRICE) {
		SEM_PRICE = sEM_PRICE;
	}
	
}
