package co.com.proyecto.tecnico.utest.tasks;

import co.com.proyecto.tecnico.utest.userinterface.UTestBasicInformationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.support.ui.Select;

public class BasicInformation implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strLanguage;
    private String strMonth;
    private String strDay;
    private String strYear;

    public BasicInformation(String strFirstName, String strLastName, String strEmail, String strLanguage, String strMonth, String strDay, String strYear) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strLanguage = strLanguage;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
    }




    public static BasicInformation firstStep(String strFirstName, String strLastName, String strEmail, String strLanguage, String strMonth, String strDay, String strYear){return Tasks.instrumented(BasicInformation.class,strFirstName, strLastName, strEmail, strLanguage, strMonth, strDay, strYear); }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strFirstName).into(UTestBasicInformationPage.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(UTestBasicInformationPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(UTestBasicInformationPage.INPUT_EMAIL),
                Click.on(UTestBasicInformationPage.INPUT_LANGUAGUES),
                Enter.theValue(strLanguage).into(UTestBasicInformationPage.INPUT_LANGUAGUES),
                Click.on(UTestBasicInformationPage.SELECT_LANGUAGUES),
                SelectFromOptions.byVisibleText(strMonth).from(UTestBasicInformationPage.BUTTON_MONT),
                SelectFromOptions.byVisibleText(strDay).from(UTestBasicInformationPage.BUTTON_DAY),
                SelectFromOptions.byVisibleText(strYear).from(UTestBasicInformationPage.BUTTON_YEAR),
                Click.on(UTestBasicInformationPage.NEXT_BUTTON)
        );
    }
}
