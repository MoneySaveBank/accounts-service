package org.com.MSBank_accounts_service.accoutns_service.repository;

import org.com.MSBank_accounts_service.accoutns_service.model.Account;
import org.com.MSBank_accounts_service.accoutns_service.model.AccountId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, AccountId> {

    List<Account> findByCustomerNumber(String customerNumber);
}
