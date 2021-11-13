package seleniumOsnove;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak21_09 {

	public static void main(String[] args) throws InterruptedException {

/* Zadatak 1) Pokrenuti program koji ce otvoriti 4 taba, na svakom tabu otici na neku web stranicu.
 * Nakon toga redom zatvarati svaki tab.
 * Napraviti thread sleep od 2 sekunde izmedju zatvaranja svakog taba. */

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.open()");
		jse.executeScript("window.open()");
		jse.executeScript("window.open()");		
		jse.executeScript("window.open()");		
		
		driver.getWindowHandles();
		ArrayList<String> listaTabova = new ArrayList<String> (driver.getWindowHandles());
		
		driver.switchTo().window(listaTabova.get(0)).navigate().to("http://www.google.com");
		driver.switchTo().window(listaTabova.get(1)).navigate().to("http://www.youtube.com");
		driver.switchTo().window(listaTabova.get(2)).navigate().to("http://www.linkedin.com");
		driver.switchTo().window(listaTabova.get(3)).navigate().to("http://www.gmail.com");
		driver.switchTo().window(listaTabova.get(4)).navigate().to("http://www.facebook.com");
		
		Thread.sleep(2000);
		
		driver.switchTo().window(listaTabova.get(1)).close();
		Thread.sleep(2000);
		
		driver.switchTo().window(listaTabova.get(2)).close();
		Thread.sleep(2000);
		
		driver.switchTo().window(listaTabova.get(3)).close();
		Thread.sleep(2000);
		
		driver.switchTo().window(listaTabova.get(4)).close();
		Thread.sleep(2000);
		
		driver.switchTo().window(listaTabova.get(0)).close();
	}

}
