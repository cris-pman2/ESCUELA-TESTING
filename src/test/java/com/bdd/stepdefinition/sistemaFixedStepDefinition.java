package com.bdd.stepdefinition;

import com.bdd.step.sistemaFixedStep;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class sistemaFixedStepDefinition {
    @Steps
    sistemaFixedStep SistemaFixedStep;

    @Dado("^que abre la pagina web sistemaFixed en el navegador \"([^\"]*)\"$")
    public void queAbreLaPaginaWebSistemaFixedEnElNavegador(String navegador) throws Throwable {
        SistemaFixedStep.queAbreLaPaginaWebSistemaFixedEnElNavegador(navegador);
    }

    @Y("^realizar click en el icono de menú$")
    public void realizarClickEnElIconoDeMenú() {
        SistemaFixedStep.realizarClickEnElIconoDeMenú();
    }

    @Y("^realizar click en el menú Clientes$")
    public void realizarClickEnElMenúClientes() {
        SistemaFixedStep.realizarClickEnElMenúClientes();
    }

    @Y("^realizar click en el submenú Ver mis clientes$")
    public void realizarClickEnElSubmenúVerMisClientes() {
        SistemaFixedStep.realizarClickEnElSubmenúVerMisClientes();
        
    }

    @Y("^realizar click en el botón AGREGAR CLIENTE$")
    public void realizarClickEnElBotónAGREGARCLIENTE() {
        SistemaFixedStep.realizarClickEnElBotónAGREGARCLIENTE();
    }

    @Y("^seleccionar \"([^\"]*)\" en el combo Tipo de documento$")
    public void seleccionarEnElComboTipoDeDocumento(String TIPODEDOCUMENTO) throws Throwable {
        SistemaFixedStep.seleccionarEnElComboTipoDeDocumento(TIPODEDOCUMENTO);
    }

    @Y("^escribir \"([^\"]*)\" en el cuadro de texto Numero de documento$")
    public void escribirEnElCuadroDeTextoNumeroDeDocumento(String NUMERODEDOCUMENTO) throws Throwable {
        SistemaFixedStep.escribirEnElCuadroDeTextoNumeroDeDocumento(NUMERODEDOCUMENTO);
    }

    @Y("^seleccionar \"([^\"]*)\" en el combo País$")
    public void seleccionarEnElComboPaís(String País) throws Throwable {
        SistemaFixedStep.seleccionarEnElComboPaís(País);
    }

    @Y("^escribir \"([^\"]*)\" en el cuadro de texto Razón Social$")
    public void escribirEnElCuadroDeTextoRazónSocial(String RAZÓNSOCIAL) throws Throwable {
        SistemaFixedStep.escribirEnElCuadroDeTextoRazónSocial(RAZÓNSOCIAL);
    }

    @Y("^escribir \"([^\"]*)\" en el cuadro de texto Nombre$")
    public void escribirEnElCuadroDeTextoNombre(String Nombre) throws Throwable {
        SistemaFixedStep.escribirEnElCuadroDeTextoNombre(Nombre);
    }

    @Y("^escribir \"([^\"]*)\" en el cuadro de texto Dirección$")
    public void escribirEnElCuadroDeTextoDirección(String Dirección) throws Throwable {
        SistemaFixedStep.escribirEnElCuadroDeTextoDirección(Dirección);
    }

    @Y("^escribir \"([^\"]*)\" en el cuadro de texto Localidad$")
    public void escribirEnElCuadroDeTextoLocalidad(String Localidad) throws Throwable {
        SistemaFixedStep.escribirEnElCuadroDeTextoLocalidad(Localidad);
    }

    @Y("^escribir \"([^\"]*)\" en el cuadro de texto Departamento$")
    public void escribirEnElCuadroDeTextoDepartamento(String Departamentos) throws Throwable {
        SistemaFixedStep.escribirEnElCuadroDeTextoDepartamento(Departamentos);
    }

    @Y("^escribir \"([^\"]*)\" en el cuadro de texto Domicilio entrega$")
    public void escribirEnElCuadroDeTextoDomicilioEntrega(String DOMICILIOENTREGA) throws Throwable {
        SistemaFixedStep.escribirEnElCuadroDeTextoDomicilioEntrega(DOMICILIOENTREGA);
    }

    @Y("^escribir \"([^\"]*)\" en el cuadro de texto Descuento$")
    public void escribirEnElCuadroDeTextoDescuento(String Descuento) throws Throwable {
        SistemaFixedStep.escribirEnElCuadroDeTextoDescuento(Descuento);
    }

    @Y("^escribir \"([^\"]*)\" en el cuadro de texto Mail envio factura$")
    public void escribirEnElCuadroDeTextoMailEnvioFactura(String MAILENVIOFACTURA) throws Throwable {
        SistemaFixedStep.escribirEnElCuadroDeTextoMailEnvioFactura(MAILENVIOFACTURA);
    }

    @Y("^marcar \"([^\"]*)\" en el checkbox Es proveedor$")
    public void marcarEnElCheckboxEsProveedor(String ESPROVEEDOR) throws Throwable {
        SistemaFixedStep.marcarEnElCheckboxEsProveedor(ESPROVEEDOR);
    }

    @Y("^marcar \"([^\"]*)\" en el checkbox Es cliente$")
    public void marcarEnElCheckboxEsCliente(String ESCLIENTE) throws Throwable {
        SistemaFixedStep.marcarEnElCheckboxEsCliente(ESCLIENTE);
    }

    @Cuando("^realizar click en el botón Agregar del formulario Agregar Cliente$")
    public void realizarClickEnElBotónAgregarDelFormularioAgregarCliente() {
        SistemaFixedStep.realizarClickEnElBotónAgregarDelFormularioAgregarCliente();
    }

    @Entonces("^validar que se haya registrado correctamentes$")
    public void validarQueSeHayaRegistradoCorrectamente() {
        SistemaFixedStep.validarQueSeHayaRegistradoCorrectamente();
    }

}
