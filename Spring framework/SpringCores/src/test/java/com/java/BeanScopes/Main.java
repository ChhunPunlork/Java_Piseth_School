package com.java.BeanScopes;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
	@Autowired
	private SingletonBean singletonBean1;

	@Autowired
	private SingletonBean singletonBean2;

	@Autowired
	private ProtoTypeBean protoTypeBean1;

	@Autowired
	private ProtoTypeBean protoTypeBean2;

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@PostConstruct
	public void testBeanScopes() {
		System.out.println("Test Singleton and Prototype");

		System.out.println("Are singletonBean1 and singletonBean2 same?" + (singletonBean1 == singletonBean2));

		System.out.println("Are prototypeBean1 and prototypeBean2 same?" + (protoTypeBean1 == protoTypeBean2));
	}
}
