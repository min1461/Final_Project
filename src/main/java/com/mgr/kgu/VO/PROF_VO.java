package com.mgr.kgu.VO;

public class PROF_VO {
	// 교수 번호
	private int PROF_NUM;
	// 교수 이름
	private String PROF_NAME;
	// 교수 비밀번호
	private String PROF_PW;

	public PROF_VO() {
	}
	
	public PROF_VO(int id, String pw) {
		PROF_NUM = id;
		PROF_PW = pw;
	}

	public int getProf_NUM() {
		return PROF_NUM;
	}

	public void setProf_NUM(int prof_NUM) {
		this.PROF_NUM = prof_NUM;
	}

	public String getProf_NAME() {
		return PROF_NAME;
	}

	public void setProf_NAME(String prof_NAME) {
		this.PROF_NAME = prof_NAME;
	}

	public String getProf_PW() {
		return PROF_PW;
	}

	public void setProf_PW(String prof_PW) {
		this.PROF_PW = prof_PW;
	}
}
