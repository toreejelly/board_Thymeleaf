package board.service;

import java.util.List;


import board.vo.BoardVO;

public interface BoardService {
	
	//목록조회
	public List<BoardVO> getList();
	
	//글쓰기
	public void contentWrite(BoardVO boardVO);
	
	//최신 글 번호
	public int boardId();
}
