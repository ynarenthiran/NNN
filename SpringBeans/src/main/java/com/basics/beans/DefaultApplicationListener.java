package com.basics.beans;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class DefaultApplicationListener implements ApplicationListener<ApplicationEvent>{

	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("DefaultApplicationListener : onApplicationEvent" + event.getClass() + event);
	}

}
