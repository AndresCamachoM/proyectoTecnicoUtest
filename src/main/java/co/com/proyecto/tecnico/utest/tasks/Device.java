package co.com.proyecto.tecnico.utest.tasks;

import co.com.proyecto.tecnico.utest.userinterface.UTestDevicePage;
import co.com.proyecto.tecnico.utest.userinterface.UTestLocationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Device implements Task {

    private String computer;
    private String version;
    private String language;
    private String mobile;
    private String model;
    private String operatingsystem;

    public Device(String computer, String version, String language, String mobile, String model, String operatingsystem) {
        this.computer = computer;
        this.version = version;
        this.language = language;
        this.mobile = mobile;
        this.model = model;
        this.operatingsystem = operatingsystem;
    }

    public static Performable theForm(String computer, String version, String language, String mobile, String model, String operatingsystem) {
        return Tasks.instrumented(Device.class, computer, version, language, mobile, model, operatingsystem);
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UTestDevicePage.BUTTON_MOBILE),
                Enter.theValue(mobile).into(UTestDevicePage.INPUT_MOBILE),
                Click.on(UTestDevicePage.SELECT_MOBILE),

                Click.on(UTestDevicePage.BUTTON_MODEL),
                Enter.theValue(model).into(UTestDevicePage.INPUT_MODEL),
                Click.on(UTestDevicePage.SELECT_MODEL),



                Click.on(UTestDevicePage.BUTTON_OPERATINGSYSTEM),
                Enter.theValue(operatingsystem).into(UTestDevicePage.INPUT_OPERATINGSYSTEM),
                Click.on(UTestDevicePage.SELECT_OPERATINGSYSTEM),

                Click.on(UTestDevicePage.BUTTON_COMPUTER),
                Enter.theValue(computer).into(UTestDevicePage.INPUT_COMPUTER),
                Click.on(UTestDevicePage.SELECT_COMPUTER),


                Click.on(UTestDevicePage.BUTTON_VERSION),
                Enter.keyValues(String.valueOf(version)).into(UTestDevicePage.INPUT_VERSION),
                Click.on(UTestDevicePage.SELECT_VERSION),

                Click.on(UTestDevicePage.BUTTON_LANGUAGE),
                Enter.theValue(language).into(UTestDevicePage.INPUT_LANGUAGE),
                Click.on(UTestDevicePage.SELECT_LANGUAGE),


                Click.on(UTestDevicePage.NEXT_BUTTON)


        );
    }
}
