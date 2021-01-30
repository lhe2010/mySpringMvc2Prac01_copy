package com.spring.boardPrac01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.boardPrac01.dto.BoardDTO;
import com.spring.boardPrac01.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;

	@RequestMapping(value="/")
	public String firstpage() {
		return "home";
	}

	@RequestMapping(value="/main", method=RequestMethod.GET)
	public String main() {
		return "boardPrac01/main";
	}
	
	@RequestMapping(value="/boardList")
	public String boardList(Model model) throws Exception {
		
		List<BoardDTO> boardList = boardService.listAll();
		model.addAttribute("boardList", boardList);
		
		return "boardPrac01/bList";
	}
}
