package com.mgr.kgu.DAO;

import org.apache.ibatis.annotations.Param;

import com.mgr.kgu.VO.STU_VO;

// 인터페이스
public interface STU_DAO {
	boolean getlogininfo(Integer STU_NUM, String STU_PW);
	STU_VO getAllinfo(Integer STU_NUM);

}