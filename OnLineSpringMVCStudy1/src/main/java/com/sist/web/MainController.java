package com.sist.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//MVC => Model클래스 설정 : 요청처리 => 결과값 전송 (B) 
/*
 *   Model 
 *     = ~VO
 *     = ~DAO
 *     = ~Manager
 *     = ~Controller
 *    ====================> Servlet = Model + View
 *    View 
 *    = CSS
 *    = JS
 *    = JSP
 *    = HTML
 *  
 *  
 *  1. 프로그램 => 상태관리 (데이터 관리) : 변수(변수,클래스)
 *       
 */
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MainController {
   //ID , Password
   //1.입력하는 JSP
   @RequestMapping("main/output.do")
   //매개변수는 DispatcherServlet이 설정해준다.
   public String main_input(HttpServletRequest request)
   {
      //스프링 2.5이하 => request
      //스프링 2.5이상 => 권장 => request 사용하지 않음
      //보안 (request안에는 접속자의 ip를 확인 가능)
      //데이터 처리 => 전송(JSP)
      String id=request.getParameter("id");
      String pwd=request.getParameter("pwd");
      
      request.setAttribute("id", id);
      request.setAttribute("pwd", pwd);
      return "main/output";
      /*
       *  return "" => forward
       *  return "폴더명/JSP명"
       *        "main/main" ==> .jsp를 생략한다
       *  return "" => sendRedirect
       *           "redirect:main.do"
       */
   }
   
   @RequestMapping("main/input.do")
   public String main_input()
   {
      return "main/input";
   }
   
   @RequestMapping("main/output2.do")
   // 세션 생성 이런건 전부 매개변수로 받아서 처리한다 
   public String main_output2(String id,String pwd,Model model,HttpSession session)
   {
	   // Model => 인터페이스 (해당 JSP로 데이터 전송 역할)
       // 전송 
	   model.addAttribute("id",id);
	   model.addAttribute("pwd",pwd); // 이게 request.setAttribute이다 ★

	   // Spring => 요청값 받는 경우 => 매게변수로 받는다 , 전송 시에는 Model을 받는다
	   
	   return "main/output2";
   }
}






