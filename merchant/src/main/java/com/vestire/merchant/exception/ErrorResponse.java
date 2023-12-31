package com.vestire.merchant.exception;

public class ErrorResponse {
    private final String errorCode;
    private final String errorMessage;

    public ErrorResponse(String errorMessage, String errorCode) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
