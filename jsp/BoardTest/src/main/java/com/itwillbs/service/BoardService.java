package com.itwillbs.service;

import java.util.List;

import com.itwillbs.domain.BoardVO;

public interface BoardService {

	// 글쓰기
	public void regist(BoardVO vo) throws Exception;
	
	// 글 전체 목록을 가져오는 동작
	public List<BoardVO> listALL() throws Exception;
	
	// 글 하나의 정보를 가져오는 동작
	public BoardVO read(int bno) throws Exception;
	
	// 글 정보 수정하는 동작
	public void modify(BoardVO vo) throws Exception;

	// 글 정보 삭제하는 동작
	public void remove(Integer bno) throws Exception;
	
}
