package com.jaclon.ssm.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyAppListener implements ServletContextListener {

    public MyAppListener() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        servletContext.setAttribute("ctp", servletContext.getContextPath());
    }


    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // TODO Auto-generated method stub
    }
	
}
