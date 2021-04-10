package com.mgr.kgu.Service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.mgr.kgu.VO.DOR_VO;

public interface DOR_Service {

	ArrayList<DOR_VO> getAllDOR(int STU_NUM);
	int insertDor(DOR_VO dor_VO);
}
