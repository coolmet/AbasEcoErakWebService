package com.abas.ecoerak.service;

import com.abas.ecoerak.model.AbasOrder;
import com.abas.ecoerak.model.ExecResult;

public interface EdpService
{
	ExecResult addOrder(AbasOrder abasOrder);
	
	ExecResult addOrder(String jsonData);
}
