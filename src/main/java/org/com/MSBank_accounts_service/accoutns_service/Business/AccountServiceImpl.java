package org.com.MSBank_accounts_service.accoutns_service.Business;

import org.com.MSBank_accounts_service.accoutns_service.client.CardsClient;
import org.com.MSBank_accounts_service.accoutns_service.model.Account;
import org.com.MSBank_accounts_service.accoutns_service.repository.AccountRepository;
import org.com.MSBank_accounts_service.accoutns_service.service.AccountService;
import org.com.MSBank_accounts_service.accoutns_service.view.AccountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    private CardsClient cardsClient;

    private final static String STATUS = "ACT";

    public AccountServiceImpl(AccountRepository accountRepository, CardsClient cardsClient) {
        this.accountRepository = accountRepository;
        this.cardsClient = cardsClient;
    }

    private Function<Account, AccountDto> mapper =
            account -> new AccountDto(account.getAccountNumber(), account.getProductNumber(),
                    account.getProductName(), account.getBalance(), cardsClient.getCardsByAccountNumber(account.getAccountNumber()));

    @Override
    public List<AccountDto> getCustomerAccounts(String customerNumber) {
        return accountRepository.findByCustomerNumber(customerNumber)
                .stream()
                .filter(account -> account.getStatus().equals(STATUS))
                .map(mapper)
                .toList();
    }
}
