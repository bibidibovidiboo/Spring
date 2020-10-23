package com.sist.di;

import org.mybatis.spring.support.SqlSessionDaoSupport;

/*
 * 1.XML 이용
 * 2.Annotation 이용
 * 3.XML+Annotation 이용***
 * 4.순수 자바 => 스프링5에서 주로 사용
 */
import java.util.*;
public class MusicDAO extends SqlSessionDaoSupport{
	public List<MusicVO> musicAllData(){
		
		return getSqlSession().selectList("musicAllData");
	}
}
