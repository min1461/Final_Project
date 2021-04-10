package com.mgr.kgu.VO;

public class ADM_VO {
	// 관리자 번호
	private int ADM_NUM;
	// 관리자 이름
	private String ADM_NAME;
	// 관리자 비밀번호
	private String ADM_PW;
	
	public ADM_VO() {
	}

	public ADM_VO(int id, String pw) {
		ADM_NUM = id;
		ADM_PW = pw;
	}

	public int getADM_NUM() {
		return ADM_NUM;
	}

	public void setADM_NUM(int aDM_NUM) {
		ADM_NUM = aDM_NUM;
	}

	public String getADM_NAME() {
		return ADM_NAME;
	}

	public void setADM_NAME(String aDM_NAME) {
		ADM_NAME = aDM_NAME;
	}

	public String getADM_PW() {
		return ADM_PW;
	}

	public void setADM_PW(String aDM_PW) {
		ADM_PW = aDM_PW;
	}
}