package com.mgr.kgu.Service;

import org.apache.ibatis.annotations.Param;

import com.mgr.kgu.VO.TUI_VO;

public interface TUI_Service {

	// 정보호출
		/*TUI_VO getAllinfo(int TUI_NUM, int TUI_FEE);*/
	TUI_VO getAllinfo(@Param("num") int num, @Param("fee") int fee);
		
}
