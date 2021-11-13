package seleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meme {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://imgflip.com/memegenerator");
		WebElement continueButton = driver.findElement(By.id("mm-show-upload"));
		continueButton.click();
		
		driver.findElement(By.xpath("/html/body/div[7]"));
		driver.findElement(By.id("mm-upload"));
		
	//	WebElement continueButton1 = driver.findElement(By.id("mm-show-upload-file-btn"));
	//	continueButton1.click();
		
//		WebElement continueButton2 = driver.findElement(By.id("//*[@id=\"mm-upload-file-btn\"]"));
//		continueButton2.click();
				
		WebElement continueButton2 = driver.findElement(By.xpath("//*[@id=\"mm-upload-file-btn\"]"));
		continueButton2.click();	
		
		WebElement continueButton3 = driver.findElement(By.id("mm-upload-file"));
		continueButton3.sendKeys("C:\\Users\\User\\Desktop\\Study-material-70-gb-meme-796");
		
		WebElement continueButton4 = driver.findElement(By.xpath("mm-upload-btn"));
		continueButton4.click();
	}

}
