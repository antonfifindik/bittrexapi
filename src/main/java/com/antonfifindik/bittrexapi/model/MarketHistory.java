package com.antonfifindik.bittrexapi.model;

import lombok.Data;

@Data
public class MarketHistory {
    public String Id;
    public String TimeStamp;
    public String Quantity;
    public String Price;
    public String Total;
    public String FillType;
    public String OrderType;

}
