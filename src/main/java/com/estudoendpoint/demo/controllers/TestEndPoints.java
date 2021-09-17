package com.estudoendpoint.demo.controllers;


import com.estudoendpoint.demo.model.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
