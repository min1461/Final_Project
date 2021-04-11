package com.mgr.kgu.VO;

//학점(SCORE)
public class SCO_VO {
	private int SCO_NUM; //점수코드
	private int STU_NUM; //학번
	private int SUB_NUM; //과목코드
	private int SCO_APP; //받은 점수
	
	public SCO_VO() {
	}
	
	public int getSCO_NUM() {
		return SCO_NUM;
	}
	public void setSCO_NUM(int sCO_NUM) {
		SCO_NUM = sCO_NUM;
	}
	public int getSTU_NUM() {
		return STU_NUM;
	}
	public void setSTU_NUM(int sTU_NUM) {
		STU_NUM = sTU_NUM;
	}
	public int getSUB_NUM() {
		return SUB_NUM;
	}
	public void setSUB_NUM(int sUB_NUM) {
		SUB_NUM = sUB_NUM;
	}
	public int getSCO_APP() {
		return SCO_APP;
	}
	public void setSCO_APP(int sCO_APP) {
		SCO_APP = sCO_APP;
	}
	
}
