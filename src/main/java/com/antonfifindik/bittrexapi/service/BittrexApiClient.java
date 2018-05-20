package com.antonfifindik.bittrexapi.service;

import com.antonfifindik.bittrexapi.model.BittrexApiResponse;
import com.antonfifindik.bittrexapi.model.MarketHistory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Component
public class BittrexApiClient {
    private RestTemplate restTemplate = new RestTemplate();

    public BittrexApiResponse getAll() {
        String url = "https://bittrex.com/api/v1.1/public/getmarkethistory?market=BTC-ETH";
        BittrexApiResponse result;
        try {
            result = restTemplate.getForObject(new URI(url), BittrexApiResponse.class);
            return result;
        } catch (URISyntaxException e) {
            throw new RuntimeException();
        }
    }

}
