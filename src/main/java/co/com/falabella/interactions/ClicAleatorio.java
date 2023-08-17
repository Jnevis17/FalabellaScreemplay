package co.com.falabella.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

import static co.com.falabella.ui.CatalogoUI.LBL_PRODUCTOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClicAleatorio implements Interaction{
    @Override
    public <T extends Actor> void performAs(T actor) {
        //Esto me va retonar una lista de elementos
        List<WebElementFacade> ListaProductos = LBL_PRODUCTOS.resolveAllFor(actor);

        if(ListaProductos!= null){
            Random random = new Random();
            int indexRandom = random.nextInt(ListaProductos.size());
            //Hacer Clic en el producto
            ListaProductos.get(indexRandom).click();
        }
        else{
            throw new RuntimeException("No se encontro elemento");
        }

    }
    public static Performable click(){
        return instrumented(ClicAleatorio.class);
    }
}
