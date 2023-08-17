package co.com.falabella.tasks;

import co.com.falabella.utils.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;


import static co.com.falabella.ui.InicioUI.TXT_BUSCAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class InicioEnterTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Tiempo de espera
                WaitUntil.the(TXT_BUSCAR, isVisible()).forNoMoreThan(3).seconds(),
                //Desde este punto se envia la información
                Enter.theValue(Data.extractTo().get(0).get("producto")).into(TXT_BUSCAR).thenHit(Keys.ENTER)
        );
    }

    public static InicioEnterTask on  () {
        return instrumented(InicioEnterTask.class);
    }
}
