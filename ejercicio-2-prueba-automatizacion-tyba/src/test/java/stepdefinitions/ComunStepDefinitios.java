package stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import com.tyba.segundo_ejercicio.utilities.Url;
import static net.serenitybdd.screenplay.actors.OnStage.aNewActor;

public class ComunStepDefinitios {
    private final Url page = new Url();

    @Before
    public void SetUp(){

        OnStage.setTheStage(new OnlineCast());
        aNewActor().attemptsTo(
                Open.browserOn(page)
        );

    }
}
