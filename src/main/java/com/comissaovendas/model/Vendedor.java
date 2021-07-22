package com.comissaovendas.model;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {

    private String nome;
    private double salario;
    private List<Venda> vendas;

    public Vendedor(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.vendas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void addVendas(Venda venda) {
        this.vendas.add(venda);
    }

    public void removeVendas(Venda venda) {
        this.vendas.remove(venda);
    }
    
    

}
