package com.cams.utils;

public class JSONResponse {
	
	private String responseCode;
    private String message;
    
    public JSONResponse() {	
    }
    
    public JSONResponse(String responseCode,String message ) {
    	this.responseCode=responseCode;
    	this.message=message;
    }
	public String getResponseCode() {
			return responseCode;
    }

    public void setResponseCode(String responseCode) {
			this.responseCode = responseCode;
	}

	public String getMessage() {
			return message;
	}

	public void setMessage(String message) {
			this.message = message;
	}

}
