package seleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to(
				"https://www.amazon.com/Selenium-Framework-Design-Data-Driven-Testing/dp/1788473574/ref=sr_1_2?dchild=1&keywords=selenium+test&qid=1631829742&sr=8-2");
		driver.findElement(By.xpath("//*[@id=\"submit.add-to-cart\"]"));
		WebElement continueButton = driver.findElement(By.id("add-to-cart-button"));
		continueButton.click();
		driver.navigate().refresh();
		
		driver.manage().deleteCookieNamed("session-id");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		driver.close();
		
		
		boolean empty = true;
		
		if (empty) {
			System.out.println("Your Amazon Cart is empty.");
		} else { System.out.println("The cart is not empty.");
		
		} 
		
	}

}
