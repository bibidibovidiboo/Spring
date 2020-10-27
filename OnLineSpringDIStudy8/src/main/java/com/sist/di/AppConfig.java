package com.sist.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/*
 * 메모리 할당
 * @Component : 일반 클래스,vo,mainclass
 * @Repository : DAO
 * @Controller : Model
 * @Service : Manager,DAO+DAO
 * @RestController : 파일 전송 없이 일반 문자열 전송(Ajax,React..) 
 * 주입(Inject) : 메모리에 저자오딘 객체 주소를 가지고 올 때 사용, 일반 변수 사용 불가
 * =@Autowired : 스프링에서 저장된 클래스 중에 맞는 주소를 찾아서 자동 주입
 * ============
 * =@Resource
 * =@Qualifier
 * =@Inject
 * 
 * 스프링 면접
 * 1.DI,Container 개념
 * 2.AOP vs OOP
 * 3.DAO vs Service
 */

@Configuration
@ComponentScan(basePackages = {"com.sist.di"})
public class AppConfig {

}
