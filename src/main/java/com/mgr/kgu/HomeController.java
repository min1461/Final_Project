package com.mgr.kgu;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

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

	@RequestMapping(value = "/login_std")
	public String login_std(Model model) {
//		return "login_std";
		return "main_std";
	}
	
	@RequestMapping(value = "/login_prof")
	public String login_prof(Model model) {
//		return "login_prof";
		return "main_prof";
	}
	
	@RequestMapping(value = "/login_admin")
	public String login_admin(Model model) {
//		return "login_admin";
		return "main_admin";
	}

	@RequestMapping(value = "/main_std")
	public String main_std(Model model, std_VO std_VO) {
		// 로그인아이디,비밀번호를 parameter로 받아서 std_VO 생성
		model.addAttribute("std_VO", std_VO);
		return "main_std";
	}

	@RequestMapping(value = "/main_prof")
	public String main_prof(Model model, prof_VO prof_VO) {
		model.addAttribute("prof_VO", prof_VO);
		return "main_prof";
	}

	@RequestMapping(value = "/main_admin")
	public String main_admin(Model model, admin_VO admin_VO) {
		model.addAttribute("admin_VO", admin_VO);
		return "main_admin";
	}
	
	@RequestMapping(value = "/notice")
	public String notice(Model model) {
		return "notice";
	}
	
	@RequestMapping(value = "/grades_chk")
	public String grades_chk(Model model) {
		return "grades_chk";
	}
	
	@RequestMapping(value = "/just_main")
	public String just_main(Model model) {
		return "just_main";
	}

}
