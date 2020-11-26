package com.sist.news;

import java.util.*;

import javax.xml.bind.JAXBContext;

import org.springframework.stereotype.Component;
import java.net.*;
@Component
public class NewsManager {
	public List<Item> newsAllData(String fd){
		List<Item> list=new ArrayList<Item>();
		try {
			String strUrl="http://newssearch.naver.com/search.naver?where=rss&query="
		               +URLEncoder.encode(fd, "UTF-8");
			URL url=new URL(strUrl);
			JAXBContext jb=JAXBContext.newInstance(Rss.class);
		}catch(Exception ex){}
		return list;
	}
}
