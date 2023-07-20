package com.vestire.merchant.exception;

public class MerchantException extends RuntimeException{
    private final String errorCode;
    public MerchantException(String message,String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
