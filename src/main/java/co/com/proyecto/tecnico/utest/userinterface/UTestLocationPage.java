package co.com.proyecto.tecnico.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestLocationPage  extends PageObject {

    public static final Target BUTTON_COUNTRY = Target.the("BUTTON FOR COUNTRY SECTION")
            .located(By.xpath("//span[contains(string(), 'Select a country')][1]"));

    public static final Target SEARCH_COUNTRY = Target.the("BUTTON FOR COUNTRY SECTION")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target SELECT_COUNTRY = Target.the("PUT YOUR COUNTRY")
            .located(By.xpath("//span[@class='ui-select-choices-row-inner']"));

    public static final Target INPUT_CODEPOSTAL = Target.the("PUT YOUR CODE POSTAL")
            .located(By.xpath("//input[@id='zip']"));

    public static final Target INPUT_CITY = Target.the("PUT YOUR CITY ")
            .located(By.xpath("//input[@id='city']"));

    public static final Target SELECT_CITY = Target.the("SELECT YOUR CITY ")
            .located(By.xpath("//div[@class='pac-item'][1]"));

    public static final Target NEXT_BUTTON = Target.the("BUTTON FOR NEXT FORM")
            .located(By.xpath("//a[contains(string(), 'Next: Devices')]"));
}
