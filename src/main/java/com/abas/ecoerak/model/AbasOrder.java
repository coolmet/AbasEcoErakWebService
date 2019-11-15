package com.abas.ecoerak.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AbasOrder
{
	@JsonProperty("Master")
	public Master master;
	
	@JsonProperty("Line")
	public List<Line> line;
	
	@JsonProperty("Distribution")
	public List<Distribution> distribution;
	
	@Override
	public String toString()
	{
		return "AbasOrder [MASTER="+master+", LINE="+line+", DISTRIBITUON="+distribution+"]";
	}
	
}
