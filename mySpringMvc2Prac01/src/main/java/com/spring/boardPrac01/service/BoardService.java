package com.spring.boardPrac01.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boardPrac01.dto.BoardDTO;

public interface BoardService {
	public List<BoardDTO> listAll() throws Exception;
}
