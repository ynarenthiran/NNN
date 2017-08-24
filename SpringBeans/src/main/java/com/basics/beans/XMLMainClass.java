package com.basics.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.basics.beans.xml.XMLBean;
import com.basics.beans.xml.XMLBeanConstructor;
import com.basics.beans.xml.XMLBeanSetter;

public class XMLMainClass {

	public static void main(String[] args) {
		
		Resource resource=new ClassPathResource("applicationContext.xml");  
		BeanFactory factory=new XmlBeanFactory(resource);  
		
		//ApplicationContext factory = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		XMLBean xMLBean1 = (XMLBean) factory.getBean("XMLBean_Singleton");
		xMLBean1.process();
		XMLBean xMLBean2 = (XMLBean) factory.getBean("XMLBean_Singleton");
		xMLBean2.process();

		XMLBean xMLBean3 = (XMLBean) factory.getBean("XMLBean");
		xMLBean3.process();
		XMLBean xMLBean4 = (XMLBean) factory.getBean("XMLBean");
		xMLBean4.process();
		
		
		XMLBeanSetter xMLBeanSetter1 = factory.getBean("XMLBeanSetter", XMLBeanSetter.class);
		xMLBeanSetter1.process();
		
		XMLBeanSetter xMLBeanSetter2 = factory.getBean("XMLBeanSetter_Default", XMLBeanSetter.class);
		xMLBeanSetter2.process();
		
		
		XMLBeanConstructor xMLBeanConstructor = factory.getBean("XMLBeanConstructor", XMLBeanConstructor.class);
		xMLBeanConstructor.process();
		
		XMLBeanConstructor xMLBeanConstructor1 = factory.getBean("XMLBeanConstructor_1", XMLBeanConstructor.class);
		xMLBeanConstructor1.process();
		
		XMLBeanConstructor xMLBeanConstructor2 = factory.getBean("XMLBeanConstructor_2", XMLBeanConstructor.class);
		xMLBeanConstructor2.process();
		
		XMLBeanConstructor xMLBeanConstructor3 = factory.getBean("XMLBeanConstructor_3", XMLBeanConstructor.class);
		xMLBeanConstructor3.process();
		
		XMLBeanConstructor xMLBeanConstructor4 = factory.getBean("XMLBeanConstructor_4", XMLBeanConstructor.class);
		xMLBeanConstructor4.process();
		

	}
}
