
package com.mgr.kgu;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mgr.kgu.VO.admin_VO;
import com.mgr.kgu.VO.prof_VO;
import com.mgr.kgu.VO.std_VO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	// index=>학생로그인페이지
	@RequestMapping(value = "/std_login")
	public String std_login(Model model) {
		return "main/std_main";
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
	@RequestMapping(value = "/std_main")
	public String std_main(Model model, HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("HAKBUN"));
		String pw = request.getParameter("HAK_PW");
		std_VO sv = new std_VO(id, pw);
		model.addAttribute("std_VO", sv);
		return "main/std_main";
	}

	// 교수로그인페이지=>교수메인
	@RequestMapping(value = "/prof_main")
	public String prof_main(Model model, int id, String pw) {
		prof_VO pv = new prof_VO(id, pw);
		model.addAttribute("prof_VO", pw);
		return "main/prof_main";
	}

	// 관리자로그인페이지=>관리자메인
	@RequestMapping(value = "/adm_main")
	public String adm_main(Model model, int id, String pw) {
		admin_VO av = new admin_VO(id, pw);
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
	@RequestMapping(value = "/std_gradesCheck")
	public String std_gradesCheck(Model model) {
		return "student/std_gradesCheck";
	}

	// 학점
	@RequestMapping(value = "/prof_scoreInsert")
	public String prof_scoreInsert(Model model) {
		return "professor/prof_scoreInsert";
	}

	// ----------- 아직 안만진곳 ------------
	// 학생관리(호출페이지)
	@RequestMapping(value = "/std_call")
	public String std_call(Model model) {
		return "std_call";
	}

	// 학생관리(추가)
	@RequestMapping(value = "/std_insert")
	public String std_insert(Model model) {
		return "std_insert";
	}

	// 학생관리(수정)
	@RequestMapping(value = "/std_update")
	public String std_update(Model model) {
		return "std_update";
	}

	// 학생관리(상태 변경)
	@RequestMapping(value = "/std_state")
	public String std_state(Model model) {
		return "std_state";
	}

	// 교수출석 (입력)
	@RequestMapping(value = "/prof_attendance")
	public String prof_attendance(Model model) {
		return "professor/prof_attendance";
	}

	// 학생관리(상태 변경)
	@RequestMapping(value = "/std_infoUpdate")
	public String std_infoUpdate(Model model) {
//		std_VO sv = new std_VO(111, "12345");
//		model.addAttribute("sv",sv);
		return "student/std_infoUpdate";
	}

	// 학생출석 (조회)
	@RequestMapping(value = "/std_attendanceCheck")
	public String std_attendanceCheck(Model model) {
		return "student/std_attendanceCheck";
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
	@RequestMapping(value = "/std_registerInsert")
	public String std_registerInsert(Model model) {
		return "student/std_registerInsert";
	}

	// 수강신청 입력
	@RequestMapping(value = "/std_registerCheck")
	public String std_registerCheck(Model model) {
		return "student/std_registerCheck";
	}

	// 등록금 조회
	@RequestMapping(value = "/std_tuitionCheck")
	public String std_tuitionCheck(Model model) {
		return "student/std_tuitionCheck";
	}

	// 입사신청
	@RequestMapping(value = "/std_joinInsert")
	public String std_joinInsert(Model model) {
		return "student/std_joinInsert";
	}

	// 장학금신청
	@RequestMapping(value = "/std_scholarshipApplyCheck")
	public String std_scholarshipApplyCheck(Model model) {
		return "student/std_scholarshipApplyCheck";
	}

	// 기숙사배정
	@RequestMapping(value = "/adm_roomCheck")
	public String adm_roomCheck(Model model) {
		return "admin/adm_roomCheck";
	}

	// 휴복학신청
	@RequestMapping(value = "/std_stateInsert")
	public String std_stateInsert(Model model) {
		return "student/std_stateInsert";
	}

	// 벌점등록
	@RequestMapping(value = "/adm_penaltyInsert")
	public String adm_penaltyInsert(Model model) {
		return "admin/adm_penaltyInsert";

	}

	// 벌점조회
	@RequestMapping(value = "/std_penaltyCheck")
	public String std_penaltyCheck(Model model) {
		return "student/std_penaltyCheck";

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