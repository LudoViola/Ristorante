package Eccezioni;

public class AlimentoSbagliatoException extends RuntimeException {
    public AlimentoSbagliatoException() {
        super("Alimento non valido");
    }

    public AlimentoSbagliatoException(String message) {
        super(message);
    }
}
