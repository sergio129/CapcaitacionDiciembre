package practica.konecta.web.Tareas;


import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import practica.konecta.web.Interacciones.LoginInteraction;
import practica.konecta.web.Modelos.LoginModel;

@AllArgsConstructor
public class LoginTask implements Task {
    public final LoginModel login;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(LoginInteraction.inicio(login));
    }

    public static LoginTask iniciarsesion(LoginModel login) {
        return new LoginTask(login);
    }
}
