package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import userinterface.InfoForm;
import userinterface.UtestPage;

public class CompleteForm implements Task {

    public static CompleteForm the(String data) {
        return Tasks.instrumented(CompleteForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Neiva").into(InfoForm.INPUT_CITY),
                Enter.theValue("410003").into(InfoForm.INPUT_ZIP),
                Click.on(InfoForm.INPUT_COUNTRY)
                );
    }
}
