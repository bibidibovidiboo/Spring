package com.sist.di2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MainClass {
	@Autowired //autowired�� �������� ��� �Ұ���
	private Sawon sa;//null
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app=new ClassPathXmlApplicationContext("app2.xml");
		MainClass mc=(MainClass)app.getBean("mainclass");
		System.out.println("�̸�:"+mc.sa.getSaram().getName());
		System.out.println("����:"+mc.sa.getSaram().getSex());
		System.out.println("����:"+mc.sa.getSaram().getAge());
		System.out.println("�μ�"+mc.sa.getDept());
		System.out.println("����:"+mc.sa.getJob());
	}

}
