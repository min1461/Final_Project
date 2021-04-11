package com.mgr.kgu.VO;

import java.util.Date;

//시험(TEST)
public class TES_VO {
	private int TES_NUM; //시험코드
	private int SUB_NUM; //과목코드
	private int PROF_NUM; //교수번호
	private String TES_STA; //시험 여부(보류, 미정, 시작, 종료)
	private Date TES_START; //시험 시작일
	private Date TES_END; //시험 종료일
	private Date TES_CONT_DATE; //SYSDATE(작성일)
	private String TES_TITLE; //시험 제목
	private String TEST_COUT; //시험 내용
	
	public TES_VO() {
	}
	
	public int getTES_NUM() {
		return TES_NUM;
	}
	public void setTES_NUM(int tES_NUM) {
		TES_NUM = tES_NUM;
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
	public String getTES_STA() {
		return TES_STA;
	}
	public void setTES_STA(String tES_STA) {
		TES_STA = tES_STA;
	}
	public Date getTES_START() {
		return TES_START;
	}
	public void setTES_START(Date tES_START) {
		TES_START = tES_START;
	}
	public Date getTES_END() {
		return TES_END;
	}
	public void setTES_END(Date tES_END) {
		TES_END = tES_END;
	}
	public Date getTES_CONT_DATE() {
		return TES_CONT_DATE;
	}
	public void setTES_CONT_DATE(Date tES_CONT_DATE) {
		TES_CONT_DATE = tES_CONT_DATE;
	}
	public String getTES_TITLE() {
		return TES_TITLE;
	}
	public void setTES_TITLE(String tES_TITLE) {
		TES_TITLE = tES_TITLE;
	}
	public String getTEST_COUT() {
		return TEST_COUT;
	}
	public void setTEST_COUT(String tEST_COUT) {
		TEST_COUT = tEST_COUT;
	}
}
