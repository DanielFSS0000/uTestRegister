@stories
Feature: uTest Join Today
  Reto tecnico para Automatizacion con teniendo de base uTest para implementar el patron ScreenPlay

@scenario1
 Scenario: Diligenciar formulario de registro
  Given usuario daniel ingresa a pagina uTest
  When diligencia todos los datos que el formulario le solicita
  Then se obtiene el mensaje de usuario creado en la ventan de uTest

