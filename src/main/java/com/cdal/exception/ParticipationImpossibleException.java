package main.java.com.cdal.exception;

public class ParticipationImpossibleException extends Exception {

    public ParticipationImpossibleException() {
        super("La participation n'est pas possible car les caractéristiques ne correspondent pas à l'épreuve.");
    }

}
