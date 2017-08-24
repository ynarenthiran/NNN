package com.basics.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.basics.beans.clazz.MainConfig;
import com.basics.beans.clazz.TestBean;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

		TestBean testBean = applicationContext.getBean("test1", TestBean.class);
		testBean.process();
		/*
		 * TestBean testBean1 = applicationContext.getBean("test1",
		 * TestBean.class); testBean1.process();
		 * 
		 * 
		 * 
		 * TestBean testBean2 = applicationContext.getBean("test2",
		 * TestBean.class); testBean2.process();
		 * 
		 * TestBean testBean3 = applicationContext.getBean("test2",
		 * TestBean.class); testBean3.process();
		 * 
		 * TestAutoWire testAutoWire1 =
		 * applicationContext.getBean("testAutoWire", TestAutoWire.class);
		 * testAutoWire1.process();
		 */

		MainClassAware mainClassAware = applicationContext.getBean("mainClassAware", MainClassAware.class);

		TestBean testBean1 = mainClassAware.getTestBean();
		testBean1.process();

		((AbstractApplicationContext) applicationContext).close();

	}
}
