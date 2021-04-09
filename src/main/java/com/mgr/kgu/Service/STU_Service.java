package com.mgr.kgu.Service;

import org.apache.ibatis.annotations.Param;

import com.mgr.kgu.VO.STU_VO;

public interface STU_Service {

	boolean getlogininfo(Integer STU_NUM, String STU_PW);

	STU_VO getAllinfo(int STU_NUM);

	String changedAddress(String STU_ADDRESS, int STU_NUM);

}