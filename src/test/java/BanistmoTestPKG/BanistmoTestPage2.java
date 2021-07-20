package BanistmoTestPKG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BanistmoTestPage2 {
	
	@Test
	public static void BanistmoPage() {
		System.setProperty("webdriver.gecko.driver","C:/Users/DEV-02/eclipse-workspace/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 60);

		String url = "https://www.banistmo.com/wps/portal/banistmo/personas";

		driver.get(url);

		WebElement PYS = driver.findElement(By.xpath("//a[@href='#']"));
		PYS.click();
		
		WebElement P = driver.findElement(By.xpath("//a[@href='/wps/portal/banistmo/personas/productos-y-servicios/tarjetas-credito/']"));
		P.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/wps/wcm/connect/www.banistmo.com11237/dcdc59c8-34db-4935-a2b5-20bd9eedd63f/Banistmo+Contrato+TDC+%28VJul18%29.pdf?MOD=AJPERES&CVID=m.JehZY']")));
		WebElement TC = driver.findElement(By.xpath("//a[@href='/wps/wcm/connect/www.banistmo.com11237/dcdc59c8-34db-4935-a2b5-20bd9eedd63f/Banistmo+Contrato+TDC+%28VJul18%29.pdf?MOD=AJPERES&CVID=m.JehZY']"));
		TC.click();
		
	}
}