package co.com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ValidacionUi {
    public static Target H1_TITULO = Target.the("Titulo detalle del producto")
            .locatedBy("//h1[@class='jsx-1680787435 product-name fa--product-name false']");


    public static Target LBL_NOMBRE=Target.the("Label name cart")
            .locatedBy("//a[@class='chakra-link css-qpfo7l']");

    public static Target LBL_CANTIDA=Target.the("Label quantity cart")
            .locatedBy("//input[contains(@id,'qty-')]");

}
