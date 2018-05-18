package com.antonfifindik.bittrexapi.model;

import lombok.Data;

@Data
public class BittrexApiResponse {
    private boolean success;
    private String message;
    private MarketHistory[] result;

    public BittrexApiResponse() {}

    public BittrexApiResponse(boolean success, String message, MarketHistory[] result) {
        this.success = success;
        this.message = message;
        this.result = result;
    }
}
