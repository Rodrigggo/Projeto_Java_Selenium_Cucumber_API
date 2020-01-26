package StepsDefinition;


import java.io.UnsupportedEncodingException;

import org.openqa.selenium.chrome.ChromeDriver;

import Actions.RealizarConsultaVagasActions;
import Actions.SwApiActions;
import Reports.Report;
import Utils.WebDriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;


public class GetApiSwApiStep {
	
	
	String nomeCenario;
	Report report; 
	SwApiActions swApiActions;
	ChromeDriver driver;

	@Before("@StartFeatureGetApi")
	public void before() {
		System.out.println("Iniciando o cenario...");		
		report = new Report();
		swApiActions = new SwApiActions();
	}
	
	@After("@FinishFeatureGetApi")
	public void tearDown() throws Exception {
		System.out.println("Finalizando o cenario....\n");
		report.createReportDoc();

	}
	
	@Given("^Eu realizo um GET para \"([^\"]*)\"$")
	public void eu_realizo_um_GET_para(String endPoint) {		
		swApiActions.getApiSWapi(endPoint);			
	}

	@Then("^codigo de resposta deve ser (\\d+)$")
	public void codigo_de_resposta_deve_ser(int codigo)  {
		swApiActions.validarCodeApiSWapi(codigo);
	}

	@When("^resposta deve conter os titulos com o \"([^\"]*)\" e \"([^\"]*)\"$")
	public void resposta_deve_conter_os_titulos_com_o_e(String diretor, String produtor)  {
		swApiActions.validarResponseApiSWapi(diretor, produtor);
	}
	
}
