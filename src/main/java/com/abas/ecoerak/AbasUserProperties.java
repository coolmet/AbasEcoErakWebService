package com.abas.ecoerak;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.boot.context.properties.ConfigurationProperties;
import com.abas.ecoerak.model.AbasUserDetailsModel;

@ConfigurationProperties("users")
public class AbasUserProperties
{
	private final List<AbasUserDetailsModel> admins=new ArrayList<>();
	private final List<AbasUserDetailsModel> rests=new ArrayList<>();
	
	public List<AbasUserDetailsModel> getAdmins()
	{
		return this.admins;
	}
	
	public List<AbasUserDetailsModel> getRests()
	{
		return rests;
	}
	
	public List<AbasUserDetailsModel> getUsers()
	{
		return Stream.of(admins,rests)
		             .flatMap(x->x.stream())
		             .collect(Collectors.toList());
	}
	
}
