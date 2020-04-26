package br.com.contabancaria.modulos;

import javax.persistence.*;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;

    @JoinColumn(unique = true) //Anotação para restringir associação do elemento conta com mais de um cliente
    @OneToOne
    private Conta conta;

    public Cliente(String nome, Conta conta){
        this.nome = nome;
        this.conta = conta;
    }



}
