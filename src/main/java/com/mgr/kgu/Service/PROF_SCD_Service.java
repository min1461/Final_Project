package com.mgr.kgu.Service;

import java.util.ArrayList;

import com.mgr.kgu.VO.TSCD_VO;

public interface PROF_SCD_Service {
	ArrayList<TSCD_VO> getAllinfo();
	
	TSCD_VO getTelinfo(int TSCD_NUM);

	void insertinfo(TSCD_VO tscd_VO);

	boolean updateinfo(int TSCD_NUM, String TSCD_TITLE, String TSCD_CONT);

	void deleteinfo(TSCD_VO tscd_VO);

}
