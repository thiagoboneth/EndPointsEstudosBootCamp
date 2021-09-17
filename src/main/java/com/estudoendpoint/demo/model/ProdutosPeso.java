package com.estudoendpoint.demo.model;

public class ProdutosPeso {

    private String nomeProduto;
    private Double pesoProduto;

    public ProdutosPeso(String nomeProduto, Double pesoProduto) {
        this.nomeProduto = nomeProduto;
        this.pesoProduto = pesoProduto;
    }


    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getPesoProduto() {
        return pesoProduto;
    }

    public void setPesoProduto(Double pesoProduto) {
        this.pesoProduto = pesoProduto;
    }

    @Override
    public String toString() {
        return "ProdutosPeso{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", pesoProduto=" + pesoProduto +
                '}';
    }
}
