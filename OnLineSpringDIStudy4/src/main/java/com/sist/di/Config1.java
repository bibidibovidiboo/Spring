package com.sist.di;

// spring 5버전 p.90
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config1 {
	@Bean("sawon")
	public Sawon sawonInfo() {
		Sawon s = new Sawon(); // 객체 생성
		/*
		 * <bean id="sa" class="com.sist.di.Sawon" 
		 * 	p:name="홍길동" 
		 * 	p:dept="영업부"
		 * 	p:job="대리" />
		 */
		// DI
		s.setName("이순신");
		s.setDept("개발부");
		s.setJob("과장");
		return s;
	}
}
