package ejerciciosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class LoginUsingTestNG {
    WebDriver driver;

    //Se usa before method y no before class porque las acciones de un test no deben depender del anterior
    //Y se pueden afectar el uno al otro así que hay que generar un nuevo Chrome Driver para cada test.
    @BeforeMethod
    public void declareDriver() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
    }

    @Test
    public void loginWithValidCredentials() {
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
    }

    @Test
    public void loginWithInvalidCredentials() {
        WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement signInBtn = driver.findElement(By.xpath("//button[text()='Sign In']"));

        username.sendKeys("esmeralda");
        password.sendKeys("test");

        signInBtn.click();
        //Thread.sleep(3000);

        WebElement message = driver.findElement(By.xpath("//p[@class='error']"));
        System.out.println(message.getText());
    }

    @AfterMethod
    public void closeDriver(){
        driver.quit();
    }
}
