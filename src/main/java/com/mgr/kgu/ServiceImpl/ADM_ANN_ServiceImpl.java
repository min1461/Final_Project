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
	public ArrayList<ANN_VO> getAllinfo() throws Exception {
		return annkaja.getAllinfo();
	}
	
	@Override
	public ANN_VO getTelinfo(ANN_VO ann_VO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ANN_VO insertinfo(ANN_VO ann_VO) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public ANN_VO updateinfo(ANN_VO ann_VO) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public ANN_VO deleteinfo(ANN_VO ann_VO) {
		// TODO Auto-generated method stub
		return null;
	}
}
