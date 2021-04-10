package com.mgr.kgu.Service;

import java.util.ArrayList;

import com.mgr.kgu.VO.PEN_VO;

public interface PEN_Service {

	ArrayList<PEN_VO> getAllPenalty(int STU_NUM);
	int insertPenalty(PEN_VO pen_VO);
	
}
