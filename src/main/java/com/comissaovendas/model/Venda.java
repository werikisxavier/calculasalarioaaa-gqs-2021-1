package com.comissaovendas.model;

public class Venda {

    private double valorTotal;
    private double percentualComissao;
    private double comissaoVendedor;

    public Venda(double valorTotal, double percentualComissao) throws Exception {
        this.valorTotal = valorTotal;
        this.setPercentualComissao(percentualComissao);
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) throws Exception {
        if (percentualComissao >= 0 && percentualComissao <= 100) {
            this.percentualComissao = percentualComissao;
            this.comissaoVendedor = valorTotal * percentualComissao / 100;
        } else {
            throw new Exception("Percentual invalido!");
        }
    }

    public double getComissaoVendedor() {
        return comissaoVendedor;
    }

}
