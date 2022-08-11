package co.com.proyecto.tecnico.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestBasicInformationPage extends PageObject {
    public static final Target INPUT_FIRSTNAME = Target.the("PUT YOUR FIRST NAME")
            .located(By.xpath("//input[@id='firstName']"));

    public static final Target INPUT_LASTNAME = Target.the("PUT YOUR LAST NAME")
            .located(By.xpath("//input[@id='lastName']"));

    public static final Target INPUT_EMAIL = Target.the("PUT YOUR EMAIL")
            .located(By.xpath("//input[@id='email']"));

    public static final Target INPUT_LANGUAGUES = Target.the("INPUT FOR SEARCH LANGUAGUES")
            .located(By.xpath("//input[@type='search']"));

    public static final Target SELECT_LANGUAGUES = Target.the("SELECT THE LANGUAGUES WHO YOU KNOW")
            .located(By.xpath("//span[contains(string(), 'Spanish')]"));

    public static final Target BUTTON_MONT = Target.the("BUTTON FOR MONT SECCION")
            .located(By.xpath("//select[@id='birthMonth']"));

    public static final Target SELECT_MONT = Target.the("SELECT FOR MONT SECCION")
            .located(By.xpath("//option[@label='April']"));

    public static final Target BUTTON_DAY = Target.the("BUTTON FOR DAY SECCION")
            .located(By.xpath("//select[@id='birthDay']"));

    public static final Target SELECT_DAY = Target.the("SELECT FOR DAY SECCION")
            .located(By.xpath("//option[@label='8']"));

    public static final Target BUTTON_YEAR = Target.the("BUTTON FOR YEAR SECCION")
            .located(By.xpath("//select[@id='birthYear']"));

    public static final Target SELECT_YEAR = Target.the("SELECT FOR YEAR SECCION")
            .located(By.xpath("//option[@label='2002']"));

    public static final Target NEXT_BUTTON = Target.the("BUTTON FOR NEXT FORM")
            .located(By.xpath("//a[contains(string(), 'Next: Location')]"));

    }
