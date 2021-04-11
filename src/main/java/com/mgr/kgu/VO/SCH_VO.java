package com.mgr.kgu.VO;

//장학금(SCHOLAR)
public class SCH_VO {
	private int SCH_NUM; //장학금 코드
	private int STD_NUM; //학번
	private int SCH_PRICE; //장학금 금액
	private String SCH_STATE; //장학금 신청여부(보류, 신청, 처리중, 지급완료)
	
	public SCH_VO() {
	}
	
	public int getSCH_NUM() {
		return SCH_NUM;
	}
	public void setSCH_NUM(int sCH_NUM) {
		SCH_NUM = sCH_NUM;
	}
	public int getSTD_NUM() {
		return STD_NUM;
	}
	public void setSTD_NUM(int sTD_NUM) {
		STD_NUM = sTD_NUM;
	}
	public int getSCH_PRICE() {
		return SCH_PRICE;
	}
	public void setSCH_PRICE(int sCH_PRICE) {
		SCH_PRICE = sCH_PRICE;
	}
	public String getSCH_STATE() {
		return SCH_STATE;
	}
	public void setSCH_STATE(String sCH_STATE) {
		SCH_STATE = sCH_STATE;
	}
	
}
