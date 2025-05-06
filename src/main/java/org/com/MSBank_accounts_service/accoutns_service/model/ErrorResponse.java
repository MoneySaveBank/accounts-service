package org.com.MSBank_accounts_service.accoutns_service.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class ErrorResponse {

    private int code;

    private ErrorType type;

    private String message;

    private String details;

    private String location;

}
