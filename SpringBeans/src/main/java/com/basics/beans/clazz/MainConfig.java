package com.basics.beans.clazz;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.basics.beans.CustomBeanPostProcess;
import com.basics.beans.DefaultApplicationListener;
import com.basics.beans.MainClassAware;

@Configuration
public class MainConfig implements BeanFactoryAware {
	@Bean
	public TestBean test1() {
		return new TestBean();
	}

	@Bean
	@Scope("prototype")
	public TestBean test2() {
		return new TestBean();
	}

	@Bean
	public TestAutoWire testAutoWire() {
		return new TestAutoWire();
	}

	@Bean
	public MainClassAware mainClassAware() {
		return new MainClassAware();
	}

	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub

	}

	@Bean
	public CustomBeanPostProcess getCustomBeanPostProcess() {
		return new CustomBeanPostProcess();
	}

	@Bean
	public DefaultApplicationListener getDefaultApplicationListener() {
		return new DefaultApplicationListener();
	}
}
