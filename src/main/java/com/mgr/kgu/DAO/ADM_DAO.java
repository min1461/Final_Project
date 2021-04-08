package com.mgr.kgu.DAO;

import com.mgr.kgu.VO.ADM_VO;

public interface ADM_DAO {
	ADM_VO getTelinfo(Integer ADM_NUM,String ADM_PW);
	ADM_VO getADMNUM();
	ADM_VO getADMPW();
}
