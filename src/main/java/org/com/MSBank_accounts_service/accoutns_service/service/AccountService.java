package org.com.MSBank_accounts_service.accoutns_service.service;

import org.com.MSBank_accounts_service.accoutns_service.model.Account;
import org.com.MSBank_accounts_service.accoutns_service.view.AccountDto;

import java.util.List;

public interface AccountService {

    List<AccountDto> getCustomerAccounts(String customerNumber);
}
