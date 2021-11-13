package seleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Vezba21_09 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

/*
Zadatak 3) Otici na sajt demoqa, kliknuti na Elements, kliknuti na Text Box, popuniti podatke i kliknuti na Submit.
Sa leve strane kliknuti na Checkbox. Cekirati samo "Desktop" i utvrditi da je samo taj checkbox cekira.
Kliknuti na Radio Button sa leve strane, kliknuti na "Yes" pa na "Impressive" i utvrditi da se radio button promenio. */		
		
		driver.navigate().to("https://demoqa.com/");
		driver.manage().window().maximize();
		
		WebElement card = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
		card.click();
		
		WebElement textBox = driver.findElement(By.id("item-0"));
		textBox.click();
		
		Thread.sleep(500);
		driver.findElement(By.id("userForm"));
		WebElement username = driver.findElement(By.id("userName"));
		username.sendKeys("ViktVid");
		
		Thread.sleep(500);
		WebElement useremail = driver.findElement(By.id("userEmail"));
		useremail.sendKeys("viktvid@gmail.com");
		
		Thread.sleep(500);
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		currentAddress.sendKeys("Current Address");
		
		Thread.sleep(500);
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
		permanentAddress.sendKeys("Permanent Address"); 
		
		
		WebElement element = driver.findElement(By.id("submit"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(500);
		WebElement checkBox = driver.findElement(By.id("item-1"));
		checkBox.click();
		
		Thread.sleep(500);
		WebElement homeLine = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]"));
		homeLine.click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div"));
		
		
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button")).click();
		
		Thread.sleep(500);
		WebElement desktop = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[3]"));
		desktop.click();
		
		Thread.sleep(500);
		WebElement text = driver.findElement(By.xpath("//*[@id=\"result\"]/span[1]"));
		Thread.sleep(500);
		text.getText();
		String expectedText = "You have selected :\r\n" + 
				"desktop\r\n" + 
				"notes\r\n" + 
				"commands\r\n" + 
				"";
		
		if(text.equals(expectedText)) {
			System.out.println("Desktop je cekiran.");
		} else {
			System.out.println("Desktop nije cekiran.");
		}
		
		Thread.sleep(500);
		WebElement radioButton = driver.findElement(By.id("item-2"));
		radioButton.click();
		
		Thread.sleep(1000);
		WebElement yes = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[2]"));
		yes.click();
		
		Thread.sleep(1000);
		driver.findElement(By.className("mt-3"));
		Thread.sleep(500);
		WebElement izbor = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/p"));
		izbor.getText();
		
		Thread.sleep(1000);
		WebElement impressive = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/label"));
		impressive.click();
		
		Thread.sleep(1000);	
		driver.findElement(By.className("mt-3"));
		Thread.sleep(500);
		WebElement izbor2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/p"));
		izbor2.getText();
		
		Thread.sleep(1000);
		if (izbor.equals(izbor2)) {
			System.out.println("Radio Button se nije promenio");
		} else {
			System.out.println("Radio Button se jeste promenio.");
		} 
	}

}
