package com.NadaAlshaibnai.androidrecycleview;

import java.util.ArrayList;

public class Currency {
    private String currencyCode;
    private String currencyName;
    private double exchangeRate;

    public Currency(String currencyCode, String getCurrencyName, double exchangeRate) {
        this.currencyCode = currencyCode;
        this.currencyName = getCurrencyName;
        this.exchangeRate = exchangeRate;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String getCurrencyName) {
        this.currencyName = getCurrencyName;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

}
