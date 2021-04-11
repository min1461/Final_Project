package com.mgr.kgu.VO;

//강의평가(REVIEW)
public class REV_VO {
	private int REV_NUM; //평가코드
	private int STD_NUM; //학번
	private int SUB_NUM; //과목코드
	private int PROF_NUM; //교수번호
	private int REV_COM; //강의평가내용
	
	public REV_VO() {
	}
	
	public int getREV_NUM() {
		return REV_NUM;
	}
	public void setREV_NUM(int rEV_NUM) {
		REV_NUM = rEV_NUM;
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
	public int getREV_COM() {
		return REV_COM;
	}
	public void setREV_COM(int rEV_COM) {
		REV_COM = rEV_COM;
	}
}
