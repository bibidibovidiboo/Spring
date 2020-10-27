package com.sist.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/*
 * �޸� �Ҵ�
 * @Component : �Ϲ� Ŭ����,vo,mainclass
 * @Repository : DAO
 * @Controller : Model
 * @Service : Manager,DAO+DAO
 * @RestController : ���� ���� ���� �Ϲ� ���ڿ� ����(Ajax,React..) 
 * ����(Inject) : �޸𸮿� ���ڿ��� ��ü �ּҸ� ������ �� �� ���, �Ϲ� ���� ��� �Ұ�
 * =@Autowired : ���������� ����� Ŭ���� �߿� �´� �ּҸ� ã�Ƽ� �ڵ� ����
 * ============
 * =@Resource
 * =@Qualifier
 * =@Inject
 * 
 * ������ ����
 * 1.DI,Container ����
 * 2.AOP vs OOP
 * 3.DAO vs Service
 */

@Configuration
@ComponentScan(basePackages = {"com.sist.di"})
public class AppConfig {

}
