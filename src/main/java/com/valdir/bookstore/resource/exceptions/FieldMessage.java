package com.valdir.bookstore.resource.exceptions;

import lombok.Data;

import java.io.Serializable;

@Data
public class FieldMessage implements Serializable {

    private static final long serialVersionUID = 1l;

    private String fieldName;
    private String message;

    public FieldMessage() {
        super();
    }

    public FieldMessage(String fieldName, String message) {
        super();
        this.fieldName = fieldName;
        this.message = message;
    }
}
