package com.greedy.section01.contextlistener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListenerTest implements ServletContextListener {

	@Override
	public void contextInitalized(ServletContextEvent sce) {
		System.out.println("context init!!");
	}
	
	@Override 
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("context destyoed");
	}
 }
