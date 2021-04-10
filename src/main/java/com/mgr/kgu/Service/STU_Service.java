package com.mgr.kgu.Service;

import java.util.ArrayList;

import com.mgr.kgu.VO.SCO_VO;
import com.mgr.kgu.VO.STU_VO;

public interface STU_Service {

	// 정보호출
	STU_VO getAllinfo(int STU_NUM, String STU_PW);

	// 정보변경
	void changedInfo(int STU_NUM, String after_address, String after_number, String after_email, String after_bankname, String after_bankacc);
	
	// 비번및 정보변경
	void changedInfoPW(int STU_NUM, String after_pw, String after_address, String after_number, String after_email, String after_bankname, String after_bankacc);

	ArrayList<SCO_VO> callMyallscholar(int STU_NUM);
}