package co.com.proyecto.tecnico.utest.tasks;

import co.com.proyecto.tecnico.utest.userinterface.UTestPage;
import co.com.proyecto.tecnico.utest.userinterface.UTestSignInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class SignIn implements Task {

    public static SignIn onThePage(){
        return Tasks.instrumented(SignIn.class);

    }
    private SignIn signIn;




    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(UTestSignInPage.Register_Button));
    }
}
