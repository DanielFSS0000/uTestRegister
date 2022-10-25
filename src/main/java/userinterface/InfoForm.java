package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class InfoForm extends PageObject {
    public static final Target INPUT_CITY = Target.the("Input de Ciudad")
            .located(By.id("city"));
    public static final Target INPUT_ZIP= Target.the("Input de Codigo Postal")
            .located(By.id("zip"));
    public static final Target COUNTRY = Target.the("Click on country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public static final Target INPUT_COUNTRY= Target.the("Input de Pais")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BTN_DEVICES2 = Target.the("Botton Next Step")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

}
