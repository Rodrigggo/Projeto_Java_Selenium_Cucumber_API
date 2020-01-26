package Utils;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {

	public static void openURL(WebDriver driver, String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void selectElementVisibleText(WebDriver driver, By by, String Name) {

		WebElement element = driver.findElement(by);
		Select selectitem = new Select(element);
		selectitem.selectByVisibleText(Name);

	}

	public static void scrollToElement(WebDriver driver, WebElement Element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// WebElement Element = driver.findElement(a_usuario_login);
		js.executeScript("arguments[0].scrollIntoView();", Element);

	}

	public static void click(WebDriver driver, By by, int timeout) {
			try {
				WebElement element = (new WebDriverWait(driver, timeout)).until(ExpectedConditions.elementToBeClickable(by));
				Actions actions = new Actions(driver);
				WebElement mainMenu = element;
				actions.moveToElement(mainMenu).build().perform();
				element.click();
				return;
			} catch (Exception e) {
				Assert.fail("Erro na acao de click" + e.getMessage());
			}
	}


	public static void sendKeys(ChromeDriver driver, WebElement webElement, int timeout, String valor) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(webElement));
		wait.until(ExpectedConditions.elementToBeClickable(webElement));
		Actions actions = new Actions(driver);
		actions.moveToElement(webElement).build().perform();
		webElement.click();
		webElement.sendKeys(valor.trim());
	}

}
