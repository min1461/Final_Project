package com.mgr.kgu.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgr.kgu.DAO.TUI_DAO;
import com.mgr.kgu.Service.TUI_Service;
import com.mgr.kgu.VO.TUI_VO;

@Service("TUI_Service")
public class TUI_ServiceImpl implements TUI_Service {

	@Autowired
	private TUI_DAO TUI_DAO;

	@Override
	public TUI_VO getAllinfo(int TUI_NUM, int TUI_FEE) {
		return TUI_DAO.getAllinfo(TUI_NUM, TUI_FEE);
	}


}