package co.com.proyecto.tecnico.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestLastInformationPage extends PageObject {

    public static final Target INPUT_PASSWORD = Target.the("INPUT FOR PUT THE PASSWORD")
            .located(By.xpath("//input[@id='password']"));

    public static final Target INPUT_CONFIRMPASSWORD = Target.the("INPUT FOR PUT THE CONFIRM PASSWORD")
            .located(By.xpath("//input[@id='confirmPassword']"));

    public static final Target ACCEPT_PRIVACITYUTEST = Target.the("ACCEPT UTEST TERMS")
            .located(By.xpath("//span[@class='checkmark signup-consent__checkbox error']"));


    public static final Target ACCEPTS_PRIVACYANDSECURITYPOLICY = Target.the("ACCEPT THE PRIVACY AND SECURITY POLICY")
            .located(By.xpath("//span[@class='checkmark signup-consent__checkbox error']"));



    public static final Target NEXT_BUTTON = Target.the("BUTTON FOR END FORM")
            .located(By.xpath("//a[contains(string(), 'Complete Setup')]"));
}
