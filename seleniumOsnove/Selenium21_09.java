package seleniumOsnove;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium21_09 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Komanda za otvaranje tabova:
		js.executeScript("window.open()");
		js.executeScript("window.open()");
		js.executeScript("window.open()");
		js.executeScript("window.open()");

		Thread.sleep(2000);
		
		driver.navigate().to("http://www.youtube.com");
		
		//driver.getWindowHandles();
		
		//Kreiranje liste svih otvorenih tabova:
		ArrayList<String> listaTabova = new ArrayList<String> (driver.getWindowHandles());
		
		//Prebacivanje na tab sa indexom 2:
		driver.switchTo().window(listaTabova.get(2));
		
		
	}
}
