package seleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class KatalonShop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://cms.demo.katalon.com/");

		WebElement patientNinja = driver.findElement(By.cssSelector(".product.type-product.post-66.status-publish.last.instock.product_cat-clothing.product_cat-hoodies.has-post-thumbnail.taxable.shipping-taxable.purchasable.product-type-simple"));
		patientNinja.click();

		WebElement submitButton = driver.findElement(By.name("add-to-cart"));
		submitButton.click();

		//Los primer provere korpe
		WebElement notification = driver.findElement(By.className("woocommerce-message"));
		String message = notification.getText();
		notification.isDisplayed();
		//Los primer provere korpe


		WebElement cartButton = driver.findElement(By.cssSelector(".page_item.page-item-8"));
		cartButton.click();
		WebElement productName = driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[3]/a"));
		String ime = productName.getText();

		Assert.assertEquals("Patient Ninja", ime);
	}

}
