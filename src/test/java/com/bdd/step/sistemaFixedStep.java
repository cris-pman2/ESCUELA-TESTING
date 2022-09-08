package com.bdd.step;

import com.bdd.page.sistemaFixedPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class sistemaFixedStep extends ScenarioSteps {
    sistemaFixedPage SistemaFixedPage;
    @Step
    public void queAbreLaPaginaWebSistemaFixedEnElNavegador(String navegador) {
        SistemaFixedPage.queAbreLaPaginaWebSistemaFixedEnElNavegador(navegador);
    }

    @Step
    public void realizarClickEnElIconoDeMenú() {
        SistemaFixedPage.realizarClickEnElIconoDeMenú();
    }

    @Step
    public void realizarClickEnElMenúClientes() {
        SistemaFixedPage.realizarClickEnElMenúClientes();
    }

    @Step
    public void realizarClickEnElSubmenúVerMisClientes() {
        SistemaFixedPage.realizarClickEnElSubmenúVerMisClientes();
    }

    @Step
    public void realizarClickEnElBotónAGREGARCLIENTE() {
        SistemaFixedPage.realizarClickEnElBotónAGREGARCLIENTE();
    }

    @Step
    public void seleccionarEnElComboTipoDeDocumento(String tipodedocumento) {
        SistemaFixedPage.seleccionarEnElComboTipoDeDocumento(tipodedocumento);
    }

    @Step
    public void escribirEnElCuadroDeTextoNumeroDeDocumento(String numerodedocumento) {
        SistemaFixedPage.escribirEnElCuadroDeTextoNumeroDeDocumento(numerodedocumento);
    }

    @Step
    public void seleccionarEnElComboPaís(String país) {
        SistemaFixedPage.seleccionarEnElComboPaís(país);
    }

    @Step
    public void escribirEnElCuadroDeTextoRazónSocial(String razónsocial) {
        SistemaFixedPage.escribirEnElCuadroDeTextoRazónSocial(razónsocial);
    }

    @Step
    public void escribirEnElCuadroDeTextoNombre(String nombre) {
        SistemaFixedPage.escribirEnElCuadroDeTextoNombre(nombre);
    }

    @Step
    public void escribirEnElCuadroDeTextoDirección(String dirección) {
        SistemaFixedPage.escribirEnElCuadroDeTextoDirección(dirección);
    }

    @Step
    public void escribirEnElCuadroDeTextoLocalidad(String localidad) {
        SistemaFixedPage.escribirEnElCuadroDeTextoLocalidad(localidad);
    }

    @Step
    public void escribirEnElCuadroDeTextoDepartamento(String departamentos) {
        SistemaFixedPage.escribirEnElCuadroDeTextoDepartamento(departamentos);
    }

    @Step
    public void escribirEnElCuadroDeTextoDomicilioEntrega(String domicilioentrega) {
        SistemaFixedPage.escribirEnElCuadroDeTextoDomicilioEntrega(domicilioentrega);
    }

    @Step
    public void escribirEnElCuadroDeTextoDescuento(String descuento) {
        SistemaFixedPage.escribirEnElCuadroDeTextoDescuento(descuento);
    }

    @Step
    public void escribirEnElCuadroDeTextoMailEnvioFactura(String mailenviofactura) {
        SistemaFixedPage.escribirEnElCuadroDeTextoMailEnvioFactura(mailenviofactura);
    }

    @Step
    public void marcarEnElCheckboxEsProveedor(String esproveedor) {
        SistemaFixedPage.marcarEnElCheckboxEsProveedor(esproveedor);
    }

    @Step
    public void marcarEnElCheckboxEsCliente(String escliente) {
        SistemaFixedPage.marcarEnElCheckboxEsCliente(escliente);
    }

    @Step
    public void realizarClickEnElBotónAgregarDelFormularioAgregarCliente() {
        SistemaFixedPage.realizarClickEnElBotónAgregarDelFormularioAgregarCliente();
    }

    @Step
    public void validarQueSeHayaRegistradoCorrectamente() {
        SistemaFixedPage.validarQueSeHayaRegistradoCorrectamente();
    }
}
