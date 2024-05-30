package board.service;

import java.util.List;

import board.vo.BoardVO;

public interface BoardService {
	
	//목록조회
	public List<BoardVO> getList();

}
