package co.com.proyecto.tecnico.utest.tasks;

import co.com.proyecto.tecnico.utest.userinterface.UTestDevicePage;
import co.com.proyecto.tecnico.utest.userinterface.UTestLastInformationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LastInformation implements Task {


    public LastInformation(String password) {
        this.password = password;
    }

    private String password;


    public static Performable theForm(String password) {
        return Tasks.instrumented(LastInformation.class,password);
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(password).into(UTestLastInformationPage.INPUT_PASSWORD),
                Enter.theValue(password).into(UTestLastInformationPage.INPUT_CONFIRMPASSWORD),
                Click.on(UTestLastInformationPage.ACCEPT_PRIVACITYUTEST),
                Click.on(UTestLastInformationPage.ACCEPTS_PRIVACYANDSECURITYPOLICY),
                Click.on(UTestLastInformationPage.NEXT_BUTTON),
                Click.on(UTestLastInformationPage.NEXT_BUTTON)
                );
    }
}
