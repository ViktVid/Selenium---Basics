package seleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class PrintLogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/login");

		HappyPathForgotPassword hpfp = new HappyPathForgotPassword("tomsmith", "SuperSecretPassword!");

		driver.findElement(By.xpath("//*[@id=\"login\"]/div[1]"));
		System.out.println("USERNAME: " + HappyPathForgotPassword.getUsername());
		String username = HappyPathForgotPassword.getUsername();
		driver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"login\"]/div[2]/div"));
		System.out.println("Unesite PASSWORD.");
		String password = HappyPathForgotPassword.getPassword();
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"login\"]/button"));
		driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();

		hpfp.stampanje();
		WebElement logout = driver.findElement(By.xpath("//*[@id=\"content\"]/div/a"));

		String title = logout.getText();
		String expectedTitle = "Logout";

		Assert.assertEquals(title, expectedTitle);

		if (logout.isDisplayed()) {
			System.out.println("Ulogovani ste.");
		} else {
			System.out.println("Niste ulogovani.");
		}

		logout.click();

		Thread.sleep(2000);

		WebElement login = driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in"));

		if (login.isDisplayed()) {
			System.out.println("Izlogovani ste.");
		} else {
			System.out.println("Niste izlogovani.");
		}

		driver.close();

	}

}