package com.sist.aop;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
   @RequestMapping("board/update.do")
   public String board_update()
   {
      JSONObject obj=new JSONObject();
      obj.put("name", "È«±æµ¿");
      obj.put("sex", "³²ÀÚ");
      return obj.toJSONString();
   }
}