package co.com.falabella.tasks;

import co.com.falabella.utils.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.falabella.ui.IngresarCantidadUi.TXT_CANTIDAD;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
public class IngresoCantidadTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_CANTIDAD, isVisible()).forNoMoreThan(2).seconds(),
                Enter.theValue(Data.extractTo().get(0).get("cantidad")).into(TXT_CANTIDAD)
        );
    }

    public static IngresoCantidadTask on  () {
        return instrumented(IngresoCantidadTask.class);
    }
}
