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

    private String strComputer;
    private String strVersion;
    private String strDeviceLanguage;
    private String strMobile;
    private String strModel;
    private String strOperatingSystem;

    public Device(String strComputer, String strVersion, String strDeviceLanguage, String strMobile, String strModel, String strOperatingSystem) {
        this.strComputer = strComputer;
        this.strVersion = strVersion;
        this.strDeviceLanguage = strDeviceLanguage;
        this.strMobile = strMobile;
        this.strModel = strModel;
        this.strOperatingSystem = strOperatingSystem;
    }

    public static Device thirdStep(String strComputer, String strVersion, String strDeviceLanguage, String strMobile, String strModel, String strOperatingSystem) {
        return Tasks.instrumented(Device.class, strComputer, strVersion, strDeviceLanguage, strMobile, strModel, strOperatingSystem);
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UTestDevicePage.BUTTON_COMPUTER),
                Enter.theValue(strComputer).into(UTestDevicePage.INPUT_COMPUTER),
                Click.on(UTestDevicePage.SELECT_COMPUTER),


                Click.on(UTestDevicePage.BUTTON_VERSION),
                Enter.keyValues(String.valueOf(strVersion)).into(UTestDevicePage.INPUT_VERSION),
                Click.on(UTestDevicePage.SELECT_VERSION),

                Click.on(UTestDevicePage.BUTTON_LANGUAGE),
                Enter.theValue(strDeviceLanguage).into(UTestDevicePage.INPUT_LANGUAGE),
                Click.on(UTestDevicePage.SELECT_LANGUAGE),

                Click.on(UTestDevicePage.BUTTON_MOBILE),
                Enter.theValue(strMobile).into(UTestDevicePage.INPUT_MOBILE),
                Click.on(UTestDevicePage.SELECT_MOBILE),

                Click.on(UTestDevicePage.BUTTON_MODEL),
                Enter.theValue(strModel).into(UTestDevicePage.INPUT_MODEL),
                Click.on(UTestDevicePage.SELECT_MODEL),

                Click.on(UTestDevicePage.BUTTON_OPERATINGSYSTEM),
                Enter.theValue(strOperatingSystem).into(UTestDevicePage.INPUT_OPERATINGSYSTEM),
                Click.on(UTestDevicePage.SELECT_OPERATINGSYSTEM),

                Click.on(UTestDevicePage.NEXT_BUTTON)


        );
    }
}
