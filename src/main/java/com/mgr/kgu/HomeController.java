package com.mgr.kgu;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mgr.kgu.ServiceImpl.STU_ServiceImpl;
import com.mgr.kgu.VO.*;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	private STU_ServiceImpl STU_Service;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("테스트를 시작합니다^^");
		STU_VO STU_VO = STU_Service.getTelinfo();
		System.out.println("생성완료");
		model.addAttribute("STU_NAME", STU_VO.getSTU_NAME());
		System.out.println("모델에 이름 추가 완료");
		System.out.println(STU_VO.getSTU_NAME());
		System.out.println("테스트 종료");
		return "home";
	}

	// index=>학생로그인페이지
	@RequestMapping(value = "/STU_login")
	public String STU_login(Model model) {
		return "main/STU_main";
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
	@RequestMapping(value = "/STU_main")
	public String STU_main(Model model, HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("HAKBUN"));
		String pw = request.getParameter("HAK_PW");
		STU_VO sv = new STU_VO(id, pw);
		model.addAttribute("STU_VO", sv);
		return "main/STU_main";
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
	public String com_noticelist(Model model) {
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
	@RequestMapping(value = "/STU_gradesCheck")
	public String STU_gradesCheck(Model model) {
		return "student/STU_gradesCheck";
	}

	// 학점
	@RequestMapping(value = "/prof_scoreInsert")
	public String prof_scoreInsert(Model model) {
		return "professor/prof_scoreInsert";
	}

	// ----------- 아직 안만진곳 ------------
	// 학생관리(호출페이지)
	@RequestMapping(value = "/STU_call")
	public String STU_call(Model model) {
		return "STU_call";
	}

	// 학생관리(추가)
	@RequestMapping(value = "/STU_insert")
	public String STU_insert(Model model) {
		return "STU_insert";
	}

	// 학생관리(수정)
	@RequestMapping(value = "/STU_update")
	public String STU_update(Model model) {
		return "STU_update";
	}

	// 학생관리(상태 변경)
	@RequestMapping(value = "/STU_state")
	public String STU_state(Model model) {
		return "STU_state";
	}

	// 교수출석 (입력)
	@RequestMapping(value = "/prof_attendance")
	public String prof_attendance(Model model) {
		return "professor/prof_attendance";
	}

	// 학생관리(상태 변경)
	@RequestMapping(value = "/STU_infoUpdate")
	public String STU_infoUpdate(Model model) {
//		STU_VO sv = new STU_VO(111, "12345");
//		model.addAttribute("sv",sv);
		return "student/STU_infoUpdate";
	}

	// 학생출석 (조회)
	@RequestMapping(value = "/STU_attendanceCheck")
	public String STU_attendanceCheck(Model model) {
		return "student/STU_attendanceCheck";
	}

	// 관리자 공지사항 수정
	@RequestMapping(value = "/adm_noticeUpdate")
	public String adm_noticeUpdate(Model model) {
		return "admin/adm_noticeUpdate";
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
	@RequestMapping(value = "/STU_registerInsert")
	public String STU_registerInsert(Model model) {
		return "student/STU_registerInsert";
	}

	// 수강신청 입력
	@RequestMapping(value = "/STU_registerCheck")
	public String STU_registerCheck(Model model) {
		return "student/STU_registerCheck";
	}

	// 등록금 조회
	@RequestMapping(value = "/STU_tuitionCheck")
	public String STU_tuitionCheck(Model model) {
		return "student/STU_tuitionCheck";
	}

	// 입사신청
	@RequestMapping(value = "/STU_joinInsert")
	public String STU_joinInsert(Model model) {
		return "student/STU_joinInsert";
	}

	// 장학금신청
	@RequestMapping(value = "/STU_scholarshipApplyCheck")
	public String STU_scholarshipApplyCheck(Model model) {
		return "student/STU_scholarshipApplyCheck";
	}

	// 기숙사배정
	@RequestMapping(value = "/adm_roomCheck")
	public String adm_roomCheck(Model model) {
		return "admin/adm_roomCheck";
	}

	// 휴복학신청
	@RequestMapping(value = "/STU_stateInsert")
	public String STU_stateInsert(Model model) {
		return "student/STU_stateInsert";
	}
	
	//휴복학 승인
	@RequestMapping(value ="/adm_stateCheck")
	public String adm_stateCheck(Model model) {
		return "admin/adm_stateCheck";
	}

	// 벌점등록
	@RequestMapping(value = "/adm_penaltyInsert")
	public String adm_penaltyInsert(Model model) {
		return "admin/adm_penaltyInsert";
	}

	// 강의평가
	@RequestMapping(value = "/STU_evaluationInsert")
	public String STU_evaluationInsert(Model model) {
		return "student/STU_evaluationInsert";
	}

	// 강의평가 팝업
	@RequestMapping(value = "/STU_popupInsert")
	public String STU_popupInsert(Model model) {
		return "student/STU_popupInsert";
	}

	// 벌점조회
	@RequestMapping(value = "/STU_penaltyCheck")
	public String STU_penaltyCheck(Model model) {
		return "student/STU_penaltyCheck";

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
}