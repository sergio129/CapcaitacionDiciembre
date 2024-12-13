Feature: Realizar compra de diferentes productos

  @Login
  Scenario: Login exito
    Given Usuario ingresa a la pagina de demoblaze
    When Usuario se logue con las siguientes credenciales, Usuario: "sanayaromero62@gmail.com", Contra:"Sistemas_89*"
    Then Validamos que se muestre "Welcome sanayaromero62@gmail.com"