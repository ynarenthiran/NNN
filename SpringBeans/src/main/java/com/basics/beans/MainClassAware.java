package com.basics.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.basics.beans.clazz.TestBean;

public class MainClassAware implements ApplicationContextAware,BeanNameAware {
	public void setBeanName(String arg0) {
		System.out.println("MainConfig : setBeanName :" + arg0);
		
	}
	public static void main(String[] args) {
		
	
		/*
		TestBean testBean1 = applicationContext.getBean("test1", TestBean.class);
		testBean1.process();
		
		

		TestBean testBean2 = applicationContext.getBean("test2", TestBean.class);
		testBean2.process();
		
		TestBean testBean3 = applicationContext.getBean("test2", TestBean.class);
		testBean3.process();
		
		TestAutoWire testAutoWire1 = applicationContext.getBean("testAutoWire", TestAutoWire.class);
		testAutoWire1.process();
*/
		
	}

	public TestBean getTestBean() {
		return applicationContext.getBean("test1", TestBean.class);
		
	}

	private ApplicationContext applicationContext;
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		
	}

}
