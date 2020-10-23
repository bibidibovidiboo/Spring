package com.sist.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app=new ClassPathXmlApplicationContext("app.xml");
		MusicDAO dao=(MusicDAO)app.getBean("dao");
		List<MusicVO> list=dao.musicAllData();
		for(MusicVO vo:list) {
			System.out.println(vo.getTitle()+" "+vo.getAlbum()+" "+vo.getSinger());
		}
	}

}
