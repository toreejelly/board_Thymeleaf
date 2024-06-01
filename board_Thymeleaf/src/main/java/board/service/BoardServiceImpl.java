package board.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.mapper.BoardMapper;
import board.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	
	@Autowired
	private BoardMapper mapper;
	
	//목록조회
	@Override
	public List<BoardVO> getList(){
		return mapper.getList();
	}
	
	
	//글쓰기
	@Override
	public void contentWrite(BoardVO boardVO) {
		mapper.contentWrite(boardVO);
		
	}
	
	//최신 글 번호
	@Override	
	public int boardId() {
		return mapper.boardId();
	}
	
	//글 조회
	@Override	
	public BoardVO getContent(int boardId) {
		return mapper.getContent(boardId);
	}
	
}//end
