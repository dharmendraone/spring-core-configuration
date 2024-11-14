package in.sct.java;

import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.sct.beans.Student;

public class Main {

	public static void main(String[] args) {

		System.out.println("java project run successfully.....");
		
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("resources/applicationContext.xml");

		System.out.println("Beans object created successfully...");
		System.out.println("===================================================");

		Student obj = (Student) context.getBean("std1");
		obj.display();
		System.out.println("===================================================");

		Student obj2 = (Student) context.getBean("std2");
		obj2.display();

		System.out.println("===================================================");
			context.close();
		System.out.println("beans close successfuly...");


	}

}
