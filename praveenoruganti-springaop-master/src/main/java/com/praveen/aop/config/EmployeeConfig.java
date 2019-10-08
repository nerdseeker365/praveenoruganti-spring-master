package com.praveen.aop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.praveen.aop.service.EmployeeService;


@Configuration
@ComponentScan(basePackages = "com.praveen.aop")
public class EmployeeConfig {
	@Bean(name="employeeService")
	public EmployeeService getBean() {		
		return new EmployeeService();
	}
	
}