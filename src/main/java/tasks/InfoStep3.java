package tasks;

import model.DataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import userinterface.InfoForm;
import userinterface.Step3Form;

import java.security.Key;
import java.util.List;

public class InfoStep3 implements Task {

    private List<DataModel> data;

    public InfoStep3(List<DataModel> data){
        this.data = data;
    }

    public static InfoStep3 the(List<DataModel> data)
    {
        return Tasks.instrumented(InfoStep3.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Step3Form.CONTENT_BRAND),
                Enter.theValue(data.get(0).getStrBrand()).into(Step3Form.BRAND).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(Step3Form.CONTENT_MODEL),
                Enter.theValue(data.get(0).getStrBrandModel()).into(Step3Form.MODEL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(Step3Form.CONTENT_OS),
                Enter.theValue(data.get(0).getStrOS()).into(Step3Form.OPERATING_SYSTEM).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(Step3Form.NEXT_STEP)
                );
    }
}
