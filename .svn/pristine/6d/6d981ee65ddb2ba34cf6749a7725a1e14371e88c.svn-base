package com.abas.ecoerak.service;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import com.abas.ecoerak.ConfigPropertiesAbas;
import com.abas.ecoerak.SprinBootAppConfiguration;
import de.abas.ceks.jedp.EDPEditor;
import de.abas.ceks.jedp.EDPFactory;
import de.abas.ceks.jedp.EDPLockBehavior;
import de.abas.ceks.jedp.EDPMessage;
import de.abas.ceks.jedp.EDPMessageListener;
import de.abas.ceks.jedp.EDPQuery;
import de.abas.ceks.jedp.EDPSession;

@Service
// @Scope(value="session")
public class EdpSessionService
{
	@Autowired
	AbasMobileUtils abasMobileUtils;
	
	@Autowired
	private ConfigPropertiesAbas configAbas;
	
	Logger LOGGER=LoggerFactory.getLogger(SprinBootAppConfiguration.class);
	
	public EDPSession SESSION=null;
	
	ArrayList<EDPMessage> edpMessages;
	
	public boolean EDPSESSION_START()
	{
		edpMessages=new ArrayList<EDPMessage>();
		int count=0;
		boolean status=false;
		while(count<5)
		{
			LOGGER.debug(">>"+count+">"+configAbas.getEdp().getServerip()+"_"+configAbas.getEdp().getPort()+"_"+configAbas.getS3().getMandant()+"_"+configAbas.getEdp().getPassword()+"_"+"AbasMobile");
			try
			{
				if(SESSION==null)
				{
					try
					{
						SESSION=EDPFactory.createEDPSession();
						SESSION.setConnectTimeout(configAbas.getEdp().getSessiontimeout());
					}
					catch(Exception rt)
					{
						LOGGER.info(rt.getLocalizedMessage());
					}
				}
				if(!SESSION.isConnected())
				{
					SESSION.beginSession(configAbas.getEdp().getServerip(),configAbas.getEdp().getPort(),configAbas.getS3().getMandant(),configAbas.getEdp().getPassword(),"AbasMobile");
					SESSION.setEKSLanguage(configAbas.getEdp().getLang());
					SESSION.resetErrorMessageListener();
					SESSION.setErrorMessageListener(this.edpMessageListener(edpMessages));
					SESSION.setStatusMessageListener(this.edpMessageListener(edpMessages));
					SESSION.setBoolMode(EDPSession.BOOLMODE_NUM);
				}
				if(SESSION.isConnected())
				{
					count=5;
					status=true;
				}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
				LOGGER.info(abasMobileUtils.exceptionMessage(e));
				LOGGER.debug(abasMobileUtils.exceptionMessageDetails(e));
			}
			count++;
		}
		return status;
	}
	
	public boolean EDPSESSION_END()
	{
		boolean status=false;
		try
		{
			while(SESSION!=null&&SESSION.isConnected())
			{
				SESSION.endSession();
			}
			status=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			LOGGER.info(abasMobileUtils.exceptionMessage(e));
			LOGGER.debug(abasMobileUtils.exceptionMessageDetails(e));
		}
		return status;
	}
	
	public EDPMessageListener edpMessageListener(ArrayList<EDPMessage> edpMessage)
	{
		return new EDPMessageListener()
		{
			@Override
			public void receivedMessage(EDPMessage em)
			{
				if(!em.getMessageText().contains("ymapass"))
				{
					edpMessage.add(em);
					try
					{
						throw new Exception("message");
					}
					catch(Exception e)
					{
						e.printStackTrace();
						LOGGER.info(abasMobileUtils.exceptionMessage(e));
						LOGGER.debug(abasMobileUtils.exceptionMessageDetails(e));
					}
				}
			}
		};
	}
}
