package eserciziAlimentari;

import Eccezioni.AlimentoSbagliatoException;

import alimenti.Alimento;
import alimenti.Vino;


import java.io.File;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Enoteca extends EsercizioRistorazione {
    public Enoteca(String nome) {
        super(nome);
        this.mappaAlimenti = new LinkedHashMap<>();
    }

    @Override
    public void aggiungiAlimento(Alimento alimento) {
        try {
            if (alimento instanceof Vino) {
                mappaAlimenti.put(alimento.getNome(), alimento);
            } else {
                throw new AlimentoSbagliatoException("L' alimento " + alimento.getNome() + " non è un vino");
            }
        } catch (AlimentoSbagliatoException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void rimuoviAlimento(Alimento alimento) {
        if (this.mappaAlimenti.containsKey(alimento.getNome())) {
            mappaAlimenti.remove(alimento.getNome());
        } else {
            throw new AlimentoSbagliatoException("Alimento non presente");
        }
    }

    @Override
    public void stampaMenu() {
        super.stampaMenu();
    }
}

