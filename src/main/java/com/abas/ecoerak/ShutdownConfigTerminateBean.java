package com.abas.ecoerak;

import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import com.abas.ecoerak.service.EdpSessionService;

public class ShutdownConfigTerminateBean
{
	@Autowired
	EdpSessionService edpSessionService;
	
	@PreDestroy
	public void onDestroy() throws Exception
	{
		System.out.println("EDPSESSION is closing ...");
		edpSessionService.EDPSESSION_END();
		System.out.println("EDPSESSION is closed ...");
		System.out.println("Spring Container is destroyed!");
	}
}
