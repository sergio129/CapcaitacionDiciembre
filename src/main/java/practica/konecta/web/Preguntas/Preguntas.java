package practica.konecta.web.Preguntas;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static practica.konecta.web.Interfaces.LoginInterface.Welcome;

public class Preguntas {
    public static Question<String> login(){
        return actor -> BrowseTheWeb.as(actor).find(Welcome).getText();
    }
}
