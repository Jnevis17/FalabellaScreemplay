package co.com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

public class InicioUI {
    public static Target TXT_BUSCAR = Target.the("Caja de texto Buscar ")
            .locatedBy("//input[@id='testId-SearchBar-Input']");
}
