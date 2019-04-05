package com.manash.client;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RestEasyClient {

	public static void main(String[] args) throws Exception {
		//create URL 
		String name="http://localhost:2525/REST-App7-JAX-RS2.0-API/wish/manash";
		//create URL 
		URL url=new URL(name);
		//create Http Connection 
		HttpURLConnection con=(HttpURLConnection)url.openConnection();
		//set request mode
		con.setRequestMethod("GET");
		if(con.getResponseCode()==200) {
			InputStream is=con.getInputStream();
			//create InputStreamReader to read response
			InputStreamReader isr=new InputStreamReader(is);
			//read data to BufferReader object
			BufferedReader br=new BufferedReader(isr);
			//read data from buffer reader
			String msg=br.readLine();
			System.out.println(msg);
		}
		else
			System.out.println("Connection failed");
	}
}
