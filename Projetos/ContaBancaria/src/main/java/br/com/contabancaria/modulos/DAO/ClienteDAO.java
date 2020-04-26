package br.com.contabancaria.modulos.DAO;

import br.com.contabancaria.modulos.Cliente;

import javax.persistence.EntityManager;

public class ClienteDAO extends DAO{


    public ClienteDAO(EntityManager entityManager) {
        super(entityManager);
    }

    public Cliente create(Cliente cliente){
        return (Cliente) super.create(cliente);
    }


}
