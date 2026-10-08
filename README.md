# Sistema de Cadastro - Java

Sistema de cadastro de usuários em **Java** executado no terminal, com operações de cadastrar, listar, buscar, alterar e remover.

O projeto tem como objetivo praticar **Programação Orientada a Objetos** e a lógica de um CRUD simples.

---

## Sobre o projeto

O sistema permite gerenciar uma lista de usuários, cada um com as seguintes informações:

- Nome
- Idade
- E-mail

Os dados ficam armazenados em memória (`ArrayList`) durante a execução do programa.

O projeto foi desenvolvido como parte dos meus estudos em **Java e Programação Orientada a Objetos**.

---

## Tecnologias utilizadas

- Java
- Programação Orientada a Objetos
- Scanner (entrada de dados pelo terminal)
- Collections (`ArrayList`)

---

## Estrutura do projeto

```
├── Main.java
├── SistemaCadastro.java
└── Usuario.java
```

### Main

Ponto de entrada da aplicação. Cria o sistema e inicia o menu.

### SistemaCadastro

Contém a lista de usuários, o menu e todas as operações do sistema.

### Usuario

Classe que representa um usuário, com atributos privados, getters e setters.

---

## Funcionalidades

### Cadastrar usuário

Solicita nome, idade e e-mail e adiciona o usuário à lista.

### Listar usuários

Exibe todos os usuários cadastrados.

### Buscar usuário

Busca um usuário pelo nome, sem diferenciar maiúsculas de minúsculas.

### Alterar usuário

Localiza o usuário pelo nome e permite alterar nome, idade e e-mail.

### Remover usuário

Remove um usuário da lista através do nome.

---

## Menu

```
=========== MENU ===========
1 - Cadastrar usuário
2 - Listar usuários
3 - Buscar usuário
4 - Alterar usuário
5 - Remover usuário
0 - Sair
```

---

## Validações

- A idade só aceita números; caso contrário, o programa pede a digitação novamente
- Mensagem exibida quando o usuário buscado, alterado ou removido não é encontrado
- Mensagem exibida quando a lista está vazia

---

## Como executar

### Pré-requisitos

- JDK instalado

### Passos

```bash
# Clonar o repositório
git clone https://github.com/ruanxanel/sistema-de-cadastro.git

# Entrar na pasta do projeto
cd sistema-de-cadastro

# Compilar
javac -d out *.java

# Executar
java -cp out CadastroPOO.Main
```

Os arquivos declaram o pacote `CadastroPOO`. Se preferir, abra o projeto em uma IDE como o IntelliJ IDEA e execute a classe `Main`.

---

## Conceitos praticados

Durante o desenvolvimento deste projeto foram praticados conceitos como:

- Programação Orientada a Objetos
- Classes e objetos
- Encapsulamento (getters e setters)
- Construtores
- Collections (`ArrayList`)
- Estruturas de repetição e condicionais
- `switch`
- Tratamento de exceções com `try/catch`
- Entrada de dados com `Scanner`

---

## Objetivo

Este projeto faz parte da minha jornada de aprendizado em **desenvolvimento com Java**.

O objetivo é aplicar na prática os conceitos estudados e construir projetos para meu portfólio.

---

## Próximos passos

- [ ] Validar o formato do e-mail
- [ ] Impedir cadastro de e-mails duplicados
- [ ] Buscar e remover por ID em vez de nome
- [ ] Persistir os dados em arquivo ou banco de dados
- [ ] Criar testes automatizados

---

## Autor

**Ruan Henrique**

Estudante de Ciência da Computação, focado em desenvolvimento Back-End com Java e Spring Boot.