package com.demo.APItests;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiStart {

	@Test
	public static void test_get() {
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(res.asPrettyString());
	}

	@Test
	public static void test_getById() {
		Response re = RestAssured.get("https://reqres.in/api/users/8");
		System.out.println(re.asPrettyString());
	}

	@Test
	public static void test_getByInvalidId() {
		Response ivid = RestAssured.get("https://reqres.in/api/users/23");
		System.out.println(ivid.asPrettyString());
		System.out.println(ivid.statusCode());
	}

	@Test
	public static void test_getByList() {
		Response list = RestAssured.get("https://reqres.in/api/unknown");
		System.out.println(list.asPrettyString());
	}

	@Test
	public static void test_getListById() {
		Response list = RestAssured.get("https://reqres.in/api/unknown/3");
		System.out.println(list.asPrettyString());
	}

	@Test
	public static void test_ListByInvalidId() {
		Response inlist = RestAssured.get("https://reqres.in/api/unknown/23");
		System.out.println(inlist.asPrettyString());
		System.out.println(inlist.statusCode());
	}
}