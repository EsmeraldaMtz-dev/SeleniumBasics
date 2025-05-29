package ejerciciosSelenium;

import org.testng.annotations.*;

public class AnotationsTestNG {
    @DataProvider
    public Object[][] datosLogin(){
        return new Object[][] {
                {"usuario1", "contrasena1"},
                {"usuario2", "contrasena2"},
                {"usuario3", "contrasena3"},
        };
    }

    @Test(dataProvider = "datosLogin")
    public void loginTestData(String user, String password){
        System.out.println("Dato Usuario:"+user+ ", contrasena: "+password);
    }

    @BeforeSuite
    public void prepararCocina() {
        System.out.println("Preparo mi cocina porque voy a cocinar");
    }

    @AfterSuite
    public void limpiarCocina(){
        System.out.println("Terminé de cocinar, dejo todo limpio y listo para mañana");
    }
    @BeforeClass
    public void encenderHorno(){
        System.out.println("Prendemos y calentamos el horno");
    }

    @AfterClass
    public void apagarHorno(){
        System.out.println("Apagamos el horno");
    }
    @BeforeMethod
    public void lavarseLasManos() {
        System.out.println("Me lavo las manos con agua y jabon.");
    }

    @AfterMethod
    public void lavarPlatos(){
        System.out.println("Lavo los platos");
    }

    @Test (priority = 2, groups = {"smoke"})
    public void hacerPastel(){
        System.out.println("Hacemos un pastel");
    }
    @Test(priority = 1, enabled = false)
    public void hacerPizza(){
        System.out.println("Preparamos la pizza");
    }
}
