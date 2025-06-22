# API REST de Pedidos com Spring Boot MVC
Este projeto tem como objetivo a construção de uma API RESTful no domínio "Pedido", seguindo o padrão arquitetural MVC. A solução foi desenvolvida com Java Spring Boot e banco de dados H2, proporcionando um CRUD completo com persistência local e seguindo os princípios de arquitetura aprendidos na pós graduação de Arquitetura de Software.

## Tecnologias
- Java 17
- Spring Boot 3.4.7
- Spring Data JPA
- H2 Database
- Lombok

## Funcionalidades
- CRUD completo de pedidos
- Consultas por cliente e status
- Contagem de pedidos

## Execução
1. Clonar o repositório
2. Executar `mvn spring-boot:run`
3. Acessar `http://localhost:8080/v1/pedido`

## Documentação
- Relatório completo em `/docs/relatorio.pdf`

## Endpoints
- GET /v1/pedido - Lista todos os pedidos
- GET /v1/pedido/{id} - Busca pedido por ID
- POST /v1/pedido - Cria/atualiza pedido
- DELETE /v1/pedido/{id} - Remove pedido
- GET /v1/pedido/cliente/{cliente} - Busca por cliente
- GET /v1/pedido/status/{status} - Busca por status
- GET /v1/pedido/contar - Conta total de pedidos
