package com.manash.resource;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.manash.binding.BookInfo;
import com.manash.service.BookService;


@Path("/store")
public class BookResource {
	

	//create BookService class object
	private BookService service =new BookService();
	 
	 /**
	  * This method is used to add book object into the map collection
	  * @param b
	  * @return String
	  */
	 @POST
	 @Consumes(MediaType.APPLICATION_JSON)
	  public String addBook(BookInfo b) {
       //invoke service class methods
		 boolean flag=service.add(b);
		 if(flag==true)
			 return "Book Added sucessfully";
		 return "failed to add book";
	  }
     /**
      * This Method is used to return a book object to the client
      *  
      * @param bookId
      * @return BookInfo
      */
	 
	 @GET
	 @Path("{bookId}")
	 @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	 public BookInfo getBook(@PathParam("bookId") String bookId) {
		 int bid=Integer.parseInt(bookId);
		 BookInfo info=service.get(bid);
		 return info;
	 }
	 /**
	  * This Method is used to remove Book object from the map collection.
	  * @param bookId
	  * @return BookInfo
	  */
	 
	 @DELETE
	 @Path("{bookId}")
	 @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	 public BookInfo delete(@PathParam("bookId") String bookId) {
		 int bid=Integer.parseInt(bookId);
		 BookInfo info=service.delete(bid);
		 return info;
	 }
	 /**
	  * This Method is used to update Book object into map collection.
	  * @param BookInfo
	  * @return BookInfo
	  */
	 @PUT
	 @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	 @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	 public BookInfo updateBook(BookInfo bi) {
		 BookInfo book=service.update(bi);
		 return book;
	 }
	 
	 /**
	  * This Method is used to retrive  all objects from map collection. 
	  * @return Response
	  */
	 @GET
	 @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	 public List<BookInfo> getAllBooks() {
		 List<BookInfo> bookList=service.getAll();
		 return bookList;
	 }
	 
}