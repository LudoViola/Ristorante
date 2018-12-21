package alimenti;

import java.text.DecimalFormat;

public class Carne extends Alimento {

    private String animaleProvenienza;
    private String pezzo;


    public Carne(double prezzo, String nome, String animaleProvenienza, String pezzo) {
        super(prezzo, nome);
        this.animaleProvenienza = animaleProvenienza;
        this.pezzo = pezzo;
        generaEtichetta();
    }

    @Override
    public void generaEtichetta() {

        this.etichetta.add(this.nome);
        this.etichetta.add((String.valueOf(this.prezzo)));
        this.etichetta.add(this.animaleProvenienza);
        this.etichetta.add(this.pezzo);
    }

    @Override
    public String toString() {
        return "Carne{" +
                "prezzo=" + prezzo +
                ", nome='" + nome + '\'' +
                '}';
    }
}
