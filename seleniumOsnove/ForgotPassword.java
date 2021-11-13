package seleniumOsnove;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class ForgotPassword {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/login");

		Scanner scan = new Scanner(System.in);

		driver.findElement(By.xpath("//*[@id=\"login\"]/div[1]"));
		System.out.println("Unesite USERNAME: ");
		String username = scan.next();
		driver.findElement(By.id("username")).sendKeys(username);

		driver.findElement(By.xpath("//*[@id=\"login\"]/div[2]/div"));
		System.out.println("Unesite PASSWORD: ");
		String password = scan.next();
		driver.findElement(By.id("password")).sendKeys(password);

		driver.findElement(By.xpath("//*[@id=\"login\"]/button"));
		driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
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
		
		scan.close();
		driver.close();

	}

}
