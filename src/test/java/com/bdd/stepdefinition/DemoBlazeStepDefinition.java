package com.bdd.stepdefinition;

import com.bdd.step.DemoBlazeStep;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class DemoBlazeStepDefinition {
    @Steps
    DemoBlazeStep demoBlazeStep;

    @Dado("^que abre la pagina web DemoBlaze en el navegador \"([^\"]*)\"$")
    public void queAbreLaPaginaWebDemoBlazeEnElNavegador(String navegador) throws Throwable {
        demoBlazeStep.queAbreLaPaginaWebDemoBlazeEnElNavegador(navegador);
    }

    @Y("^realizar click en el botón Sign Up$")
    public void realizarClickEnElBotónSignUp() {
        demoBlazeStep.realizarClickEnElBotónSignUp();
    }

    @Y("^escribir \"([^\"]*)\" en el cuadro de texto Username$")
    public void escribirEnElCuadroDeTextoUsername(String Username) throws Throwable {
        demoBlazeStep.escribirEnElCuadroDeTextoUsername(Username);
    }

    @Y("^escribir \"([^\"]*)\" en el cuadro de texto Password$")
    public void escribirEnElCuadroDeTextoPassword(String Password) throws Throwable {
        demoBlazeStep.escribirEnElCuadroDeTextoPassword(Password);
    }

    @Cuando("^realizar click en el botón Sign Up del formulario$")
    public void realizarClickEnElBotónSignUpDelFormulario() {
        demoBlazeStep.realizarClickEnElBotónSignUpDelFormulario();
    }

    @Entonces("^validar si el usuario ya existe y aceptar$")
    public void validarSiElUsuarioYaExiste() {
        demoBlazeStep.validarSiElUsuarioYaExisteYAceptar();
    }
}
