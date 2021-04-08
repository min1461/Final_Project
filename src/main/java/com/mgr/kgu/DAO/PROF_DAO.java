package com.mgr.kgu.DAO;

import com.mgr.kgu.VO.PROF_VO;

public interface PROF_DAO {
	PROF_VO getTelinfo(Integer PROF_NUM,String PROF_PW);
	PROF_VO getPROFNUM();
	PROF_VO getPROFPW();
}
