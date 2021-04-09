package com.mgr.kgu.Service;

import com.mgr.kgu.VO.STU_VO;

public interface STU_Service {

	boolean getlogininfo(Integer STU_NUM, String STU_PW);

	STU_VO getAllinfo(int STU_NUM);

	void changedInfo(int STU_NUM, String after_address, String after_number, String after_email, String after_bankname, String after_bankacc);
	
	void changedInfoPW(int STU_NUM, String after_pw, String after_address, String after_number, String after_email, String after_bankname, String after_bankacc);

}