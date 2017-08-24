package com.basics.beans.clazz;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestAutoWire implements DisposableBean, InitializingBean {

	@Autowired
	private TestBean test1;
	@Autowired
	private TestBean test2;

	@Autowired
	@Qualifier("test2")
	private TestBean test3;

	public TestAutoWire() {
		System.out.println("TestAutoWire  Constructor:" + hashCode());
	}

	public void process() {
		System.out.println(test1 + ":" + test2 + ":" + test3);
	}

	public TestBean getTest1() {
		return test1;
	}

	public void setTest1(TestBean test1) {
		this.test1 = test1;
	}

	public TestBean getTest2() {
		return test2;
	}

	public void setTest2(TestBean test2) {
		this.test2 = test2;
	}

	public TestBean getTest3() {
		return test3;
	}

	public void setTest3(TestBean test3) {
		this.test3 = test3;
	}

	@Override
	public String toString() {
		return "TestAutoWire [test1=" + test1 + ", test2=" + test2 + ", test3=" + test3 + ", hashCode()=" + hashCode()
				+ "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("TestAutoWired: afterPropertiesSet: " + toString());

	}

	public void destroy() throws Exception {
		System.out.println("TestAutoWired: destroy: " + toString());

	}

}
