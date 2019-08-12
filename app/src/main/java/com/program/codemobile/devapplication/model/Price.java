package com.program.codemobile.devapplication.model;

public class Price
{
    private String formattedPriceValue;

    private String priceValue;

    public String getFormattedPriceValue ()
    {
        return formattedPriceValue;
    }

    public void setFormattedPriceValue (String formattedPriceValue)
    {
        this.formattedPriceValue = formattedPriceValue;
    }

    public String getPriceValue ()
    {
        return priceValue;
    }

    public void setPriceValue (String priceValue)
    {
        this.priceValue = priceValue;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [formattedPriceValue = "+formattedPriceValue+", priceValue = "+priceValue+"]";
    }
}