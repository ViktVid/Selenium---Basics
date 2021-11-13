package seleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTestAutomation {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver pta = new ChromeDriver();

		pta.navigate().to("https://practicetestautomation.com/");
		
		pta.findElement(By.id("menu-primary-items"));
		WebElement practice = pta.findElement(By.id("menu-item-20"));
		practice.click();
		Thread.sleep(2000);
		
		WebElement testLoginPage = pta.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[1]/div[1]/p/a"));

		testLoginPage.click();
		Thread.sleep(2000);

		pta.findElement(By.id("username"));
		WebElement username = pta.findElement(By.id("username"));
		
		username.click();
		username.clear();
		username.click();

		username.sendKeys("student");
		
		pta.findElement(By.id("password"));
		WebElement password = pta.findElement(By.id("password"));
		password.click();
		password.clear();
		password.click();

		password.sendKeys("Password123");
		Thread.sleep(2000);
		
		pta.findElement(By.id("submit"));
		WebElement submit = pta.findElement(By.id("submit"));
		submit.click();
		Thread.sleep(2000);
		
		pta.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a"));
		WebElement logOut = pta.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a"));
		logOut.click();
		Thread.sleep(2000);
		
		pta.close();
		
	}

}
