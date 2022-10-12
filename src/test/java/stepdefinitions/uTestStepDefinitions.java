package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.CompleteForm;
import tasks.Join;
import tasks.OpenUp;

public class uTestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^usuario daniel ingresa a pagina uTest$")
    public void usuarioDanielIngresaAPaginaUTest() {
        OnStage.theActorCalled("Daniel").wasAbleTo(OpenUp.thePage(), (Join.onThePage()));
    }
    @When("^Diligencia todos los datos que el formulario le solicita$")
    public void diligenciaTodosLosDatosQueElFormularioLeSolicita(String data) {
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteForm.the(data));

    }

    @Then("^se obtiene el mensaje de usuario creado en la ventan de uTest$")
    public void seObtieneElMensajeDeUsuarioCreadoEnLaVentanDeUTest() {

    }

}
