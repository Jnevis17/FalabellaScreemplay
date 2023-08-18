package co.com.falabella.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.falabella.ui.ClicIrCarritoUi.BTN_IRCARRITO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClicIrCarritoTask implements Task {
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(BTN_IRCARRITO)
            );
        }
        public static  ClicIrCarritoTask on  () {
            return instrumented(ClicIrCarritoTask.class);
        }
}
