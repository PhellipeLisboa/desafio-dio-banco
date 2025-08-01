# Banco Digital - Desafio DIO

Projeto desenvolvido como parte de um desafio proposto no bootcamp da Digital Innovation One (DIO). 
O objetivo era simular um **banco digital**, utilizando conceitos de Programação Orientada a Objetos (POO) com Java.

---

## Funcionalidades implementadas

✅ Criação de clientes (Pessoa Física e Pessoa Jurídica). 
✅ Abertura de contas (Corrente e Poupança).
✅ Depósito, saque e transferência entre contas.  
✅ Registro automático de transações.  
✅ Impressão de extrato com histórico.
✅ Busca de contas por cliente.
✅ Listagem de todos os clientes do banco.

---

## Estrutura de Classes

- `Banco`: Gerencia contas e operações gerais.
- `Cliente` (abstrata): Estrutura básica da entidade cliente.
    - `ClientePessoaFisica`: Possui acesso à conta poupança.
    - `ClientePessoaJuridica`: Não possui acesso à poupança.
- `IConta` (interface): Estabelece os métodos obrigatórios para todos os tipos de conta.
- `Conta` (abstrata): Estrutura básica para a entidade conta.
    - `ContaCorrente`
    - `ContaPoupanca`
- `TipoTransacao` (enum): Estabelece os tipos de transações possíveis.
- `Transacao`: Representação de uma movimentação (depósito, saque, transferência).
- `Main`: Ambiente usado para testar as funcionalidades implementadas.

---

## Conceitos aplicados

- Herança e polimorfismo
- Classes abstratas e métodos sobrescritos.
- Encapsulamento de lógica de negócio.
- Stream API para buscas e listagens.
- Enum para tipos de transação.
- DateTimeFormatter para formatação de datas.

---

## Ideias para futuras melhorias
- Implementar autenticação de cliente.
- Implementar produtos financeiros como cartão de crédito, empréstimo, etc.
- Melhorar a interface para a interação com o sistema.