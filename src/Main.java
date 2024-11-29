import banco.ContaBancaria;
import banco.GerenciadorBanco;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    GerenciadorBanco banco = new GerenciadorBanco();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("1- Criar conta");
      System.out.println("2- Depositar");
      System.out.println("3- Sacar");
      System.out.println("4 - Buscar conta");
      System.out.println("5- Listar contas");
      System.out.println("6- Remover contas");
      System.out.println("7- Sair");
      System.out.println("Escolha uma opção.");
      int opcao = scanner.nextInt();
      scanner.nextLine();

      switch (opcao) {
        //Criar conta
        case 1:
          System.out.println("Numero da conta: ");
          String numero = scanner.next();
          System.out.println("Nome do titular: ");
          String titular = scanner.next();

          banco.adicionarConta(new ContaBancaria(titular));
          System.out.println("Conta adicionada com sucesso!");
          break;

        case 2:
          System.out.println("Numero da conta: ");
          numero = scanner.next();
          scanner.nextLine();

          ContaBancaria conta = banco.buscarConta(numero);
          if (conta != null) {
            System.out.println("Valor do deposito: ");
            double valor = scanner.nextDouble();
            conta.depositar(valor);

          }
          break;

        case 3:
          System.out.println("Numero da conta");
          String numero2 = scanner.nextLine();
          ContaBancaria conta3 = banco.buscarConta(numero2);


          if (conta3 != null) {
            System.out.print("Digite o valor que deseja sacar: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();
            conta3.sacar(valor);
          }
          break;
        case 4:
          System.out.println("Numero da conta");
          numero = scanner.nextLine();
          banco.buscarConta(numero);
          break;
        case 5:
          System.out.println("Listando contas: ");
          banco.listarContas();
          break;

        case 6:
          System.out.println("Numero da conta: ");
          numero = scanner.next();
          ContaBancaria conta2 = banco.buscarConta(numero);

          if (conta2 != null) {
            banco.removerConta(conta2.getNumeroConta());
          }
          break;

        case 7:
          System.out.println("Obrigado por usar nosso banco!!");
          return;

        default:
          System.out.println("Opção inválida.");
      }

    }

  }

}