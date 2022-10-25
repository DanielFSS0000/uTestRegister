package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class UtestPage extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("Boton Join Para Formulario de Registro")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target FIRST_NAME = Target.the("Input de Primer nombre")
            .located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Input Apellidos")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Email")
            .located(By.id("email"));
    public static final Target DATE_MONTH = Target.the("Mes de Cumpleaños")
            .located(By.xpath("//*[@id=\"birthMonth\"]"));
    public static final Target DATE_DAY = Target.the("Dia de cumpleaños")
            .located(By.xpath("//*[@id=\"birthDay\"]"));
    public static final Target DATE_YEAR = Target.the("Año de nacimiento")
            .located(By.xpath("//*[@id=\"birthYear\"]"));
    public static final Target BTN_NEXT = Target.the("Botton Next Location")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));

}
