package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Student {

	@Value("Dharmendra Patel")
	private String name;
	@Value("24")
	private int age;
	@Value("dharmendra@gmail.com")
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display() {
		System.out.println("Full name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Email: "+email);
	}
}
