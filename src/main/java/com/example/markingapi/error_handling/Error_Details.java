package com.example.markingapi.error_handling;

import java.util.Date;

public class Error_Details {
    private Date timestamp;
    private String message;
    private String details;
    public Error_Details(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
}
