package com.sist.di3;

import org.springframework.stereotype.Repository;

@Repository
public class Oracle implements MyDAO{

	@Override
	public void getConnection() {
		// TODO Auto-generated method stub
		System.out.println("����Ŭ ����");
	}

	@Override
	public void disConnection() {
		// TODO Auto-generated method stub
		System.out.println("����Ŭ ����");
	}
	
}
