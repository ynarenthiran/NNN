package com.basics.beans.xml;

public class XMLBeanConstructor {
	private XMLBean xmlBean;
	private String name;
	private int age;
	private int month;
	
	public XMLBeanConstructor(XMLBean xmlBean) {
		this.xmlBean = xmlBean;
		System.out.println("XMLBeanConstructor Constructor :" + hashCode() + "::" + xmlBean);
	}
	 public XMLBeanConstructor(XMLBean xmlBean, String name, int age) {
		this.xmlBean = xmlBean;
		this.name = name;
		this.age = age;
		System.out.println("XMLBeanConstructor Constructor(Multiple) :" + hashCode() + "::" + toString());
	}
	 
	 
	 public XMLBeanConstructor(XMLBean xmlBean, int age, String name) {
		this.xmlBean = xmlBean;
		this.name = name;
		this.age = age;
		System.out.println("XMLBeanConstructor Constructor(Multiple) :" + hashCode() + "::" + toString());
	}
	 
	 public XMLBeanConstructor(XMLBean xmlBean, int age, int month, String name) {
		this.xmlBean = xmlBean;
		this.name = name;
		this.age = age;
		this.month = month;
		System.out.println("XMLBeanConstructor Constructor(Multiple) :" + hashCode() + "::" + toString());
	}


	public void process() {
		System.out.println("XMLBeanConstructor Process :" + toString());
	}

	public XMLBean getXmlBean() {
		return xmlBean;
	}

	public void setXmlBean(XMLBean xmlBean) {
		this.xmlBean = xmlBean;
	}

	@Override
	public String toString() {
		return "XMLBeanConstructor [xmlBean=" + xmlBean + ", name=" + name + ", age=" + age + ", month=" + month
				+ ", hashCode()=" + hashCode() + "]";
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
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	

}
