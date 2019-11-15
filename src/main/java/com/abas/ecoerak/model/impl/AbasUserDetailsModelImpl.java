package com.abas.ecoerak.model.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import com.abas.ecoerak.model.AbasUserDetailsModel;

public interface AbasUserDetailsModelImpl extends JpaRepository<AbasUserDetailsModel,Long>
{
	AbasUserDetailsModel findByUsername(String username);
}
