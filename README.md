# Grails 6 + docker


## Buildar e rodar imagem docker 

Para buildar e rodar a imagem docker rode o script rodarimagem.sh


## Tabela de comandos

| Comando Grails |Comando Gladew  |
|--|--|
|grails war  | ./gradlew assemble |
|grails check  | ./gradlew test-app |
|grails test  | grails test-app -unit |
|grails integrationTest  | grails test-app -integration |


## Ativação do hot Reloading

É necessário da seguinte dependência

`
developmentOnly("org.springframework.boot:spring-boot-devtools")
`


## Grails 6.0.0 Documentation

- [User Guide](https://docs.grails.org/6.0.0/guide/index.html)
- [API Reference](https://docs.grails.org/6.0.0/api/index.html)
- [Grails Guides](https://guides.grails.org/index.html)
---

## Feature geb documentation

- [Grails Geb Functional Testing for Grails documentation](https://github.com/grails3-plugins/geb#readme)

- [https://www.gebish.org/manual/current/](https://www.gebish.org/manual/current/)

## Feature micronaut-http-client documentation

- [Grails Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

## Feature scaffolding documentation

- [Grails Scaffolding Plugin documentation](https://grails.github.io/scaffolding/latest/groovydoc/)

- [https://grails-fields-plugin.github.io/grails-fields/latest/guide/index.html](https://grails-fields-plugin.github.io/grails-fields/latest/guide/index.html)

## Feature asset-pipeline-grails documentation

- [Grails Asset Pipeline Core documentation](https://www.asset-pipeline.com/manual/)

