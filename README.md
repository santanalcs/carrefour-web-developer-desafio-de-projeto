<h1>Desafio de Projeto </h1>
<p><h2>Conhecendo Spring Data JPA na Prática com Java.</h2></p><br>

<h2>Projeto - Catálogo de Filmes</h2>
<p>Este projeto foi elaborado a partir das aulas do Desafio de Projeto - Conhecendo Spring Data JPA na prática com java do Bootcamp <strong>Carrefour Web Developer</strong></strong>.</p>

<h2>
Apresentação
</h2>
<p>CRUD de um Catálogo de Filmes que possibilita a geração de um cadastro de dados relacionados á Filmes a partir das tabelas a seguir</p>

- [x] Diretores

- [x] Produtoras

- [x] Filmes

<h2>Estruturas do Projeto</h2>
<p><h3> - Camada de Modelo:</h3>Como o préóprio nome sugere, é onde ficam as class Entity, que são beans criados para representar as regras e propriedades do modelo das entidades de dados (Banco de Dados).</p><p></p>Assim como as Entity, também estão as suas respectivas interfaces, aqui identificadas pelo sufixo Sql, que extends metodos com funcionalidades específicas de acesso e persistência dos dados (Especificação JPA), injetadas nas class que prover servicos ao métodos dos Controllers na camada de Controle.</p>
<p><h3> - Camada de Visão:</h3> Representada por class Form, as quais são importadas e utilizadas como parâmetros em métodos de class Controller e interfaces Service que prover serviços a esses controladores.</p>
<p><h3> - Camada de Controle:</h3> Camada representada por class Controlleres e Services, responsáveis pelo: tratamento e processamento das requisições (Mapeamento das requisições HTTP), e por gerar respostas do fluxo de dados de entradas dos seus respectivos processos (Criação, Atualização, Exclusão e Listagem, dos dados relacionados).</p>

<h2>🛠 Tecnologias Utilizadas</h2>

<ul>
    <li>IDE IntelliJ</li>
    <li>Java 11</li>
    <li>Maven</li>
    <li><strong>Spring Web</strong></li>
    <li><strong>Spring Data JPA</strong></li>
    <li><strong>PostgreSQL Driver</strong></li>
    <li><strong>Hibernate Validator</strong></li>
    <li>Lombok</li>
    <li>Postman</li>
</ul>

------------






