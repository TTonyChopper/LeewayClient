package com.vg.market.leeway.query;

public class LeewayQueryBuilder
{
    public final static String LEEWAY_BASE_URL = "api.leeway.tech";

    private final String key;

    public LeewayQueryBuilder(String key) {
        this.key = key;
    }

    public String getStockTimes(ApiStockTimesFunction function, String symbol, String interval) {
        return "/api/v1/public/" + function.getValue()
                +"/" + symbol
                +"?apitoken=" + key
                +"&interval=" + interval;
    }
}
