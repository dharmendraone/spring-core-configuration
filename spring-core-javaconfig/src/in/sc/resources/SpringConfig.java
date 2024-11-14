package in.sc.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sc.beans.Student;

@Configuration
public class SpringConfig {

	@Bean
	public Student std1() {
		
		Student std = new Student();
		std.setName("Dharmendra Patel");
		std.setAge(24);
		std.setEmail("dharmendra@gmail.com");
		return std;
	}
	
	@Bean
	public Student std2() {
		
		Student std = new Student();
		std.setName("ankit Patel");
		std.setAge(23);
		std.setEmail("ankit@gmail.com");
		return std;
	}
}
