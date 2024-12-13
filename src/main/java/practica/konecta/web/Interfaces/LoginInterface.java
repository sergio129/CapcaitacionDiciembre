package practica.konecta.web.Interfaces;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoblaze.com/")
public class LoginInterface extends PageObject {
    public static final Target Login_In = Target.the("Boton para ingresar al login").located(By.id("login2"));
    public static final Target User_Name = Target.the("Campo para ingresar el usuario").located(By.id("loginusername"));
    public static final Target Password = Target.the("Campo para ingresar el Password").located(By.id("loginpassword"));
    public static final Target Bt_Log_In = Target.the("Boton para iniciar sesion").located(By.cssSelector("[onclick='logIn()']"));
    public static final Target Welcome = Target.the("Menu de bienvenida").located(By.id("nameofuser"));

}
