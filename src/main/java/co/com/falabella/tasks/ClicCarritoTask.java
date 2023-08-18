package co.com.falabella.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.falabella.ui.ClicCarrito.BTN_CARRITO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClicCarritoTask implements Task {
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(BTN_CARRITO)
            );
    }
    public static ClicCarritoTask on  () {
        return instrumented(ClicCarritoTask.class);
    }

}
