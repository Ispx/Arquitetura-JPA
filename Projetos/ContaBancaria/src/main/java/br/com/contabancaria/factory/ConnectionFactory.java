package br.com.contabancaria.factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory implements AutoCloseable{
    EntityManagerFactory emf  = null;
    EntityManager em = null;

    public ConnectionFactory(){
        emf = Persistence.createEntityManagerFactory("desenvolvimento");
        em = emf.createEntityManager();
    }

    public EntityManager open(){

        if(em == null){
            new ConnectionFactory();
        }
        return em;
    }


    public void close(){
        try {
            if (em != null) {
                em.close();
                emf.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
