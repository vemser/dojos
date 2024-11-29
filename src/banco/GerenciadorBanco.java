package banco;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorBanco {

    private List<ContaBancaria> contas;

    public GerenciadorBanco() {
        this.contas = new ArrayList<ContaBancaria>();
    }

    public List<ContaBancaria> getContas() {
        return contas;
    }

    public void setContas(List<ContaBancaria> contas) {
        this.contas = contas;
    }


    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public void removerConta(String numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                contas.remove(conta);
                System.out.println("Conta removida com sucesso.");
                return;
            }
        }
        System.out.println("Esse número da conta não existe.");
    }

    public ContaBancaria buscarConta(String numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                System.out.println("Conta encontrada: ");
                return conta;
            }
        }
        System.out.println("Nenhuma conta encontrada!");
        return null;
    }

    public void listarContas(){
        if(contas.isEmpty()){
            System.out.println("Nenhuma conta encontrada no momento!");
            return;
        }

        for(ContaBancaria conta: contas){
            System.out.println(conta);
        }
    }

}
