package com.manash.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.manash.binding.BookInfo;


public class BookService {
	private  static final Map<Integer,BookInfo> bookMap=new HashMap<Integer,BookInfo>();
	
	/**
	 * This Method is used to add book Object into map collection
	 * @param bi
	 * @return boolean
	 */
	public boolean add(BookInfo bi) {
		if(!bookMap.containsKey(bi.getBid())) {
			bookMap.put(bi.getBid(), bi);
			return true;
		}
		return false;
	}
	
	/**
	 * This Method is used to get book Object from map collection
	 * @param bid
	 * @return BookInfo
	 */
	public BookInfo get(int bid) {
		if(bookMap.containsKey(bid)) {
			BookInfo info=bookMap.get(bid);
			return info;
		}
		else
			return null;	
	}
	
	/**
	 * This Method is used to remove bookObject from map collection 
	 * @param bid
	 * @return
	 */
	public BookInfo delete(int bid) {
		if(bookMap.containsKey(bid)) {
			BookInfo info=bookMap.remove(bid);
			return info;
		}
		return null;
	}
	/**
	 * THis method is used to update the Book based on the id
	 * @param bi
	 * @return BookInfo 
	 */
	public BookInfo update(BookInfo bi) {
		if(bookMap.containsKey(bi.getBid())) {
			BookInfo info=bookMap.put(bi.getBid(), bi);
			return info;
		}
		return null;
	}
	
	/**
	 * This Method is used retrive all objects from map collection
	 * @return List<BookInfo>
	 */
	public List<BookInfo> getAll() {
	 Collection<BookInfo> collection=bookMap.values();
	 List<BookInfo> list=new ArrayList<BookInfo>(collection);
	 return list;
	}
	
}
