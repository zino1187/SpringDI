package context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import food.Chef;

public class MyApp {

	public static void main(String[] args) {
		//������ ������������ ���̱� ���� �ʿ��� ��ü�� DI�� 
		//������ ��Ű����, � �������� ������ �ʿ��ϴ�!!
		//�� ������ �������� �����ϸ�, ��ü�� �޸𸮿� �ø��� 
		//Ư�� ��ü�� �ʿ�� �ϴ� ��ü�� ���Ե� ���ִ� ������ �ϴ� 
		//�������� ��ü�� ������ ApplicationContext �� �Ѵ�!!
		String configLocation="context/config.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(configLocation);
		
		//ApplicationContext�� �޸𸮿� �ö� ��� ��ü������ ������ �ְ�, 
		//�̷��� ������ �ϴ� ��ü�� ������ �����̳ʶ� �Ѵ�!!
		Chef chef=(Chef)context.getBean("chef");
		chef.cook();

	}

}





