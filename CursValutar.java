package com.itfactory.CursValutar;

public class CursValutar {
    private double RON;
    private double EUR;
    private double USD;
    private double GBP;

    public CursValutar (double RON)
    {
        this.RON = RON;
        this.EUR = EUR;
        this.USD = USD;
        this.GBP = GBP;
    }

    public double getEUR()
    {
        return EUR;
    }

    public void setEUR(double EUR)
    {
        this.EUR = EUR;
    }

    public double getUSD()
    {
        return USD;
    }

    public void setUSD(double USD)
    {
        this.USD = USD;
    }

    public double getGBP()
    {
        return GBP;
    }

    public void setGBP(double GBP)
    {
        this.GBP = GBP;
    }

    public double cursRonEur()
    {
        return 0.2023;
    }

    public double cursRonUsd()
    {
        return 0.2207;
    }

    public double cursRonGbp()
    {
        return 0.1680;
    }

    public double cursEurRon()
    {
        return 4.9443;
    }

    public double cursEurUsd()
    {
        return 1.0913;
    }

    public double cursEurGbp()
    {
        return 0.8307;
    }

    public double cursUsdRon()
    {
        return 4.5307;
    }

    public double cursUsdEur()
    {
        return 0.9163;
    }

    public double cursUsdGbp()
    {
        return 0.7612;
    }

    public double cursGbpRon()
    {
        return 5.9520;
    }

    public double cursGbpEur()
    {
        return 1.2038;
    }

    public double cursGbpUsd()
    {
        return 1.3137;
    }
}
