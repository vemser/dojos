public class ContaBancaria {
    private String numeroConta;
    public String titular;
    private Double saldoAtual;

    public ContaBancaria(String numeroConta, String titular){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldoAtual = 0.0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(Double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public void Depositar(Double valor){
        if(valor > 0){
            this.saldoAtual += valor;
        }else{
            System.out.println("Só é possível depositar valores positivos");
        }
    }

    public void Sacar(Double valor){
        if(valor <= 0){
            System.out.println("Digite um valor positivo");
        }
        else if(valor <= this.saldoAtual){
            this.saldoAtual -= valor;
        }else {
            System.out.println("Digite um valor menor ou igual ao seu saldo atual");
        }

    }

}
