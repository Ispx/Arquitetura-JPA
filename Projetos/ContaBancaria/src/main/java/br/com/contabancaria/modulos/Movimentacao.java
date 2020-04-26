package br.com.contabancaria.modulos;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Movimentacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    private TipoMovementacao tipo;

    private Date data;
    private BigDecimal valor;

    @ManyToOne
    private Conta conta;


    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    public Movimentacao(TipoMovementacao tipo,Categoria categoria, Conta conta, BigDecimal valor, Date data){
        this.tipo = tipo;
        this.conta = conta;
        this.valor = valor;
        this.id = id;
        this.data = data;
        this.categoria = categoria;
    }



}
