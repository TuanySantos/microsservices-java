# Cadastro de Usuário

Este é um projeto de exemplo que implementa um sistema de cadastro de usuário usando Spring Boot e PostgreSQL.

## Funcionalidades

- Cadastro de novos usuários
- Atualização de informações do usuário
- Exclusão de usuário
- Busca de usuário por ID
- Listagem de todos os usuários cadastrados

## Tecnologias Utilizadas

- Spring Boot: Framework Java para desenvolvimento de aplicações web
- PostgreSQL: Sistema de gerenciamento de banco de dados relacional
- Hibernate: Framework de mapeamento objeto-relacional (ORM)
- Maven: Ferramenta de automação de compilação para projetos Java
- Java 17: Linguagem de programação principal utilizada no projeto

## Configuração do Banco de Dados

Este projeto utiliza o PostgreSQL como banco de dados. Antes de executar a aplicação, certifique-se de ter um servidor PostgreSQL em execução e configure as propriedades de conexão no arquivo `application.properties`.

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/nome_do_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
