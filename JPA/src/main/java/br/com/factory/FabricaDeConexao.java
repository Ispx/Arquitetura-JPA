package br.com.factory;
import javax.persistence.*;


public class FabricaDeConexao {

    private  EntityManagerFactory emf = null;
    private EntityManager entityManager = null;

    public FabricaDeConexao(){

        emf = Persistence.createEntityManagerFactory("desenvolvimento");
        this.entityManager = emf.createEntityManager();

    }

    private void validacao(){
        if(entityManager == null) {
            new FabricaDeConexao();
        }
    }

    public void conexao(){
        validacao();
        entityManager.getTransaction().begin();

    }

    public void persistir(Object object){
        validacao();
        entityManager.persist(object);
        entityManager.getTransaction().commit();

    }


    public void close() throws Exception {
        emf.close();
        entityManager.close();
    }
}
