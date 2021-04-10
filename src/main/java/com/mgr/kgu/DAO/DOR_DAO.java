package com.mgr.kgu.DAO;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.mgr.kgu.VO.DOR_VO;

public interface DOR_DAO {

	ArrayList<DOR_VO> getAllDOR(@Param("STU_NUM") int STU_NUM);
	int insertDor(DOR_VO dor_VO);
}
