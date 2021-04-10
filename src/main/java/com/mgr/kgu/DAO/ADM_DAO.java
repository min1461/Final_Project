package com.mgr.kgu.DAO;

import org.apache.ibatis.annotations.Param;

import com.mgr.kgu.VO.ADM_VO;


public interface ADM_DAO {
	ADM_VO getAllinfo(@Param("ADM_NUM") int ADM_NUM, @Param("ADM_PW") String ADM_PW);
	
	/*ArrayList<ADM_VO> callMyallscholar(@Param("ADM_NUM") int ADM_NUM);*/
}
