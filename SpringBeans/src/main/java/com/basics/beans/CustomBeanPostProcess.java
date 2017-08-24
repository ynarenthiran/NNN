package com.basics.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcess implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("CustomBeanPostProcess : postProcessAfterInitialization :" + arg0 + ":" + arg1 + ":" + arg0.getClass());
		return arg0;
	}
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("CustomBeanPostProcess : postProcessBeforeInitialization :"+ arg0 + ":" + arg1 + ":" + arg0.getClass());
		return arg0;
	}

}
