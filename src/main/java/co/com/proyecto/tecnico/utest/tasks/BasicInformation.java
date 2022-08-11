package co.com.proyecto.tecnico.utest.tasks;

import co.com.proyecto.tecnico.utest.userinterface.UTestBasicInformationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.support.ui.Select;

public class BasicInformation implements Task {
    private String firstname;
    private String lastname;
    private String email;
    private String language;

    public String month;

    public BasicInformation(String firstname, String lastname, String email, String language) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.language = language;
    }




    public static Performable theForm(String firstname, String lastname, String email, String language){return Tasks.instrumented(BasicInformation.class,firstname, lastname, email, language); }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(firstname).into(UTestBasicInformationPage.INPUT_FIRSTNAME),
                Enter.theValue(lastname).into(UTestBasicInformationPage.INPUT_LASTNAME),
                Enter.theValue(email).into(UTestBasicInformationPage.INPUT_EMAIL),
                Click.on(UTestBasicInformationPage.INPUT_LANGUAGUES),
                Enter.theValue(language).into(UTestBasicInformationPage.INPUT_LANGUAGUES),
                Click.on(UTestBasicInformationPage.SELECT_LANGUAGUES),
                Click.on(UTestBasicInformationPage.BUTTON_MONT),
                Click.on(UTestBasicInformationPage.SELECT_MONT),
                Click.on(UTestBasicInformationPage.BUTTON_DAY),
                Click.on(UTestBasicInformationPage.SELECT_DAY),
                Click.on(UTestBasicInformationPage.BUTTON_YEAR),
                Click.on(UTestBasicInformationPage.SELECT_YEAR),
                Click.on(UTestBasicInformationPage.NEXT_BUTTON)
        );
    }
}
