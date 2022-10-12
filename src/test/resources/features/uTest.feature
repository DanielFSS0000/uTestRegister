@stories
Feature: uTest Join Today
  Reto tecnico para Automatizacion con teniendo de base uTest para implementar el patron ScreenPlay

@scenario1
 Scenario:Diligenciar registro de formulario
  Given usuario daniel ingresa a uTest para registrarse como nuevo usuario
  When Diligencia todos los datos que el formulario le solicita
  Then se obtiene el mensaje de usuario creado en la ventan de uTest

