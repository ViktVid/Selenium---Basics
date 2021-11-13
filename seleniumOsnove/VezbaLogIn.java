package seleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class VezbaLogIn {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://the-internet.herokuapp.com/login");
		
		driver.findElement(By.xpath("//*[@id=\"login\"]/div[1]"));
		WebElement username = driver.findElement(By.id("username"));
		username.click();

		username.sendKeys("tomsmith");
				
		driver.findElement(By.xpath("//*[@id=\"login\"]/div[2]/div"));
		WebElement password = driver.findElement(By.id("password"));
		password.click();
		password.sendKeys("SuperSecretPassword!");
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]/button/i"));
		login.click();
		
//		WebElement body = driver.findElement(By.xpath("/html/body/div[1]"));
//		WebElement body1 = driver.findElement(By.id("flash-messages"));
//		WebElement flash = driver.findElement(By.id("flash"));

//		String title = flash.getText();
//		String expectedTitle = " You logged into a secure area!";
		
        
		WebElement logout = driver.findElement(By.xpath("//*[@id=\"content\"]/div/a"));
		
		String title = logout.getText();
		String expectedTitle = "Logout";
		
		Assert.assertEquals(title,expectedTitle);
		
		if (logout.isDisplayed()) {
			System.out.println("Ulogovani ste.");
		} else {
			System.out.println("Niste ulogovani.");
		}
		
		logout.click();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
