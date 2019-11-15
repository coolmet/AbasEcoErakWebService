package com.abas.ecoerak.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.abas.ecoerak.AbasUserProperties;
import com.abas.ecoerak.model.AbasUserDetailsModel;
import com.abas.ecoerak.service.UserService;

@Service
@Transactional(rollbackFor=Exception.class)
public class UserServiceImpl implements UserService
{
	@Autowired
	AbasUserProperties abasUserProperties;
	
	@Override
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	@Secured(value=
	{"ROLE_RESTUSER"})
	public List<AbasUserDetailsModel> findAll()
	{
		return abasUserProperties.getUsers();
	}
	
	@Override
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public AbasUserDetailsModel findByUserName(String userName)
	{
		return abasUserProperties.getUsers().stream().filter(f->f.getUsername().equals(userName)).findFirst().get();
	}
	
	@Override
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public List<AbasUserDetailsModel> findAllByUserRole(String userRole)
	{
		return abasUserProperties.getUsers().stream().filter(f->f.getRolesAsString().contains(userRole)).collect(Collectors.toList());
	}
	
}
