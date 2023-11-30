#language: en

@UserLogin
Feature: El usuario realiza el proceso para hacer el Login


  Scenario Outline: Login de usuario con resultado exitoso
    Given el usuario ingresa con los datos "<username>" "<password>"
    Then el usuario puede ingresar exitosamente

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | locked_out_user         | secret_sauce |


  Scenario Outline: Login de usuario con resultado fallido
    Given el usuario ingresa con los datos "<username>" "<password>"
    Then el usuario evidencia un error en el ingreso

    Examples:
      | username      | password     |
      | standard_user | 123456       |
      | prueba1234    | secret_sauce |
      | prueba12345   | Pruaba321    |