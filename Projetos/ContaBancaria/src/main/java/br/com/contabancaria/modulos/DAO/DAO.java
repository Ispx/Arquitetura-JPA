package br.com.contabancaria.modulos.DAO;

import javax.persistence.EntityManager;


public class DAO  implements AutoCloseable{

    private EntityManager entityManager = null;

    public DAO(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    protected Object create(Object object){
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(object);
            entityManager.getTransaction().commit();
        }catch (Exception e){
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        }
       return object;
    }

    public Object merge(Object object) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(object);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        }
        return object;
    }

    public void delete(Object object){
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(object);
            entityManager.getTransaction().commit();
        }catch (Exception e){
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public Object find(Object object, int primarykey){

        try{
            entityManager.getTransaction().begin();

            entityManager.find(object.getClass(),primarykey);
            entityManager.getTransaction().commit();

        }catch (Exception e){
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        }

        return object;
    }

    @Override
    public void close() {
        try{
            if(entityManager != null){
                entityManager.close();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
