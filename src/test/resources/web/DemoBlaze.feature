#language: es

@FEATURE_DEMOBLAZE
Característica: Validación del formulario de registro de usuarios de la pagina DemoBlaze
  Como propietario del sistema DemoBlaze
  Quiero probar el formulario de registro de usuarios
  Para validar el buen funcionamiento de los elementos y registro

  @DEMOBLAZE_ESCENARIO_01
  Esquema del escenario: Validar el correcto funcionamiento del formulario Sign Up de DemoBlaze
    Dado que abre la pagina web DemoBlaze en el navegador "<NAVEGADOR>"
    Y realizar click en el botón Sign Up
    Y escribir "<USERNAME>" en el cuadro de texto Username
    Y escribir "<PASSWORD>" en el cuadro de texto Password
    Cuando realizar click en el botón Sign Up del formulario
    Entonces validar si el usuario ya existe y aceptar

    Ejemplos:
      | NAVEGADOR | USERNAME | PASSWORD |
      | Edge      | cris_pman2     | qwerty12345678    |
