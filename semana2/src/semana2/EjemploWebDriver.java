package semana2;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EjemploWebDriver {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Metz\\workspace\\Semana2\\Drivers\\chromedriver");
		
		WebDriver driver = new ChromeDriver () ;
		driver.navigate().to("https//espanol.yahoo.com") ;
		//verificar que este la caja de busqueda
		if (driver.findElement(By.id("uh-search-box")).isDisplayed()) {
			System.out.println("verificacion 1 passed");
			
		}else{System.out.println("verificacion 1 failed");
		System.exit(-1);}  //con uno es sufieciente se pone casa que se necesita
		
		 driver.findElement(By.id("uh-search-box")).clear();   //limpiar mi search boc
		 driver.findElement(By.id("uh-search-box")).sendKeys("Selenium");  //type en search box selenium
		 
			
	
	
		
		
	}
}
