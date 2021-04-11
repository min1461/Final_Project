package com.mgr.kgu.DAO;

import java.util.ArrayList;


import com.mgr.kgu.VO.DOR_VO;

public interface DOR_DAO {

	ArrayList<DOR_VO> getAllDOR();
	int insertDor(DOR_VO dor_VO);
}
