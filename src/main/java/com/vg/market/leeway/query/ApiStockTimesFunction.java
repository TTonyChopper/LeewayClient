package com.vg.market.leeway.query;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum ApiStockTimesFunction
{
    Intraday("/intraday", "intraday");

    private final static Map<String, ApiStockTimesFunction> leewayTimes;
    static {
        leewayTimes = Arrays.stream(ApiStockTimesFunction.values()).collect(Collectors.toMap(ApiStockTimesFunction::getUrl, Function.identity()));
    }

    String url;
    String value;

    ApiStockTimesFunction(String url, String value) {
        this.url = url;
        this.value = value;
    }

    public static Map<String, ApiStockTimesFunction> getMap()
    {
        return leewayTimes;
    }

    public String getUrl()
    {
        return url;
    }

    public String getValue() {
        return value;
    }
}
