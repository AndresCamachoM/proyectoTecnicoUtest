package co.com.proyecto.tecnico.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestDevicePage extends PageObject {

 public static final Target BUTTON_COMPUTER = Target.the("BUTTON FOR COMPUTER SECTION")
        .located(By.xpath("//span[@class='ui-select-match-text pull-left ui-select-allow-clear'][1]"));

 public static final Target INPUT_COMPUTER = Target.the("INPUT FOR COMPUTER SECTION")
         .located(By.xpath("//input[@type='search'][1]"));

 public static final Target SELECT_COMPUTER = Target.the("SELECT FOR COMPUTER SECTION")
         .located(By.xpath("//span[@class='ui-select-choices-row-inner']"));

 public static final Target BUTTON_VERSION = Target.the("BUTTON FOR VERSION SECTION")
         .located(By.xpath("//span[@aria-label='Select a Version']"));

 public static final Target INPUT_VERSION = Target.the("INPUT FOR VERSION SECTION")
         .located(By.xpath("//input[@placeholder='Select a Version']"));

 public static final Target SELECT_VERSION = Target.the("SELECT FOR VERSION SECTION")
         .located(By.xpath("//span[@class='ui-select-choices-row-inner']"));

 public static final Target BUTTON_LANGUAGE = Target.the("BUTTON FOR VERSION SECTION")
         .located(By.xpath("//span[@aria-label='Select OS language']"));

 public static final Target INPUT_LANGUAGE = Target.the("INPUT FOR VERSION SECTION")
         .located(By.xpath("//input[@placeholder='Select OS language']"));

 public static final Target SELECT_LANGUAGE = Target.the("SELECT FOR VERSION SECTION")
         .located(By.xpath("//span[@class='ui-select-choices-row-inner']"));

 public static final Target BUTTON_MOBILE = Target.the("BUTTON FOR MOBILE SECTION")
         .located(By.xpath("//span[@aria-label='Select Brand']"));

 public static final Target INPUT_MOBILE = Target.the("INPUT FOR MOBILE SECTION")
         .located(By.xpath("//input[@placeholder='Select Brand']"));

 public static final Target SELECT_MOBILE = Target.the("SELECT FOR MOBILE SECTION")
         .located(By.xpath("//span[@class='ui-select-choices-row-inner']"));

 public static final Target BUTTON_MODEL = Target.the("BUTTON FOR MODEL SECTION")
         .located(By.xpath("//span[@aria-label='Select a Model']"));

 public static final Target INPUT_MODEL = Target.the("INPUT FOR MODEL SECTION")
         .located(By.xpath("//input[@placeholder='Select a Model']"));

 public static final Target SELECT_MODEL = Target.the("SELECT FOR MODEL SECTION")
         .located(By.xpath("//span[@class='ui-select-choices-row-inner']"));

 public static final Target BUTTON_OPERATINGSYSTEM = Target.the("BUTTON FOR OPERATING SYSTEM SECTION")
         .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span"));

 public static final Target INPUT_OPERATINGSYSTEM = Target.the("INPUT FOR OPERATING SYSTEM SECTION")
         .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));

 public static final Target SELECT_OPERATINGSYSTEM = Target.the("SELECT FOR OPERATING SYSTEM SECTION")
         .located(By.xpath("//span[@class='ui-select-choices-row-inner']"));

 public static final Target NEXT_BUTTON = Target.the("BUTTON FOR NEXT FORM")
         .located(By.xpath("//a[contains(string(), 'Next: Last Step')]"));


}
