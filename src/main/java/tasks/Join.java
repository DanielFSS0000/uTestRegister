package tasks;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import userinterface.UtestPage;

public class Join implements Task {

    public static Join onThePage() {
        return Tasks.instrumented(Join.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestPage.JOIN_BUTTON),
                Enter.theValue("Daniel Felipe").into(UtestPage.FIRST_NAME),
                Enter.theValue("Sandoval Solano").into(UtestPage.LAST_NAME),
                Enter.theValue("daniel970620@gmail.com").into(UtestPage.EMAIL),
                Click.on(UtestPage.DATE_MONTH),
                Click.on(UtestPage.DATE_DAY),
                Click.on(UtestPage.DATE_YEAR),
                Click.on(UtestPage.BTN_NEXT),
                Click.on(UtestPage.BTN_DEVICES)
        );

    }
}
