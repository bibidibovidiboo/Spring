package com.sist.di3;

import org.springframework.stereotype.Repository;

@Repository
public class MySql implements MyDAO{

	@Override
	public void getConnection() {
		// TODO Auto-generated method stub
		System.out.println("MySql에 연결");
	}

	@Override
	public void disConnection() {
		// TODO Auto-generated method stub
		System.out.println("MySql에 연결 해제");
	}
	
}
