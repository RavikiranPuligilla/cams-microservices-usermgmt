package com.cams.usermgmt.service.impl;


import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.cams.dao.chromadata.ChromaDataDaoImpl;
import com.cams.dao.mylease.MyLeaseDao;
import com.cams.model.Customer;
import com.cams.model.chromadata.ModelYears;
import com.cams.model.mylease.MyLease;
import com.cams.model.usermgmt.AdminUser;
import com.cams.utils.AESEncryption;
import com.cams.utils.JSONResponse;
//import com.cams.utils.SendMail;


public class UserMgmtServiceImpl implements UserMgmtService{
	private static final Logger logger = Logger.getLogger(UserMgmtServiceImpl.class);

	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	private MyLeaseDao myLeaseDao;
	
	public JSONResponse authenticateUser(String username, String password,HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		
		logger.info("Entered authenticateUser method::"+username+":: "+password);
		//from Customer where customerLoginNo like '"+customerLoginNo+"%' order by companyName
		JSONResponse response=new JSONResponse("400","Login is failed");
		if(StringUtils.isNotBlank(username)&&StringUtils.isNotBlank(password)) {
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try{
			Query query = session.createQuery("from Customer where customerLoginNo='"+username+"' and password='"+AESEncryption.encryptText(password)+"'");
			
			

			List<Customer> users = query.list();
			tx.commit();
			
			if(users!=null&&users.size()>0) {
				Customer user=users.get(0);
				//System.out.println("Address number"+user.getAddressNumber());
				request.getSession().setAttribute("userId", username);
				request.getSession().setAttribute("addressNum", user.getAddressNumber());
				request.getSession().setAttribute("userObj", user);
				if(user.getMileageNotification()!=null)
				request.getSession().setAttribute("mileageNotification", user.getMileageNotification());
				
				tx = session.beginTransaction();
				Query myleaseQuery = session.createQuery("from MyLease where addressNum='"+user.getAddressNumber()+"' and rownum<2 ");
				List<MyLease> leaseList=myleaseQuery.list();
				if(leaseList!=null&&leaseList.size()>0) {
					MyLease lease=leaseList.get(0);
					request.getSession().setAttribute("myleaseObj", lease);
				}
				tx.commit();
				
				response.setResponseCode("200");
				response.setMessage(AESEncryption.encryptText(username));
				myLeaseDao.setGpsUrl(request);
			}
		session.close();	
		logger.info("Exiting successfully authenticateUser method::");	
		}catch(Exception e){
			e.printStackTrace();
			logger.error("Exception in authenticateUser method:: "+ e);
			tx.rollback();
			session.close();
			
		}
		}else {
			response.setResponseCode("401");
			response.setMessage("Mandatory field is missing");
		}
		return response;
		// TODO Auto-generated method stub
	}
	
	public JSONResponse isOACUser(String username,HttpServletRequest request) throws Exception {
		
		
		System.out.print("Entered isOACUser method::"+username);
		
		logger.info("Entered isOACUser method::"+username);
		//from Customer where customerLoginNo like '"+customerLoginNo+"%' order by companyName
		JSONResponse response=new JSONResponse("404","user is not oac user");
		if(StringUtils.isNotBlank(username)) {
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try{
			Query query = session.createQuery("from Customer where customerLoginNo='"+username+"' and OACApplicable='true'");

			List<Customer> users = query.list();
			tx.commit();
			
			if(users!=null&&users.size()>0) {
				
				response.setResponseCode("200");
				response.setMessage("user is oac user");
			}else {
				response.setResponseCode("404");
				response.setMessage("user is not oac user");
			}
		session.close();	
		logger.info("Exiting successfully isOACUser method::");	
		}catch(Exception e){
			e.printStackTrace();
			logger.error("Exception in isOACUser method:: "+ e);
			tx.rollback();
			session.close();
			
		}
		}else {
			response.setResponseCode("401");
			response.setMessage("Mandatory field is missing");
		}
		return response;
		// TODO Auto-generated method stub
	}
	
	
	
