package com.mgr.kgu.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgr.kgu.DAO.ADM_DAO;
import com.mgr.kgu.Service.ADM_Service;
import com.mgr.kgu.VO.ADM_VO;


@Service
public class ADM_ServiceImpl implements ADM_Service {

	@Autowired
	private ADM_DAO ADM_DAO;

	@Override
	public ADM_VO getTelinfo(Integer ADM_NUM, String ADM_PW) {
		return this.ADM_DAO.getTelinfo(ADM_NUM, ADM_PW);
	}
}