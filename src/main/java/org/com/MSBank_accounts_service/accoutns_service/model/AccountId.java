package org.com.MSBank_accounts_service.accoutns_service.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class AccountId implements Serializable {

    private String customerNumber;

    private String accountNumber;
}
