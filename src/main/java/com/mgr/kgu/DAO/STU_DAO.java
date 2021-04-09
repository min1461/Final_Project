package com.mgr.kgu.DAO;

import org.apache.ibatis.annotations.Param;

import com.mgr.kgu.VO.STU_VO;

// 인터페이스
public interface STU_DAO {
	boolean getlogininfo(@Param("STU_NUM") Integer STU_NUM, @Param("STU_PW") String STU_PW);

	STU_VO getAllinfo(@Param("STU_NUM") int STU_NUM);

	String changedAddress(@Param("changedAddress") String STU_ADDRESS, @Param("STU_NUM") int STU_NUM);

}