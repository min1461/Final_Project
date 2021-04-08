package com.mgr.kgu.VO;

public class PROF_VO {
	// 교수 번호
	private int prof_NUM;
	// 교수 이름
	private String prof_NAME;
	// 교수 비밀번호
	private String prof_PW;

	public PROF_VO(int id, String pw) {
		prof_NUM = id;
		prof_PW = pw;
	}

	public int getProf_NUM() {
		return prof_NUM;
	}

	public void setProf_NUM(int prof_NUM) {
		this.prof_NUM = prof_NUM;
	}

	public String getProf_NAME() {
		return prof_NAME;
	}

	public void setProf_NAME(String prof_NAME) {
		this.prof_NAME = prof_NAME;
	}

	public String getProf_PW() {
		return prof_PW;
	}

	public void setProf_PW(String prof_PW) {
		this.prof_PW = prof_PW;
	}
}
