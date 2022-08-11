package co.com.proyecto.tecnico.utest.tasks;

import co.com.proyecto.tecnico.utest.userinterface.UTestLocationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Location implements Task {

    private String country;
    private Integer codepostal;
    private String city;

    public Location(String country, Integer codepostal, String city) {
        this.country = country;
        this.codepostal = codepostal;
        this.city = city;
    }

    public static Performable theForm(String country, Integer codepostal, String city){return Tasks.instrumented(Location.class,country, codepostal, city); }

    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(UTestLocationPage.INPUT_CITY),
                Enter.theValue(city).into(UTestLocationPage.INPUT_CITY),
                Click.on(UTestLocationPage.SELECT_CITY),

                Click.on(UTestLocationPage.BUTTON_COUNTRY),
                Enter.theValue(country).into(UTestLocationPage.SEARCH_COUNTRY),
                Click.on(UTestLocationPage.SELECT_COUNTRY),

                Clear.field(UTestLocationPage.INPUT_CODEPOSTAL),
                Enter.keyValues(String.valueOf(codepostal)).into(UTestLocationPage.INPUT_CODEPOSTAL),

                Click.on(UTestLocationPage.NEXT_BUTTON)

                );
    }
}
