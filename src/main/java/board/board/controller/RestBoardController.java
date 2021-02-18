package board.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RestBoardController {

	@Autowired
	private BoardService boardService;
}
