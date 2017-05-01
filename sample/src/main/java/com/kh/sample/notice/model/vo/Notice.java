package com.kh.sample.notice.model.vo;

import java.sql.Date;

public class Notice implements java.io.Serializable{

	private int notice_no;
	private String notice_title;
	private String notice_writer;
	private Date notice_date;
	private String notice_content;
	private int hit;
	public Notice() {
		super();
	}
	public Notice(int notice_no, String notice_title, String notice_writer, Date notice_date, String notice_content,
			int hit) {
		super();
		this.notice_no = notice_no;
		this.notice_title = notice_title;
		this.notice_writer = notice_writer;
		this.notice_date = notice_date;
		this.notice_content = notice_content;
		this.hit = hit;
	}
	public int getNotice_no() {
		return notice_no;
	}
	public void setNotice_no(int notice_no) {
		this.notice_no = notice_no;
	}
	public String getNotice_title() {
		return notice_title;
	}
	public void setNotice_title(String notice_title) {
		this.notice_title = notice_title;
	}
	public String getNotice_writer() {
		return notice_writer;
	}
	public void setNotice_writer(String notice_writer) {
		this.notice_writer = notice_writer;
	}
	public Date getNotice_date() {
		return notice_date;
	}
	public void setNotice_date(Date notice_date) {
		this.notice_date = notice_date;
	}
	public String getNotice_content() {
		return notice_content;
	}
	public void setNotice_content(String notice_content) {
		this.notice_content = notice_content;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	@Override
	public String toString() {
		return "Notice [notice_no=" + notice_no + ", notice_title=" + notice_title + ", notice_writer=" + notice_writer
				+ ", notice_date=" + notice_date + ", notice_content=" + notice_content + ", hit=" + hit + "]";
	}
	
}
