package board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import board.service.BoardServiceImpl;
import board.vo.BoardVO;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
public class BoardController {
	
	@Autowired
	private BoardServiceImpl boardService;
	
	//목록조회
	@GetMapping("/list")
	public String list(Model model) {
		log.info("BoardController list()");
		
		model.addAttribute("list", boardService.getList());
		
		return "list";
		
	}
	
	 
	 //글쓰기 페이지
	@GetMapping("/contentWriteForm")
	public String contentWriteForm() {
		log.info("BoardController contentWriteForm()");
		
		return "contentWriteForm";
	}

	
	//글 작성
	@PostMapping("/contentWrite")
	public ResponseEntity<String> contentWrite(@RequestBody BoardVO boardVO){
		
		
		ResponseEntity<String> entity = null;
		
		try {
			//글쓰기
			boardService.contentWrite(boardVO);
			//최신 글 번호
			int boardId = boardService.boardId();
			String strboardId = Integer.toString(boardId);
			log.info("boardId :" + boardId);//strboardId물어보면 안되나?
			
			
			
		}catch(Exception e) {
			
		}
		
		return entity;
	}
	
	

	

}
