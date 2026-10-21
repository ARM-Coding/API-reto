package edu.altair.crm.exceptions;

public class FaltaNotFoundException extends RuntimeException {

    public FaltaNotFoundException(Long idFalta) {
        super("No se encontró la falta con el ID: " + idFalta);
    }
}
