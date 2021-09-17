package com.estudoendpoint.demo.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListaProdutoPeso {

    ArrayList<ProdutosPeso> produto = new ArrayList<>();

    public void guardaProduto(ProdutosPeso produtoGuardar){
        produto.add(produtoGuardar);
    }

    public void listaProdutoPeso() {
        Collections.sort(produto, new Comparator<ProdutosPeso>() {
            @Override
            public int compare(ProdutosPeso o1, ProdutosPeso o2) {
                return o1.getPesoProduto().compareTo(o2.getPesoProduto());
            }
        });
    }

    public ArrayList<ProdutosPeso> retornaLista(){
        listaProdutoPeso();
        return produto;
    }
}
