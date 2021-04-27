package com.mgr.kgu.Service;

import java.util.ArrayList;

import com.mgr.kgu.VO.SCD_VO;

public interface ADM_SCD_Service {
	ArrayList<SCD_VO> getAllinfo();
	
	SCD_VO getTelinfo(int SCD_NUM);

	void insertinfo(SCD_VO scd_VO);

	boolean updateinfo(int SCD_NUM, String SCD_TITLE, String SCD_CONT);

	void deleteinfo(SCD_VO scd_VO);

}
