package com.basics.beans.xml;

public class XMLBean {

	public XMLBean() {
		System.out.println("XMLBean Constructor :" + hashCode());
	}

	public void process() {
		System.out.println("XMLBean Process[" + hashCode()+ "]");
	}

	@Override
	public String toString() {
		return "XMLBean [" + hashCode() + "]";
	}

}
