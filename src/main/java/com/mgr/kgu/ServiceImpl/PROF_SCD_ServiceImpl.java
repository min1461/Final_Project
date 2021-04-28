package com.mgr.kgu.ServiceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgr.kgu.DAO.PROF_SCD_DAO;
import com.mgr.kgu.Service.PROF_SCD_Service;
import com.mgr.kgu.VO.TSCD_VO;

@Service("PROF_SCD_Service")
public class PROF_SCD_ServiceImpl implements PROF_SCD_Service {
	
	@Autowired
	private PROF_SCD_DAO tscdkaja;

	@Override
	public ArrayList<TSCD_VO> getAllinfo(){
		return tscdkaja.getAllinfo();
	}
	
	@Override
	public TSCD_VO getTelinfo(int TSCD_NUM) {
		// TODO Auto-generated method stub
		return tscdkaja.getTelinfo(TSCD_NUM);
	}

	@Override
	public void insertinfo(TSCD_VO tscd_VO) {
		// TODO Auto-generated method stub
		tscdkaja.insertinfo(tscd_VO);
	}
	
	@Override
	public boolean updateinfo(int TSCD_NUM, String TSCD_TITLE, String TSCD_CONT) {
		return tscdkaja.updateinfo(TSCD_NUM, TSCD_TITLE, TSCD_CONT);
	}
	
	@Override
	public void deleteinfo(TSCD_VO tscd_VO) {
		// TODO Auto-generated method stub
		tscdkaja.deleteinfo(tscd_VO);
	}






}
