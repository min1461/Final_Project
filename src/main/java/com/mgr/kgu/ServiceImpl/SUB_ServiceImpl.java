package com.mgr.kgu.ServiceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgr.kgu.DAO.SUB_DAO;
import com.mgr.kgu.Service.SUB_Service;
import com.mgr.kgu.VO.SUB_VO;

@Service("SUB_Service")
public class SUB_ServiceImpl implements SUB_Service {

	@Autowired
	private SUB_DAO SUB_DAO;

	@Override
	public ArrayList<SUB_VO> callAllSubject() {
		return SUB_DAO.callAllSubject();
	}

	@Override
	public boolean subjectInsertProcess(int sub_num, int stu_num) {
		return true;
	}
}