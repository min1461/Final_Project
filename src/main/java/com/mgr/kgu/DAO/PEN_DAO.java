package com.mgr.kgu.DAO;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.mgr.kgu.VO.PEN_VO;

public interface PEN_DAO {

	ArrayList<PEN_VO> getAllPenalty(@Param("STU_NUM") int STU_NUM);
	int insertPenalty(PEN_VO pen_VO);
}
