package com.TestCases.RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestCase1 {


	 @Test
	public void test01() {

		// Specify the base URL to the RESTful web service  
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET, "/Bangalore");

		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
	}

	//  @Test
	public void test02() {
		// Specify the base URL to the RESTful web service  
		RestAssured.baseURI = "http://services.groupkt.com/country/get/all";
		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET, "");

		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
	}

	//  @Test
	public void test03() {
		// Specify the base URL to the RESTful web service  
		RestAssured.baseURI = "http://services.groupkt.com/country/get";
		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET, "/name/Afghanistan");

		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
	}

	//  @Test
	public void test04() {
		// Specify the base URL to the RESTful web service  
		RestAssured.baseURI = "http://services.groupkt.com/country/get";
		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET, "/iso2code/IN");

		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
	}

	//  @Test
	public void test05() {
		// Specify the base URL to the RESTful web service  
		RestAssured.baseURI = "http://services.groupkt.com/country/get";
		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET, "/iso3code/IND");

		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
	}

	//  @Test
	public void test06() {
		// Specify the base URL to the RESTful web service  
		RestAssured.baseURI = "http://services.groupkt.com/country/get";
		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET, "/iso3code/XYZ");

		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
	}

	@Test
	public void test07() {
		// Specify the base URL to the RESTful web service  
		RestAssured.baseURI = "http://services.groupkt.com/country/search?text=un";
		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET,"");

		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
	}
	
	/*
	 *   http://services.groupkt.com/state/get/{countryCode}/all
	 *   http://services.groupkt.com/state/get/{countryCode}/all
	 *   http://services.groupkt.com/state/get/IND/UP 
	 *   http://services.groupkt.com/state/search/IND?text=pradesh
	 *   https://jsonplaceholder.typicode.com/users
	 *   https://jsonplaceholder.typicode.com/users/1
	 *   https://jsonplaceholder.typicode.com/posts
	 *   
	 *   
	 *   
	 */
	
	
	
	
	
	
	
	

}
