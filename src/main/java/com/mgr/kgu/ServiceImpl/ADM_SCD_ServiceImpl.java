package com.mgr.kgu.ServiceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgr.kgu.DAO.ADM_SCD_DAO;
import com.mgr.kgu.Service.ADM_SCD_Service;
import com.mgr.kgu.VO.SCD_VO;

@Service("ADN_SCD_Service")
public class ADM_SCD_ServiceImpl implements ADM_SCD_Service {
	
	@Autowired
	private ADM_SCD_DAO scdkaja;

	@Override
	public ArrayList<SCD_VO> getAllinfo(){
		return scdkaja.getAllinfo();
	}
	
	@Override
	public SCD_VO getTelinfo(int SCD_NUM) {
		// TODO Auto-generated method stub
		return scdkaja.getTelinfo(SCD_NUM);
	}

	@Override
	public void insertinfo(SCD_VO scd_VO) {
		// TODO Auto-generated method stub
		scdkaja.insertinfo(scd_VO);
	}
	
	@Override
	public boolean updateinfo(int SCD_NUM, String SCD_TITLE, String SCD_CONT) {
		return scdkaja.updateinfo(SCD_NUM, SCD_TITLE, SCD_CONT);
	}
	
	@Override
	public void deleteinfo(SCD_VO scd_VO) {
		// TODO Auto-generated method stub
		scdkaja.deleteinfo(scd_VO);
	}






}
