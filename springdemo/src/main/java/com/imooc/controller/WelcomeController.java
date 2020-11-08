package com.imooc.controller;

import com.imooc.service.WelcomeService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;

import java.util.Arrays;

/**
 * TODO
 *
 * @author lzq
 */
@Controller
public class WelcomeController implements ApplicationContextAware, BeanNameAware {
	private String myName;
	private ApplicationContext myContainer;

	@Autowired
	private WelcomeService welcomeService;

	public void handleRequest() {
		welcomeService.sayHello("来自Controller的问候");
		System.out.println("我是谁:" + myName);
		String[] beanDefinitionNames = myContainer.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanDefinitionNames));
	}

	@Override
	public void setBeanName(String name) {
		this.myName = name;
		System.out.println("WelcomeController.setBeanName()");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.myContainer = applicationContext;
		System.out.println("WelcomeController.setApplicationContext()");
	}
}
