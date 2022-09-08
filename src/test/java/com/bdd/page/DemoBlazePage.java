package com.bdd.page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@DefaultUrl("https://www.demoblaze.com/index.html")

public class DemoBlazePage extends PageObject {

    @FindBy(xpath = "//a[@id='signin2']")
    WebElement Btn_SignUp;

    @FindBy(xpath = "//input[@id='sign-username']")
    WebElement Txt_Username;

    @FindBy(xpath = "//input[@id='sign-password']")
    WebElement Txt_Password;

    @FindBy(xpath = "//button[text()='Sign up']")
    WebElement Btn_SignUpFormulario;

    public void queAbreLaPaginaWebDemoBlazeEnElNavegador(String navegador) {
        Browser.Start(this, "Edge");
    }

    public void realizarClickEnElBotónSignUp() {
        Btn_SignUp.click();
    }

    public void escribirEnElCuadroDeTextoUsername(String username) {
        Txt_Username.sendKeys(username);
    }

    public void escribirEnElCuadroDeTextoPassword(String password) {
        Txt_Password.sendKeys(password);
    }

    public void realizarClickEnElBotónSignUpDelFormulario() {
        Btn_SignUpFormulario.click();
    }

    public void validarSiElUsuarioYaExisteYAceptar() {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), 5);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = this.getDriver().switchTo().alert();
            String alertaMensaje = alert.getText();

            if (alertaMensaje.equals("Sign up successful.")) {
                Assert.assertTrue("Sign up successful.", true);
                this.getDriver().switchTo().alert().accept();
            } else {
                this.getDriver().switchTo().alert().accept();
                Assert.fail("This user already exist.");
            }
        }catch (Exception e) {
            Assert.fail("Error al registrar");
        }
    }
}
