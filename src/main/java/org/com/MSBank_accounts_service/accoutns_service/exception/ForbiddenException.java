package org.com.MSBank_accounts_service.accoutns_service.exception;

public class ForbiddenException extends RuntimeException{

    public ForbiddenException(){
        super();
    }

    public ForbiddenException(String message){
        super(message);
    }
}
