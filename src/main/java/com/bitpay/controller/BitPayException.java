package com.bitpay.controller;

public class BitPayException extends Exception {

    public BitPayException(String message) {
        super(message);
    }

    public BitPayException(String message, Throwable exception) {
        super(message, exception);
    }

    private static final long serialVersionUID = 1L;
}
