package co.com.proyecto.tecnico.utest.questions;

import co.com.proyecto.tecnico.utest.userinterface.UTestWelcomeUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.TextContent;

public class QuestionForm implements Question<String> {

    public static Question<String> value(){
        return new QuestionForm();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(UTestWelcomeUserPage.TEXT_WELCOME).getText();
    }
}
