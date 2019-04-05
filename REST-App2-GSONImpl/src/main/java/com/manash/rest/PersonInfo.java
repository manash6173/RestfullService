package com.manash.rest;

import java.util.Date;

import lombok.Data;

@Data
public class PersonInfo {

	private int pid;
	private String pname;
	private String addrs;
	private Date dob;
}
