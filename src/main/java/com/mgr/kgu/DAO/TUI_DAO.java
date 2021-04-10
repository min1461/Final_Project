package com.mgr.kgu.DAO;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.mgr.kgu.VO.SCO_VO;
import com.mgr.kgu.VO.STU_VO;
import com.mgr.kgu.VO.TUI_VO;

public interface TUI_DAO {
	TUI_VO getAllinfo(@Param("TUI_NUM") int TUI_NUM,  @Param("TUI_FEE") int TUI_FEE);

}
