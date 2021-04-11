package com.mgr.kgu.DAO;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.mgr.kgu.VO.SUB_VO;

// 인터페이스
public interface SUB_DAO {
	ArrayList<SUB_VO> callAllSubject();

	boolean subjectInsertProcess(@Param("sub_num") int sub_num, @Param("stu_num") int stu_num);

}