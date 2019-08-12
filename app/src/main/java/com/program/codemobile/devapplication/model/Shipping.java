package com.program.codemobile.devapplication.model;


public class Shipping
{
    private String cashOnDelivery;

    private String rCercano;

    private String rTienda;

    private String dDomicilio;

    public String getCashOnDelivery ()
    {
        return cashOnDelivery;
    }

    public void setCashOnDelivery (String cashOnDelivery)
    {
        this.cashOnDelivery = cashOnDelivery;
    }

    public String getRCercano ()
    {
        return rCercano;
    }

    public void setRCercano (String rCercano)
    {
        this.rCercano = rCercano;
    }

    public String getRTienda ()
    {
        return rTienda;
    }

    public void setRTienda (String rTienda)
    {
        this.rTienda = rTienda;
    }

    public String getDDomicilio ()
    {
        return dDomicilio;
    }

    public void setDDomicilio (String dDomicilio)
    {
        this.dDomicilio = dDomicilio;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [cashOnDelivery = "+cashOnDelivery+", rCercano = "+rCercano+", rTienda = "+rTienda+", dDomicilio = "+dDomicilio+"]";
    }
}
