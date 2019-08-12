package com.program.codemobile.devapplication.model;

public class Promotion
{
    private String badge;

    private String stock;

    public String getBadge ()
    {
        return badge;
    }

    public void setBadge (String badge)
    {
        this.badge = badge;
    }

    public String getStock ()
    {
        return stock;
    }

    public void setStock (String stock)
    {
        this.stock = stock;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [badge = "+badge+", stock = "+stock+"]";
    }
}