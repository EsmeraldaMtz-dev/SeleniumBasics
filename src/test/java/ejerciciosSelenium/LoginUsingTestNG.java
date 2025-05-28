package ejerciciosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginUsingTestNG {
    @Test
    public void loginWithValidCredentials() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement signInBtn = driver.findElement(By.xpath("//button[text()='Sign In']"));

        username.sendKeys("esmeralda");
        password.sendKeys("rahulshettyacademy");

        signInBtn.click();
        //Thread.sleep(3000);
        //Explicit Wait
        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='logout-btn']")));
        WebElement message = driver.findElement(By.xpath("//h1"));
        System.out.println(message.getText());

        driver.quit();
    }

    @Test
    public void loginWithInvalidCredentials() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement signInBtn = driver.findElement(By.xpath("//button[text()='Sign In']"));

        username.sendKeys("esmeralda");
        password.sendKeys("test");

        signInBtn.click();
        //Thread.sleep(3000);

        WebElement message = driver.findElement(By.xpath("//p[@class='error']"));
        System.out.println(message.getText());

        driver.quit();
    }
}
