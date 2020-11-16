package com.sist.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//Model => JSP(HTML(태그형) + Java)
//JSP(HTML(태그형)) => VIEW
//JAVA => Model( VO / DAO / Manager)
//controller : 스프링 안에서 제작되어있음 => 동작 매뉴얼 제작 => xml
import java.util.*;
import com.sist.manager.*;
@Controller // model역할
public class MovieController {
	@Autowired
	private MovieManager mgr;
	@RequestMapping("movie/main.do")
	public String movie_main(int no, Model model) 
	
	{
		/*if(no==null)
			no="1"; 		//http://localhost/web/movie/main.do?no=1  ==> ?no=1 없어도 오류나지 않게  */
		
		
		List<MovieVO> list=mgr.jsonAllData(no);
		model.addAttribute("list",list);
		return "movie/main";
	}
}
