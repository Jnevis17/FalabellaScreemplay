package co.com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CatalogoUI {
    public static Target LBL_PRODUCTOS = Target.the("Ruta del producto elegido")
            .locatedBy("//a[@class='jsx-1576191951 section-body pod-link']");
}
