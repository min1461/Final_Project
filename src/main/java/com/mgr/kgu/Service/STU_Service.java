package com.mgr.kgu.Service;

import org.apache.ibatis.annotations.Param;

import com.mgr.kgu.VO.STU_VO;

public interface STU_Service {
	boolean getlogininfo(@Param("STU_NUM") Integer STU_NUM, @Param("STU_PW") String STU_PW);
	STU_VO getAllinfo(@Param("STU_NUM")int STU_NUM);
	String changeAddress(@Param("changedAddress")String STU_ADDRESS, @Param("STU_NUM")int STU_NUM);
}