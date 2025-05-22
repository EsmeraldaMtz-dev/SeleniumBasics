package Tareas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsVideos {
  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");

    //2.2.11 CSS Selectors
    List<WebElement> divsAndPs = driver.findElements(By.cssSelector("div, p"));
    List<WebElement> psInsideDivs = driver.findElements(By.cssSelector("div p"));

    for(WebElement element : psInsideDivs) {
      System.out.println(element.getText());
    }

    //2.2.12 Ids by CSS




    driver.quit();
  }
}
