package com.mgr.kgu.ServiceImpl;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgr.kgu.DAO.PEN_DAO;
import com.mgr.kgu.Service.PEN_Service;
import com.mgr.kgu.VO.PEN_VO;

@Service("PEN_Service")
public class PEN_ServiceImpl implements PEN_Service {

	@Autowired
	private PEN_DAO pdao;

	

	@Override
	public int insertPenalty(PEN_VO PEN_VO) {
		// TODO Auto-generated method stub
		return pdao.insertPenalty(PEN_VO);
	}


	@Override
	public ArrayList<PEN_VO> getAllPenalty(int STU_NUM) {
		// TODO Auto-generated method stub
		System.out.println("STU_NUM은 "+ STU_NUM);
		return pdao.getAllPenalty(STU_NUM);
	}

	
}
