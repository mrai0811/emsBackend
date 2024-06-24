package com.rai.springboot_backend;

import com.rai.springboot_backend.model.Employee;
import com.rai.springboot_backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

//	@Autowired
//	private EmployeeRepository employeeRepository;
//
//	@Override
//	public void run(String ... args) throws  Exception{
////		Employee employee = new Employee();
////		employee.setFirstName("Mausam");
////		employee.setLastName("Rai");
////		employee.setEmailId("mausam@rai.com");
////		employeeRepository.save(employee);
////
////		Employee employee1 = new Employee();
////		employee1.setFirstName("Sumi");
////		employee1.setLastName("Rai");
////		employee1.setEmailId("sumi@rai.com");
////		employeeRepository.save(employee1);
//	}

}
