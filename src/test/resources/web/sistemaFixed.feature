#language: es

@FEATURE_SISTEMAFIXED
Característica: Validación del formulario de ingreso de usuarios de la pagina sistemaFixed
  Como propietario del sistema sistemaFixed
  Quiero probar el formulario de ingreso de clientes
  Para validar el buen funcionamiento de los elementos y ingreso

  @SISTEMAFIXED_ESCENARIO_01
  Esquema del escenario: Validar el correcto funcionamiento del formulario Agregar Cliente de sistemaFixed
    Dado que abre la pagina web sistemaFixed en el navegador "<NAVEGADOR>"
    Y realizar click en el icono de menú
    Y realizar click en el menú Clientes
    Y realizar click en el submenú Ver mis clientes
    Y realizar click en el botón AGREGAR CLIENTE
    Y seleccionar "<TIPODEDOCUMENTO>" en el combo Tipo de documento
    Y escribir "<NUMERODEDOCUMENTO>" en el cuadro de texto Numero de documento
    Y seleccionar "<PAÍS>" en el combo País
    Y escribir "<RAZÓNSOCIAL>" en el cuadro de texto Razón Social
    Y escribir "<NOMBRE>" en el cuadro de texto Nombre
    Y escribir "<DIRECCIÓN>" en el cuadro de texto Dirección
    Y escribir "<LOCALIDAD>" en el cuadro de texto Localidad
    Y escribir "<DEPARTAMENTO>" en el cuadro de texto Departamento
    Y escribir "<DOMICILIOENTREGA>" en el cuadro de texto Domicilio entrega
    Y escribir "<DESCUENTO>" en el cuadro de texto Descuento
    Y escribir "<MAILENVIOFACTURA>" en el cuadro de texto Mail envio factura
    Y marcar "<ESPROVEEDOR>" en el checkbox Es proveedor
    Y marcar "<ESCLIENTE>" en el checkbox Es cliente
    Cuando realizar click en el botón Agregar del formulario Agregar Cliente
    Entonces validar que se haya registrado correctamentes

    Ejemplos:
      | NAVEGADOR | TIPODEDOCUMENTO | NUMERODEDOCUMENTO | PAÍS | RAZÓNSOCIAL   | NOMBRE         | DIRECCIÓN        | LOCALIDAD | DEPARTAMENTO | DOMICILIOENTREGA | DESCUENTO | MAILENVIOFACTURA      | ESPROVEEDOR | ESCLIENTE |
      | Edge      | Otros           | 70873640          | Perú | RESEDISA EIRL | Luis Alcantara | Calle 6 de enero | Trujillo  | La Libertad  | Cesar Vallejo    | 616       | cris_pman@hotmail.com | SI          | NO        |
