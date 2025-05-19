package ejerciciosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class EjercicioLocalizacionDeElementos {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // a) Localizar por id
        WebElement openWindowButton = driver.findElement(By.id("openwindow"));
        WebElement openTabButton = driver.findElement(By.id("opentab"));
        WebElement enterNameInput = driver.findElement(By.id("name"));
        WebElement alertButton = driver.findElement(By.id("alertbtn"));
        WebElement confirmButton = driver.findElement(By.id("confirmbtn"));
        WebElement hideButton = driver.findElement(By.id("hide-textbox"));
        WebElement showButton = driver.findElement(By.id("show-textbox"));
        WebElement hideShowExampleInput = driver.findElement(By.id("displayed-text"));

        // b) Localizar por name

        WebElement enterNameInputByName = driver.findElement(By.name("enter-name"));
        WebElement hideShowExampleInputByName = driver.findElement(By.name("show-hide"));

        // c) Localizar por className

        List<WebElement> radioInputs = driver.findElements(By.className("radioButton"));

        // d) Localizar por linkText o partialLinkText

        WebElement blinkingText= driver.findElement(By.linkText("QA Meetup with Rahul Shetty @Pune - Limited Seats! Book Now!"));
        WebElement blinkingTextPartial= driver.findElement(By.partialLinkText("QA Meetup"));
        WebElement footerUrlDiscountCoBrokenLink= driver.findElement(By.partialLinkText("Broken Link"));

    }
}
