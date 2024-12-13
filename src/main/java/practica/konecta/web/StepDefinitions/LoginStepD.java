package practica.konecta.web.StepDefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.WebDriver;
import practica.konecta.web.Interfaces.LoginInterface;
import practica.konecta.web.Modelos.LoginModel;
import practica.konecta.web.Preguntas.Preguntas;
import practica.konecta.web.Tareas.LoginTask;

public class LoginStepD {
    @Managed(driver = "chrome")
    private WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    LoginInterface home = new LoginInterface();
    LoginModel model = new LoginModel();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("Usuario ingresa a la pagina de demoblaze")
    public void usuario_ingresa_a_la_pagina_de_demoblaze() throws InterruptedException {
        actor.wasAbleTo(Open.browserOn(home));
        Thread.sleep(5000);
    }

    @When("Usuario se logue con las siguientes credenciales, Usuario: {string}, Contra:{string}")
    public void usuario_se_logue_con_las_siguientes_credenciales_usuario_contra(String user, String passw) throws InterruptedException {
        model.setUser(user);
        model.setPassword(passw);
        actor.wasAbleTo(LoginTask.iniciarsesion(model));
        Thread.sleep(5000);
    }

    @Then("Validamos que se muestre {string}")
    public void validamos_que_se_muestre(String welcom) {
        actor.wasAbleTo(
                Ensure.that(Preguntas.login()).isEqualTo(welcom)
        );
    }

}
