package com.mgr.kgu.VO;

import java.sql.Date;

//등록금(TUITION)
public class TUI_VO {
	private int TUI_NUM; //등록금코드
	private int STD_NUM; //학번
	private String TUI_UNI; //소속대학
	private int TUI_FEE; //등록금 금액
	private Date TUI_PAY; //등록금 결제일
	

	public int getTUI_NUM() {
		return TUI_NUM;
	}
	public void setTUI_NUM(int tUI_NUM) {
		TUI_NUM = tUI_NUM;
	}
	public int getSTD_NUM() {
		return STD_NUM;
	}
	public void setSTD_NUM(int sTD_NUM) {
		STD_NUM = sTD_NUM;
	}
	public String getTUI_UNI() {
		return TUI_UNI;
	}
	public void setTUI_UNI(String tUI_UNI) {
		TUI_UNI = tUI_UNI;
	}
	public int getTUI_FEE() {
		return TUI_FEE;
	}
	public void setTUI_FEE(int tUI_FEE) {
		TUI_FEE = tUI_FEE;
	}
	public Date getTUI_PAY() {
		return TUI_PAY;
	}
	public void setTUI_PAY(Date tUI_PAY) {
		TUI_PAY = tUI_PAY;
	}
}

