package com.antonfifindik.bittrexapi.model;

import lombok.Data;

@Data
public class BittrexApiResponse {
    private boolean success;
    private String message;
    private MarketHistory[] result;

}
