
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

	// 공지사항(전체)
	@RequestMapping(value = "/notice")
	public String notice(Model model) {
		return "common/notice";
	}

	// 세부공지사항
	@RequestMapping(value = "/n_contents")
	public String n_contents(Model model) {
		return "common/n_contents";
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
<<<<<<< HEAD
	
	// 교수출석관리
	@RequestMapping(value ="/prof_attendance")
	public String prof_attendance(Model model) {
	    return "professor/prof_attendance";
	}
			
=======

	// 학생관리(상태 변경)
	@RequestMapping(value = "/std_infoUpdate")
	public String std_infoUpdate(Model model) {
		return "student/std_infoUpdate";
	}
>>>>>>> 490f2104323972bbd2d17bd9c92262ee9d199b26
}