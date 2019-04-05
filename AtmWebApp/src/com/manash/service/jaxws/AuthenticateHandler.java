package com.manash.service.jaxws;

import java.util.Iterator;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.Node;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;




public class AuthenticateHandler implements SOAPHandler<SOAPMessageContext> {
	private static final String SECRET_KEY="AshokIt";

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		boolean outbound=false;
		System.out.println("AuthenticateHandler.handleMessage()");
		//to check inbounds or outbounds
		outbound=(boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if(!outbound) {
			try {
				//get soap message from soapRequest
				SOAPMessage soapMsg=context.getMessage();
				//get soapHeader from soap message
				SOAPHeader soapheader=soapMsg.getSOAPHeader();
				//Iterator soap elements from soapheader 
				Iterator<?> header=soapheader.extractHeaderElements(SOAPConstants.URI_SOAP_ACTOR_NEXT);
				if(header.hasNext()) {
					Node node=(Node) header.next();
					if(node!=null) {
						String key=node.getValue();
						if(SECRET_KEY.equals(key.trim())) {
							//key match process the request
							return true;
						}//inner if
						else {
							//key did not match
						}//inner else
					}//inner if
					
				}//outer if
				//header not found
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		try {
			SOAPMessage soapmsg=context.getMessage();
			SOAPBody soapbody=soapmsg.getSOAPBody();
			SOAPFault soapfault=soapbody.addFault();
			soapfault.setFaultString("secret key not matched!!");
			throw new SOAPException();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void close(MessageContext context) {
		System.out.println("AuthenticateHandler.close()");

	}

	@Override
	public Set<QName> getHeaders() {
	System.out.println("AuthenticateHandler.getHeaders()");
		return null;
	}

}
