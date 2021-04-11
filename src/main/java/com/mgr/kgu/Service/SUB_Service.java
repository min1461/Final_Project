package com.mgr.kgu.Service;

import java.util.ArrayList;

import com.mgr.kgu.VO.SUB_VO;

public interface SUB_Service {
	ArrayList<SUB_VO> callAllSubject();

	boolean subjectInsertProcess(int sub_num, int stu_num);
}