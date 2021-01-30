package com.spring.boardPrac01.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.boardPrac01.dao.BoardDAO;
import com.spring.boardPrac01.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;
	
	@Override
	public List<BoardDTO> listAll() throws Exception {
		return dao.getAllBoard();
	}

}
