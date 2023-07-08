package com.serverest.api.token;

import static org.junit.Assert.assertEquals;
import org.apache.commons.lang3.RandomStringUtils;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Token {
	
	private Response response;
	String url = "https://serverest.dev";
	
	public String requestBodyUsuario(String email) {
		return "{\r\n"
				+ "  \"nome\": \"Fulano da Silva\",\r\n"
				+ "  \"email\": \""+email+"\",\r\n"
				+ "  \"password\": \"teste\",\r\n"
				+ "  \"administrador\": \"true\"\r\n"
				+ "}";
	}
	
	public String emailRandom() {
		String caracteresPermitidos = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "_-.";
		String temp = RandomStringUtils.random(10, caracteresPermitidos);
		String email = temp + "@hotmail.com";
		return email;	
	}
	
	public String requestBodyLogin(String email) {
		return "{\r\n" + "  \"email\": \"" + email + "\",\r\n" + "  \"password\": \"teste\"\r\n" + "}";
	}
	public String retornaToken() {
		// aqui ele vai criar um usuário
		String emailRandom = emailRandom();
		response = RestAssured.given().contentType(ContentType.JSON).body(requestBodyUsuario(emailRandom))
				.post(url + "/usuarios");
		
		assertEquals(201, response.statusCode());
		assertEquals("Cadastro realizado com sucesso", response.jsonPath().getString("message"));

		// aqui será feito o login
		response = RestAssured.given().contentType(ContentType.JSON).body(requestBodyLogin(emailRandom))
				.post(url + "/login");
		
		assertEquals(200, response.statusCode());
		assertEquals("Login realizado com sucesso", response.jsonPath().getString("message"));

		
		return response.jsonPath().getString("authorization");
	}
}
