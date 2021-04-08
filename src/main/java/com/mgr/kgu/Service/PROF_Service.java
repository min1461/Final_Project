package com.mgr.kgu.Service;

import org.apache.ibatis.annotations.Param;

import com.mgr.kgu.VO.PROF_VO;

public interface PROF_Service {

	PROF_VO getTelinfo(@Param("prof_NUM") Integer prof_NUM, @Param("prof_PW") String prof_PW);
}
