package br.com.contabancaria.main;

import br.com.contabancaria.factory.ConnectionFactory;
import br.com.contabancaria.modulos.*;

import br.com.contabancaria.modulos.DAO.ContaDAO;
import br.com.contabancaria.modulos.DAO.MovimentacaoDAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import java.math.BigDecimal;

import java.util.Date;

public class main {

    public static void main(String[] args) {

        Movimentacao movimentacao;
        Conta conta;
        Cliente cliente;
        try (ConnectionFactory con = new ConnectionFactory()) {
            EntityManager entityManager = con.open();


            conta = new Conta(784,5,06,"Paula Rodrigues Silva");
            new ContaDAO(entityManager).create(conta);
            //cliente = new Cliente("Paula",conta);
            //new ClienteDAO(entityManager).create(cliente);
            movimentacao = new Movimentacao(TipoMovementacao.ENTRADA, Categoria.CREDITO_EM_CONTA,conta,new BigDecimal(200.0), new Date());
            new MovimentacaoDAO(entityManager).create(movimentacao);
        }


    }
}
