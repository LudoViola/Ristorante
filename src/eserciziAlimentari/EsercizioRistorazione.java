package eserciziAlimentari;

import Eccezioni.MenuException;
import alimenti.Alimento;
import alimenti.Carne;
import alimenti.Vino;

import java.io.File;
import java.util.Map;
import java.util.Scanner;

public abstract class EsercizioRistorazione {

    //Makehashset

    private String nome;
    protected Map<String, Alimento> mappaAlimenti;
    protected final String path = "/home/ludovico/Desktop/Ristorante/src/menu1.txt";

    public EsercizioRistorazione(String nome) {
        this.nome = nome;
    }


    public abstract void aggiungiAlimento(Alimento alimento);


    public abstract void rimuoviAlimento(Alimento alimento);


    public void stampaMenu() {
        try {
            if (this.mappaAlimenti.isEmpty()) {
                throw new MenuException("Il menù non contiene elementi");
            } else {
                System.out.println("Menù " + nome);
                for (Alimento a : mappaAlimenti.values()) {
                    System.out.println(a.toString());
                }
            }
        }catch (MenuException e) {
            System.out.println(e.getMessage());
        }

    }

    public void leggiMenu() {
        File f;
        Scanner scanner;
        try {
            f = new File(path);
            scanner = new Scanner(f);
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                String[] dettagli = s.split("\t");
                if(Integer.parseInt(dettagli[0]) == 1 ) {
                    Vino v = new Vino(Double.parseDouble(dettagli[5]), dettagli[1], dettagli[3], dettagli[4], Double.parseDouble(dettagli[2]));
                    aggiungiAlimento(v);
                }
                else if(Integer.parseInt(dettagli[0]) == 0) {
                    Carne c = new Carne(Double.parseDouble(dettagli[4]), dettagli[1], dettagli[2], dettagli[3]);
                    aggiungiAlimento(c);
                }
            }

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
