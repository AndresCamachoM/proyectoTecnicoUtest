package co.com.proyecto.tecnico.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestWelcomeUserPage extends PageObject {

    public static By TEXT_WELCOME = By.xpath("//h1[contains(string(), 'Welcome')]");
}
