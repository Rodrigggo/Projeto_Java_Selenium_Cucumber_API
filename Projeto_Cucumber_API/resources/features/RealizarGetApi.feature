Feature: Realizar o GET na API SwAip

  @ignore
  @StartFeatureGetApi
  @FinishFeatureGetApi
  Scenario Outline: Realizar o GET na API SwAip e recuperar os titulos
    Given Eu realizo um GET para "<linkAPI>"
    When codigo de resposta deve ser 200
    Then resposta deve conter os titulos com o "<diretor>" e "<produtor>"

    Examples: 
      | linkAPI                     | diretor       | produtor      |
      | http://swapi.co/api/films/  | George Lucas  | Rick McCallum |