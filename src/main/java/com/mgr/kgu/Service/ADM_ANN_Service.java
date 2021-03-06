package com.mgr.kgu.Service;

import java.util.ArrayList;

import com.mgr.kgu.VO.ANN_VO;

public interface ADM_ANN_Service {
	ArrayList<ANN_VO> getAllinfo();
	
	ANN_VO getTelinfo(int ANN_NUM);

	void insertinfo(ANN_VO ann_VO);

	boolean updateinfo(int ANN_NUM, String ANN_TITLE, String ANN_CONT);

	void deleteinfo(ANN_VO ann_VO);

}
