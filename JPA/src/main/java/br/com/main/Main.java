package br.com.main;

import br.com.factory.FabricaDeConexao;
import br.com.modulos.classe;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String...a) throws Exception {

        classe objeto = new classe("Outros",5);

        FabricaDeConexao fabrica = new FabricaDeConexao();

        fabrica.conexao();

        fabrica.persistir(objeto);

        fabrica.close();


    }
}
