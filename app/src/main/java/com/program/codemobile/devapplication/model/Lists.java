package com.program.codemobile.devapplication.model;

public class Lists
{
    private OutOfStockList outOfStockList;

    private UnavailableList unavailableList;

    private Promotion promotion;

    public OutOfStockList getOutOfStockList ()
    {
        return outOfStockList;
    }

    public void setOutOfStockList (OutOfStockList outOfStockList)
    {
        this.outOfStockList = outOfStockList;
    }

    public UnavailableList getUnavailableList ()
    {
        return unavailableList;
    }

    public void setUnavailableList (UnavailableList unavailableList)
    {
        this.unavailableList = unavailableList;
    }

    public Promotion getPromotion ()
    {
        return promotion;
    }

    public void setPromotion (Promotion promotion)
    {
        this.promotion = promotion;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [outOfStockList = "+outOfStockList+", unavailableList = "+unavailableList+", promotion = "+promotion+"]";
    }
}