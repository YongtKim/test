package com.kh.sample.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kh.sample.board.model.vo.Board;

@Controller
public class BoardController {

	
	@RequestMapping(value = "board.do", method = RequestMethod.GET)
	public String board(Model model) {
				
		model.addAttribute("String", "board" );
		
		return "board/board";
	}
	@RequestMapping(value = "boardselect.do", method = RequestMethod.GET)
	public String boardselect(Model model, Board board) {

		board.setBoard_title("aa");
		board.setBoard_content("aaaaaaa");

		model.addAttribute("String", "boardselect" );
		model.addAttribute("Board", board );
		
		return "board/board";
	}
}
