package com.mgr.kgu.VO;

import java.util.Date;

//휴복학(VACATION)
public class VAC_VO {
	private int VAC_NUM; //휴복학코드
	private int STD_NUM; //학번
	private Date VAC_APPDAY; //학번
	private Date VAC_PERDAY; //휴학기간
	private String VAC_REASON; //휴학사유
	private Date VAC_ENDDAY; //복학신청일
	private Date VAC_STADAY; //복학일
	
	public VAC_VO() {
	}
	
	public int getVAC_NUM() {
		return VAC_NUM;
	}
	public void setVAC_NUM(int vAC_NUM) {
		VAC_NUM = vAC_NUM;
	}
	public int getSTD_NUM() {
		return STD_NUM;
	}
	public void setSTD_NUM(int sTD_NUM) {
		STD_NUM = sTD_NUM;
	}
	public Date getVAC_APPDAY() {
		return VAC_APPDAY;
	}
	public void setVAC_APPDAY(Date vAC_APPDAY) {
		VAC_APPDAY = vAC_APPDAY;
	}
	public Date getVAC_PERDAY() {
		return VAC_PERDAY;
	}
	public void setVAC_PERDAY(Date vAC_PERDAY) {
		VAC_PERDAY = vAC_PERDAY;
	}
	public String getVAC_REASON() {
		return VAC_REASON;
	}
	public void setVAC_REASON(String vAC_REASON) {
		VAC_REASON = vAC_REASON;
	}
	public Date getVAC_ENDDAY() {
		return VAC_ENDDAY;
	}
	public void setVAC_ENDDAY(Date vAC_ENDDAY) {
		VAC_ENDDAY = vAC_ENDDAY;
	}
	public Date getVAC_STADAY() {
		return VAC_STADAY;
	}
	public void setVAC_STADAY(Date vAC_STADAY) {
		VAC_STADAY = vAC_STADAY;
	}
}
