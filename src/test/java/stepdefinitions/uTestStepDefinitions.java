package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.DataModel;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.CompleteForm;
import tasks.InfoStep3;
import tasks.Join;
import tasks.OpenUp;

import java.util.List;

public class uTestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^usuario daniel ingresa a pagina uTest$")
    public void usuarioDanielIngresaAPaginaUTest(List<DataModel> data) {
        OnStage.theActorCalled("Daniel").wasAbleTo(OpenUp.thePage(), (Join.onThePage(data)));
    }
    @When("^Diligencia todos los datos que el formulario le solicita$")
    public void diligenciaTodosLosDatosQueElFormularioLeSolicita(List<DataModel> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteForm.the(data), InfoStep3.the(data));
    }

    @Then("^se obtiene el mensaje de usuario creado en la ventan de uTest$")
    public void seObtieneElMensajeDeUsuarioCreadoEnLaVentanDeUTest() {

    }

}
