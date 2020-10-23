package com.sist.di4;
import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MainClass {

	public static void main(String[] args) {
		try {
			List<String> list=new ArrayList<String>();
			list.add("com.sist.di4.A");
			list.add("com.sist.di4.B");
			list.add("com.sist.di4.C");
			list.add("com.sist.di4.D");
			
			for(String s:list) {
				Class clsName=Class.forName(s);
				if(clsName.isAnnotationPresent(Component.class)==false)
					continue;
				Object obj=clsName.newInstance();
				System.out.println(obj);
				
			}
		}catch(Exception ex) {}
	}
}
