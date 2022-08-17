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

    private String strPassword;
    private String strConfirmPassword;

    public LastInformation(String strPassword, String strConfirmPassword) {
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }


    public static LastInformation fourthStep(String strPassword, String strConfirmPassword) {
        return Tasks.instrumented(LastInformation.class,strPassword, strConfirmPassword);
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strPassword).into(UTestLastInformationPage.INPUT_PASSWORD),
                Enter.theValue(strConfirmPassword).into(UTestLastInformationPage.INPUT_CONFIRMPASSWORD),
                Click.on(UTestLastInformationPage.ACCEPT_PRIVACITYUTEST),
                Click.on(UTestLastInformationPage.ACCEPTS_PRIVACYANDSECURITYPOLICY),
                Click.on(UTestLastInformationPage.NEXT_BUTTON)
                );
    }
}
