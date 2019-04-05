package com.xml.parseAddress;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class ParseAddressXML {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory factory=null;
		SAXParser parser=null;
		File file=null;
		FileInputStream fio=null;
		//create SAXParseFactory
		factory=SAXParserFactory.newInstance();
		//creating SAXParse from factory
		parser=factory.newSAXParser();
		//locate file 
		file=new File("address.xml");
		//create FileInputStream 
		fio=new FileInputStream(file);
		//parse XMl Using DefaultHandler
		parser.parse(fio,new AddressHandler());
	}

}
