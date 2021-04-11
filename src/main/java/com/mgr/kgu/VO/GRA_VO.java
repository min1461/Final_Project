package com.mgr.kgu.VO;

//성적(GRADE)
public class GRA_VO {
	private int GRA_NUM; //성적코드
	private int STD_NUM; //학번
	private int SUB_NUM; //과목코드
	private int PROF_NUM; //교수번호
	private int GRA_HAK; //학점
	private int GRA_RAN; //등급
	private int GRA_YEAR; //연도
	private int GRA_RANK; //학년
	private int GRA_SEASON; //학기
	
	public GRA_VO() {
	}
	
	public int getGRA_NUM() {
		return GRA_NUM;
	}
	public void setGRA_NUM(int gRA_NUM) {
		GRA_NUM = gRA_NUM;
	}
	public int getSTD_NUM() {
		return STD_NUM;
	}
	public void setSTD_NUM(int sTD_NUM) {
		STD_NUM = sTD_NUM;
	}
	public int getSUB_NUM() {
		return SUB_NUM;
	}
	public void setSUB_NUM(int sUB_NUM) {
		SUB_NUM = sUB_NUM;
	}
	public int getPROF_NUM() {
		return PROF_NUM;
	}
	public void setPROF_NUM(int pROF_NUM) {
		PROF_NUM = pROF_NUM;
	}
	public int getGRA_HAK() {
		return GRA_HAK;
	}
	public void setGRA_HAK(int gRA_HAK) {
		GRA_HAK = gRA_HAK;
	}
	public int getGRA_RAN() {
		return GRA_RAN;
	}
	public void setGRA_RAN(int gRA_RAN) {
		GRA_RAN = gRA_RAN;
	}
	public int getGRA_YEAR() {
		return GRA_YEAR;
	}
	public void setGRA_YEAR(int gRA_YEAR) {
		GRA_YEAR = gRA_YEAR;
	}
	public int getGRA_RANK() {
		return GRA_RANK;
	}
	public void setGRA_RANK(int gRA_RANK) {
		GRA_RANK = gRA_RANK;
	}
	public int getGRA_SEASON() {
		return GRA_SEASON;
	}
	public void setGRA_SEASON(int gRA_SEASON) {
		GRA_SEASON = gRA_SEASON;
	}
}
