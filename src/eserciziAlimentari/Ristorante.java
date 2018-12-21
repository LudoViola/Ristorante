package eserciziAlimentari;

import Eccezioni.AlimentoSbagliatoException;
import alimenti.Alimento;

import java.util.LinkedHashMap;


public class Ristorante extends EsercizioRistorazione {

    public Ristorante(String nome) {
        super(nome);
        this.mappaAlimenti = new LinkedHashMap<>();
    }
    @Override
    public void aggiungiAlimento(Alimento alimento) {
            mappaAlimenti.put(alimento.getNome(), alimento);

    }

    @Override
    public void rimuoviAlimento(Alimento alimento) {
        if(this.mappaAlimenti.containsKey(alimento.getNome())) {
            mappaAlimenti.remove(alimento.getNome());
        }
        else {
            throw new AlimentoSbagliatoException("Alimento non presente");
        }
    }

    @Override
    public void stampaMenu() {
        super.stampaMenu();

    }



}
