package com.cams.usermgmt.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;

import com.cams.utils.JSONResponse;

public interface UserMgmtService {

	
		JSONResponse authenticateUser(String username,String password,HttpServletRequest request) throws Exception;
		JSONResponse changePassword(String currentPassword,String newPassword,HttpServletRequest request) throws Exception;
		Response authData(HttpServletRequest request, HttpServletResponse response);
		JSONResponse logoutCustomerPortalUser(HttpServletRequest request, HttpServletResponse response);
		Response adminAuthData(HttpServletRequest request, HttpServletResponse response);
		JSONResponse authenticateAdminUser(String username, String password, HttpServletRequest request);
		JSONResponse logoutAdminPortalUser(HttpServletRequest request, HttpServletResponse response);
		JSONResponse forgotPassword(String username, HttpServletRequest request);
		boolean setUserSession(String username, HttpServletRequest request);
	    JSONResponse isOACUser(String username,HttpServletRequest request) throws Exception;
		
}
