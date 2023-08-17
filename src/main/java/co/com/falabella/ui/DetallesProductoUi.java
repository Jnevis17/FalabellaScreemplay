package co.com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

public class DetallesProductoUi {
    public static Target H1_TITULO = Target.the("Titulo detalle del producto")
            .locatedBy("//h1[@class='jsx-1680787435 product-name fa--product-name false']");

}
