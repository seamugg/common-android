package com.rockaport.common.android.database;

public class GenericDatabaseException extends Exception {
    public GenericDatabaseException() {
        super();
    }

    public GenericDatabaseException(String message) {
        super(message);
    }

    public GenericDatabaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public GenericDatabaseException(Throwable cause) {
        super(cause);
    }
}
