package com.mgr.kgu.Service;

import java.util.ArrayList;

import com.mgr.kgu.VO.ANN_VO;

public interface ADM_ANN_Service {
	public ArrayList<ANN_VO> getAllinfo() throws Exception;
	
	public ANN_VO getTelinfo(ANN_VO ann_VO);

	public ANN_VO insertinfo(ANN_VO ann_VO);

	public ANN_VO updateinfo(ANN_VO ann_VO);

	public ANN_VO deleteinfo(ANN_VO ann_VO);

}
