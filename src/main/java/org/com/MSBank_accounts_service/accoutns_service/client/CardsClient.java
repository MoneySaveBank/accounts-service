package org.com.MSBank_accounts_service.accoutns_service.client;

import org.com.MSBank_accounts_service.accoutns_service.model.Card;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class CardsClient {


    private final RestTemplate restTemplate;

    public CardsClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @SuppressWarnings("unchecked")
    public List<Card> getCardsByAccountNumber(String accountNumber) {

        return restTemplate
                .getForEntity("http://cards-service/api/cards/{accountNumber}", List.class,accountNumber)
                .getBody();
    }
}
