package StepsDefinition;


import java.io.UnsupportedEncodingException;

import org.openqa.selenium.chrome.ChromeDriver;

import Actions.RealizarConsultaVagasActions;
import Reports.Report;
import Utils.WebDriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;


public class ConsultarVagasStep {
	
	
	String nomeCenario;
	Report report; 
	RealizarConsultaVagasActions realizarConsultaVagasActions;
	ChromeDriver driver;

	@Before("@StartFeatureConsultarVagas")
	public void before() {
		System.out.println("Iniciando o cenario vagas...");		
		WebDriverManager webDriverManager = new WebDriverManager();
	    driver = webDriverManager.getDriver();
		report = new Report();
		realizarConsultaVagasActions = new RealizarConsultaVagasActions(driver, report);
	}
	
	@After("@FinishFeatureConsultarVagas")
	public void tearDown() throws Exception {
		System.out.println("Finalizando o cenario....\n");
		report.createReportDoc();
		driver.close();

	}
	
	@Given("^Acessar o site \"([^\"]*)\"$")
	public void acessar_o_site(String site) throws InterruptedException {		
		realizarConsultaVagasActions.acessaSite(site);	 
	}
		

	@When("^Acessar a pagina confira nossas vagas$")
	public void acessar_a_pagina_confira_nossas_vagas() throws InterruptedException  {
		realizarConsultaVagasActions.acessaTelaConsultarVagas();
	}
	
	

	@Then("^Realizar uma consulta no departamento \"([^\"]*)\" para o estado \"([^\"]*)\"$")
	public void realizar_uma_consulta_no_departamento_para_o_estado(String departamento, String estado) throws InterruptedException, UnsupportedEncodingException  {

		realizarConsultaVagasActions.realizarConsulta(departamento,estado);

	}

}
