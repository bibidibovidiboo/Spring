package com.sist.di;

import org.mybatis.spring.support.SqlSessionDaoSupport;

/*
 * 1.XML �̿�
 * 2.Annotation �̿�
 * 3.XML+Annotation �̿�***
 * 4.���� �ڹ� => ������5���� �ַ� ���
 */
import java.util.*;
public class MusicDAO extends SqlSessionDaoSupport{
	public List<MusicVO> musicAllData(){
		
		return getSqlSession().selectList("musicAllData");
	}
}
