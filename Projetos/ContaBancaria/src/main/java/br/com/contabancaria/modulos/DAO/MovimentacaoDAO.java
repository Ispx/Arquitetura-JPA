package br.com.contabancaria.modulos.DAO;

import br.com.contabancaria.modulos.Movimentacao;

import javax.persistence.EntityManager;

public class MovimentacaoDAO extends DAO {

    public MovimentacaoDAO(EntityManager entityManager) {
        super(entityManager);
    }

    public  Movimentacao create(Movimentacao movimentacao) {
        return (Movimentacao) super.create(movimentacao);
    }

    public Movimentacao merge(Movimentacao movimentacao){
        return (Movimentacao) super.merge(movimentacao);
    }
}
