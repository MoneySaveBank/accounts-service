package org.com.MSBank_accounts_service.accoutns_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "accounts")
@IdClass(AccountId.class)
public class Account {

    @Id
    private String accountNumber;

    @Id
    private String customerNumber;

    private int productNumber;

    private String productName;

    private String status;

    private BigDecimal balance;

    private String creationDate;
}
