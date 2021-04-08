package com.mgr.kgu.Service;

import org.apache.ibatis.annotations.Param;

import com.mgr.kgu.VO.STD_VO;

public interface STD_Service {
	STD_VO getTelinfo(@Param("STD_NUM") Integer STD_NUM, @Param("STD_PW") Integer STD_PW);
	STD_VO getSTDNUM();
	STD_VO getSTDPW();
}