package com.mgr.kgu.ServiceImpl;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgr.kgu.DAO.STU_DAO;
import com.mgr.kgu.Service.STU_Service;
import com.mgr.kgu.VO.STU_VO;


@Service
public class STU_ServiceImpl implements STU_Service {

	@Autowired
	private STU_DAO STU_DAO;

	@Override
	public boolean getlogininfo(Integer STU_NUM, String STU_PW) {
		return true;
	}

	@Override
	public STU_VO getAllinfo(Integer STU_NUM) {
		return STU_DAO.getAllinfo(STU_NUM);
	}	
}