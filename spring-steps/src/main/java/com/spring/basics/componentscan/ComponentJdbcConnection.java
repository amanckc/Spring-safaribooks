package com.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,
		proxyMode=ScopedProxyMode.TARGET_CLASS)//for different instances of JDBC
public class ComponentJdbcConnection {
	
	
@Autowired
	public ComponentJdbcConnection() {
	System.out.println("jdbc");
}
}
