package com.cams.usermgmt.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cams.usermgmt.service.UserMgmtService;
import com.cams.utils.JSONResponse;

@RestController
public class UserMgmtController {

	

	@Autowired
	UserMgmtService userMgmtService;

	 @GetMapping("/authData")	 
	 public Response  authData(@Context HttpServletRequest request,@Context HttpServletResponse response) throws Exception{	  
		 return userMgmtService.authData(request,response);
	  }
	 
	 @GetMapping("/adminAuthData")
	 public Response  adminAuthData(@Context HttpServletRequest request,@Context HttpServletResponse response) throws Exception{
	  
		 return userMgmtService.adminAuthData(request,response);
	  }
	 
	 @PostMapping(path="/authenticateCustomerPortalUser",consumes= "application/json", produces = "application/json")
//	 @POST
//     @Produces(MediaType.APPLICATION_JSON)
//     @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
//	 @Path("/authenticateCustomerPortalUser")
	 public JSONResponse  authenticateUser(@FormParam("username") String username, @FormParam("password") String password,@Context HttpServletRequest request) throws Exception{
	   return userMgmtService.authenticateUser(username,password,request);
	  }
	 
	 @PostMapping(path="/forgotpassword",consumes= "application/json", produces = "application/json")
//	 @POST
//     @Produces(MediaType.APPLICATION_JSON)
//     @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
//	 @Path("/forgotpassword")
	 public JSONResponse  forgotPassword(@FormParam("username") String username,@Context HttpServletRequest request) throws Exception{
	   return userMgmtService.forgotPassword(username,request);
	  }
	 
	 
	 @PostMapping(path="/authenticateAdminPortalUser",consumes= "application/json", produces = "application/json")
//	 @POST
//     @Produces(MediaType.APPLICATION_JSON)
//     @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
//	 @Path("/authenticateAdminPortalUser")
	 public JSONResponse  authenticateAdminUser(@FormParam("username") String username, @FormParam("password") String password,@Context HttpServletRequest request) throws Exception{
	   return userMgmtService.authenticateAdminUser(username,password,request);
	  }
     
	 
	 @GetMapping("/logoutCustomerPortalUser")
//     @GET
//	 @Path("/logoutCustomerPortalUser")
	 public JSONResponse  logoutCustomerPortalUser(@Context HttpServletRequest request,@Context HttpServletResponse response) throws Exception{
	   return userMgmtService.logoutCustomerPortalUser(request,response);
	  }
     
	 @GetMapping("/logoutAdminPortalUser")
//     @GET
//	 @Path("/logoutAdminPortalUser")
	 public JSONResponse  logoutAdminPortalUser(@Context HttpServletRequest request,@Context HttpServletResponse response) throws Exception{
	   return userMgmtService.logoutAdminPortalUser(request,response);
	  }
     
	 @GetMapping("/sessionTest")
//	    @GET
//		@Path("/sessionTest")
		public JSONResponse sessionTest(@Context HttpServletRequest request,@Context HttpServletResponse response) throws Exception {
			
	    	JSONResponse response11 =new JSONResponse();

		        
		  
		        // Set response content type
		        //response.setContentType("text/html");

		        // Actual logic goes here.
		        //PrintWriter out = response.getWriter();
		    	
		    	Integer addressNum= (Integer) request.getSession().getAttribute("addressNum");
		    	
		    	//out.println("addressNum"+addressNum);
		    	System.out.print("request.getSession()"+request.getSession());
		    	if(addressNum==null) {
		    	request.getSession().setAttribute("addressNum",1);
		    	}else {
		    	request.getSession().setAttribute("addressNum",addressNum+1);
		    	}
		
		    	response11.setMessage("Session Counter");  
		    	response11.setMessage(request.getSession().getAttribute("addressNum").toString());
		    	
		    	return response11;
			
		}
	    
	 @PostMapping(path="/changepassword",consumes= "application/json", produces = "application/json")
//	     @POST
//		 @Produces(MediaType.APPLICATION_JSON)
//	     @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
//		 @Path("/changepassword")
		 public JSONResponse  changePassword(@FormParam("currentpsswd") String currentPsswd, @FormParam("newpsswd") String newPsswd,@Context HttpServletRequest request,@Context HttpServletResponse response) throws Exception{
		  
			 return userMgmtService.changePassword(currentPsswd,newPsswd,request);
		  }
	     
	     
	     @GetMapping("/authenticateUser/{username}/{password}")
//	     @GET
//		 @Path("/authenticateUser/{username}/{password}")
		 public JSONResponse  authenticateUser(@PathParam("username") String username, @PathParam("password") String password,@Context HttpServletRequest request,@Context HttpServletResponse response) throws Exception{
		  
			 return userMgmtService.authenticateUser(username,password,request);
		  }
	     
	     
	     @GetMapping("/isOACUser/{username}")
//	     @GET
//		 @Path("/isOACUser/{username}")
	     public JSONResponse isOACUser(@PathParam("username") String username,@Context HttpServletRequest request,@Context HttpServletResponse response) throws Exception{
	 		
	    	 return userMgmtService.isOACUser(username,request);
	 	}
	          
    

}
