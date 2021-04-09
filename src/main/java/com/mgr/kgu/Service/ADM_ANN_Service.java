package com.mgr.kgu.Service;

import java.util.ArrayList;

import com.mgr.kgu.VO.ANN_VO;

public interface ADM_ANN_Service {
	ArrayList<ANN_VO> getAllinfo();
	
	ANN_VO getTelinfo(ANN_VO ann_VO);

	void insertinfo(ANN_VO ann_VO);

	void updateinfo(ANN_VO ann_VO);

	void deleteinfo(ANN_VO ann_VO);

}
