package com.bdd.step;

import com.bdd.page.DemoBlazePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DemoBlazeStep extends ScenarioSteps {
    DemoBlazePage demoBlazePage;

    @Step
    public void queAbreLaPaginaWebDemoBlazeEnElNavegador(String navegador) {
        demoBlazePage.queAbreLaPaginaWebDemoBlazeEnElNavegador(navegador);
    }

    @Step
    public void realizarClickEnElBotónSignUp() {
        demoBlazePage.realizarClickEnElBotónSignUp();
    }

    @Step
    public void escribirEnElCuadroDeTextoUsername(String username) {
        demoBlazePage.escribirEnElCuadroDeTextoUsername(username);
    }

    @Step
    public void escribirEnElCuadroDeTextoPassword(String password) {
        demoBlazePage.escribirEnElCuadroDeTextoPassword(password);
    }

    @Step
    public void realizarClickEnElBotónSignUpDelFormulario() {
        demoBlazePage.realizarClickEnElBotónSignUpDelFormulario();
    }

    @Step
    public void validarSiElUsuarioYaExisteYAceptar() {
        demoBlazePage.validarSiElUsuarioYaExisteYAceptar();
    }
}
