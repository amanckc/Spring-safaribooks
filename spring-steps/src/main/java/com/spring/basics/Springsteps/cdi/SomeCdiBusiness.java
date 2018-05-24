package com.spring.basics.Springsteps.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeCdiBusiness {
	@Autowired
	SomeCdiDAO someCDIBizDAO;
//setter injection
	public SomeCdiDAO getSomeCDIBizDAO() {
		return someCDIBizDAO;
	}

	public void setSomeCDIBizDAO(SomeCdiDAO someCDIBizDAO) {
		this.someCDIBizDAO = someCDIBizDAO;
	}
	
	
}
