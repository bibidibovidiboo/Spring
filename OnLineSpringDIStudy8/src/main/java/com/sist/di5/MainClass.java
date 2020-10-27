package com.sist.di5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	/*
	 *  GenericXmlApplicationContext => XML 파싱 기능 O / close()가 있음 
	 *  GenericApplicationContext => XML 파싱기능이 없다  (어노테이션 용도) / close()가 없음 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext app=new GenericXmlApplicationContext("app.xml");
//		ApplicationContext app=new ClassPathXmlApplicationContext("app.xml");
		
		// 싱글턴 
		Sawon sa1=(Sawon)app.getBean("sa");
		Sawon sa2=(Sawon)app.getBean("sa");
		System.out.println("sa1:"+sa1);
		System.out.println("sa2:"+sa2);
		sa1.print();
		app.close();
	}

}
