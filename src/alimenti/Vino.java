package alimenti;


import java.awt.*;
import java.text.DecimalFormat;

public class Vino extends Alimento {
    private String tipologiaVino;
    private String colore;
    private double gradazioneAlcolica;

    public Vino(double prezzo, String nome, String tipologiaVino, String colore, double gradazioneAlcolica) {
        super(prezzo, nome);
        this.tipologiaVino = tipologiaVino;
        this.colore = colore;
        this.gradazioneAlcolica = gradazioneAlcolica;
        generaEtichetta();
    }

    @Override
    public void generaEtichetta() {
        DecimalFormat df = new DecimalFormat("#.##");

        this.etichetta.add(this.nome);
        this.etichetta.add(String.valueOf(this.prezzo));
        this.etichetta.add(this.tipologiaVino);
        this.etichetta.add(this.colore);
        this.etichetta.add(df.format((this.gradazioneAlcolica)));

    }

    @Override
    public String toString() {
        return "Vino{" +
                "prezzo=" + prezzo +
                ", nome='" + nome + '\'' +
                '}';
    }
}
