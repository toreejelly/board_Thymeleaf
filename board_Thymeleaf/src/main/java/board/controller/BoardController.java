package board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import board.service.BoardServiceImpl;


@Controller
public class BoardController {
	
	@Autowired
	private BoardServiceImpl boardService;
	
	//목록조회
	@GetMapping("/list")
	public String list(Model model) {
		
		model.addAttribute("list", boardService.getList());
		
		return "list";
		
	}
	
	
	


	

}
