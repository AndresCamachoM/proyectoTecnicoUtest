package co.com.proyecto.tecnico.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestSignInPage extends PageObject {
    public static final Target Register_Button = Target.the("Button that should take us to a form to register")
            .located(By.xpath("//a[contains(string(), 'Join Today')][1]"));

}
