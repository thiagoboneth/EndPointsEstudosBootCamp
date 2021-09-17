package com.estudoendpoint.demo.controllers;


import com.estudoendpoint.demo.model.ListaProdutoPeso;
import com.estudoendpoint.demo.model.Pessoa;
import com.estudoendpoint.demo.model.ProdutosPeso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Locale;

@RestController

public class TestEndPoints {

    @GetMapping("/{nome}")

        public String inverteString(@PathVariable String nome){

        StringBuilder sb = new StringBuilder(nome);
        sb.reverse();
        return "Seu nome invertido " + sb.toString().toUpperCase(Locale.ROOT);

    }

    public String inversor(String nome){

        StringBuilder sb = new StringBuilder(nome);
        sb.reverse();
        return sb.toString().toUpperCase(Locale.ROOT);
    }

    @GetMapping("/teste2/{nome}")
    public String palidromo(@PathVariable String nome){

        nome = nome.replaceAll("\\s+", "").toUpperCase(Locale.ROOT);
        if (nome.equals(inversor(nome))) {
            return nome + " É Palindromo";
        }
        return "Não é Palindromo";
    }

    @GetMapping("/pessoa")

    public Pessoa retornaPessoa(@RequestParam String nome, @RequestParam String sobrenome, @RequestParam Integer idade){
        Pessoa pessoa = new Pessoa(nome,sobrenome,idade);
        return pessoa;
     }

     @GetMapping("/listaPeso")

    public ArrayList<ProdutosPeso> retornaListaPeso() {

         ArrayList<ProdutosPeso> produto = new ArrayList<>();

         ListaProdutoPeso listagem = new ListaProdutoPeso();

         ProdutosPeso produtosPeso1 = new ProdutosPeso("Feijão", 1.0);
         ProdutosPeso produtosPeso2 = new ProdutosPeso("Sal", 0.5);
         ProdutosPeso produtosPeso3 = new ProdutosPeso("Farinha",1.0);
         ProdutosPeso produtosPeso4 = new ProdutosPeso("Arroz",5.0);

         listagem.guardaProduto(produtosPeso1);
         listagem.guardaProduto(produtosPeso2);
         listagem.guardaProduto(produtosPeso3);
         listagem.guardaProduto(produtosPeso4);


         return listagem.retornaLista();
     }

}
