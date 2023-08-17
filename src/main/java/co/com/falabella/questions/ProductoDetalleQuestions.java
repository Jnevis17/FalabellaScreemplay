package co.com.falabella.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.falabella.ui.DetallesProductoUi.H1_TITULO;

public class ProductoDetalleQuestions implements Question <Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade NombreProdcuto = (WebElementFacade) H1_TITULO.resolveFor(actor);

        return NombreProdcuto.isDisabled();
    }

    public static Question <Boolean> from(){
        return new ProductoDetalleQuestions();
    }
}

