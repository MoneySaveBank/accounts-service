package org.com.MSBank_accounts_service.accoutns_service.exception;

public class UnauthorizedException extends RuntimeException{

    public UnauthorizedException() {
        super();
    }
    public UnauthorizedException(String message){
        super(message);
    }
}
