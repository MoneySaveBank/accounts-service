package org.com.MSBank_accounts_service.accoutns_service.controller;

import org.com.MSBank_accounts_service.accoutns_service.service.AccountService;
import org.com.MSBank_accounts_service.accoutns_service.view.AccountDto;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private final AccountService accountService;

    private final RedisTemplate<String, String> redisTemplate;

    public AccountController(AccountService accountService, RedisTemplate<String, String> redisTemplate) {
        this.accountService = accountService;
        this.redisTemplate = redisTemplate;
    }

    @GetMapping("/{customerNumber}")
    public List<AccountDto> accountRetrieve(@RequestHeader("Authorization") String authorization,
                                            @PathVariable("customerNumber")String customerNumber) {

        System.out.println(authorization);
        System.out.println(redisTemplate.opsForValue().get(authorization));
        String customerInRedis = redisTemplate.opsForValue().get("token:" + authorization);
        System.out.println(customerInRedis);
        return accountService.getCustomerAccounts(customerNumber);
    }

    /*@GetMapping("/{customerNumber}")
    public List<AccountDto> accountRetrieve(@PathVariable("customerNumber") String customerNumber) {
        return accountService.getCustomerAccounts(customerNumber);
    }*/
}
