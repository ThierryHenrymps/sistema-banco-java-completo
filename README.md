# Henry Bank

## Descricao

O Henry Bank e um sistema bancario desenvolvido em Java com interface grafica utilizando Swing. O objetivo do projeto e simular o funcionamento basico de um banco, permitindo o cadastro de clientes e contas, alem da realizacao de operacoes bancarias.

O sistema utiliza PostgreSQL para armazenar todas as informacoes de clientes, contas e movimentacoes.

---

## Tecnologias utilizadas

* Java 25
* Maven
* PostgreSQL
* NetBeans IDE
* Java Swing

---

## Funcionalidades

* Login de usuario
* Cadastro de usuarios
* Gerenciamento de usuarios
* Cadastro de clientes
* Gerenciamento de clientes
* Cadastro de contas
* Busca de contas
* Deposito
* Saque
* Transferencia entre contas
* Extrato das movimentacoes
* Relatorio geral do sistema

---

## Como executar o projeto

### 1. Clonar ou abrir o projeto no NetBeans.

### 2. Criar o banco de dados PostgreSQL.

Criar um banco chamado:

```
henrybank
```

Executar o script SQL para criar todas as tabelas do sistema.

### 3. Configurar a conexao

No arquivo `ConexaoDB.java`, alterar caso necessario:

* URL
* Usuario
* Senha

Exemplo:

```java
jdbc:postgresql://localhost:2222/henrybank
```

### 4. Compilar o projeto

### 5. Executar

Executar a classe principal do projeto ou iniciar pelo NetBeans.

---

# Estrutura dos pacotes

## banco.dao

Responsavel por toda comunicacao com o banco de dados.

Classes:

* ClienteDAO
* ContaDAO
* UsuarioDAO
* ExtratoDAO
* RelatorioDAO
* ConexaoDB

---

## banco.model

Contem as classes que representam os objetos do sistema.

Classes:

* Cliente
* Conta
* ContaCorrente
* ContaPoupanca
* Usuario
* Extrato

---

## banco.Util

Contem classes auxiliares utilizadas pelo sistema.

---

## ui

Contem todas as telas do sistema desenvolvidas utilizando Java Swing.

Exemplos:

* TelaLogin
* TelaMenuPrincipal
* TelaCadastroCliente
* TelaCadastroConta
* TelaGerenciarClientes
* TelaGerenciarUsuarios
* TelaOperacoes
* TelaExtrato
* TelaRelatorio

---

# Hierarquia de classes

```
Pessoa
│
├── Cliente
│
└── Usuario


Conta
│
├── ContaCorrente
│
└── ContaPoupanca


Extrato
```

---

# Funcionalidades implementadas

## Cadastro de clientes

Permite cadastrar novos clientes no banco de dados.

## Cadastro de contas

Permite criar contas correntes e poupanca para os clientes.

## Operacoes

O sistema permite:

* Deposito
* Saque
* Transferencia

Todas as operacoes atualizam automaticamente o saldo da conta.

## Extrato

Cada operacao realizada gera um registro na tabela de extrato contendo:

* Conta
* Tipo da operacao
* Valor
* Data
* Hora

## Relatorio

O sistema gera um relatorio geral contendo:

* Valor total depositado
* Valor total sacado
* Quantidade total de movimentacoes

---

# Autor
CEFET MG
Thierry Henry Moreira Pimenta Silva
