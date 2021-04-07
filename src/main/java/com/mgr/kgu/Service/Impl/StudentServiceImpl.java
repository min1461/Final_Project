package com.mgr.kgu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mgr.kgu.service.myService;
import com.mgr.kgu.service.DAO.StudentDAO;
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