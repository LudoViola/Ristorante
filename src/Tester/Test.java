package Tester;


import alimenti.Alimento;
import alimenti.Carne;
import alimenti.Vino;
import eserciziAlimentari.Enoteca;
import eserciziAlimentari.EsercizioRistorazione;
import eserciziAlimentari.Ristorante;

public class Test {
    public static void main(String[] args) {
        EsercizioRistorazione ristorante = new Ristorante("Da Gino");
        EsercizioRistorazione enoteca = new Enoteca("Vini e dintorni");


       /* Alimento brunello = new Vino(13.12, "Brunello","Secco","Rosso",11.71);
        Alimento chianina = new Carne(15.36,"Chianina","Bufalo","Coscia");
        Vino chianti = new Vino(13.12, "Chianti","Secco","Rosso",11.71);

            brunello.stampaEtichetta();
            chianina.stampaEtichetta();

            ristorante.aggiungiAlimento(chianina);
            ristorante.aggiungiAlimento(brunello);
            ristorante.aggiungiAlimento(chianti);

            ristorante.rimuoviAlimento(brunello);


            enoteca.aggiungiAlimento(chianina);
            enoteca.aggiungiAlimento(brunello);
            enoteca.aggiungiAlimento(chianti);
            */
            ristorante.leggiMenu();
            enoteca.leggiMenu();

            ristorante.stampaMenu();
        System.out.println("\n**********\n");
            enoteca.stampaMenu();

    }
}
