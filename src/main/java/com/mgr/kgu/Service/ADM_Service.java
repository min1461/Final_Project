package com.mgr.kgu.Service;

import org.apache.ibatis.annotations.Param;

import com.mgr.kgu.VO.ADM_VO;

public interface ADM_Service {

	ADM_VO getTelinfo(@Param("ADM_NUM") Integer ADM_NUM, @Param("ADM_PW") String ADM_PW);

}
