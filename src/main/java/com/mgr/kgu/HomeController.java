package com.mgr.kgu;

import java.util.ArrayList;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mgr.kgu.DAO.ADM_ANN_DAO;
import com.mgr.kgu.DAO.STU_DAO;
import com.mgr.kgu.Service.ADM_ANN_Service;
import com.mgr.kgu.VO.ADM_VO;
import com.mgr.kgu.VO.ANN_VO;
import com.mgr.kgu.VO.PROF_VO;
import com.mgr.kgu.VO.STU_VO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	private STU_DAO stu_dao;
	
	private ADM_ANN_DAO adm_ann_dao;

	/**
	 * Simply selects the home view to render by returning its name.
	 */

	// index=>학생로그인페이지
	@RequestMapping(value = "/stu_login")
	public String stu_login(Model model) {
		return "login/stu_login";
	}

	// index=>교수로그인페이지
	@RequestMapping(value = "/prof_login")
	public String prof_login(Model model) {
		return "main/prof_main";
	}

	// index=>관리자로그인페이지
	@RequestMapping(value = "/adm_login")
	public String adm_login(Model model) {
		return "main/adm_main";
	}

	// 학생로그인페이지=>학생메인
	@RequestMapping(value = "/stu_main")
	public String stu_main(HttpSession session, Model model, HttpServletRequest request) {
		int id = Integer.valueOf(request.getParameter("HAKBUN"));
		String pw = request.getParameter("HAK_PW");
		STU_VO stu_vo = stu_dao.getAllinfo(id);
		session.setAttribute("stu_VO", stu_vo);
		return "main/stu_main";
	}

	// 교수로그인페이지=>교수메인
	@RequestMapping(value = "/prof_main")
	public String prof_main(Model model, int id, String pw) {
		PROF_VO pv = new PROF_VO(id, pw);
		model.addAttribute("prof_VO", pv.getProf_PW());
		return "main/prof_main";
	}

	// 관리자로그인페이지=>관리자메인
	@RequestMapping(value = "/adm_main")
	public String adm_main(Model model, int id, String pw) {
		ADM_VO av = new ADM_VO(id, pw);
		model.addAttribute("admin_VO", av);
		return "main/adm_main";
	}

	// 공지사항 리스트
	@RequestMapping(value = "/com_noticelist")
	public String com_noticelist(HttpSession session, Model model, HttpServletRequest request) {
	    ArrayList <ANN_VO> nlist = adm_ann_dao.getAllinfo();
		session.setAttribute("nlist", nlist);
		return "common/com_noticelist";
	}

	// 세부공지사항
	@RequestMapping(value = "/com_noticeCheck")
	public String com_noticeCheck(Model model) {
		return "common/com_noticeCheck";
	}

	// 학교 주요일정 리스트
	@RequestMapping(value = "/com_uschedulelist")
	public String com_uschedulelist(Model model) {
		return "common/com_uschedulelist";
	}

	// 학교 세부주요일정
	@RequestMapping(value = "/com_uscheduleCheck")
	public String com_uscheduleCheck(Model model) {
		return "common/com_uscheduleCheck";
	}

	// 시험일정 리스트
	@RequestMapping(value = "/com_pschedulelist")
	public String com_pschedulelist(Model model) {
		return "common/com_pschedulelist";
	}

	// 세부 시험일정
	@RequestMapping(value = "/com_pscheduleCheck")
	public String com_pscheduleCheck(Model model) {
		return "common/com_pscheduleCheck";
	}

	// 교수용 시험일정 리스트
	@RequestMapping(value = "/prof_schedulelist")
	public String prof_schedulelist(Model model) {
		return "professor/prof_schedulelist";
	}

	// 교수용 세부 시험일정
	@RequestMapping(value = "/prof_scheduleCheck")
	public String prof_scheduleCheck(Model model) {
		return "professor/prof_scheduleCheck";
	}

	// 관리자용 공지사항 리스트
	@RequestMapping(value = "/adm_noticelist")
	public String adm_noticelist(Model model) {
		return "admin/adm_noticelist";
	}

	// 관리자용 세부 공지사항일정
	@RequestMapping(value = "/adm_scheduleCheck")
	public String adm_scheduleCheck(Model model) {
		return "admin/adm_scheduleCheck";
	}

	// 관리자용 주요일정 리스트
	@RequestMapping(value = "/adm_schedulelist")
	public String adm_schedulelist(Model model) {
		return "admin/adm_schedulelist";
	}

	// 관리자용 세부 주요일정
	@RequestMapping(value = "/adm_noticeCheck")
	public String adm_noticeCheck(Model model) {
		return "admin/adm_noticeCheck";
	}

	// 성적확인
	@RequestMapping(value = "/stu_gradesCheck")
	public String stu_gradesCheck(Model model) {
		return "student/stu_gradesCheck";
	}

	// 학점
	@RequestMapping(value = "/prof_scoreInsert")
	public String prof_scoreInsert(Model model) {
		return "professor/prof_scoreInsert";
	}

	// ----------- 아직 안만진곳 ------------
	// 학생관리(호출페이지)
	@RequestMapping(value = "/stu_call")
	public String stu_call(Model model) {
		return "stu_call";
	}

	// 학생관리(추가)
	@RequestMapping(value = "/stu_insert")
	public String stu_insert(Model model) {
		return "stu_insert";
	}

	// 학생관리(수정)
	@RequestMapping(value = "/stu_update")
	public String stu_update(Model model) {
		return "stu_update";
	}

	// 학생관리(상태 변경)
	@RequestMapping(value = "/stu_state")
	public String stu_state(Model model) {
		return "stu_state";
	}

	// 교수출석 (입력)
	@RequestMapping(value = "/prof_attendance")
	public String prof_attendance(Model model) {
		return "professor/prof_attendance";
	}

	// 학생관리(상태 변경)
	@RequestMapping(value = "/stu_infoUpdate")
	public String stu_infoUpdate(Model model) {
		STU_VO sv = new STU_VO(111, "12345");
		model.addAttribute("sv", sv);
		return "student/stu_infoUpdate";
	}

	// 학생출석 (조회)
	@RequestMapping(value = "/stu_attendanceCheck")
	public String stu_attendanceCheck(Model model) {
		return "student/stu_attendanceCheck";
	}

	// 관리자 공지사항 수정
	@RequestMapping(value = "/adm_noticeUpdate")
	public String adm_noticeUpdate(Model model) {
		return "admin/adm_noticeUpdate";
	}
	
	//관리자 공지사항 입력 폼
	@RequestMapping(value = "/adm_noticeInsertForm")
	public String adm_noticeInsertForm(HttpSession session, Model model, HttpServletRequest request) {
		
		
		return "admin/adm_noticelist";
	}
	// 관리자 공지사항 입력
	@RequestMapping(value = "/adm_noticeInsert")
	public String adm_noticeInsert(Model model) {
		return "admin/adm_noticeInsert";
	}

	// 관리자 주요일정 수정
	@RequestMapping(value = "/adm_scheduleUpdate")
	public String adm_scheduleUpdate(Model model) {
		return "admin/adm_scheduleUpdate";
	}

	// 관리자 주요일정 입력
	@RequestMapping(value = "/adm_scheduleInsert")
	public String adm_scheduleInsert(Model model) {
		return "admin/adm_scheduleInsert";
	}

	// 교수 시험일정 수정
	@RequestMapping(value = "/prof_scheduleUpdate")
	public String prof_scheduleUpdate(Model model) {
		return "professor/prof_scheduleUpdate";
	}

	// 교수 시험일정 입력
	@RequestMapping(value = "/prof_scheduleInsert")
	public String prof_scheduleInsert(Model model) {
		return "professor/prof_scheduleInsert";
	}

	// 수강신청 입력
	@RequestMapping(value = "/stu_registerInsert")
	public String stu_registerInsert(Model model) {
		return "student/stu_registerInsert";
	}

	// 수강신청 입력
	@RequestMapping(value = "/stu_registerCheck")
	public String stu_registerCheck(Model model) {
		return "student/stu_registerCheck";
	}

	// 등록금 조회
	@RequestMapping(value = "/stu_tuitionCheck")
	public String stu_tuitionCheck(Model model) {
		return "student/stu_tuitionCheck";
	}

	// 입사신청
	@RequestMapping(value = "/stu_joinInsert")
	public String stu_joinInsert(Model model) {
		return "student/stu_joinInsert";
	}

	// 장학금신청
	@RequestMapping(value = "/stu_scholarshipApplyCheck")
	public String stu_scholarshipApplyCheck(Model model) {
		return "student/stu_scholarshipApplyCheck";
	}

	// 기숙사배정
	@RequestMapping(value = "/adm_roomCheck")
	public String adm_roomCheck(Model model) {
		return "admin/adm_roomCheck";
	}

	// 휴복학신청
	@RequestMapping(value = "/stu_stateInsert")
	public String stu_stateInsert(Model model) {
		return "student/stu_stateInsert";
	}

	// 휴복학 승인
	@RequestMapping(value = "/adm_stateCheck")
	public String adm_stateCheck(Model model) {
		return "admin/adm_stateCheck";
	}

	// 벌점등록
	@RequestMapping(value = "/adm_penaltyInsert")
	public String adm_penaltyInsert(Model model) {
		return "admin/adm_penaltyInsert";
	}

	// 강의평가
	@RequestMapping(value = "/stu_evaluationInsert")
	public String stu_evaluationInsert(Model model) {
		return "student/stu_evaluationInsert";
	}

	// 강의평가 팝업
	@RequestMapping(value = "/stu_popupInsert")
	public String stu_popupInsert(Model model) {
		return "student/stu_popupInsert";
	}

	// 벌점조회
	@RequestMapping(value = "/stu_penaltyCheck")
	public String stu_penaltyCheck(Model model) {
		return "student/stu_penaltyCheck";

	}

	// 장학금 조회
	@RequestMapping(value = "/adm_tuitiondepositCheck")
	public String adm_tuitiondepositCheck(Model model) {
		return "admin/adm_tuitiondepositCheck";

	}

	// 장학금 승인
	@RequestMapping(value = "/adm_tuitiondepositApproval")
	public String adm_tuitiondepositApproval(Model model) {
		return "admin/adm_tuitiondepositApproval";
	}

	@RequestMapping(value = "/changeinfo")
	public String changeinfo(HttpSession session, Model model, HttpServletRequest request) {
		STU_VO stu_vo = (STU_VO) session.getAttribute("stu_VO");
		String before_address = stu_vo.getSTU_ADDRESS();
		String after_address = request.getParameter("address");
		if (!before_address.equals(after_address) || !after_address.equals("")) {
			int stu_num = stu_vo.getSTU_NUM();
			System.out.println(stu_vo.getSTU_ADDRESS());
			stu_dao.changedAddress(after_address, stu_num);
			System.out.println(after_address);
			System.out.println(stu_vo.getSTU_ADDRESS());
		}
		return "student/stu_infoUpdate";
	}

	// 학생관리
	@RequestMapping(value = "/adm_studentCheck")
	public String adm_studentCheck(Model model) {
		return "admin/adm_studentCheck";
	}
}