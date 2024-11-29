
import java.util.ArrayList;
import java.util.List;

public class GerenciadorBanco {

    private List<ContaBancaria> contas;

    public GerenciadorBanco(List<ContaBancaria> contas){
        this.contas = contas;
    }

    public List<ContaBancaria> getContas() {
        return contas;
    }

    public void setContas(List<ContaBancaria> contas) {
        this.contas = contas;
    }


    public void adicionarConta(ContaBancaria conta){
        contas.add(conta);
    }

    public void removerConta(String numeroConta){
        for(ContaBancaria conta: contas){
            if(conta.getNumeroConta().equals(numeroConta)) {
                contas.remove(conta);
                System.out.println("Conta removida com sucesso.");
                return;
            }
        }
        System.out.println("Esse número da conta não existe.");
    }



}
