package com.sist.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main/") // 공통으로 붙는 부분을 여기에 처리하고 나머지를 밑에서 처리함
public class MainController {
	/*@RequestMapping("main/emp.do")
	public String main_emp() {
		return "main/emp"; // 입력 폼
	}
	
	@RequestMapping("main/emp_ok.do")
	// 전송을 해야해서 model을 넣음
	public String main_emp_ok(EmpVO vo,Model model) {
		model.addAttribute("vo", vo);
		return "main/emp_ok"; // request를 전송 => forward
	}*/
	
	/*  RequestMapping 둘다 받아서 모두 처리하면 너무 느리기 때문에
		get / post mapping으로 나누어서 사용하는 것이 효율적 
		=> but 실무는 주로 버전이 낮아서 RequestMapping을 사용한다
	*/
	@GetMapping("emp.do")
	public String main_emp() {
		return "emp"; // 입력폼 => 이부분 main을 제외하려면 dispatcher에서 p:prefix="/main/" 이 처리를 해줘야함 ★
	}
	@PostMapping("emp_ok.do")
	public String main_emp_ok(EmpVO vo,Model model) {
		model.addAttribute("vo",vo);
		return "emp_ok"; // request를 전송 => forward
	}
	
}
