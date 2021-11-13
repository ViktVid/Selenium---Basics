package seleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wordpress {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://wordpress.com/read");

		WebElement loginField = driver.findElement(By.id("usernameOrEmail"));
		loginField.sendKeys("videnovicviktoria@gmail.com");
		WebElement continueButton = driver.findElement(By.cssSelector(".button.form-button.is-primary"));
		continueButton.click();
		
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("Za svrhu testiranja.");
		continueButton.click();
		Thread.sleep(5000);
		
		driver.manage().deleteCookieNamed("wordpress_logged_in");
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

}
