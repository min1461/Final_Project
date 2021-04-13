package com.mgr.kgu.DAO;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.mgr.kgu.VO.TUI_VO;


public interface TUI_DAO {
	
    ArrayList<TUI_VO> allTuiInfo(@Param("STU_NUM") int STU_NUM);
}
