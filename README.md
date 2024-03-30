Cadastro de Usuário
Este é um projeto de exemplo que implementa um sistema de cadastro de usuário usando Spring Boot e PostgreSQL.

Funcionalidades
Cadastro de novos usuários
Atualização de informações do usuário
Exclusão de usuário
Busca de usuário por ID
Listagem de todos os usuários cadastrados
Tecnologias Utilizadas
Spring Boot: Framework Java para desenvolvimento de aplicações web
PostgreSQL: Sistema de gerenciamento de banco de dados relacional
Hibernate: Framework de mapeamento objeto-relacional (ORM)
Maven: Ferramenta de automação de compilação para projetos Java
Java 17: Linguagem de programação principal utilizada no projeto
Configuração do Banco de Dados
Este projeto utiliza o PostgreSQL como banco de dados. Antes de executar a aplicação, certifique-se de ter um servidor PostgreSQL em execução e configure as propriedades de conexão no arquivo application.properties.

properties
Copy code
spring.datasource.url=jdbc:postgresql://localhost:5432/nome_do_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
Como Executar o Projeto
Clone o repositório para o seu ambiente de desenvolvimento:
bash
Copy code
git clone https://github.com/TuanySantos/microsservices-java.git
Navegue até o diretório do projeto:
bash
Copy code
cd cadastro-usuario
Compile o projeto usando o Maven:
bash
Copy code
mvn clean install
Execute a aplicação Spring Boot:
bash
Copy code
mvn spring-boot:run
A aplicação estará disponível em http://localhost:8080.

Endpoints da API
GET /api/usuarios: Lista todos os usuários cadastrados
GET /api/usuarios/{id}: Retorna um usuário específico pelo ID
POST /api/usuarios: Cadastra um novo usuário
PUT /api/usuarios/{id}: Atualiza as informações de um usuário pelo ID
DELETE /api/usuarios/{id}: Exclui um usuário pelo ID
Exemplo de Requisição
Cadastrar um Novo Usuário
http
Copy code
POST /api/usuarios HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
"nome": "Exemplo",
"email": "exemplo@example.com",
"telefone": "(00) 12345-6789"
}
Resposta
http
Copy code
HTTP/1.1 201 Created
Content-Type: application/json

{
"id": 1,
"nome": "Exemplo",
"email": "exemplo@example.com",
"telefone": "(00) 12345-6789"
}
Contribuindo
Contribuições são bem-vindas! Sinta-se à vontade para enviar pull requests ou abrir issues relatando problemas ou sugestões para melhorias.

Licença
Este projeto está licenciado sob a MIT License.