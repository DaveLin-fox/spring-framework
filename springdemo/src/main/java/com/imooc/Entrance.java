package com.imooc;

import com.imooc.controller.WelcomeController;
import com.imooc.entity.User;
import com.imooc.entity.factory.UserFactoryBean;
import com.imooc.service.WelcomeService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * TODO
 *
 * @author lzq
 */
@Configuration
@ComponentScan
public class Entrance {

	public Entrance() {
		System.out.println("entrance init");
	}

	public static void main3(String[] args) {
		System.out.println("Hello World");

		String xmlPath = "//Users/dave/projects/git-project/spring-framework/springdemo/src/main/resources/spring/spring-config.xml";

 		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPath);
		WelcomeService welcomeService = (WelcomeService) applicationContext.getBean("welcomeService");
		welcomeService.sayHello("强大的spring框架");

		// 得到无参构造函数创建的对象
		User user1a = (User) applicationContext.getBean("user1");
		User user1b = (User) applicationContext.getBean("user1");

		// 得到静态工厂创建的对象
		User user2a = (User) applicationContext.getBean("user2");
		User user2b = (User) applicationContext.getBean("user2");

		// 得到实例工厂创建的对象
		User user3a = (User) applicationContext.getBean("user3");
		User user3b = (User) applicationContext.getBean("user3");

		// 得到BeanFactory创建的对象
		UserFactoryBean user4a = (UserFactoryBean) applicationContext.getBean("&userFactoryBean");
		User user4b = (User) applicationContext.getBean("userFactoryBean");

		System.out.println("无参构造函数创建的对象：" + user1a);
		System.out.println("无参构造函数创建的对象：" + user1b);
		System.out.println("静态工厂创建的对象：" + user2a);
		System.out.println("静态工厂创建的对象：" + user2b);
		System.out.println("静态工厂创建的对象：" + user3a);
		System.out.println("静态工厂创建的对象：" + user3b);
		System.out.println("factoryBean创建的对象：" + user4a);
		System.out.println("factoryBean创建的对象：" + user4b);

	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Entrance.class);
//		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//		for (String beanDefinitionName : beanDefinitionNames) {
//			System.out.println(beanDefinitionName);
//		}
//		WelcomeService welcomeService = applicationContext.getBean(WelcomeService.class);
//		welcomeService.sayHello("强大的Spring框架");
//
//		WelcomeController welcomeController = applicationContext.getBean(WelcomeController.class);
//		welcomeController.handleRequest();

		User user5 = applicationContext.getBean("user5", User.class);
		System.out.println("CustomizedBeanDefinitionRegistryPostProcessor创建的对象:" + user5);
	}
}
