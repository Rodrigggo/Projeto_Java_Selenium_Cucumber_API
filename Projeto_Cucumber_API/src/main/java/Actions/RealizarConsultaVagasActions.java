package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjects.GupyIoPageObject;
import PageObjects.HomePageObject;
import Reports.Report;
import Utils.SeleniumUtils;

public class RealizarConsultaVagasActions extends SeleniumUtils{
	
	ChromeDriver driver;
	Report report;
	SeleniumUtils seleniumUtils;

	/**
	 * - Construtor da Class.
	 */
	public RealizarConsultaVagasActions(ChromeDriver driver, Report report) {
		this.driver = driver;
		this.report = report;
	}

	public void acessaSite(String site) throws InterruptedException {
		openURL(driver, site);
		report.capturarText("Site acessado com sucesso");
		report.capturar();
	}
	
	public void acessaTelaConsultarVagas() throws InterruptedException {
		
		click(driver, HomePageObject.link_carreiras,20);
		Thread.sleep(2000);
		report.capturarText("Buscando botao de consultar vagas");
		report.capturar();
		click(driver, HomePageObject.button_confira_vagas,20);
	}
	
	public void realizarConsulta(String departamento, String estado) throws InterruptedException {			
		Thread.sleep(1000);
		selectElementVisibleText(driver, GupyIoPageObject.selectDepartamento,departamento);
		selectElementVisibleText(driver, GupyIoPageObject.selectEstado,estado);
		Thread.sleep(1000);
		report.capturarText("Consulta de vaga realizada com sucesso");
		report.capturar();
	

	}

}
