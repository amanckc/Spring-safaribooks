package com.spring.basics.Springsteps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {
	
	
@Autowired
	public JdbcConnection() {
	System.out.println("jdbc");
}
}
