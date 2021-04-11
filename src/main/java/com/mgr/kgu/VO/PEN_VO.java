package com.mgr.kgu.VO;

import java.util.Date;

//벌점(PENALTY)
public class PEN_VO {

	private int PEN_NUM; //벌점코드
	private int STU_NUM; //학번
	private int PEN_POI; //벌점크기
	private String PEN_COM; //벌점사유
	private Date PEN_DATE; //벌점부여일
	
	public PEN_VO() {
	}
	
	public int getPEN_NUM() {
		return PEN_NUM;
	}
	public void setPEN_NUM(int pEN_NUM) {
		PEN_NUM = pEN_NUM;
	}
	public int getSTU_NUM() {
		return STU_NUM;
	}
	public void setSTU_NUM(int sTU_NUM) {
		STU_NUM = sTU_NUM;
	}
	public int getPEN_POI() {
		return PEN_POI;
	}
	public void setPEN_POI(int pEN_POI) {
		PEN_POI = pEN_POI;
	}
	public String getPEN_COM() {
		return PEN_COM;
	}
	public void setPEN_COM(String pEN_COM) {
		PEN_COM = pEN_COM;
	}
	public Date getPEN_DATE() {
		return PEN_DATE;
	}
	public void setPEN_DATE(Date pEN_DATE) {
		PEN_DATE = pEN_DATE;
	}
}
