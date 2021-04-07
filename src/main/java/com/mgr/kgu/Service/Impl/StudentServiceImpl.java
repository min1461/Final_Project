package com.mgr.kgu.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgr.kgu.Service.myService;
import com.mgr.kgu.Service.DAO.StudentDAO;
import com.mgr.kgu.VO.StudentVO;

@Service
public class StudentServiceImpl implements StudentDAO {

	@Autowired
	private myService sdt_Service;

	@Override
	public StudentVO getTelinfo() {
		return sdt_Service.getTelinfo();
	}
}