package com.program.codemobile.devapplication.model;

public class Warranties
{
    private String thumbnail;

    private String quantity;

    private Price[] Price;

    private String name;

    private String partNumber;

    private String type;

    private String uniqueID;

    public String getThumbnail ()
    {
        return thumbnail;
    }

    public void setThumbnail (String thumbnail)
    {
        this.thumbnail = thumbnail;
    }

    public String getQuantity ()
    {
        return quantity;
    }

    public void setQuantity (String quantity)
    {
        this.quantity = quantity;
    }

    public Price[] getPrice ()
    {
        return Price;
    }

    public void setPrice (Price[] Price)
    {
        this.Price = Price;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getPartNumber ()
    {
        return partNumber;
    }

    public void setPartNumber (String partNumber)
    {
        this.partNumber = partNumber;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getUniqueID ()
    {
        return uniqueID;
    }

    public void setUniqueID (String uniqueID)
    {
        this.uniqueID = uniqueID;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [thumbnail = "+thumbnail+", quantity = "+quantity+", Price = "+Price+", name = "+name+", partNumber = "+partNumber+", type = "+type+", uniqueID = "+uniqueID+"]";
    }
}