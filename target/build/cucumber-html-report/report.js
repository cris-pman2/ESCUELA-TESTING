$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/web/DemoBlaze.feature");
formatter.feature({
  "name": "Validación del formulario de registro de usuarios de la pagina DemoBlaze",
  "description": "  Como propietario del sistema DemoBlaze\n  Quiero probar el formulario de registro de usuarios\n  Para validar el buen funcionamiento de los elementos y registro",
  "keyword": "Característica",
  "tags": [
    {
      "name": "@FEATURE_DEMOBLAZE"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Validar el correcto funcionamiento del formulario Sign Up de DemoBlaze",
  "description": "",
  "keyword": "Esquema del escenario",
  "tags": [
    {
      "name": "@DEMOBLAZE_ESCENARIO_01"
    }
  ]
});
formatter.step({
  "name": "que abre la pagina web DemoBlaze en el navegador \"\u003cNAVEGADOR\u003e\"",
  "keyword": "Dado "
});
formatter.step({
  "name": "realizar click en el botón Sign Up",
  "keyword": "Y "
});
formatter.step({
  "name": "escribir \"\u003cUSERNAME\u003e\" en el cuadro de texto Username",
  "keyword": "Y "
});
formatter.step({
  "name": "escribir \"\u003cPASSWORD\u003e\" en el cuadro de texto Password",
  "keyword": "Y "
});
formatter.step({
  "name": "realizar click en el botón Sign Up del formulario",
  "keyword": "Cuando "
});
formatter.step({
  "name": "validar si el usuario ya existe y aceptar",
  "keyword": "Entonces "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Ejemplos",
  "rows": [
    {
      "cells": [
        "NAVEGADOR",
        "USERNAME",
        "PASSWORD"
      ]
    },
    {
      "cells": [
        "Edge",
        "cris_pman2",
        "qwerty12345678"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validar el correcto funcionamiento del formulario Sign Up de DemoBlaze",
  "description": "",
  "keyword": "Esquema del escenario",
  "tags": [
    {
      "name": "@FEATURE_DEMOBLAZE"
    },
    {
      "name": "@DEMOBLAZE_ESCENARIO_01"
    }
  ]
});
formatter.step({
  "name": "que abre la pagina web DemoBlaze en el navegador \"Edge\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.queAbreLaPaginaWebDemoBlazeEnElNavegador(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "realizar click en el botón Sign Up",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.realizarClickEnElBotónSignUp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribir \"cris_pman2\" en el cuadro de texto Username",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.escribirEnElCuadroDeTextoUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribir \"qwerty12345678\" en el cuadro de texto Password",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.escribirEnElCuadroDeTextoPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "realizar click en el botón Sign Up del formulario",
  "keyword": "Cuando "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.realizarClickEnElBotónSignUpDelFormulario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validar si el usuario ya existe y aceptar",
  "keyword": "Entonces "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.validarSiElUsuarioYaExiste()"
});
formatter.result({
  "status": "passed"
});
});