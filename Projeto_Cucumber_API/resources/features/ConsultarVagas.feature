Feature: Consultar vagas

   #@ignore
  @StartFeatureConsultarVagas
  @FinishFeatureConsultarVagas
  Scenario Outline: Acessar a tela confira nossas vaga
    Given Acessar o site "<inmetrics>"
    When  Acessar a pagina confira nossas vagas
    Then  Realizar uma consulta no departamento "<departamento>" para o estado "<estado>"

    Examples: 
      | inmetrics                     | departamento        | estado  |
      | https://www.inmetrics.com.br/ | Consulting          | Barueri |