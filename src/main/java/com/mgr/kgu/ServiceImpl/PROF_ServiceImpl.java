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
	public PROF_VO getAllinfo(Integer prof_NUM, String prof_PW) {
		return PROF_DAO.getAllinfo(prof_NUM, prof_PW);
	}

}