	public boolean setUserSession(String username,HttpServletRequest request) {
		// TODO Auto-generated method stub
		
		
		//from Customer where customerLoginNo like '"+customerLoginNo+"%' order by companyName
		
		if(StringUtils.isNotBlank(username)) {
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try{
			Query query = session.createQuery("from Customer where customerLoginNo='"+username+"'");
			
			

			List<Customer> users = query.list();
			tx.commit();
			
			if(users!=null&&users.size()>0) {
				Customer user=users.get(0);
				//System.out.println("Address number"+user.getAddressNumber());
				request.getSession().setAttribute("userId", username);
				request.getSession().setAttribute("addressNum", user.getAddressNumber());
				request.getSession().setAttribute("userObj", user);
				if(user.getMileageNotification()!=null)
				request.getSession().setAttribute("mileageNotification", user.getMileageNotification());
				
				tx = session.beginTransaction();
				Query myleaseQuery = session.createQuery("from MyLease where addressNum='"+user.getAddressNumber()+"' and rownum<2 ");
				List<MyLease> leaseList=myleaseQuery.list();
				if(leaseList!=null&&leaseList.size()>0) {
					MyLease lease=leaseList.get(0);
					request.getSession().setAttribute("myleaseObj", lease);
				}
				tx.commit();
				
				myLeaseDao.setGpsUrl(request);
				session.close();
				logger.info("Exiting successfully authenticateUser method::");	
				return true ;
			}else {
				session.close();
				logger.info("Exiting successfully authenticateUser method::");	
				return false ;
			}
			
		
		}catch(Exception e){
			e.printStackTrace();
			logger.error("Exception in authenticateUser method:: "+ e);
			tx.rollback();
			session.close();
			
		}
		}else {
			logger.info("Exiting successfully authenticateUser method::");	
			return false ;
			
		}
		
		// TODO Auto-generated method stub
		return false ;
	}

	
	@Override
	public JSONResponse changePassword(String currentPassword, String newPassword, HttpServletRequest request)
			throws Exception {
        logger.info("Entered changePassword method::");
		
		JSONResponse response=new JSONResponse("400","Login is failed");
		if(StringUtils.isNotBlank(currentPassword)&&StringUtils.isNotBlank(newPassword)) {
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		String username ="";
		if(request.getAttribute("userId")!=null) {
			username=(String)request.getAttribute("userId");
		}
		else {
			username=(String)request.getSession().getAttribute("userId");
		}
		System.out.println("username is "+username);
		
		try{
			Query query = session.createQuery("from  Customer  where customerLoginNo='"+username+"' and password='"+AESEncryption.encryptText(currentPassword)+"'");
			

			List<Customer> users = query.list();
			
			
			if(users!=null&&users.size()>0) {
				Customer user=users.get(0);
				user.setPassword(AESEncryption.encryptText(newPassword));
				session.save(user);
				tx.commit();
				session.close();
				response.setResponseCode("200");
				response.setMessage("Password Changed Successfully");
			}else {
				response.setResponseCode("402");
				response.setMessage("Password Mismatch");
			}
		logger.info("Exiting successfully change password method::");	
		}catch(Exception e){
			e.printStackTrace();
			logger.error("Exception in change password method:: "+ e);
			tx.rollback();
			session.close();
			
		}
		}else {
			response.setResponseCode("401");
			response.setMessage("Mandatory field is missing");
		}
		return response;
		// TODO Auto-generated method stub

	
	}


