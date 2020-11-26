package com.sist.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

import javax.servlet.http.HttpSession;

import com.sist.dao.*;
import com.sist.naver.NaverManager;
@Controller
@RequestMapping("food/")
// 6FQw_o8z3yxlzPREeUJr
// wsJ4F6HtPN
public class FoodController {
   @Autowired
   private FoodDAO fdao;
   @Autowired
   private ReplyDAO rdao;
   @Autowired
   private NaverManager nm;
   @Autowired
   private RManager rm;
   @RequestMapping("list.do")
   public String food_list(Model model)
   {
	   List<FoodCategoryVO> list=fdao.foodCategoryAllData();
	   model.addAttribute("list", list);
	   return "food/list";
   }
   @RequestMapping("food_category.do")
   public String food_category(int no,Model model)
   {
	   List<FoodVO> list=fdao.foodCategoryFoodListData(no);
	   for(FoodVO vo:list)
	   {
		   String s=vo.getPoster();
		   s=s.substring(0,s.indexOf("^"));
		   vo.setPosterOne(s);
		   
		   String ss=vo.getAddr();
		   StringTokenizer st=new StringTokenizer(ss,"지");
		   vo.setAddr1(st.nextToken());
		   String sss=st.nextToken();
		   sss=sss.substring(2);
		   vo.setAddr2(sss);
	   }
	   FoodCategoryVO vo=fdao.foodCategoryInfoData(no);
	   model.addAttribute("list", list);
	   model.addAttribute("vo", vo);
	   return "food/category";
   }
   @RequestMapping("food_detail.do")
   public String food_detail(int no,String page,Model model)
   {
	   FoodVO vo=fdao.foodDetailData(no);
	   String s=vo.getAddr();
	   StringTokenizer st=new StringTokenizer(s,"지");
	   vo.setAddr1(st.nextToken());
	   vo.setAddr2("지"+st.nextToken());
	   
	   String type=vo.getType();
	   st=new StringTokenizer(type,"/");
	   String result="";
	   while(st.hasMoreTokens())
	   {
		   result+=st.nextToken().trim()+"|";
	   }
	   result=result.substring(0,result.lastIndexOf("|"));
	   List<RecipeVO> list=fdao.foodLikeRecipeData(result);
	   if(page==null)
		   page="1";
	   int curpage=Integer.parseInt(page);
	   List<ReplyVO> rList=rdao.replyListData(no, curpage);
	   nm.naverData(vo.getTitle());
	   //rm.graph(no);
	   model.addAttribute("vo", vo);
	   model.addAttribute("list", list);
	   model.addAttribute("rList", rList);
	   return "food/food_detail";
   }
   @RequestMapping("reply_insert.do")
   public String reply_insert(int cno,String msg,HttpSession session)
   {
	   String id=(String)session.getAttribute("id");
	   String name=(String)session.getAttribute("name");
	   ReplyVO vo=new ReplyVO();
	   vo.setCno(cno);
	   vo.setMsg(msg);
	   vo.setId(id);
	   vo.setName(name);
	   rdao.replyInsert(vo);
	   return "redirect:../food/food_detail.do?no="+cno;
   }
   @RequestMapping("reply_delete.do")
   public String reply_delete(int no,int cno)
   {
	   rdao.reply_delete(no);
	   return "redirect:../food/food_detail.do?no="+cno;
   }
   @RequestMapping("reply_update.do")
   public String reply_update(int no,int cno,String msg)
   {
	   rdao.reply_update(no, msg);
	   return "redirect:../food/food_detail.do?no="+cno;
   }
}





