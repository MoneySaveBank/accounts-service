package org.com.MSBank_accounts_service.accoutns_service.model;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Card {

    private String accountNumber;

    private String cardNumber;

    private String cardType;

    private String status;

    private String creationDate;
}
