package tasks;

import model.DataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userinterface.InfoForm;

import java.util.List;


public class CompleteForm implements Task {

    private List<DataModel> data;

    public CompleteForm(List<DataModel> data){
        this.data = data;
    }

    public static CompleteForm the(List<DataModel> data) {
        return Tasks.instrumented(CompleteForm.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrCity()).into(InfoForm.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(InfoForm.INPUT_CITY),
                Hit.the(Keys.ENTER).into(InfoForm.INPUT_CITY),
                Enter.theValue(data.get(0).getZipCode()).into(InfoForm.INPUT_ZIP),
                Click.on(InfoForm.COUNTRY),
                Enter.theValue(data.get(0).getStrCountry()).into(InfoForm.INPUT_COUNTRY).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(InfoForm.BTN_DEVICES2)
                );
    }
}
