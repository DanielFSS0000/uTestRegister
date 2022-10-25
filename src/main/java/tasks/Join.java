package tasks;

import model.DataModel;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.InfoForm;
import userinterface.UtestPage;

import java.util.List;

public class Join implements Task {

    private List<DataModel> data;

    public Join(List<DataModel> data){
        this.data = data;
    }

    public static Join onThePage(List<DataModel> data) {
        return Tasks.instrumented(Join.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(UtestPage.JOIN_BUTTON),
                Enter.theValue(data.get(0).getStrName()).into(UtestPage.FIRST_NAME),
                Enter.theValue(data.get(0).getStrLastName()).into(UtestPage.LAST_NAME),
                Enter.theValue(data.get(0).getStrMail()).into(UtestPage.EMAIL),
                SelectFromOptions.byVisibleText(data.get(0).getStrMonth()).from(UtestPage.DATE_MONTH),
                SelectFromOptions.byVisibleText(data.get(0).getStrDay()).from(UtestPage.DATE_DAY),
                SelectFromOptions.byVisibleText(data.get(0).getStrYear()).from(UtestPage.DATE_YEAR),
                Click.on(UtestPage.BTN_NEXT)
        );

    }
}
