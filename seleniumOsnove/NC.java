package seleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class NC {
		
	 WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	    	
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	    }

	    @BeforeMethod
	    public void driverSetUp() {
	        driver.manage().window().maximize();
	    }
	    
	    @Test (priority = 10)
	    public void positiveLogInTest() throws InterruptedException {
	    	
	    	driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
	    	
	    	WebElement username = driver.findElement(By.id("username"));
	    	username.clear();
	    	username.sendKeys("student");
	    	
	    	WebElement password = driver.findElement(By.id("password"));
	    	password.clear();
	    	password.sendKeys("Password123");
	    	
	    	WebElement submit = driver.findElement(By.id("submit"));
	    	submit.click();
	    	
	    	Thread.sleep(500);
	    	driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[1]"));
	    	WebElement header = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[1]/h1"));
	    	header.getText();
	    	
	    	Assert.assertEquals("Logged In Successfully", header);
	    	Thread.sleep(500);
	    	driver.findElement(By.id("//*[@id=\"loop-container\"]/div/article/div[2]/div"));
	    	WebElement button = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div"));
	    	button.getText();
	    	
	    	Assert.assertEquals("Log out", button); 
	    	
	    	button.click();
	    
	}
	    @Test (priority = 20)
	    public void negativeUsernameTest() {
	    	
	    	driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
	    	
	    	WebElement username = driver.findElement(By.id("username"));
	    	username.clear();
	    	username.sendKeys("incorrectUser");
	    	
	    	WebElement password = driver.findElement(By.id("password"));
	    	password.clear();
	    	password.sendKeys("Password123");
	    	
	    	WebElement submit = driver.findElement(By.id("submit"));
	    	submit.click();
	    	
	    	WebElement error = driver.findElement(By.id("error"));
	    	error.getText();
	    	
	    	Assert.assertEquals(error, "Your username is invalid!");
	    	
	    }

}
