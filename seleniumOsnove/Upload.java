package seleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// import junit.framework.Assert;

public class Upload {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/form"));
		
		WebElement upload = driver.findElement(By.id("file-upload"));
		Thread.sleep(3000);
		upload.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg");
		
		WebElement submit = driver.findElement(By.id("file-submit"));
		submit.click();
		
		WebElement provera = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3"));
		provera.getText();
		
		if (provera.isDisplayed()) {
			System.out.println("Uploaded!");
		} else {
			System.out.println("Internal Server Error");
		}
		
		driver.close();
		
/*		WebElement content = driver.findElement(By.id("content"));
		String tekst = content.getText();
		String text = "File Uploaded!";
		
		Assert.assertEquals(text, tekst); */
		
		
	}

}
