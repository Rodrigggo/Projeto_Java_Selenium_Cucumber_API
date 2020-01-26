package Actions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class main {

	public static void main(String[] args) throws IOException {


		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET, "http://swapi.co/api/films/");

		String responseBody = response.getBody().asString();
		System.out.println("Response Body is: " + responseBody);

		JsonPath jp = new JsonPath(responseBody);

		List<String> valuesToTitle = jp.getList("results.title");
		List<String> valuesToDirector = jp.getList("results.director");
		List<String> valuesToProducer = jp.getList("results.producer");

		int cont = 0;
		for (String valueT : valuesToTitle) {
			if ((valuesToDirector.get(cont).contains("George Lucas"))
					&& (valuesToProducer.get(cont).contains("Rick McCallum"))) {
				System.out.println("TEST " + valueT);
			}
			cont++;
		}

	}

}
