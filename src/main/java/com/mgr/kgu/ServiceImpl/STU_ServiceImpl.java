package com.mgr.kgu.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgr.kgu.DAO.STU_DAO;
import com.mgr.kgu.Service.STU_Service;
import com.mgr.kgu.VO.STU_VO;

@Service
public class STU_ServiceImpl implements STU_DAO {

	@Autowired
	private STU_Service STU_Service;

	@Override
	public STU_VO getTelinfo() {
		return STU_Service.getTelinfo();
	}
	
	@Override
	public STU_VO getSTU_NUM() {
		return STU_Service.getSTU_NUM();
	}
	
	@Override
	public STU_VO getSTU_PW() {
		return this.STU_Service.getSTU_PW();
	}
}