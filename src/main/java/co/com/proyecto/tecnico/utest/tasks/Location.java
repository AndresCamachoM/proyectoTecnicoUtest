package co.com.proyecto.tecnico.utest.tasks;

import co.com.proyecto.tecnico.utest.userinterface.UTestLocationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.WebElement;

public class Location implements Task {

    private String strCountry;
    private Integer strCodePostal;
    private String strCity;

    public Location(String strCountry, Integer strCodePostal, String strCity) {
        this.strCountry = strCountry;
        this.strCodePostal = strCodePostal;
        this.strCity = strCity;
    }

    public static Location secondStep(String strCountry, Integer strCodePostal, String strCity){return Tasks.instrumented(Location.class,strCountry, strCodePostal, strCity); }

    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(UTestLocationPage.INPUT_CITY),
                Enter.theValue(strCity).into(UTestLocationPage.INPUT_CITY),
                Wait.until(WebElementQuestion.the(UTestLocationPage.SELECT_CITY), WebElementStateMatchers.isEnabled()).forNoLongerThan(5).seconds(),

                Click.on(UTestLocationPage.SELECT_CITY),

                Click.on(UTestLocationPage.BUTTON_COUNTRY),
                Enter.theValue(strCountry).into(UTestLocationPage.SEARCH_COUNTRY),
                Click.on(UTestLocationPage.SELECT_COUNTRY),

                Clear.field(UTestLocationPage.INPUT_CODEPOSTAL),
                Enter.keyValues(String.valueOf(strCodePostal)).into(UTestLocationPage.INPUT_CODEPOSTAL),

                Click.on(UTestLocationPage.NEXT_BUTTON)

                );

    }
}
