package stepdefinitions;

import com.tyba.segundo_ejercicio.questions.UserLoginQuestions;
import com.tyba.segundo_ejercicio.tasks.IncomeInformation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static com.tyba.segundo_ejercicio.userinterfaces.UserLoginUserInterfaces.*;

public class UserLoginStepDefinitions {

    @Given("el {word} ingresa con los datos {string} {string}")
    public void elUsuarioIngresaConLosDatos(String name, String username, String password){
        theActorCalled(name).wasAbleTo(IncomeInformation.incomeInformation(username,password));
    }

    @Then("el usuario puede ingresar exitosamente")
    public void elUsuarioPuedeIngresarExitosamente() {
        theActorInTheSpotlight().wasAbleTo(
                WaitUntil.the(VALIDATE_SUCCESSFUL_LOGIN, isVisible()).forNoMoreThan(Duration.ofSeconds(5)),
                Ensure.that(UserLoginQuestions.successfulLogin()).isTrue()
        );
    }

    @Then("el usuario evidencia un error en el ingreso")
    public void elUsuarioEvidenciaUnErrorEnElIngreso() {
        theActorInTheSpotlight().wasAbleTo(
                WaitUntil.the(VALIDATE_FAILED_LOGIN, isVisible()).forNoMoreThan(Duration.ofSeconds(5)),
                Ensure.that(UserLoginQuestions.failedLogin()).isTrue()
        );
    }
}
