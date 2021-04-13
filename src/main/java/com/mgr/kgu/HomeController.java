package com.mgr.kgu;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mgr.kgu.Service.ADM_ANN_Service;
import com.mgr.kgu.Service.ADM_Service;
import com.mgr.kgu.Service.DOR_Service;
import com.mgr.kgu.Service.PEN_Service;
import com.mgr.kgu.Service.PROF_Service;
import com.mgr.kgu.Service.STU_Service;
import com.mgr.kgu.Service.SUB_Service;
import com.mgr.kgu.Service.TUI_Service;
import com.mgr.kgu.VO.ADM_VO;
import com.mgr.kgu.VO.ANN_VO;
import com.mgr.kgu.VO.DOR_VO;
import com.mgr.kgu.VO.PEN_VO;
import com.mgr.kgu.VO.PROF_VO;
import com.mgr.kgu.VO.SCO_VO;
import com.mgr.kgu.VO.STU_VO;
import com.mgr.kgu.VO.SUB_VO;
import com.mgr.kgu.VO.TUI_VO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	private STU_Service stu_service;

	@Autowired
	private ADM_Service adm_service;

	@Autowired
	private PROF_Service prof_service;

	@Autowired
	private ADM_ANN_Service adm_ann_Service;

	@Autowired
	private PEN_Service pen_Service;

	@Autowired
	private DOR_Service dor_Service;

	@Autowired
	private TUI_Service tui_Service;

	@Autowired
	private SUB_Service sub_Service;


	/**
	 * Simply selects the home view to render by returning its name.
	 */

	// index=>학생로그인페이지
	@RequestMapping(value = "/stu_login")
	public String stu_login(Model model) {
		/* return "login/stu_login"; */
		return "login/stu_login";
	}

	// index=>교수로그인페이지
	@RequestMapping(value = "/prof_login")
	public String prof_login(Model model) {
		/* return "login/prof_login"; */
		return "login/prof_login";
	}

	// index=>관리자로그인페이지
	@RequestMapping(value = "/adm_login")
	public String adm_login(Model model) {
		/* return "login/adm_login"; */
		return "login/adm_login";
	}

	// 학생로그인페이지=>학생메인
	@RequestMapping(value = "/stu_main")
	public String stu_main(HttpSession session, Model model, HttpServletRequest request) {
		int id = Integer.valueOf(request.getParameter("HAKBUN"));
		String pw = request.getParameter("HAK_PW");
		STU_VO stu_vo = stu_service.getAllinfo(id, pw);
		if (stu_vo != null) {
			ArrayList<SCO_VO> scolist = stu_service.callMyallscholar(id);
			session.setAttribute("stu_VO", stu_vo);
			session.setAttribute("scolist", scolist);
		} else {
			return "login/stu_login";
		}
		return "main/stu_main";
	}

	// 교수로그인페이지=>교수메인
	@RequestMapping(value = "/prof_main")
	public String prof_main(HttpSession session, Model model, HttpServletRequest request) {
		int id = Integer.valueOf(request.getParameter("PROFBUN"));
		String pw = request.getParameter("PROF_PW");
		PROF_VO prof_VO = prof_service.getAllinfo(id, pw);
		if (prof_VO != null) {
			System.out.println(prof_VO.getProf_NAME());
			System.out.println(prof_VO.getProf_NUM());
			System.out.println(prof_VO.getProf_PW());
			session.setAttribute("prof_VO", prof_VO);
		} else {
			return "login/prof_login";
		}
		return "main/prof_main";
	}

	// 관리자로그인페이지=>관리자메인
	@RequestMapping(value = "/adm_main")
	public String adm_main(HttpSession session, Model model, HttpServletRequest request) {
		int id = Integer.valueOf(request.getParameter("ADMBUN"));
		String pw = request.getParameter("ADM_PW");
		ADM_VO adm_vo = adm_service.getAllinfo(id, pw);
		if (adm_vo != null) {
			/* ArrayList<ADM_VO> admlist= adm_service.callMyallscholar(id); */
			session.setAttribute("adm_VO", adm_vo);
			/* session.setAttribute("admlist", admlist); */
		} else {
			return "login/adm_login";
		}
		return "main/adm_main";
	}

	// 공지사항 리스트
	@RequestMapping(value = "/com_noticelist")
	public String com_noticelist(HttpSession session, Model model, HttpServletRequest request) {
		ArrayList<ANN_VO> nlist = adm_ann_Service.getAllinfo();
		session.setAttribute("nlist", nlist);
		return "common/com_noticelist";
	}

	// 세부공지사항
	@RequestMapping(value = "/com_noticeCheck")
	public String com_noticeCheck(@RequestParam(value = "ANN_NUM") String ANN_NUM2, HttpServletRequest request,
			Model model) {

		int ANN_NUM = Integer.valueOf(ANN_NUM2);
		ANN_VO ann_VO = adm_ann_Service.getTelinfo(ANN_NUM);
		model.addAttribute("ann_VO", ann_VO);
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
	public String adm_noticelist(HttpSession session, Model model, HttpServletRequest request) {
		ArrayList<ANN_VO> nlist1 = adm_ann_Service.getAllinfo();
		session.setAttribute("nlist1", nlist1);
		return "admin/adm_noticelist";
	}

	// 관리자용 세부 공지사항 내용
	@RequestMapping(value = "/adm_noticeCheck")
	public String adm_noticeCheck(@RequestParam(value = "ANN_NUM") String ANN_NUM2, HttpServletRequest request,
			Model model) {

		int ANN_NUM = Integer.valueOf(ANN_NUM2);
		ANN_VO ann_VO = adm_ann_Service.getTelinfo(ANN_NUM);
		model.addAttribute("ann_VO", ann_VO);

		return "admin/adm_noticeCheck";
	}

	// 관리자용 주요일정 리스트
	@RequestMapping(value = "/adm_schedulelist")
	public String adm_schedulelist(Model model) {
		return "admin/adm_schedulelist";
	}

	// 관리자용 세부 주요일정
	@RequestMapping(value = "/adm_scheduleCheck")
	public String adm_scheduleCheck(Model model) {
		return "admin/adm_scheduleCheck";
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
	public String com_noticeUpdate(@RequestParam(value = "ANN_NUM") String ANN_NUM2, HttpServletRequest request,
			Model model) {

		int ANN_NUM = Integer.valueOf(ANN_NUM2);
		ANN_VO ann_VO = adm_ann_Service.getTelinfo(ANN_NUM);
		model.addAttribute("ann_VO", ann_VO);
		return "admin/adm_noticeUpdate";
	}
	
	// 관리자 공지사항 수정
	@RequestMapping(value = "/adm_noticeUpdateForm")
	public String com_noticeUpdateFrom(HttpSession session, HttpServletRequest request, @RequestParam(value = "ANN_CONT") String ann_cont, Model model) {
		
		int ann_num = Integer.valueOf(request.getParameter("ANN_NUM"));
		String ann_title = request.getParameter("ANN_TITLE");
		System.out.println("동작전"+ann_title);
		adm_ann_Service.updateinfo(ann_num, ann_title, ann_cont);
		System.out.println("동작후"+ann_title);
		ArrayList<ANN_VO> nlist1 = adm_ann_Service.getAllinfo();
		session.setAttribute("nlist1", nlist1);
		System.out.println("home"+ann_title);
		
		return "main/adm_main";

	}
	
	// 관리자 공지사항 삭제
	@RequestMapping(value = "/adm_noticeDelete")
	public String com_noticeDelete(ANN_VO ann_VO, Model model) {

		adm_ann_Service.deleteinfo(ann_VO);
		return "admin/adm_main";
	}

	// 관리자 공지사항 입력 폼
	@RequestMapping(value = "/adm_noticeInsertForm")
	public String adm_noticeInsertForm(ANN_VO ann_VO, Model model) {
		adm_ann_Service.insertinfo(ann_VO);
		return "main/adm_main";
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
	public String stu_registerInsert(HttpSession session, Model model, HttpServletRequest request) {
		ArrayList<SUB_VO> sub_VO = sub_Service.callAllSubject();
		model.addAttribute("sub_VO", sub_VO);
		return "student/stu_registerInsert";
	}

	// 수강신청 입력 프로세스
	@RequestMapping(value = "/stu_registerInsertProcess")
	public String stu_registerInsertProcess(HttpSession session, Model model, HttpServletRequest request) {
		int sub_num = Integer.valueOf(request.getParameter("SUB_NUM"));
		int stu_num = (int) ((STU_VO) session.getAttribute("sub_VO")).getSTU_NUM();
		sub_Service.subjectInsertProcess(sub_num, stu_num);
		return "student/stu_main";
	}

	// 수강신청 확인
	@RequestMapping(value = "/stu_registerCheck")
	public String stu_registerCheck(Model model) {
		return "student/stu_registerCheck";
	}

	// 등록금 조회 및 결제
	@RequestMapping(value = "/stu_tuitionCheck")
	public String stu_tuitionCheck(HttpSession session, HttpServletRequest request, Model model){
		STU_VO stu_vo = (STU_VO) session.getAttribute("stu_VO");
		int STU_NUM = stu_vo.getSTU_NUM();
		ArrayList<TUI_VO> tui_vo = tui_Service.allTuiInfo(STU_NUM); /*반환되는 값tui_vo*/
		model.addAttribute("tui_VO",tui_vo); //불러올이름, JSP에 있는거랑 이름 가
		return "student/stu_tuitionCheck";
	}

	// 입사신청 폼
	@RequestMapping(value = "/stu_joinInsert", method = RequestMethod.POST)
	public String stu_joinInsert(@ModelAttribute("DOR_VO") DOR_VO DOR_VO,Model model) {	
		return "student/stu_joinInsert";
	}
	
	// 입사신청 insert
	@RequestMapping(value = "/insertDor")
	public String insertDor(@ModelAttribute("DOR_VO") DOR_VO DOR_VO, Model model) {
		dor_Service.insertDor(DOR_VO);
		return "main/stu_main";
	}

	// 장학금신청
	@RequestMapping(value = "/stu_scholarshipApplyCheck")
	public String stu_scholarshipApplyCheck(Model model) {
		return "student/stu_scholarshipApplyCheck";
	}

	// 기숙사배정
	@RequestMapping(value = "/adm_roomCheck", method=RequestMethod.POST)
	public String getAllDOR(Model model) {
		ArrayList<DOR_VO> list2 = dor_Service.getAllDOR();
		model.addAttribute("gisuk1", list2);
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

	// 벌점등록 폼
	@RequestMapping(value = "/adm_penaltyInsert", method = RequestMethod.POST)
	public String adm_penaltyInsert(@ModelAttribute("PEN_VO") PEN_VO PEN_VO, Model model) throws Exception {
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
	String getAllPenalty(HttpSession session, Model model, HttpServletRequest request) {
		STU_VO stu_vo = (STU_VO) session.getAttribute("stu_VO");
		ArrayList<PEN_VO> list2 = pen_Service.getAllPenalty(stu_vo.getSTU_NUM());
		model.addAttribute("bul1", list2);
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

	// 정보변경
	@RequestMapping(value = "/changeinfo")
	public String changeinfo(HttpSession session, Model model, HttpServletRequest request) {
		STU_VO stu_vo = (STU_VO) session.getAttribute("stu_VO");
		int stu_num = stu_vo.getSTU_NUM();
		String before_pw = request.getParameter("before_pw");
		String after_pw = request.getParameter("after_pw");
		String after_address = request.getParameter("address");
		String after_number = request.getParameter("phonenumber");
		String after_email = request.getParameter("email");
		String after_bankname = request.getParameter("bankname");
		String after_bankacc = request.getParameter("bankacc");

		STU_VO stu_vo2 = stu_service.getAllinfo(stu_vo.getSTU_NUM(), stu_vo.getSTU_PW());

		// DB에 저장된 비밀번호와 현재비밀번호가 같을경우 동작(공통동작)
		if (before_pw.equals(stu_vo.getSTU_PW())) {
			// 변경할 비밀번호와 현재비밀번호가 같지 않을경우
			if (!after_pw.equals(before_pw)) {
				// 비밀번호와 정보를 바꾸는 메서드 동작
				stu_service.changedInfoPW(stu_num, after_pw, after_address, after_number, after_email, after_bankname,
						after_bankacc);
				stu_vo2 = stu_service.getAllinfo(stu_vo.getSTU_NUM(), after_pw);
				// 변경할 비밀번호가 비어있을 경우
			} else if (after_pw.equals("")) {
				// 정보만 바꾸는 메서드 동작
				stu_service.changedInfo(stu_num, after_address, after_number, after_email, after_bankname,
						after_bankacc);
				stu_vo2 = stu_service.getAllinfo(stu_vo.getSTU_NUM(), stu_vo.getSTU_PW());
				System.out.println(stu_vo2.getSTU_PW());
			}
			session.setAttribute("stu_VO", stu_vo2);
		}
		return "main/stu_main";
	}

	// 학생관리
	@RequestMapping(value = "/adm_studentCheck")
	public String adm_studentCheck(Model model) {
		return "admin/adm_studentCheck";
	}

	// 등록금 결제
	@RequestMapping(value = "/stu_tuitionPay")
	public String stu_tuitionPay() {
		return "stu/stu_tuitionPay";
	}

	// 학생 로그아웃(세선제거)
	@RequestMapping(value = "/stu_logout")
	public String stu_logout(HttpSession session) {
		session.removeAttribute("stu_VO");
		session.removeAttribute("scolist");
		return "login/stu_login";
	}

	// 교수 로그아웃(세선제거)
	@RequestMapping(value = "/prof_logout")
	public String prof_logout(HttpSession session) {
		session.removeAttribute("prof_VO");
		return "login/prof_login";
	}

	// 관리자 로그아웃(세선제거)
	@RequestMapping(value = "/adm_logout")
	public String adm_logout(HttpSession session) {
		session.removeAttribute("adm_VO");
		return "login/adm_login";
	}

	// 벌점등록
	@RequestMapping(value = "/insertPenalty")
	String insertPenalty(@ModelAttribute("PEN_VO") PEN_VO PEN_VO, Model model) {
		pen_Service.insertPenalty(PEN_VO);
		return "main/adm_main";
	}
}