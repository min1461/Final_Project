package com.mgr.kgu.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mgr.kgu.DAO.STD_DAO;
import com.mgr.kgu.Service.STD_Service;
import com.mgr.kgu.VO.STD_VO;

@Service
public class STD_ServiceImpl implements STD_DAO {

	@Autowired
	private STD_Service STD_Service;

	@Override
	public STD_VO getTelinfo() {
		return this.STD_Service.getTelinfo();
	}
	
	@Override
	public STD_VO getSTDNUM() {
		return this.STD_Service.getSTDNUM();
	}
	
	@Override
	public STD_VO getSTDPW() {
		return this.STD_Service.getSTDPW();
	}
}