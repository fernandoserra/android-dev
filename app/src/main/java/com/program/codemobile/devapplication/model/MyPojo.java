package com.program.codemobile.devapplication.model;

public class MyPojo
{
    private String longDescription;

    private String isMarketplaceProduct;

    private String[] images;

    //private String marketplace;

    Marketplace MarketplaceObject;
    // Getter Methods

    public Marketplace getMarketplace() {
        return MarketplaceObject;
    }

    // Setter Methods

    public void setMarketplace(Marketplace marketplaceObject) {
        this.MarketplaceObject = marketplaceObject;
    }

    private Simple simple;

    private String shortDescription;

    private String url;

    private String[] definingAttributes;

    private String productString;

    private SKUs[] SKUs;

    private String single;

    private String xCatEntryCategory;

    private Warranties[] warranties;

    private Shipping shipping;

    private String name;

    private String partNumber;

    private Attributes[] attributes;

    private Prices prices;

    private String thumbnailImage;

    private String fullImage;

    private String uniqueID;

    private Locals locals;

    public String getLongDescription ()
    {
        return longDescription;
    }

    public void setLongDescription (String longDescription)
    {
        this.longDescription = longDescription;
    }

    public String getIsMarketplaceProduct ()
    {
        return isMarketplaceProduct;
    }

    public void setIsMarketplaceProduct (String isMarketplaceProduct)
    {
        this.isMarketplaceProduct = isMarketplaceProduct;
    }

    public String[] getImages ()
    {
        return images;
    }

    public void setImages (String[] images)
    {
        this.images = images;
    }

    /*public String getMarketplace ()
    {
        return marketplace;
    }

    public void setMarketplace (String marketplace)
    {
        this.marketplace = marketplace;
    }*/

    public Simple getSimple ()
    {
        return simple;
    }

    public void setSimple (Simple simple)
    {
        this.simple = simple;
    }

    public String getShortDescription ()
    {
        return shortDescription;
    }

    public void setShortDescription (String shortDescription)
    {
        this.shortDescription = shortDescription;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public String[] getDefiningAttributes ()
    {
        return definingAttributes;
    }

    public void setDefiningAttributes (String[] definingAttributes)
    {
        this.definingAttributes = definingAttributes;
    }

    public String getProductString ()
    {
        return productString;
    }

    public void setProductString (String productString)
    {
        this.productString = productString;
    }

    public SKUs[] getSKUs ()
    {
        return SKUs;
    }

    public void setSKUs (SKUs[] SKUs)
    {
        this.SKUs = SKUs;
    }

    public String getSingle ()
    {
        return single;
    }

    public void setSingle (String single)
    {
        this.single = single;
    }

    public String getXCatEntryCategory ()
    {
        return xCatEntryCategory;
    }

    public void setXCatEntryCategory (String xCatEntryCategory)
    {
        this.xCatEntryCategory = xCatEntryCategory;
    }

    public Warranties[] getWarranties ()
    {
        return warranties;
    }

    public void setWarranties (Warranties[] warranties)
    {
        this.warranties = warranties;
    }

    public Shipping getShipping ()
    {
        return shipping;
    }

    public void setShipping (Shipping shipping)
    {
        this.shipping = shipping;
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

    public Attributes[] getAttributes ()
    {
        return attributes;
    }

    public void setAttributes (Attributes[] attributes)
    {
        this.attributes = attributes;
    }

    public Prices getPrices ()
    {
        return prices;
    }

    public void setPrices (Prices prices)
    {
        this.prices = prices;
    }

    public String getThumbnailImage ()
    {
        return thumbnailImage;
    }

    public void setThumbnailImage (String thumbnailImage)
    {
        this.thumbnailImage = thumbnailImage;
    }

    public String getFullImage ()
    {
        return fullImage;
    }

    public void setFullImage (String fullImage)
    {
        this.fullImage = fullImage;
    }

    public String getUniqueID ()
    {
        return uniqueID;
    }

    public void setUniqueID (String uniqueID)
    {
        this.uniqueID = uniqueID;
    }

    public Locals getLocals ()
    {
        return locals;
    }

    public void setLocals (Locals locals)
    {
        this.locals = locals;
    }

    /*
    @Override
    public String toString()
    {
        return "ClassPojo [longDescription = "+longDescription+", isMarketplaceProduct = "+isMarketplaceProduct+", images = "+images+", marketplace = "+marketplace+", simple = "+simple+", shortDescription = "+shortDescription+", url = "+url+", definingAttributes = "+definingAttributes+", productString = "+productString+", SKUs = "+SKUs+", single = "+single+", xCatEntryCategory = "+xCatEntryCategory+", warranties = "+warranties+", shipping = "+shipping+", name = "+name+", partNumber = "+partNumber+", attributes = "+attributes+", prices = "+prices+", thumbnailImage = "+thumbnailImage+", fullImage = "+fullImage+", uniqueID = "+uniqueID+", locals = "+locals+"]";
    }*/
}

class Marketplace {

    // Getter Methods

    // Setter Methods

}
