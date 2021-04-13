package com.mgr.kgu.DAO;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.mgr.kgu.VO.ANN_VO;

public interface ADM_ANN_DAO {
	ArrayList<ANN_VO> getAllinfo();
	
	ANN_VO getTelinfo(@Param("ANN_NUM") int ANN_NUM);

	void insertinfo(ANN_VO ann_VO);

	boolean updateinfo(@Param("ANN_NUM") int ANN_NUM, @Param("ANN_TITLE") String ANN_TITLE, @Param("ANN_CONT") String ANN_CONT);

	void deleteinfo(ANN_VO ann_VO);

}
