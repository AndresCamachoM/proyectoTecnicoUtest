package co.com.proyecto.tecnico.utest.stepdefinitions;

import co.com.proyecto.tecnico.utest.model.FormUser;
import co.com.proyecto.tecnico.utest.questions.QuestionForm;
import co.com.proyecto.tecnico.utest.tasks.*;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class utestStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Roberto wants to register on the Utest website")
    public void RobertoWantsToRegisterOnTheUtestWebsite() {
        OnStage.theActorCalled("Roberto").wasAbleTo(OpenUp.thePage(), (SignIn.onThePage()));
    }


    @When("He register with your valid information")
    public void HeRegisterWithYourValidInformation(List<FormUser> FormUser) throws Throwable{
        theActorInTheSpotlight().attemptsTo(
                BasicInformation.firstStep(
                        FormUser.get(0).getStrFirstName(),
                        FormUser.get(0).getStrLastName(),
                        FormUser.get(0).getStrEmail(),
                        FormUser.get(0).getStrLanguage(),
                        FormUser.get(0).getStrMonth(),
                        FormUser.get(0).getStrDay(),
                        FormUser.get(0).getStrYear()
                ),
                Location.secondStep(
                        FormUser.get(0).getStrCountry(),
                        FormUser.get(0).getStrCodePostal(),
                        FormUser.get(0).getStrCity()
                        ),
                Device.thirdStep(
                        FormUser.get(0).getStrComputer(),
                        FormUser.get(0).getStrVersion(),
                        FormUser.get(0).getStrDeviceLanguage(),
                        FormUser.get(0).getStrMobile(),
                        FormUser.get(0).getStrModel(),
                        FormUser.get(0).getStrOperatingSystem()
                        ),
                LastInformation.fourthStep(
                        FormUser.get(0).getStrPassword(),
                        FormUser.get(0).getStrPassword()
                )
        );
    }

    @Then("He should go to the welcome page")
    public void HeShouldGoToTheWelcomePage() {
        theActorInTheSpotlight().should(
                seeThat("The displayed text", QuestionForm.value(), equalTo("Welcome to the world's largest community of freelance software testers!"))
        );

    }


}
