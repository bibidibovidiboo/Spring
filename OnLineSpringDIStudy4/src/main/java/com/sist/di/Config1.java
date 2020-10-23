package com.sist.di;

// spring 5���� p.90
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config1 {
	@Bean("sawon")
	public Sawon sawonInfo() {
		Sawon s = new Sawon(); // ��ü ����
		/*
		 * <bean id="sa" class="com.sist.di.Sawon" 
		 * 	p:name="ȫ�浿" 
		 * 	p:dept="������"
		 * 	p:job="�븮" />
		 */
		// DI
		s.setName("�̼���");
		s.setDept("���ߺ�");
		s.setJob("����");
		return s;
	}
}
