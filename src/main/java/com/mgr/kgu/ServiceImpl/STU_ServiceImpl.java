package com.mgr.kgu.ServiceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgr.kgu.DAO.STU_DAO;
import com.mgr.kgu.Service.STU_Service;
import com.mgr.kgu.VO.SCO_VO;
import com.mgr.kgu.VO.STU_VO;

@Service("STU_Service")
public class STU_ServiceImpl implements STU_Service {

	@Autowired
	private STU_DAO STU_DAO;

	@Override
	public STU_VO getAllinfo(int STU_NUM, String STU_PW) {
		return STU_DAO.getAllinfo(STU_NUM, STU_PW);
	}

	@Override
	public void changedInfo(int STU_NUM, String after_address, String after_number, String after_email,
			String after_bankname, String after_bankacc) {
		STU_DAO.changedInfo(STU_NUM, after_address, after_number, after_email, after_bankname, after_bankacc);
	}

	@Override
	public void changedInfoPW(int STU_NUM, String after_pw, String after_address, String after_number,
			String after_email, String after_bankname, String after_bankacc) {
		STU_DAO.changedInfoPW(STU_NUM, after_pw, after_address, after_number, after_email, after_bankname,
				after_bankacc);

	}

	@Override
	public ArrayList<SCO_VO> callMyallscholar(int STU_NUM) {
		return STU_DAO.callMyallscholar(STU_NUM);
	}

}