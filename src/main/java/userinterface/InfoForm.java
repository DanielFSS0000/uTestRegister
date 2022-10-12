package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class InfoForm extends PageObject {
    public static final Target INPUT_CITY = Target.the("Input de Ciudad")
            .located(By.xpath("//*[@id=\"city\"]"));
    public static final Target INPUT_ZIP= Target.the("Input de Codigo Postal")
            .located(By.id("zip"));
    public static final Target INPUT_COUNTRY= Target.the("Input de Pais")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
}
