package com.valdir.bookstore.resource.exceptions;

import lombok.Data;

@Data
public class StandarError {

    private Long timestamp;
    private Integer status;
    private String error;

    public StandarError() {
        super();
    }

    public StandarError(Long timestamp, Integer status, String error) {
        super();
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
    }
}
