package apiEngine;

import io.restassured.response.Response;

public interface IRestResponse<Token>{
		public Token getBody();
		
		public String getContent();
		
		public int getStatusCode();
		
		public boolean isSuccessful();
		
		public String getStatusDescription();
		
		public Response getResponse();
		
		public Exception getException();
	}