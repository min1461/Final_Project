package com.mgr.kgu.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgr.kgu.DAO.PROF_DAO;
import com.mgr.kgu.Service.PROF_Service;
import com.mgr.kgu.VO.PROF_VO;


@Service
public class PROF_ServiceImpl implements PROF_Service {

	@Autowired
	private PROF_DAO PROF_DAO;

	@Override
	public PROF_VO getTelinfo(Integer PROF_NUM, String PROF_PW) {
		return this.PROF_DAO.getTelinfo(PROF_NUM, PROF_PW);
	}
}