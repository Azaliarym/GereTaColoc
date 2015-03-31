package org.example.geretacoloc;

/**
 * Created by Gosunet on 31/03/2015.
 */
public class Regle extends RegleDeVie {


    private int numero;
    private String regle;

    public Regle() {
        this.numero = 0;
        this.regle ="";
    }

    public Regle(int numero) {
        this.numero = numero;
        this.regle ="";
    }

    public Regle(int numero, String regle) {
        this.numero = numero;
        this.regle = regle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRegle() {
        return regle;
    }

    public void setRegle(String regle) {
        this.regle = regle;
    }
}
