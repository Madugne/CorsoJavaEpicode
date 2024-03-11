package Esercizio3.exceptions;

public class exceptionsBanca extends Exception{
    public exceptionsBanca(String messaggio) {
        super(messaggio);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
