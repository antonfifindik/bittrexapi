package com.antonfifindik.bittrexapi.service;

import com.antonfifindik.bittrexapi.model.BittrexApiResponse;
import com.antonfifindik.bittrexapi.model.MarketHistory;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Component
public class BittrexApiClient {
    private HttpClient httpClient = HttpClientBuilder.create().build();
    private ClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);
    private RestTemplate restTemplate = new RestTemplate(requestFactory);

    public BittrexApiResponse getAll() {
        String url = "https://bittrex.com/api/v1.1/public/getmarkethistory?market=BTC-DOGE";
        BittrexApiResponse result;
        try {
            result = restTemplate.getForObject(new URI(url), BittrexApiResponse.class);
            return result;
        } catch (URISyntaxException e) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) { // for test
        BittrexApiResponse response = new BittrexApiClient().getAll();
        System.out.println(response);
    }

}
