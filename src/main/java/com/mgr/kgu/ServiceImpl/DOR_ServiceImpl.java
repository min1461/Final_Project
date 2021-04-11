package com.mgr.kgu.ServiceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgr.kgu.DAO.DOR_DAO;
import com.mgr.kgu.Service.DOR_Service;
import com.mgr.kgu.VO.DOR_VO;

@Service("DOR_Service")
public class DOR_ServiceImpl implements DOR_Service {

	@Autowired
	private DOR_DAO ddao;


	@Override
	public int insertDor(DOR_VO DOR_VO) {
		// TODO Auto-generated method stub
		return ddao.insertDor(DOR_VO);
	}
	
	@Override
	public ArrayList<DOR_VO> getAllDOR() {
		// TODO Auto-generated method stub
		return ddao.getAllDOR();
	}
}
