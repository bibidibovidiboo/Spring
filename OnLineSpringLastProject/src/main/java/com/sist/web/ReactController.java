package com.sist.web;

import java.nio.charset.Charset;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.sist.dao.*;
@RestController
@CrossOrigin("http://localhost:3000") // 이거 없으면 리액트에서 접근 못함 
public class ReactController {
	 @Autowired
	 private RecipeDAO dao;
	 // produces ~ 리액트에서 한글 깨질 때 쓰는코드 ★
	 @RequestMapping(value="react_chef/chef_list.do",produces="text/plain;charset=UTF-8")
	 public String chef_list(String page) {
		 if(page==null)
			 page="1";
		 int curpage=Integer.parseInt(page);
		 List<ChefVO> list=dao.chefListData(curpage);
		 String json="";
		 try {
			 JSONArray arr=new JSONArray();
			 for(ChefVO vo:list) {
				 JSONObject obj=new JSONObject();
				 obj.put("poster", vo.getPoster());
				 obj.put("chef", vo.getChef());
				 obj.put("mc1", vo.getMc1());
				 obj.put("mc3", vo.getMc3());
				 obj.put("mc7", vo.getMc7());
				 obj.put("mc2", vo.getMc2());
				 
				 arr.add(obj);
			 }
			 
			 json=arr.toJSONString();
		 }catch(Exception ex) {}
		 return json;
	 }
	 @RequestMapping("react_chef/totalpage.do")
	 public String chef_total() {
		 int total=0;
		 try {
			 total=dao.chefTotalPage();
		 }catch(Exception ex) {}
		 return String.valueOf(total);
	 }
	 @RequestMapping(value="react_chef/chef_detail.do",produces="text/plain;charset=UTF-8")
	 public String chef_detail(String chef,String page) {
		 String result="";
		 if(page==null)
			 page="1";
		 int curpage=Integer.parseInt(page);
		 List<RecipeVO> list = dao.chefProductData(chef, curpage);
		 // JSON 파싱
		 try {
			 JSONArray arr=new JSONArray();
			 for(RecipeVO vo:list) {
				 JSONObject obj=new JSONObject();
				 obj.put("poster", vo.getPoster());
				 obj.put("title", vo.getTitle());
				 obj.put("chef", vo.getChef());
				 arr.add(obj);
			 }
			 result=arr.toJSONString();
		 }catch(Exception ex) {}
		 return result;
	 }
	 
	 @RequestMapping(value="react_chef/chef_find.do",produces="text/plain;charset=UTF-8")
	 public String chef_find(String chef,String fd) {
		 List<RecipeVO> list = dao.chefProductFindData(chef, fd);
		 String json="";
		 try {
			 JSONArray arr=new JSONArray();
			 for(RecipeVO vo:list) {
				 JSONObject obj=new JSONObject();
				 obj.put("poster", vo.getPoster());
				 obj.put("title", vo.getTitle());
				 obj.put("chef", vo.getChef());
				 arr.add(obj);
			 }
			 json=arr.toJSONString();
		 }catch(Exception ex) {}
		 return json;
			 
	 }
}





