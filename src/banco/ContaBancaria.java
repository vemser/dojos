package banco;

public class ContaBancaria {
    public static int numeroGlobal = 1;
    private String numeroConta;
    public String titular;
    private Double saldoAtual;

    public ContaBancaria(String titular) {
        this.numeroConta = String.valueOf(numeroGlobal);
        this.titular = titular;
        this.saldoAtual = 0.0;
        numeroGlobal++;
    }

    public ContaBancaria(String titular, double depositoInicial) {
        this.numeroConta = String.valueOf(numeroGlobal);
        this.titular = titular;
        depositar(depositoInicial);
        numeroGlobal++;
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

    public void depositar(Double valor) {
        if (valor > 0) {
            this.saldoAtual += valor;
        } else {
            System.out.println("Só é possível depositar valores positivos");
        }
    }

    public void sacar(Double valor) {
        if (valor <= 0) {
            System.out.println("Digite um valor positivo");
        } else if (valor <= this.saldoAtual) {
            this.saldoAtual -= valor;
            System.out.println("Valor da conta atual: " + saldoAtual);
        } else {
            System.out.println("Digite um valor menor ou igual ao seu saldo atual");
        }

    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroConta='" + numeroConta + '\'' +
                ", titular='" + titular + '\'' +
                ", saldoAtual=" + saldoAtual +
                '}';
    }
}
