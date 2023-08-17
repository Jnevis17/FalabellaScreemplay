package co.com.falabella.tasks;

import co.com.falabella.interactions.ClicAleatorio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProductosCatalogoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClicAleatorio.click()
        );
    }
    public static ProductosCatalogoTask on(){

        return instrumented(ProductosCatalogoTask.class);
    }
}
