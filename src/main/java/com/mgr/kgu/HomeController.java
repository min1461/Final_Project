
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

	@RequestMapping(value = "/login_std")
	public String login_std(Model model) {
		return "login_std";
	}

	@RequestMapping(value = "/login_prof")
	public String login_prof(Model model) {
		return "login_prof";
	}

	@RequestMapping(value = "/login_admin")
	public String login_admin(Model model) {
		return "login_admin";
	}

	@RequestMapping(value = "/main_std")
	public String main_std(Model model,HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("HAKBUN"));
		String pw = request.getParameter("HAK_PW");
		std_VO sv = new std_VO(id, pw);
		model.addAttribute("std_VO", sv);
		return "main_std";
	}

	@RequestMapping(value = "/main_prof")
	public String main_prof(Model model, int id, String pw) {
		prof_VO pv = new prof_VO(id, pw);
		model.addAttribute("prof_VO", pw);
		return "main_prof";
	}

	@RequestMapping(value = "/main_admin")
	public String main_admin(Model model, int id, String pw) {
		admin_VO av = new admin_VO(id, pw);
		model.addAttribute("admin_VO", av);
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

	@RequestMapping(value = "/n_contents")
	public String n_contents(Model model) {
		return "n_contents";
	}
	
	@RequestMapping(value ="/scoreinsert")
	public String scoreinsert(Model model) {
		return "scoreinsert";
	}

}
