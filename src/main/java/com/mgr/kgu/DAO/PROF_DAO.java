package com.mgr.kgu.DAO;

import org.apache.ibatis.annotations.Param;

import com.mgr.kgu.VO.PROF_VO;

public interface PROF_DAO {
	PROF_VO getAllinfo(@Param("prof_NUM") Integer prof_NUM, @Param("prof_PW") String prof_PW);
}
