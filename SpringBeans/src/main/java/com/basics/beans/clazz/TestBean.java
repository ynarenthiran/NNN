package com.basics.beans.clazz;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TestBean implements DisposableBean, InitializingBean {

	public TestBean() {
		System.out.println("TestBean Constructor:" + hashCode());
	}

	public void process() {
		System.out.println("TestBean Process :" + toString() );
	}

	@Override
	public String toString() {
		return "TestBean [hashCode()=" + hashCode() + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("TestBean : afterPropertiesSet");
	}

	public void destroy() throws Exception {
		System.out.println("TestBean : destroy");
	}

}
