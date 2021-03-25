package com.mgr.kgu.VO;

public class admin_VO {
	// 관리자 번호
	private int admin_NUM;
	// 관리자 이름
	private String admin_NAME;
	// 관리자 비밀번호
	private String admin_PW;

	public admin_VO(int id, String pw) {
		admin_NUM = id;
		admin_PW = pw;
	}

	public int getAdmin_NUM() {
		return admin_NUM;
	}

	public void setAdmin_NUM(int admin_NUM) {
		this.admin_NUM = admin_NUM;
	}

	public String getAdmin_NAME() {
		return admin_NAME;
	}

	public void setAdmin_NAME(String admin_NAME) {
		this.admin_NAME = admin_NAME;
	}

	public String getAdmin_PW() {
		return admin_PW;
	}

	public void setAdmin_PW(String admin_PW) {
		this.admin_PW = admin_PW;
	}
}
