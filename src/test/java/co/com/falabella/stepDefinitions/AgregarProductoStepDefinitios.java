package co.com.falabella.stepDefinitions;

import co.com.falabella.questions.ValidacionCantidadQuestions;
import co.com.falabella.questions.ValidarNombreQuestions;
import co.com.falabella.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AgregarProductoStepDefinitios {

    @Before
    public void establecerEscenario(){
        setTheStage( new OnlineCast());
    }

    @Dado("el usuario abre la pagina falabella y busca cualquier producto")
    public void elUsuarioAbreLaPaginaFalabellaYBuscaCualquierProducto() {
        //Desde aca se abre la pagina principal de falabella
        theActorCalled("Usuario").wasAbleTo(
                Open.url("https://www.falabella.com.co/"),
                InicioEnterTask.on()
        );
    }
    @Cuando("selecciona aleatoriamente un producto de la lista y le da clic")
    public void seleccionaAleatoriamenteProductoDeLaListaYLeDaClic() {
        theActorInTheSpotlight().attemptsTo(
                ProductosCatalogoTask.on()
        );
    }
    @Cuando("selecciona tres unidades del mismo producto y clic en agregar")
    public void seleccionaUnidadesDelMismoProductoYClicEnAgregar() {
        theActorInTheSpotlight().attemptsTo(
                IngresoCantidadTask.on(),
                ClicCarritoTask.on(),
                ClicIrCarritoTask.on()

        );
    }
    @Entonces("valida en el carrito de compras que el nombre del producto elegido sea el mismo del carrito,la cantidad de unidades elegidas")
    public void validaEnElCarritoDeComprasQueElNombreDelProductoElegidoSeaElMismoDelCarritoLaCantidadDeUnidadesElegidas() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidarNombreQuestions.from(), Matchers.equalTo(true)
                ),
                seeThat(
                        ValidacionCantidadQuestions.from(), Matchers.equalTo(true)
                )
        );
    }
}
