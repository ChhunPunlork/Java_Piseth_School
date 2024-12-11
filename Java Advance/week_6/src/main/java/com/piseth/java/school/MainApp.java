package com.piseth.java.school;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		
		ClienceGreeting clience = context.getBean(ClienceGreeting.class);
		clience.Greet();
	}

}
