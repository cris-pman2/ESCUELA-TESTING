package com.bdd.page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Locale;

@DefaultUrl("https://sistema.fixed.uy/demo-85")

public class sistemaFixedPage extends PageObject {

    @FindBy(xpath = "//a[@onclick='actualizarMenuFijo()']")
    WebElement Btn_Menú;

    @FindBy(xpath = "//span[text()='Clientes']")
    WebElement Btn_Clientes;

    @FindBy(xpath = "//span[text()='Ver mis clientes']")
    WebElement Btn_VerMisClientes;

    @FindBy(xpath = "//button[@data-target='#Agregar']")
    WebElement Btn_AgregarCliente;

    @FindBy(xpath = "//button[contains(text(),'RUT (Uruguay)')]")
    WebElement Cbo_TipoDocumento;

    @FindBy(xpath = "//label[text()=' Otros']")
    WebElement Btn_Otros;

    @FindBy(xpath = "//input[@id='Número-de-documento']")
    WebElement Txt_NumeroDocumento;

    @FindBy(xpath = "//*[@id='paisContenedor']/div/button")
    WebElement Cbo_País;

    @FindBy(xpath = "//label[text()=' Perú']")
    WebElement Btn_Perú;

    @FindBy(xpath = "//input[@id='Razón-Social']")
    WebElement Txt_RazonSocial;

    @FindBy(xpath = "//input[@id='Nombre']")
    WebElement Txt_Nombre;

    @FindBy(xpath = "//input[@id='Dirección']")
    WebElement Txt_Direccion;

    @FindBy(xpath = "//input[@id='Localidad']")
    WebElement Txt_Localidad;

    @FindBy(xpath = "//input[@id='Departamento']")
    WebElement Txt_Departamento;

    @FindBy(xpath = "//input[@id='Dirección-entrega']")
    WebElement Txt_DomicilioEntrega;

    @FindBy(xpath = "//input[@id='Descuento']")
    WebElement Txt_Descuento;

    @FindBy(xpath = "//input[@id='Mail-envio-factura']")
    WebElement Txt_MailEnvioFactura;

    @FindBy(xpath = "//*[@id='formAgregarCliente']/div[1]/div[13]/div[2]/div/label")
    WebElement Chk_EsProvedor;

    @FindBy(xpath = "//*[@id='formAgregarCliente']/div[1]/div[14]/div[2]/div/label")
    WebElement Chk_EsCliente;

    @FindBy(xpath = "//button[text()='Agregar']")
    WebElement Btn_Agregar;

    public void queAbreLaPaginaWebSistemaFixedEnElNavegador(String navegador) {
        Browser.Start(this, "Edge");
    }

    public void realizarClickEnElIconoDeMenú() {
        Btn_Menú.click();
    }

    public void realizarClickEnElMenúClientes() {
        Btn_Clientes.click();
    }

    public void realizarClickEnElSubmenúVerMisClientes() {
        Btn_VerMisClientes.click();
    }

    public void realizarClickEnElBotónAGREGARCLIENTE() {
        Btn_AgregarCliente.click();
    }

    public void seleccionarEnElComboTipoDeDocumento(String tipodedocumento) {
        Cbo_TipoDocumento.click();
        Cbo_TipoDocumento.sendKeys(tipodedocumento);
        Btn_Otros.click();
    }

    public void escribirEnElCuadroDeTextoNumeroDeDocumento(String numerodedocumento) {
        Txt_NumeroDocumento.sendKeys(numerodedocumento);
    }

    public void seleccionarEnElComboPaís(String país) {
        Cbo_País.click();
        Cbo_País.sendKeys(país);
        Btn_Perú.click();
    }

    public void escribirEnElCuadroDeTextoRazónSocial(String razónsocial) {
        Txt_RazonSocial.sendKeys(razónsocial);
    }

    public void escribirEnElCuadroDeTextoNombre(String nombre) {
        Txt_Nombre.sendKeys(nombre);
    }

    public void escribirEnElCuadroDeTextoDirección(String dirección) {
        Txt_Direccion.sendKeys(dirección);
    }

    public void escribirEnElCuadroDeTextoLocalidad(String localidad) {
        Txt_Localidad.sendKeys(Keys.CONTROL + "a");
        Txt_Localidad.sendKeys(localidad);
    }

    public void escribirEnElCuadroDeTextoDepartamento(String departamentos) {
        Txt_Departamento.sendKeys(Keys.CONTROL + "a");
        Txt_Departamento.sendKeys(departamentos);
    }

    public void escribirEnElCuadroDeTextoDomicilioEntrega(String domicilioentrega) {
        Txt_DomicilioEntrega.sendKeys(domicilioentrega);
    }

    public void escribirEnElCuadroDeTextoDescuento(String descuento) {
        Txt_Descuento.sendKeys(descuento);
    }

    public void escribirEnElCuadroDeTextoMailEnvioFactura(String mailenviofactura) {
        Txt_MailEnvioFactura.sendKeys(mailenviofactura);
    }

    public void marcarEnElCheckboxEsProveedor(String esproveedor) {
        Chk_EsProvedor.click();
        if (esproveedor.toLowerCase().replace(" ","")=="SI"){
            Chk_EsProvedor.click();

        }
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }

    public void marcarEnElCheckboxEsCliente(String escliente) {
        Chk_EsCliente.click();
        if (escliente.toLowerCase().replace(" ","")=="NO"){
            Chk_EsCliente.click();
        }
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }

    public void realizarClickEnElBotónAgregarDelFormularioAgregarCliente() {
        Btn_Agregar.click();
    }

    public void validarQueSeHayaRegistradoCorrectamente() {
        try {
            getDriver().findElement(By.xpath("//div[@class='alert alert-success' and text()=' Cliente creada con éxito.             ' ]"));
            Assert.assertTrue("Se ejecutó correctamente", true);
        }catch (Exception e) {
            Assert.fail("Error al registrar");
        }
    }


}
