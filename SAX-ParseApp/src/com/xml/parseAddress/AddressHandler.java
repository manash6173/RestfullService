package com.xml.parseAddress;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class AddressHandler extends DefaultHandler {
	@Override
	public void startDocument() throws SAXException {
		/*System.out.println("*****StartDocument******");*/
		
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		/*System.out.println("******StartElement******");*/
		System.out.println(qName);
		
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		/*System.out.println("*****Characters******");*/
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		/*System.out.println("******EndElement*****");*/
		
	}
	
	@Override
	public void endDocument() throws SAXException {
		/*System.out.println("******EndDocument*******");*/
		
	}
}
