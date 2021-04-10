package com.mgr.kgu.VO;

//기숙사 vo
public class DOR_VO {

    //기숙사 코드
	private int DOR_NUM;
    //학번
	private int STU_NUM;
    public int getDOR_NUM() {
		return DOR_NUM;
	}
	public void setDOR_NUM(int dOR_NUM) {
		DOR_NUM = dOR_NUM;
	}
	public int getSTU_NUM() {
		return STU_NUM;
	}
	public void setSTU_NUM(int sTU_NUM) {
		STU_NUM = sTU_NUM;
	}
	public int getPEN_NUM() {
		return PEN_NUM;
	}
	public void setPEN_NUM(int pEN_NUM) {
		PEN_NUM = pEN_NUM;
	}
	public int getDOR_ADM() {
		return DOR_ADM;
	}
	public void setDOR_ADM(int dOR_ADM) {
		DOR_ADM = dOR_ADM;
	}
	public String getDOR_ROM() {
		return DOR_ROM;
	}
	public void setDOR_ROM(String dOR_ROM) {
		DOR_ROM = dOR_ROM;
	}
	public String getDOR_STA() {
		return DOR_STA;
	}
	public void setDOR_STA(String dOR_STA) {
		DOR_STA = dOR_STA;
	}
	public int getDOR_FEE() {
		return DOR_FEE;
	}
	public void setDOR_FEE(int dOR_FEE) {
		DOR_FEE = dOR_FEE;
	}
	public String getDOR_PAY() {
		return DOR_PAY;
	}
	public void setDOR_PAY(String dOR_PAY) {
		DOR_PAY = dOR_PAY;
	}
	public int getDOR_NOP() {
		return DOR_NOP;
	}
	public void setDOR_NOP(int dOR_NOP) {
		DOR_NOP = dOR_NOP;
	}
	public String getDOR_PANA() {
		return DOR_PANA;
	}
	public void setDOR_PANA(String dOR_PANA) {
		DOR_PANA = dOR_PANA;
	}
	public String getDOR_PAST() {
		return DOR_PAST;
	}
	public void setDOR_PAST(String dOR_PAST) {
		DOR_PAST = dOR_PAST;
	}
	public String getDOR_PAPN() {
		return DOR_PAPN;
	}
	public void setDOR_PAPN(String dOR_PAPN) {
		DOR_PAPN = dOR_PAPN;
	}
	//벌점코드
	private int PEN_NUM;
    //기숙사관리자
	private int DOR_ADM;
	//방번호
	private String DOR_ROM;
	//거주상태
	private String DOR_STA;
	//기숙사비
	private int DOR_FEE;
	//결제일
	private String DOR_PAY;
	//미납횟수
	private int DOR_NOP;
	//보호자 이름
	private String DOR_PANA;
	//보호자 관계
	private String DOR_PAST;
	//보호자 전화번호
	private String DOR_PAPN;
	
	public DOR_VO(int dOR_NUM, int sTU_NUM, int pEN_NUM, int dOR_ADM, String dOR_ROM, String dOR_STA, int dOR_FEE,
			String dOR_PAY, int dOR_NOP, String dOR_PANA, String dOR_PAST, String dOR_PAPN) {
		//super();
		DOR_NUM = dOR_NUM;
		STU_NUM = sTU_NUM;
		PEN_NUM = pEN_NUM;
		DOR_ADM = dOR_ADM;
		DOR_ROM = dOR_ROM;
		DOR_STA = dOR_STA;
		DOR_FEE = dOR_FEE;
		DOR_PAY = dOR_PAY;
		DOR_NOP = dOR_NOP;
		DOR_PANA = dOR_PANA;
		DOR_PAST = dOR_PAST;
		DOR_PAPN = dOR_PAPN;
	}
	
	public DOR_VO() {}
}
