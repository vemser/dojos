# DojoUmJava
Primeiro Dojo

Sistema de Transações Bancárias
Descrição do Projeto:
Desenvolva um sistema de transações bancárias em Java que permita a realização de operações de depósito, saques em contas bancárias, verificação e atualização de saldo. O sistema deve ser composto por classes, atributos privados e públicos, além de métodos acessores (getters e setters) para manipular os dados das contas.

Sugestões:
Classes Principais:
ContaBancaria: Representa uma conta bancária.
Atributos:
numeroConta (String): Número da conta bancária.
titular (String): Nome do titular da conta.
saldo (double): Saldo atual da conta.
Métodos:
Construtor para inicializar a conta com número, titular e saldo inicial.
Métodos acessores (getters e setters) para os atributos numeroConta, titular e saldo.
Método depositar(double valor): Adiciona o valor ao saldo da conta.
Método sacar(double valor): Subtrai o valor do saldo da conta, se houver saldo suficiente.Classe GerenciadorBanco:
Atributos:
contas (List<ContaBancaria>): Lista de contas bancárias.
Métodos:
Construtor para inicializar a lista de contas.
Método adicionarConta(ContaBancaria conta): Adiciona uma nova conta à lista de contas.
Método removerConta(String numeroConta): Remove uma conta da lista com base no número da conta.
Método buscarConta(String numeroConta): Retorna uma conta com base no número da conta.
Método listarContas(): Lista todas as contas cadastradas.
Regras de Negócio:
Não é permitido sacar um valor maior do que o saldo disponível na conta.
O saldo inicial de uma conta deve ser maior ou igual a zero.
Funcionalidades Adicionais (Opcional):
Classe Main para centralizar a manipulação de todos os dados
O código-fonte deve ser organizado em pacotes conforme as boas práticas de programação.
Adicionar funcionalidades de financiamento e empréstimo.
Atributos:
valorFinanciado (double): Valor total do financiamento.
taxaJurosAnual (double): Taxa de juros anual do financiamento.
prazoMeses (int): Prazo do financiamento em meses.
tipoFinanciamento (enum): Tipo de financiamento (CASA ou CARRO).
contaBancaria (ContaBancaria): Conta bancária associada ao financiamento.


Métodos:
Construtor para inicializar o financiamento com os atributos mencionados.
calcularParcelaMensal(): Calcula o valor da parcela mensal do financiamento.
calcularValorTotal(): Calcula o valor total a ser pago ao final do financiamento.
gerarTabelaFinanciamento(): Gera uma tabela com o número de parcelas, valor da parcela, juros e amortização para cada mês.
Não esquecer de verificar o que precisa ser modificado na classe ContaBancaria
O valor do financiamento deve ser maior que zero.
A taxa de juros anual deve ser maior ou igual a zero.
O prazo em meses deve ser maior que zero.
Verificar se o cliente possui renda compatível com o valor da parcela. (Você pode adicionar um atributo rendaMensal na classe ContaBancaria ou solicitar essa informação durante a criação do financiamento).
Implementar diferentes métodos de cálculo de juros e amortização, como Tabela Price e SAC.

Atributos:
valorEmprestimo (double): Valor total do empréstimo.
taxaJurosMensal (double): Taxa de juros mensal do empréstimo.
prazoMeses (int): Prazo do empréstimo em meses.
contaBancaria (ContaBancaria): Conta bancária associada ao empréstimo.

Métodos:
Construtor para inicializar o empréstimo com os atributos mencionados.
calcularParcelaMensal(): Calcula o valor da parcela mensal do empréstimo.
calcularValorTotal(): Calcula o valor total a ser pago ao final do empréstimo.

Regras de Negócio
O valor do empréstimo deve ser maior que zero.
A taxa de juros mensal deve ser maior ou igual a zero.
O prazo em meses deve ser maior que zero.
Verificar se o cliente possui saldo médio na conta compatível com o valor do empréstimo.
Definir um limite máximo para o valor do empréstimo, que pode variar de acordo com o cliente.