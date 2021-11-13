package seleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

import org.openqa.selenium.*;

public class ZadatakPrvi {

	public static void main(String[] args) {

/* Otici na stranicu Google, povecati ekran, odraditi refresh stranice,
otici na YouTube, odraditi opet refresh i vratiti se nazad na Google. */
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		
/*		d.navigate().to("https://www.google.com");
		d.manage().window().maximize();
		d.navigate().refresh();
		d.navigate().to("https://www.youtube.com");
		d.navigate().refresh();
		d.navigate().back(); */
		
/* Drugi zadatak
 Napraviti program koji otvara clanak o Nikoli Tesli na Wikipediji
 */
		d.navigate().to("https://en.wikipedia.org/wiki/Main_Page");
		
		d.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Nikola Tesla");
		d.findElement(By.xpath("//*[@id=\"searchButton\"]")).sendKeys(Keys.ENTER); 
			
		WebElement naslov = d.findElement(By.id("firstHeading"));
		naslov.click();
		String title = naslov.getText();
		String expectedTitle = "Nikola Tesla";
		
		Assert.assertEquals(title,expectedTitle);
		

	}

}
