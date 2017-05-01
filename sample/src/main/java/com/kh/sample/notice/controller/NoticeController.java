package com.kh.sample.notice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kh.sample.member.model.service.MemberService;
import com.kh.sample.member.model.vo.Member;
import com.kh.sample.notice.model.service.NoticeService;
import com.kh.sample.notice.model.vo.Notice;

@Controller
//@RequestMapping("notice")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("nlist.do")
	public ModelAndView notice(ModelAndView mv) {
		List<Notice> nlist = (List<Notice>) noticeService.noticeList();
		mv.addObject("nlist", nlist);
		mv.setViewName("noticeListView");
		return mv;
	}
	@RequestMapping("nselect.do")
	public ModelAndView noticeSelect(){
		return null;
	}
	@RequestMapping("ninsert.do")
	public ModelAndView noticeInsert(){
		return null;
	}
	@RequestMapping("nupdate.do")
	public ModelAndView noticeUpdate(){
		return null;
	}
	@RequestMapping("ndelete.do")
	public String noticeDelete(){
		return null;
	}
	@RequestMapping("nlist.do")
	public ModelAndView noticeList(){
		return null;
	}
}
