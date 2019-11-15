package com.abas.ecoerak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.abas.ecoerak.ConfigPropertiesServer;

@Service
public class TokenService
{
	@Autowired
	ConfigPropertiesServer configPropertiesServer;
	
	public long getTokenExpirationTime()
	{
		return configPropertiesServer.getToken().getExpirationTime();
	}
	
	public String getHeaderString()
	{
		return configPropertiesServer.getToken().getHeaderString();
	}
	
	public String getPrefix()
	{
		return configPropertiesServer.getToken().getPrefix();
	}
	
	public String getSecret()
	{
		return configPropertiesServer.getToken().getSecret();
	}
	
}
