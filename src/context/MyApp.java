package context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import food.Chef;

public class MyApp {

	public static void main(String[] args) {
		//개발의 유지보수성을 높이기 위해 필요한 객체는 DI로 
		//주입을 시키려면, 어떤 누군가의 도움이 필요하다!!
		//그 역할을 스프링이 지원하면, 객체를 메모리에 올리고 
		//특정 객체가 필요로 하는 객체를 주입도 해주는 역할을 하는 
		//스프링의 객체를 가리켜 ApplicationContext 라 한다!!
		String configLocation="context/config.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(configLocation);
		
		//ApplicationContext는 메모리에 올라간 모든 객체정보를 가지고 있고, 
		//이러한 역할을 하는 객체를 가리켜 컨테이너라 한다!!
		Chef chef=(Chef)context.getBean("chef");
		chef.cook();

	}

}





