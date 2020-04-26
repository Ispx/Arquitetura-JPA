package br.com.contabancaria.modulos.DAO;

import br.com.contabancaria.modulos.Conta;

import javax.persistence.EntityManager;

public class ContaDAO extends DAO {

    public ContaDAO(EntityManager entityManager) {
        super(entityManager);
    }

    public Conta create(Conta conta){
        return (Conta) super.create(conta);
    }

}
