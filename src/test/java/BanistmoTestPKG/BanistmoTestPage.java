package BanistmoTestPKG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BanistmoTestPage {
	
	@Test
	public static void BanistmoPage() {
		System.setProperty("webdriver.gecko.driver","C:/Users/DEV-02/eclipse-workspace/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 60);

		String url = "https://www.banistmo.com/wps/portal/banistmo/personas";

		driver.get(url);

		WebElement PYS = driver.findElement(By.xpath("//a[@href='#']"));
		PYS.click();
		
		WebElement P = driver.findElement(By.xpath("//a[@href='/wps/portal/banistmo/personas/productos-y-servicios/prestamos/']"));
		P.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/wps/portal/banistmo/personas/productos-y-servicios/prestamos/prestamos-de-auto/']")));
		WebElement PA = driver.findElement(By.xpath("//a[@href='/wps/portal/banistmo/personas/productos-y-servicios/prestamos/prestamos-de-auto/']"));
		PA.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#tab4']")));
		WebElement TYT = driver.findElement(By.xpath("//a[@href='#tab4']"));
		TYT.click();
		
		WebElement Ph = driver.findElement(By.xpath("//a[@href='/wps/wcm/connect/www.banistmo.com11237/7b900517-9baa-4eac-aa23-3adeb561600e/ProhibicionesSuperIntendenciaDeBancosSIB.pdf?MOD=AJPERES&CVID=lPXjRcF']"));
		Ph.click();
	}
}
