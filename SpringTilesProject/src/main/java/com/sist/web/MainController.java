package com.sist.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("main/main.do")
	public String main_main() {
		return "main";
		
		/*
		 return 값을 받는 곳 => application-context.xml
		 <bean id="tilesResolver" 
			class="org.springframework.web.servlet.view.UrlBasedViewResolver"
			p:requestContextAttribute="requestContext"
			p:viewClass="org.springframework.web.servlet.view.tiles3.TilesView"
		/>
		 */
	}
	// 게시판 클릭 후 화면
	@RequestMapping("board/list.do")
	public String board_list() {
		return "board/list";
	}
	
	// 공지사항 클릭 후 화면 
	@RequestMapping("notice/list.do")
	public String notice_list() {
		return "notice/list";
	}
}
