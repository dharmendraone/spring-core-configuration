package in.sp.java;

import in.sp.beans.Student;
import in.sp.resources.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Student student = context.getBean(Student.class);
		student.display();
		
		

	}

}
