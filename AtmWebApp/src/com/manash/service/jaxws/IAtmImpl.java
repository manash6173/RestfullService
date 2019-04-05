package com.manash.service.jaxws;



import java.util.Date;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.manash.service.requestBinding.AccountType;
import com.manash.service.requestBinding.TransactionType;
import com.manash.service.responseBinding.InvoiceType;

@HandlerChain(file="handler-chain.xml")
@WebService(endpointInterface="com.manash.service.jaxws.IAtm")
public class IAtmImpl implements IAtm {
     
	@WebMethod
	@Override
	public @WebResult InvoiceType withdraw(@WebParam(name="accinfo") AccountType accinfo,@WebParam(name="traninfo") TransactionType traninfo) {
		//Business logics to withdraw money
		
		//create response object
		InvoiceType invoice=new InvoiceType();
		//set properties
		invoice.setTxno(123456);
		invoice.setStatus("success");
		invoice.setInvoiceDate(new Date());
		invoice.setInvoiceNum(456);
		return invoice;
	}

}
