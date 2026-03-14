package com.marketplace.marketplaceapi.shared.exception;

public class BusinessException extends RuntimeException {

    public BusinessException(String message){
        super(message);
    }
}
