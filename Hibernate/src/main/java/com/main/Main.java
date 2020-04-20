package com.main;

import com.factory.FabricaDeConexao;
import com.modulos.classe;

public class Main {

    public static void main(String...a) throws Exception {

        classe objeto = new classe("Doces",6);

        FabricaDeConexao fabrica = new FabricaDeConexao();

        fabrica.conexao();

        fabrica.persistir(objeto);

        fabrica.close();


    }
}
