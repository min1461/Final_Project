package com.mgr.kgu.VO;

//출석(ATTENDANCE)
public class ATT_VO {
	private int ATT_NUM; //출석코드
	private int STD_NUM; //학번
	private int SUB_NUM; //과목코드
	private int ATT_TOCUR; //출석일
	private int ATT_ABSENT; //결석일
	private int ATT_LESDAY; //총 수업일
	
	public ATT_VO() {
	}
	
	public int getATT_NUM() {
		return ATT_NUM;
	}
	public void setATT_NUM(int aTT_NUM) {
		ATT_NUM = aTT_NUM;
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
	public int getATT_TOCUR() {
		return ATT_TOCUR;
	}
	public void setATT_TOCUR(int aTT_TOCUR) {
		ATT_TOCUR = aTT_TOCUR;
	}
	public int getATT_ABSENT() {
		return ATT_ABSENT;
	}
	public void setATT_ABSENT(int aTT_ABSENT) {
		ATT_ABSENT = aTT_ABSENT;
	}
	public int getATT_LESDAY() {
		return ATT_LESDAY;
	}
	public void setATT_LESDAY(int aTT_LESDAY) {
		ATT_LESDAY = aTT_LESDAY;
	}
}
