package co.com.proyecto.tecnico.utest.stepdefinitions;

import co.com.proyecto.tecnico.utest.questions.QuestionForm;
import co.com.proyecto.tecnico.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

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
    public void HeRegisterWithYourValidInformation() {
        theActorInTheSpotlight().attemptsTo(
                BasicInformation.theForm("Camilo", "Contreras", "CContreras@gmail.com", "Spanish"),
                Location.theForm("Argentina", 131331, "Buenos Aires"),
                Device.theForm("Linux", "Ubuntu", "Spanish", "Apple", "iPhone 4", "iOS 11.2"),
                LastInformation.theForm("Password-123456")
        );
    }



    @Then("He should go to the welcome page")
    public void HeShouldGoToTheWelcomePage() {
        theActorInTheSpotlight().should(
                seeThat("The displayed text", QuestionForm.value(), equalTo("Welcome to the world's largest community of freelance software testers!"))
        );

    }


}
