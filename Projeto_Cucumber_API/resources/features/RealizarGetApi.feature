Feature: Realizar o GET na API SwAip

  @ignore
  @StartFeatureGetApi
  @FinishFeatureGetApi
  Scenario Outline: Realizar o GET na API SwAip e recuperar os titulos
    Given Eu realizo um GET para "<linkAPI>"
    Then  codigo de resposta deve ser <codigo>
    When  resposta deve conter os titulos com o "<diretor>" e "<produtor>"

    Examples: 
      | linkAPI                     | codigo       | diretor       | produtor      |
      | http://swapi.co/api/films/  | 200          | George Lucas  | Rick McCallum |