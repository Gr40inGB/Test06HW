package org.gr40in.model;

public class StringToDoubleParseException extends RuntimeException {
    public StringToDoubleParseException(String message) {
        super("Error parsing to number " + message);
    }
}
