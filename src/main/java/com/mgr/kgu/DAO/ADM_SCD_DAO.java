package com.mgr.kgu.DAO;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.mgr.kgu.VO.SCD_VO;

public interface ADM_SCD_DAO {
	ArrayList<SCD_VO> getAllinfo();
	
	SCD_VO getTelinfo(@Param("SCD_NUM") int SCD_NUM);

	void insertinfo(SCD_VO scd_VO);

	boolean updateinfo(@Param("SCD_NUM") int SCD_NUM, @Param("SCD_TITLE") String SCD_TITLE, @Param("SCD_CONT") String SCD_CONT);

	void deleteinfo(SCD_VO scd_VO);

}
