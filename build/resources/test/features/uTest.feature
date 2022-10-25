@stories
Feature: uTest Join Today
  @scenario1
   Scenario: Diligenciar formulario de registro
    Given usuario daniel ingresa a pagina uTest
      | strName | strLastName | strMail | strMonth  | strDay  | strYear |
      | Daniel  | Sandoval    | daniel970620@gmail.com  | June  | 20  | 1997  |
    When diligencia todos los datos que el formulario le solicita
      | strCity | zipCode | strCountry  | strBrand  | strBrandModel | strOS |
      | Neiva | 420001  | Colombia  | Xioami  | Mi 10T Pro 5G | Android 12  |

    Then se obtiene el mensaje de usuario creado en la ventan de uTest

