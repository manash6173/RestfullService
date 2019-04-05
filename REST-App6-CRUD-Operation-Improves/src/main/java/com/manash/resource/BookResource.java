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
import javax.ws.rs.core.Response.Status;

import com.manash.binding.BookInfo;
import com.manash.service.BookService;


@Path("/book")
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
	  public Response addBook(BookInfo b) {
       //invoke service class methods
		 boolean flag=service.add(b);
		 if(flag==true) {
			 String successMsg="Book Added successfully";
			 return Response.ok(successMsg).build();
		 }
		 else {
			 String errorMsg="Failed to add book";
			 return Response.status(Status.BAD_REQUEST).entity(errorMsg).build();  
		 }		 
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
	 public Response getBook(@PathParam("bookId") String bookId) {
		 int bid=Integer.parseInt(bookId);
		 BookInfo info=service.get(bid);
		 if(info!=null) {
			 return Response.ok(info).build();
		 }
		 else
			 return Response.status(Status.BAD_REQUEST).entity(info).build();
	 }
	 /**
	  * This Method is used to remove Book object from the map collection.
	  * @param bookId
	  * @return BookInfo
	  */
	 
	 @DELETE
	 @Path("{bookId}")
	 @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	 public Response delete(@PathParam("bookId") String bookId) {
		 int bid=Integer.parseInt(bookId);
		 BookInfo info=service.delete(bid);
		 if(info!=null) {
			 return Response.ok(info).build();
		 }
		 else
			 return Response.status(Status.BAD_REQUEST).entity(info).build();
	 }
	 /**
	  * This Method is used to update Book object into map collection.
	  * @param BookInfo
	  * @return BookInfo
	  */
	 @PUT
	 @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	 @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	 public Response updateBook(BookInfo bi) {
		 BookInfo info=service.update(bi);
		 if(info!=null) {
			 return Response.ok(info).build();
		 }
		 else
			 return Response.status(Status.BAD_REQUEST).entity(info).build();
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