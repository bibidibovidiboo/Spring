package com.sist.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//jsp 1개 + controller 1개 => 셋투셋투
@Controller
public class BoardController {
	@RequestMapping("board/list.do")
	public String board_list() {
		return "board/list"; // tiles.xml에서 definition */*로 리턴 ★
	}
}
