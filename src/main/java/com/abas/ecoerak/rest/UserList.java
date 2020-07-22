package com.abas.ecoerak.rest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.abas.ecoerak.model.AbasUserDetailsModel;

@XmlRootElement
@XmlSeeAlso(
{AbasUserDetailsModel.class})
public class UserList<T>
{
	
	private List<T> listOfUserObjects;
	
	public UserList()
	{
		listOfUserObjects=new ArrayList<T>();
	}
	
	public UserList(List<T> listOfUserObjects)
	{
		this.listOfUserObjects=listOfUserObjects;
	}
	
	@XmlAnyElement
	public List<T> getUser()
	{
		return listOfUserObjects;
	}
}
