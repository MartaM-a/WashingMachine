package com.machine.washing.domain;

public enum TemperatureScale {
    CELSIUS ("\u2103"), FAHRENHEIT ("F");

    private String symbol;


    TemperatureScale(String symbol) {
        this.symbol = symbol;
    }
    @Override
    public String toString( ) {
        return symbol;
    }
}