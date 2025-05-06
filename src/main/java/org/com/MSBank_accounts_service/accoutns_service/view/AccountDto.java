package org.com.MSBank_accounts_service.accoutns_service.view;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.com.MSBank_accounts_service.accoutns_service.model.Card;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class AccountDto {

    private String accountNumber;

    private int productNumber;

    private String productName;

    private BigDecimal balance;

    private List<Card> cards;
}
