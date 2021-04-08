package com.mgr.kgu.Service;

import org.apache.ibatis.annotations.Param;

import com.mgr.kgu.VO.PROF_VO;

public interface PROF_Service {

	PROF_VO getTelinfo(@Param("prof_NUM") Integer prof_NUM, @Param("prof_PW") Integer prof_PW);
	PROF_VO getPROFNUM(@Param("prof_NUM") Integer prof_NUM);
	PROF_VO getPROFPW(@Param("prof_PW") Integer prof_PW);
}
