package co.com.falabella.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.falabella.ui.ValidacionUi.LBL_NOMBRE;

public class ValidarNombreQuestions implements Question<Boolean>{

        @Override
        public Boolean answeredBy(Actor actor) {

            WebElementFacade name = LBL_NOMBRE.resolveFor(actor);

            String AgregarNombre = actor.recall("producto");
            String NombreCarrito = name.getText();

            if(!NombreCarrito.contains(AgregarNombre)){
                return false;
            }
            return true;
        }

        public static Question<Boolean> from(){
            return new ValidarNombreQuestions ();
        }
    }

