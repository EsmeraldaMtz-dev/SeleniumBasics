package ejerciciosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class InteractWithElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
/*        //driver.manage().window().maximize(); //maximiza navegador

        //Ejemplo de click
        //driver.findElement(By.id("show-textbox")).click();
        //WebElement showBtn = driver.findElement(By.id("show-textbox"));
        //showBtn.click();

        //Buscar por xpath dar click en hide
        WebElement showBtn = driver.findElement(By.xpath("//input[contains(@Id, 'show')]"));
        WebElement hideBtn = driver.findElement(By.xpath("//input[contains(@Id, 'hide')]"));
        showBtn.click();
        hideBtn.click();
        showBtn.click();
        hideBtn.click();

        //Ejemplo de sendKeys
        WebElement countryTxtbox = driver.findElement(By.id("autocomplete"));
        countryTxtbox.sendKeys("Chile");

        countryTxtbox.clear();

        //Ejercicio sendkeys
        WebElement nameInput = driver.findElement(By.xpath("//input[contains(@name, 'name')]"));
        nameInput.sendKeys("Esmeralda");
        nameInput.clear();

        // COMANDOS GET
        //getTitle() -> Trae el titulo de la página
        System.out.println(driver.getTitle());

        WebElement radioLbl = driver.findElement(By.xpath("//legend[text()='Radio Button Example']"));
        radioLbl.getText();


        WebElement suggessionLbl = driver.findElement(By.xpath("//legend[contains(text(), 'Suggession')]"));
        System.out.println(suggessionLbl.getText());

        //COMANDOS CONDICIONALES
        WebElement hideshowTxtBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
        hideBtn.click();
        System.out.println("El status del textbox isDisplayed es: " + hideshowTxtBox.isDisplayed());
        showBtn.click();
        System.out.println("El status del textbox isDisplayed es: " + hideshowTxtBox.isDisplayed());

        //Ejercicio: buscar radiobutton1 --> dar click --> verificar si está seleccionado --> imprimir el status.
        WebElement radio1 = driver.findElement(By.xpath("//label[@for='radio1']/input"));
        System.out.println("El radio1 buton está: "+ radio1.isSelected());
        radio1.click();
        System.out.println("El radio1 buton está: "+ radio1.isSelected());

        //Ejercicio opcional: Seleccionar otro radio button y verificar que el primero se ha deseleccionado
        WebElement radio3 = driver.findElement(By.xpath("//input[@value='radio3']"));
        radio3.click();
        System.out.println("El radio1 buton está: "+ radio1.isSelected());
        System.out.println("El radio3 buton está: "+ radio3.isSelected());


        //Ejercicio2: Mismo procedimiento para el check box1
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
        System.out.println("El Checkbox1 está: "+ checkbox1.isSelected());
        checkbox1.click();
        System.out.println("El Checkbox1 está: "+ checkbox1.isSelected());

        //Ejercicio opcional: seleccionar otro checkbox y verificar que el primero no se haya deseleccionado
        WebElement checkbox3 = driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
        System.out.println("El Checkbox3 está: "+ checkbox3.isSelected());
        checkbox3.click();
        System.out.println("El Checkbox1 está: "+ checkbox1.isSelected());
        System.out.println("El Checkbox3 está: "+ checkbox3.isSelected());



        //
        WebElement alertBtn = driver.findElement(By.xpath("//input[@id='alertbtn']"));
        alertBtn.click();
        driver.switchTo().alert().accept();

        WebElement confirmBtn = driver.findElement(By.xpath("//input[@id='confirmbtn']"));
        confirmBtn.click();
        driver.switchTo().alert().accept();
        confirmBtn.click();
        driver.switchTo().alert().dismiss();


        //TareaOpcional: Alerta con nombre




        //MANEJO DE DROPDOWNS"
        // 1. Búscar dropdown
        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
        // 2. Hacer instancia de Select enviando el WebElement dropdown al constructor.
        Select select = new Select(dropdown);
        // 3. Se Selecciona el valor que se desee por una de 3 opciones
            //ByIndex
        select.selectByIndex(2);
        Thread.sleep(3000);
        //ByValue
        select.selectByValue("option1");
        Thread.sleep(3000);
        //By Visible Text
        select.selectByVisibleText("Option3");


        //USO DE LA CLASE ACCIONS EN SELENIUM

        //1. Buscar elemento
        WebElement mousehoverBtn = driver.findElement(By.xpath("//button[@id='mousehover']"));
        //2. Hacer instancia de Actions
        Actions action = new Actions(driver);
        //3. Hacer hover
        WebElement ifrmaeLbl = driver.findElement(By.xpath("//legend[text()='iFrame Example']"));
        action.moveToElement(ifrmaeLbl).perform();
        action.contextClick(mousehoverBtn).perform();

 */
        //USO DEL FIND ELEMENTSSSSSS
        Actions action = new Actions(driver);
        List<WebElement> encabezados = driver.findElements(By.xpath("//table[@name='courses']//th"));
        for(WebElement element : encabezados){
            System.out.println(element.getText());
        }

        int flag=0;
        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@Class='radioButton']"));
        for(WebElement element : radioBtns){
            flag++;
            action.moveToElement(element).click().build().perform();
            System.out.println("Radio"+flag+ "clicked.");
            radioBtns.forEach(cbx -> System.out.println(cbx.isSelected()));
        }

        List<WebElement> checkboxes = driver.findElements(By.xpath("//fieldset//input[@Type='checkbox']"));
        flag=0;
        for(WebElement element : checkboxes){
            flag++;
            action.moveToElement(element).click().build().perform();
            System.out.println("Checkbox" +flag+ " clicked.");
            checkboxes.forEach(cbx -> System.out.println(cbx.isSelected()));
        }

        Thread.sleep(5000); //no se debe hacer NUNCA es MUY mala practica.
                // Ahora se hace para poder ver como funciona selenium.

        driver.quit();
    }
}
