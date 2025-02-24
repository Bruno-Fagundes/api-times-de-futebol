# Minha Primeira API REST com Spring Boot 🚀

Olá! Este é meu primeiro projeto desenvolvendo uma API REST usando Spring Boot. Decidi criar uma API para gerenciar informações sobre times de futebol, permitindo cadastrar times, suas cidades e seus rivais. Este projeto representa meu primeiro passo no desenvolvimento de APIs e tem sido uma excelente oportunidade de aprendizado.

## O Que Aprendi 📚

Durante o desenvolvimento deste projeto, aprendi diversos conceitos importantes:

1. **Arquitetura em Camadas**: Entendi como organizar o código em diferentes camadas (API, DTO, Facade) para ter uma melhor separação de responsabilidades

2. **REST APIs**: Aprendi como criar endpoints REST e usar diferentes métodos HTTP (GET, POST, PUT, DELETE)

3. **Spring Boot**: Minha primeira experiência com este framework, aprendendo sobre:
    - Anotações (@RestController, @Service, @Autowired)
    - Injeção de dependências
    - Configuração automática
    - Gerenciamento de requisições HTTP

4. **Padrões de Projeto**: Implementei padrões como DTO (Data Transfer Object) e Facade, entendendo na prática suas utilidades

## Tecnologias Utilizadas 🛠

- Java 21
- Spring Boot 3.2.2
- Maven
- Spring Web

## O Que a API Faz 💡

Esta API permite:
- Cadastrar novos times de futebol
- Listar todos os times cadastrados
- Atualizar informações de um time
- Deletar times do sistema

Para cada time, armazenamos:
- Nome do time
- Cidade onde está localizado
- Principal rival

## Como Executar o Projeto ▶️

1. Clone o repositório:
```bash
git clone https://github.com/Bruno-Fagundes/api-times-futebol.git
```

2. Entre na pasta do projeto:
```bash
cd api-times-futebol
```

3. Compile:
```bash
mvn clean install
```

4. Execute:
```bash
mvn spring-boot:run
```

A API estará rodando em `http://localhost:8080`

## Exemplos de Uso 🔍

### Cadastrar um Novo Time
```bash
curl -X POST http://localhost:8080/times \
-H "Content-Type: application/json" \
-d '{
    "time": "Grêmio",
    "cidade": "Porto Alegre",
    "rival": "Internacional"
}'
```

### Ver Todos os Times
```bash
curl http://localhost:8080/times
```

## Desafios Enfrentados 💪

Durante o desenvolvimento, encontrei alguns desafios interessantes:

1. **Entender a Estrutura**: No início, foi desafiador entender como organizar o código em diferentes camadas
2. **Nomenclatura**: Aprendi a importância de manter uma nomenclatura consistente para evitar erros
3. **Configuração do Spring**: Compreender as configurações iniciais do Spring Boot

## Próximos Passos 🎯

Pretendo evoluir este projeto adicionando:

1. **Banco de Dados**: Substituir o armazenamento em memória por um banco de dados real
2. **Mais Informações**: Adicionar mais dados sobre os times (títulos, ano de fundação, etc.)
3. **Validações**: Implementar validações para os dados recebidos
4. **Testes**: Aprender e adicionar testes automatizados
5. **Documentação**: Implementar Swagger para documentar a API
6. **Frontend**: Criar uma interface web simples para interagir com a API

## Contribuições 🤝

Como este é meu primeiro projeto, ficarei feliz em receber sugestões e contribuições! Se você tiver alguma ideia ou encontrar algo que possa ser melhorado:

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/SuaMelhoria`)
3. Faça commit das alterações (`git commit -m 'Adiciona nova funcionalidade'`)
4. Faça push para a branch (`git push origin feature/SuaMelhoria`)
5. Abra um Pull Request

## Agradecimentos 🙏

Este projeto foi uma excelente oportunidade de aprendizado e primeiro passo na jornada de desenvolvimento de APIs. Agradeço a todos que contribuírem com sugestões e melhorias!

---

⚡ Desenvolvido como parte do meu processo de aprendizado em desenvolvimento de APIs RESTful com Spring Boot.
