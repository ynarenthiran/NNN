package com.basics.beans.xml;

public class XMLBeanSetter {
	private XMLBean xmlBean;
	private String name;
	private int age;
	public XMLBeanSetter() {
		System.out.println("XMLBeanSetter Constructor  :" + hashCode());
	}

	public void process() {
		System.out.println("XMLBeanSetter Process:" + toString());
	}

	public XMLBean getXmlBean() {
		return xmlBean;
	}

	public void setXmlBean(XMLBean xmlBean) {
		this.xmlBean = xmlBean;
	}

	@Override
	public String toString() {
		return "XMLBeanSetter [xmlBean=" + xmlBean + ", name=" + name + ", age=" + age + ", hashCode()=" + hashCode()
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
