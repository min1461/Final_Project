package com.mgr.kgu.ServiceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgr.kgu.DAO.ADM_ANN_DAO;
import com.mgr.kgu.Service.ADM_ANN_Service;
import com.mgr.kgu.VO.ANN_VO;

@Service("ADN_ANN_Service")
public class ADM_ANN_ServiceImpl implements ADM_ANN_Service {
	
	@Autowired
	private ADM_ANN_DAO annkaja; // new SawonDAO()개념

	@Override
	public ArrayList<ANN_VO> getAllinfo(){
		return annkaja.getAllinfo();
	}
	
	@Override
	public ANN_VO getTelinfo(ANN_VO ann_VO) {
		// TODO Auto-generated method stub
		return annkaja.getTelinfo(ann_VO);
	}

	@Override
	public void insertinfo(ANN_VO ann_VO) {
		// TODO Auto-generated method stub
		annkaja.insertinfo(ann_VO);
	}
	
	@Override
	public void updateinfo(ANN_VO ann_VO) {
		// TODO Auto-generated method stub
		annkaja.updateinfo(ann_VO);
	}
	
	@Override
	public void deleteinfo(ANN_VO ann_VO) {
		// TODO Auto-generated method stub
		annkaja.deleteinfo(ann_VO);
	}
}
