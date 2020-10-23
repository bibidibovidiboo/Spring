package com.sist.di3;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MainClass {
	//@Autowired
	//@Qualifier("oracle")
	@Resource(name="mySql") //@Autowired + @Qualifier => @Resource
	private MyDAO dao;
	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("app3.xml");
		
		MainClass mc=(MainClass)app.getBean("mainClass");
		mc.dao.getConnection();
		mc.dao.disConnection();
		
		String s="Hello";
		StringBuffer sb=new StringBuffer();
		
		if(s instanceof Object) {
			System.out.println("����");
		}
		
		
		/*
		 * @Autowired : �������� ������ ����� Ŭ���� ��ü�� ����
		 * 				����� Ŭ������ �ּҰ��� �������� �ڵ����� ����(����)
		 */
	}
}