	@Override
	public Response authData(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	
		JsonObjectBuilder authDataBuilder = Json.createObjectBuilder();
		if(request.getSession().getAttribute("userObj")!=null) {
			authDataBuilder.add("isAuthenticated", true);
			Customer user= (Customer)request.getSession().getAttribute("userObj");
			MyLease mylease= (MyLease)request.getSession().getAttribute("myleaseObj");
			
			authDataBuilder.add("addressNum", user.getAddressNumber());
			authDataBuilder.add("addressline1", mylease.getAddressLine1()!=null?mylease.getAddressLine1():"");
			authDataBuilder.add("addressline2", mylease.getAddressLine2()!=null?mylease.getAddressLine2():"");
			authDataBuilder.add("addressline3", mylease.getAddressLine3()!=null?mylease.getAddressLine3():"");
			authDataBuilder.add("addressline5", mylease.getAddressLine5()!=null?mylease.getAddressLine5():"");
			authDataBuilder.add("contact", user.getContactName()!=null?user.getContactName():"");
			
			authDataBuilder.add("voyagerApplicable", user.getVoyagerApplicable()!=null?user.getVoyagerApplicable():"");
			authDataBuilder.add("GMMaintenance", user.getGmMaintenanceApplicable()!=null?user.getGmMaintenanceApplicable():"");
			authDataBuilder.add("billCodeGrouping", user.getBillCodeApplicable()!=null?user.getBillCodeApplicable():"");
			authDataBuilder.add("GPS", user.getGpsApplicable()!=null?user.getGpsApplicable():"");
			authDataBuilder.add("voyagerMaintApplicable", user.getVoyagerMaintenanceApplicable()!=null?user.getVoyagerMaintenanceApplicable():"");
			
			authDataBuilder.add("OACApplicable", user.getOACApplicable()!=null?user.getOACApplicable():"");
			
			String gpsURL= (String)request.getSession().getAttribute("gpsURL");
			authDataBuilder.add("gpsURL", gpsURL!=null?gpsURL:"");
			
		}else {
			authDataBuilder.add("isAuthenticated", false);
		}
		
		JsonObject authDataJsonObject = authDataBuilder.build();
		
		
		
		
		//System.out.println(authDataJsonObject);
		//System.out.println(authDataJsonObject.toString());
		return Response.ok(authDataJsonObject.toString(), MediaType.APPLICATION_JSON).build();
	}


	@Override
	public JSONResponse logoutCustomerPortalUser(HttpServletRequest request, HttpServletResponse response) {
		JSONResponse logoutResponse=new JSONResponse("400","Logout is failed");
		if(request.getSession().getAttribute("userObj")!=null) {
			request.getSession().removeAttribute("userId");
			request.getSession().removeAttribute("addressNum");
			request.getSession().removeAttribute("userObj");
			request.getSession().removeAttribute("myleaseObj");
			logoutResponse=new JSONResponse("200","Logout is successfully ");
		}

		//System.out.println(authDataJsonObject);
		//System.out.println(authDataJsonObject.toString());
		return logoutResponse;
	}


	@Override
	public Response adminAuthData(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	
		JsonObjectBuilder authDataBuilder = Json.createObjectBuilder();
		if(request.getSession().getAttribute("adminUserObj")!=null) {
			authDataBuilder.add("isAuthenticated", true);
			AdminUser adminUser= (AdminUser)request.getSession().getAttribute("adminUserObj");
			authDataBuilder.add("fname", adminUser.getFname());
			
		}else {
			authDataBuilder.add("isAuthenticated", false);
		}
		
		JsonObject authDataJsonObject = authDataBuilder.build();
		
		
		
		
		//System.out.println(authDataJsonObject);
		//System.out.println(authDataJsonObject.toString());
		return Response.ok(authDataJsonObject.toString(), MediaType.APPLICATION_JSON).build();
	}


	@Override
	public JSONResponse authenticateAdminUser(String username, String password, HttpServletRequest request) {
		// TODO Auto-generated method stub
		
		logger.info("Entered authenticateUser method::"+username+":: "+password);
		//from Customer where customerLoginNo like '"+customerLoginNo+"%' order by companyName
		JSONResponse response=new JSONResponse("400","Login is failed");
		if(StringUtils.isNotBlank(username)&&StringUtils.isNotBlank(password)) {
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try{
			Query query = session.createQuery("from AdminUser where userId='"+username+"' and password='"+AESEncryption.encryptText(password)+"'");
			
			

			List<AdminUser> adminUsers = query.list();
			tx.commit();
			
			if(adminUsers!=null&&adminUsers.size()>0) {
				AdminUser user=adminUsers.get(0);
				request.getSession().setAttribute("adminUserObj", user);
				response.setResponseCode("200");
				response.setMessage("Login is successful");
			}
		session.close();	
		logger.info("Exiting successfully authenticateUser method::");	
		}catch(Exception e){
			e.printStackTrace();
			logger.error("Exception in authenticateUser method:: "+ e);
			tx.rollback();
			session.close();
			
		}
		}else {
			response.setResponseCode("401");
			response.setMessage("Mandatory field is missing");
		}
		return response;
		// TODO Auto-generated method stub
	}


