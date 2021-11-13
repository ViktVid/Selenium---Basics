package seleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

	//	driver.get("https://www.google.com"); - Drugi nacin.
		
		driver.navigate().to("https://www.google.com"); // Ovo otvara prvo
/*		driver.navigate().to("https://www.youtube.com"); // Ovo otvara drugo
		
		Thread.sleep(3000);
		
		driver.navigate().back(); // Ovo vraca prethodni sajt(stranicu)
		
		driver.manage().window().maximize(); // Ovo ce maksimizovati prozor
		driver.navigate().forward();
		driver.navigate().back();
		
		Thread.sleep(3000); */

	//	driver.close();
		
	/*	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]")).sendKeys("IT Bootcamp");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]")).sendKeys(Keys.ENTER); 
		Nisam menjala path - tu je greska. */
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("IT Bootcamp");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")).sendKeys(Keys.ENTER);
		
	}
	
	

}
