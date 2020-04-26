package br.com.contabancaria.modulos;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numero;
    private int ag;
    private int digito;
    private String nome;

    public Conta(int numero,int digito, int ag, String nome) {
        this.numero = numero;
        this.ag = ag;
        this.digito = digito;
        this.nome = nome;
    }


    public int getId() {
        return id;
    }

    public int getNumero() {
        return numero;
    }

    public int getAg() {
        return ag;
    }

    public int getDigito() {
        return digito;
    }

    public String getNome() {
        return nome;
    }
}
