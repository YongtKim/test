package com.kh.sample.notice.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.sample.member.model.vo.Member;
import com.kh.sample.notice.model.vo.Notice;

@Repository("noticeDao")
public class NoticeDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public NoticeDao(){	}

	public List<Notice> noticeList() {
		return sqlSession.selectList("noticemapper.nlist");
	}
}
