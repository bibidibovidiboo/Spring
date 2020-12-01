package com.sist.web;

import java.nio.charset.Charset;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class ReactController {
	   @RequestMapping("react/json.do")
	   public String react_json() throws Exception
	   {
		   JSONArray arr=new JSONArray();
		   JSONObject obj=new JSONObject();
		   obj.put("name", "홍길동");
		   obj.put("sex", "남자");
		   arr.add(obj);
		   obj=new JSONObject();
		   obj.put("name", "이순신");
		   obj.put("sex", "남자");
		   arr.add(obj);
		   obj=new JSONObject();
		   obj.put("name", "심청이");
		   obj.put("sex", "여자");
		   arr.add(obj);
		   obj=new JSONObject();
		   obj.put("name", "춘향이");
		   obj.put("sex", "여자");
		   arr.add(obj);
		   obj=new JSONObject();
		   obj.put("name", "박문수");
		   obj.put("sex", "남자");
		   arr.add(obj);
		   //byte[] euckrStringBuffer  = arr.toJSONString().getBytes(Charset.forName("UTF-8"));
		
		   //String decodedHelloString = new String(euckrStringBuffer, "UTF-8");
		
		   return arr.toJSONString();
	   }
}
