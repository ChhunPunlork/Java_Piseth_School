package Lork.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAppliction {
	public static void main(String[] arqs) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		GreetingClience clience = context.getBean(GreetingClience.class);
		clience.greet();
	}
}
