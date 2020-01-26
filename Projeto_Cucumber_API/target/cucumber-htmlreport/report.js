$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ConsultarVagas.feature");
formatter.feature({
  "line": 1,
  "name": "Consultar vagas",
  "description": "",
  "id": "consultar-vagas",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#@ignore"
    }
  ],
  "line": 6,
  "name": "Acessar a tela confira nossas vaga",
  "description": "",
  "id": "consultar-vagas;acessar-a-tela-confira-nossas-vaga",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@StartFeatureConsultarVagas"
    },
    {
      "line": 5,
      "name": "@FinishFeatureConsultarVagas"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Acessar o site \"\u003cinmetrics\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Acessar a pagina confira nossas vagas",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Realizar uma consulta no departamento \"\u003cdepartamento\u003e\" para o estado \"\u003cestado\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "consultar-vagas;acessar-a-tela-confira-nossas-vaga;",
  "rows": [
    {
      "cells": [
        "inmetrics",
        "departamento",
        "estado"
      ],
      "line": 12,
      "id": "consultar-vagas;acessar-a-tela-confira-nossas-vaga;;1"
    },
    {
      "cells": [
        "https://www.inmetrics.com.br/",
        "Consulting",
        "Barueri"
      ],
      "line": 13,
      "id": "consultar-vagas;acessar-a-tela-confira-nossas-vaga;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 11228393200,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Acessar a tela confira nossas vaga",
  "description": "",
  "id": "consultar-vagas;acessar-a-tela-confira-nossas-vaga;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@StartFeatureConsultarVagas"
    },
    {
      "line": 5,
      "name": "@FinishFeatureConsultarVagas"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Acessar o site \"https://www.inmetrics.com.br/\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Acessar a pagina confira nossas vagas",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Realizar uma consulta no departamento \"Consulting\" para o estado \"Barueri\"",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.inmetrics.com.br/",
      "offset": 16
    }
  ],
  "location": "ConsultarVagasStep.acessar_o_site(String)"
});
formatter.result({
  "duration": 47342579900,
  "status": "passed"
});
formatter.match({
  "location": "ConsultarVagasStep.acessar_a_pagina_confira_nossas_vagas()"
});
formatter.result({
  "duration": 38441415200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Consulting",
      "offset": 39
    },
    {
      "val": "Barueri",
      "offset": 66
    }
  ],
  "location": "ConsultarVagasStep.realizar_uma_consulta_no_departamento_para_o_estado(String,String)"
});
formatter.result({
  "duration": 2352837600,
  "status": "passed"
});
formatter.after({
  "duration": 696583100,
  "status": "passed"
});
formatter.uri("RealizarGetApi.feature");
formatter.feature({
  "line": 1,
  "name": "Realizar o GET na API SwAip",
  "description": "",
  "id": "realizar-o-get-na-api-swaip",
  "keyword": "Feature"
});
});