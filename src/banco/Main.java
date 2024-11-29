package banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorBanco banco = new GerenciadorBanco();
        Scanner scanner = new Scanner(System.in);
       
        while(true){

            System.out.println("1- Criar conta");
            System.out.println("2- Depositar");
            System.out.println("3- Sacar");
            System.out.println("4- Listar contas");
            System.out.println("5- Remover contas");
            System.out.println("6- Sair");
            System.out.println("Escolha uma opção.");

            int opcao = scanner.nextInt();


            switch(opcao){

                case 1:
                    System.out.println("Numero da conta: ");
                    String numero = scanner.next();
                    System.out.println("Nome do titular: ");
                    String titular = scanner.next();

                    banco.adicionarConta(new ContaBancaria(numero, titular));
                    System.out.println("Conta adicionada com sucesso!");
                    break;
                case 2:
                    System.out.println("Numero da conta: ");
                    numero = scanner.next();

                    ContaBancaria conta = banco.buscarConta(numero);
                    if(conta != null){
                        System.out.println("Valor do deposito: ");
                        double valor = scanner.nextDouble();

                    }
            }
        }
        

    }
}

