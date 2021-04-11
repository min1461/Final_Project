package com.mgr.kgu.Service;


import java.util.ArrayList;

import com.mgr.kgu.VO.TUI_VO;

public interface TUI_Service {

	// 정보호출
	ArrayList<TUI_VO> allTuiInfo(int STU_NUM);
		
}
