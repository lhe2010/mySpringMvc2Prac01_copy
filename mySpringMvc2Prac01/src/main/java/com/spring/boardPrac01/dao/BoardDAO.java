package com.spring.boardPrac01.dao;

import java.util.List;

import com.spring.boardPrac01.dto.BoardDTO;

public interface BoardDAO {
	public List<BoardDTO> getAllBoard() throws Exception;

}
