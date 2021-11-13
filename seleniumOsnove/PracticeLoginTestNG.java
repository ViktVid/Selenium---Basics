package seleniumOsnove;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeLoginTestNG {

    WebDriver driver;
    WebDriverWait wdwait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, 10);
    }

    @BeforeMethod
    public void driverSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");

    }

    @Test
    public void successfulLogIn() {
        WebElement username = driver.findElement(By.id("username"));
        username.clear();
        username.sendKeys("student");
        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys("Password123");
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        WebElement logOutButton = driver.findElement(By.cssSelector(".wp-block-button__link.has-text-color.has-background.has-very-dark-gray-background-color"));
        WebElement logInNotification = driver.findElement(By.className("has-text-align-center"));
        Assert.assertTrue(logOutButton.isDisplayed());
        Assert.assertTrue(logInNotification.isDisplayed());
        //Primarna provera je da li je prisutno dugme Log Out jer je ono prisutno samo kada sam uspesno ulogovan
        //Sekundarna provera je da li je prisutna poruka da sam se uspesno ulogovao

    }

    @Test
    public void unsuccessfulLogInWithWrongUsername() throws InterruptedException {
        WebElement username = driver.findElement(By.id("username"));
        username.clear();
        username.sendKeys("incorrectUser");
        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys("Password123");
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("error")));
        WebElement errorNotification = driver.findElement(By.id("error"));
        Assert.assertTrue(errorNotification.isDisplayed());
        try {
            WebElement logOutButton = driver.findElement(By.cssSelector(".wp-block-button__link.has-text-color.has-background.has-very-dark-gray-background-color"));
            Assert.assertFalse(logOutButton.isDisplayed());
            //U ovom bloku program proverava da li je element prisutan, ako jeste onda radi Assert, ako nije onda ga preskace
            //Moze se proveriti tako sto se unese ispravan username, tada ce program da padne jer ce naci element ali nece biti false
        } catch (org.openqa.selenium.NoSuchElementException e) {

        }

    }

    @Test
    public void unsuccessfulLogInWithWrongPassword() throws InterruptedException {
        WebElement username = driver.findElement(By.id("username"));
        username.clear();
        username.sendKeys("student");
        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys("wrongPassword");
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("error")));
        WebElement errorNotification = driver.findElement(By.id("error"));
        Assert.assertTrue(errorNotification.isDisplayed());
        try {
            WebElement logOutButton = driver.findElement(By.cssSelector(".wp-block-button__link.has-text-color.has-background.has-very-dark-gray-background-color"));
            Assert.assertFalse(logOutButton.isDisplayed());
            //U ovom bloku program proverava da li je element prisutan, ako jeste onda radi Assert, ako nije onda ga preskace
            //Moze se proveriti tako sto se unese ispravan password, tada ce program da padne jer ce naci element ali nece biti false
        } catch (org.openqa.selenium.NoSuchElementException e) {

        }

    }

    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }

}