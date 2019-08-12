package com.program.codemobile.devapplication.model;

public class SKUs
{
    private String ineligible;

    private Price[] Price;

    private String[] Attributes;

    private String SKUUniqueID;

    private String xCatEntryQuantity;

    private String partNumber;

    private String isMainProduct;

    public String getIneligible ()
    {
        return ineligible;
    }

    public void setIneligible (String ineligible)
    {
        this.ineligible = ineligible;
    }

    public Price[] getPrice ()
    {
        return Price;
    }

    public void setPrice (Price[] Price)
    {
        this.Price = Price;
    }

    public String[] getAttributes ()
    {
        return Attributes;
    }

    public void setAttributes (String[] Attributes)
    {
        this.Attributes = Attributes;
    }

    public String getSKUUniqueID ()
    {
        return SKUUniqueID;
    }

    public void setSKUUniqueID (String SKUUniqueID)
    {
        this.SKUUniqueID = SKUUniqueID;
    }

    public String getXCatEntryQuantity ()
    {
        return xCatEntryQuantity;
    }

    public void setXCatEntryQuantity (String xCatEntryQuantity)
    {
        this.xCatEntryQuantity = xCatEntryQuantity;
    }

    public String getPartNumber ()
    {
        return partNumber;
    }

    public void setPartNumber (String partNumber)
    {
        this.partNumber = partNumber;
    }

    public String getIsMainProduct ()
    {
        return isMainProduct;
    }

    public void setIsMainProduct (String isMainProduct)
    {
        this.isMainProduct = isMainProduct;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ineligible = "+ineligible+", Price = "+Price+", Attributes = "+Attributes+", SKUUniqueID = "+SKUUniqueID+", xCatEntryQuantity = "+xCatEntryQuantity+", partNumber = "+partNumber+", isMainProduct = "+isMainProduct+"]";
    }
}