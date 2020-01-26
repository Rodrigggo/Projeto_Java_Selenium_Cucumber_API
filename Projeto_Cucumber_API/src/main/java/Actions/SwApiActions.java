package Actions;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import Reports.Report;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.internal.assertion.Assertion;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class SwApiActions {

    Response response;
    
	public void getApiSWapi(String endPoint) {		
		RequestSpecification httpRequest = RestAssured.given();
	    response = httpRequest.request(Method.GET, endPoint);		
	}
	
	public void validarCodeApiSWapi(int codigo) {
		
		int statusCode = response.getStatusCode();
		System.out.println("Status code is: " + statusCode);
		
		if (statusCode != codigo) {			
			Assert.fail("retorno do code divergente");	
		}else {			
			System.out.println("Code validado com sucesso");			
		}

	}

	public void validarResponseApiSWapi(String nomeDiretor, String nomeProdutor) {


		String responseBody = response.getBody().asString();
		System.out.println("Response Body is: " + responseBody);

		JsonPath jp = new JsonPath(responseBody);

		List<String> valuesToTitle = jp.getList("results.title");
		List<String> valuesToDirector = jp.getList("results.director");
		List<String> valuesToProducer = jp.getList("results.producer");

		int cont = 0;
		for (String valueT : valuesToTitle) {
			if ((valuesToDirector.get(cont).contains(nomeDiretor))
					&& (valuesToProducer.get(cont).contains(nomeProdutor))) {
				System.out.println("Title: " + valueT);
			}
			cont++;
		}

	}


}
