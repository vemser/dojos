package sevicos;

import banco.ContaBancaria;

public class Financiamento {
    private double valorFinanciado;
    private double taxaJurosAnual ;
    private int prazoMeses; 
    private Financiamento tipoFinanciamento;
    private ContaBancaria contaBancaria = new ContaBancaria(null);

    public Financiamento (){

    }

    public double getValorFinanciado() {
        return valorFinanciado;
    }

    public void setValorFinanciado(double valorFinanciado) {
        this.valorFinanciado = valorFinanciado;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void setTaxaJurosAnual(double taxaJurosAnual) {
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public int getPrazoMeses() {
        return prazoMeses;
    }

    public void setPrazoMeses(int prazoMeses) {
        this.prazoMeses = prazoMeses;
    }

    public Financiamento getTipoFinanciamento() {
        return tipoFinanciamento;
    }

    public void setTipoFinanciamento(Financiamento tipoFinanciamento) {
        this.tipoFinanciamento = tipoFinanciamento;
    }

    public ContaBancaria getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }


    
}
