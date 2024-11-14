package in.sc.java;

import in.sc.beans.Student;
import in.sc.resources.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
//		Student student = context.getBean(Student.class);
//		student.display();
		
		Student obj1 = (Student) context.getBean("std1");
		obj1.display();
		
		System.out.println("==============================");
		Student obj2 = (Student) context.getBean("std2");
		obj2.display();
	}

}
