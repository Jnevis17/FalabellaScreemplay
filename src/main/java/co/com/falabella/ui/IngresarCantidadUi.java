package co.com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

public class IngresarCantidadUi {

    public static Target TXT_CANTIDAD = Target.the("Caja de texto Buscar ")
            .locatedBy("//input[@id=\"quantity-selector-increment-input\"]");
}
