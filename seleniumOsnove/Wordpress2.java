package seleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wordpress2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://wordpress.com/read");
		driver.navigate().to("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
		
		Cookie loginCookie = new Cookie("wordpress_logged_in",
				"viktoriavidenovic%7C1726511178%7CNpd8geIcW9m3bkwOTRbdhB30wpAiZ0qygVuw3z9BEh0%7Cdaf6af22d79395df3aea195657e57f1e06b3402db4e7af63d89fa91c2a926d2a");
		
		driver.manage().addCookie(loginCookie);
		WebElement continueButton = driver.findElement(By.cssSelector("button"));
		continueButton.click();
	//	continueButton.clear();
		
		driver.manage().addCookie(loginCookie);
		driver.navigate().refresh();
	//	driver.close();
	}

}
