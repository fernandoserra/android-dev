package com.program.codemobile.devapplication.model;

public class Simple
{
    private String isMarketplaceProduct;

    private Lists lists;

    private String isCyber;

    private String isUnavailable;

    private String isOutOfStock;

    public String getIsMarketplaceProduct ()
    {
        return isMarketplaceProduct;
    }

    public void setIsMarketplaceProduct (String isMarketplaceProduct)
    {
        this.isMarketplaceProduct = isMarketplaceProduct;
    }

    public Lists getLists ()
    {
        return lists;
    }

    public void setLists (Lists lists)
    {
        this.lists = lists;
    }

    public String getIsCyber ()
    {
        return isCyber;
    }

    public void setIsCyber (String isCyber)
    {
        this.isCyber = isCyber;
    }

    public String getIsUnavailable ()
    {
        return isUnavailable;
    }

    public void setIsUnavailable (String isUnavailable)
    {
        this.isUnavailable = isUnavailable;
    }

    public String getIsOutOfStock ()
    {
        return isOutOfStock;
    }

    public void setIsOutOfStock (String isOutOfStock)
    {
        this.isOutOfStock = isOutOfStock;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [isMarketplaceProduct = "+isMarketplaceProduct+", lists = "+lists+", isCyber = "+isCyber+", isUnavailable = "+isUnavailable+", isOutOfStock = "+isOutOfStock+"]";
    }
}
