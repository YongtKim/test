package com.kh.sample.board.model.vo;

import java.sql.Date;

public class Board implements java.io.Serializable{
	private int board_num;
	private String board_title;
	private String board_writer;
	private String board_content;
	private Date board_date;
	private int board_readcount;
	private String original_filename;
	private String rename_filename;
	private int board_ref;
	private int board_lev;
	private int board_seq;
	private String board_delete_yn;
	public Board() {
		super();
	}
	public Board(int board_num, String board_title, String board_writer, String board_content, Date board_date,
			int board_readcount, String original_filename, String rename_filename, int board_ref, int board_lev,
			int board_seq, String board_delete_yn) {
		super();
		this.board_num = board_num;
		this.board_title = board_title;
		this.board_writer = board_writer;
		this.board_content = board_content;
		this.board_date = board_date;
		this.board_readcount = board_readcount;
		this.original_filename = original_filename;
		this.rename_filename = rename_filename;
		this.board_ref = board_ref;
		this.board_lev = board_lev;
		this.board_seq = board_seq;
		this.board_delete_yn = board_delete_yn;
	}
	public int getBoard_num() {
		return board_num;
	}
	public void setBoard_num(int board_num) {
		this.board_num = board_num;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getBoard_writer() {
		return board_writer;
	}
	public void setBoard_writer(String board_writer) {
		this.board_writer = board_writer;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public Date getBoard_date() {
		return board_date;
	}
	public void setBoard_date(Date board_date) {
		this.board_date = board_date;
	}
	public int getBoard_readcount() {
		return board_readcount;
	}
	public void setBoard_readcount(int board_readcount) {
		this.board_readcount = board_readcount;
	}
	public String getOriginal_filename() {
		return original_filename;
	}
	public void setOriginal_filename(String original_filename) {
		this.original_filename = original_filename;
	}
	public String getRename_filename() {
		return rename_filename;
	}
	public void setRename_filename(String rename_filename) {
		this.rename_filename = rename_filename;
	}
	public int getBoard_ref() {
		return board_ref;
	}
	public void setBoard_ref(int board_ref) {
		this.board_ref = board_ref;
	}
	public int getBoard_lev() {
		return board_lev;
	}
	public void setBoard_lev(int board_lev) {
		this.board_lev = board_lev;
	}
	public int getBoard_seq() {
		return board_seq;
	}
	public void setBoard_seq(int board_seq) {
		this.board_seq = board_seq;
	}
	
	public String getBoard_delete_yn() {
		return board_delete_yn;
	}
	public void setBoard_delete_yn(String board_delete_yn) {
		this.board_delete_yn = board_delete_yn;
	}
	@Override
	public String toString() {
		return "Board [board_num=" + board_num + ", board_title=" + board_title + ", board_writer=" + board_writer
				+ ", board_content=" + board_content + ", board_date=" + board_date + ", board_readcount="
				+ board_readcount + ", original_filename=" + original_filename + ", rename_filename=" + rename_filename
				+ ", board_ref=" + board_ref + ", board_lev=" + board_lev + ", board_seq=" + board_seq
				+ ", board_delete_yn=" + board_delete_yn + "]";
	}

}
