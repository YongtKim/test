package com.kh.sample.notice.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.sample.member.model.dao.MemberDao;
import com.kh.sample.member.model.vo.Member;
import com.kh.sample.notice.model.dao.NoticeDao;
import com.kh.sample.notice.model.vo.Notice;

@Service("noticeService")
public class NoticeServiceImpl implements NoticeService{
	
	@Autowired
	NoticeDao noticeDao;
	
	@Override
	public List<Notice> noticeList() {
		return noticeDao.noticeList();
	}
	
}
