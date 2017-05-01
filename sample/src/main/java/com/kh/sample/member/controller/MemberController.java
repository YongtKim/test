package com.kh.sample.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.kh.sample.member.model.service.MemberService;
import com.kh.sample.member.model.vo.Member;

@Controller
//@RequestMapping("member")
/*@SessionAttributes("loginUser")*/
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("login.do")
	public ModelAndView loginCheck(Member member, ModelAndView mv, HttpSession session){
		Member loginUser = memberService.loginCheck(member);
		if(loginUser != null)
			session.setAttribute("loginUser", loginUser);
//		mv.addObject("loginUser", loginUser);
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping("logout.do")
	public ModelAndView logOut(ModelAndView mv, HttpSession session){
		session.invalidate();
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping("minsert.do")
	public ModelAndView memberInsert(){
		return null;
	}
	@RequestMapping("mupdate.do")
	public ModelAndView memberUpdate(){
		return null;
	}
	@RequestMapping("mdelete.do")
	public String memberDelete(){
		return null;
	}
	@RequestMapping("mlist.do")
	public ModelAndView memberList(){
		return null;
	}
	@RequestMapping("midSearch.do")
	public ModelAndView memberIdSearch(){
		return null;
	}
	
	
	
}