	@Override
	public JSONResponse logoutAdminPortalUser(HttpServletRequest request, HttpServletResponse response) {		
	JSONResponse logoutResponse=new JSONResponse("400","Logout is failed");
	if(request.getSession().getAttribute("adminUserObj")!=null) {
		request.getSession().removeAttribute("adminUserObj");
		logoutResponse=new JSONResponse("200","Logout is successfully ");
	}

	return logoutResponse;
	}


	public JSONResponse forgotPassword(String username, HttpServletRequest request) {
		// TODO Auto-generated method stub
		
		logger.info("Entered forgotPassword method::"+username);
		//from Customer where customerLoginNo like '"+customerLoginNo+"%' order by companyName
		JSONResponse response=new JSONResponse();
		if(StringUtils.isNotBlank(username)) {
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try{
			Query query = session.createQuery("from Customer where customerLoginNo='"+username+"'");
			
			String randomPassword = RandomStringUtils.randomAlphanumeric(10);

			List<Customer> users = query.list();
			tx.commit();
			
			if(users!=null&&users.size()>0) {
				Customer user=users.get(0);
				String emailId=user.getEmailAddress();
				System.out.println("email id>>>>>>>>>>>>"+emailId);
				if(StringUtils.isNotEmpty(emailId)&&!"NA".equalsIgnoreCase(emailId)) {
				//System.out.println("Address number"+user.getAddressNumber());
				try {
		        Properties p = new Properties();
				p.setProperty("resource.loader", "class");
				p.setProperty("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
				Velocity.init( p ); 
				  /*  Get the Template  */
		        Template t = Velocity.getTemplate("velocity/template/ForgotPassword.vm" );
		        /*  create a context and add data */
		        VelocityContext context = new VelocityContext();
		        //Setting Vehicle Info
		        context.put("tempPassword", randomPassword);
		        context.put("customerName", user.getCompanyName());
		    
		        /* now render the template into a StringWriter */
		        StringWriter writer = new StringWriter();
		        t.merge( context, writer );
		        /* show the World */
		       //System.out.println(writer.toString()); 
				
				List toList=new ArrayList();
				toList.add(emailId);
				System.out.println("toList>>>>"+toList);
				
		        new SendMail().mail("no-reply@pcbapps.com",toList,"Notification",writer.toString(),"","","");
              
				user.setPassword(AESEncryption.encryptText(randomPassword));
				
				tx = session.beginTransaction();
				session.saveOrUpdate(user);
				
				tx.commit();
				response.setResponseCode("200");
				response.setMessage("Email is sent successfully");
				
				}catch(Exception e) {
					
				}
				}else {
					response.setResponseCode("401");
					response.setMessage("Primary email is not updated");
					myLeaseDao.setGpsUrl(request);
				}
				
				
				
				
			}else {
				response.setResponseCode("404");
				response.setMessage("user id is not found");
			}
		session.close();	
		logger.info("Exiting successfully forgotPassword method::");	
		}catch(Exception e){
			response.setResponseCode("500");
			response.setMessage("Internal Server Error");
			e.printStackTrace();
			logger.error("Exception in forgotPassword method:: "+ e);
			tx.rollback();
			session.close();
			
		}
		}else {
			response.setResponseCode("402");
			response.setMessage("Mandatory field is missing");
		}
		return response;
		// TODO Auto-generated method stub
	}

}
