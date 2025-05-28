package ejerciciosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSuccessful {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement signInBtn = driver.findElement(By.xpath("//button[text()='Sign In']"));

        username.sendKeys("esmeralda");
        password.sendKeys("rahulshettyacademy");

        signInBtn.click();
        Thread.sleep(3000);

        WebElement message = driver.findElement(By.xpath("//p"));
        System.out.println(message.getText());

        driver.quit();
    }
}
