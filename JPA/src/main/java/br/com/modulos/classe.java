package br.com.modulos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class classe {



    @Id
    private int id;
    private String nome;

    public classe(String nome, int id){
        this.id = id;
        this.nome = nome;
    }

}
