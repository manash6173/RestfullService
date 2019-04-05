package com.manash.service.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.manash.service.requestBinding.AccountType;
import com.manash.service.requestBinding.TransactionType;
import com.manash.service.responseBinding.InvoiceType;

@WebService()
public interface IAtm {
    @WebMethod
	public InvoiceType withdraw(AccountType accinfo,TransactionType traninfo);
}
