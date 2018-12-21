package alimenti;

import java.util.ArrayList;
import java.util.List;

public abstract class Alimento  {
    protected double prezzo;
    protected String nome;
    protected List<String> etichetta;


    public Alimento(double prezzo, String nome) {
        this.prezzo = prezzo;
        this.nome = nome;
        this.etichetta = new ArrayList<>();

    }

    public String getNome() {
        return nome;
    }


    public abstract void generaEtichetta();

    public void stampaEtichetta() {
        for (String s: etichetta ) {
            System.out.println(s);
        }
    }
}
