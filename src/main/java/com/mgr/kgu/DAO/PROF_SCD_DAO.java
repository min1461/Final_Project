package com.mgr.kgu.DAO;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.mgr.kgu.VO.TSCD_VO;

public interface PROF_SCD_DAO {
	ArrayList<TSCD_VO> getAllinfo();
	
	TSCD_VO getTelinfo(@Param("TSCD_NUM") int TSCD_NUM);

	void insertinfo(TSCD_VO tscd_VO);

	boolean updateinfo(@Param("TSCD_NUM") int TSCD_NUM, @Param("TSCD_TITLE") String TSCD_TITLE, @Param("TSCD_CONT") String TSCD_CONT);

	void deleteinfo(TSCD_VO tscd_VO);

}
