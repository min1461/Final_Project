package com.mgr.kgu.VO;

//벌점 vo
public class PEN_VO {

	private int PEN_NUM;
	private int STU_NUM;
	private int PEN_POI;
	private String PEN_COM;
	private String PEN_DATE;
	
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
	public String getPEN_DATE() {
		return PEN_DATE;
	}
	public void setPEN_DATE(String pEN_DATE) {
		PEN_DATE = pEN_DATE;
	}
	public PEN_VO(int pEN_NUM, int sTU_NUM, int pEN_POI, String pEN_COM, String pEN_DATE) {
		super();
		PEN_NUM = pEN_NUM;
		STU_NUM = sTU_NUM;
		PEN_POI = pEN_POI;
		PEN_COM = pEN_COM;
		PEN_DATE = pEN_DATE;
	}

	public PEN_VO() {}
}
