package board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import board.vo.BoardVO;

@Mapper
public  interface BoardMapper {

	//목록조회
	public List<BoardVO> getList();
	
	//글쓰기
	public void contentWrite(BoardVO boardVO);
	
	//최신 글 번호
	public int boardId();

}
