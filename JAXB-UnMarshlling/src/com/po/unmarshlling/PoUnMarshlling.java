package com.po.unmarshlling;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.manash.types.PurchaseOrderType;

public class PoUnMarshlling {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws JAXBException {
		JAXBContext jctx=null;
		Unmarshaller unmarshaller=null;
		JAXBElement<PurchaseOrderType> jElement=null;
		//create JAX-BContext Factory
        jctx=JAXBContext.newInstance("com.manash.types");
        //get UnMarshaller object from factory
        unmarshaller=jctx.createUnmarshaller();
        jElement=(JAXBElement<PurchaseOrderType>) unmarshaller.unmarshal(new File("po.xml"));
        System.out.println(jElement);
        
	}

}
