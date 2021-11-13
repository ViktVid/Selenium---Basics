package seleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IskljucitiPopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://www.ctshop.rs/");
		WebDriverWait wdwait = new WebDriverWait(driver, 10);

		wdwait.until(ExpectedConditions.elementToBeClickable(
				By.cssSelector(".soundest-form-background-image-content-inner.soundest-form-background-image")));
		WebElement popup = driver.findElement(
				By.cssSelector(".soundest-form-background-image-content-inner.soundest-form-background-image"));
		if (popup.isDisplayed()) {
			System.out.println("Popup je prikazan");
		} else {
			System.out.println("Popup nije prikazan");
		}

		WebElement popupClose = driver.findElement(By.className("soundest-form-background-image-close"));
		popupClose.click();

		wdwait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(
				".soundest-form-background-image.soundest-form-present.soundest-form-background-image-hidden")));
		WebElement popup1 = driver.findElement(By.cssSelector(
				".soundest-form-background-image.soundest-form-present.soundest-form-background-image-hidden"));
		if (popup1.isEnabled()) {
			System.out.println("Popup nije prikazan");
		} else {
			System.out.println("Popup je prikazan");
		}
	}
}