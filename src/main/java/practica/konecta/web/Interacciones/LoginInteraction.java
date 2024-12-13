package practica.konecta.web.Interacciones;


import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import practica.konecta.web.Interfaces.LoginInterface;
import practica.konecta.web.Modelos.LoginModel;


@AllArgsConstructor
public class LoginInteraction implements Interaction {
    private final LoginModel login;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginInterface.Login_In),
                Enter.theValue(login.getUser()).into(LoginInterface.User_Name),
                Enter.theValue(login.getPassword()).into(LoginInterface.Password),
                Click.on(LoginInterface.Bt_Log_In)
        );
    }

    public static LoginInteraction inicio(LoginModel login) {
        return new LoginInteraction(login);
    }
}
