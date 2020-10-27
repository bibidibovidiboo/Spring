package com.sist.aop;

import org.springframework.stereotype.Repository;

@Repository
public class MyDAO {
	public void boardAllData() {
		System.out.println("boardAllData() Call...");
	}
}
