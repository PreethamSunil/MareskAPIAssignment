package com.maresk.testcases;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class TC001 extends Base{
	
	@BeforeClass
	public void SpacexConfig()
	{
	log.info("----TC001 API Validation test started for SPaceX Get Request API----");	
	RestAssured.baseURI = "https://api.spacexdata.com/v4/launches";
	httpRequest = RestAssured.given();
	httpRequest.header("content/type", "application/json; charset=UTF-8"); 
	httpResponse = httpRequest.request(Method.GET,"/latest");


	}
	
	@Test(priority = 1)
	public void ValidateStatus()
	{
		log.info("----TC002: Status Code Check----");	
		log.info("Step001: Validate Status Code Started");
		int statuscode = httpResponse.getStatusCode();
		Assert.assertEquals(statuscode, 200);
		log.info("----Status Code for SPaceX Get Request call is " + statuscode );
		log.info("Step001: Validate Status Code Completed");
	}
	
	@Test(priority = 2)
	public void ValidateResponce()
	{
		log.info("----TC002: Response Check----");	
		log.info("Step001: Validate Response is not null");
		String responcebody = httpResponse.getBody().asString();
		Assert.assertNotNull(responcebody, "Responce Body");
		log.info("----Responce Code for SPaceX Get Request call is " + responcebody );
		log.info("Step002: Validate response is Completed");
	}
	
	@Test (priority=3)
	public void Validateschema()
	{
		log.info("Step003: Validate Schema Started");
		httpResponse.then().body(matchesJsonSchemaInClasspath("targetschema.json")); 
		log.info(httpResponse.getBody().asString());
		log.info("Step003: Validate Schema Completed");
	}

}
