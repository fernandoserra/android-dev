package com.program.codemobile.devapplication.model;

public class ProductModel {


    private String name;
    private String thumbnailImage;
    private double priceListPrice;
    private double priceCardPrice;
    private String category;
    private String sku;
    private String uniqueID;
    public ProductModel(String name, String thumbnailImage, double priceListPrice, double priceCardPrice, String category, String sku, String uniqueID) {
        this.name = name;
        this.thumbnailImage = thumbnailImage;
        this.priceListPrice = priceListPrice;
        this.priceCardPrice = priceCardPrice;
        this.category = category;
        this.sku = sku;
        this.uniqueID = uniqueID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumbnailImage() {
        return thumbnailImage;
    }

    public void setThumbnailImage(String thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }

    public double getPriceListPrice() {
        return priceListPrice;
    }

    public void setPriceListPrice(double priceListPrice) {
        this.priceListPrice = priceListPrice;
    }

    public double getPriceCardPrice() {
        return priceCardPrice;
    }

    public void setPriceCardPrice(double priceCardPrice) {
        this.priceCardPrice = priceCardPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "name='" + name + '\'' +
                ", thumbnailImage='" + thumbnailImage + '\'' +
                ", priceListPrice=" + priceListPrice +
                ", priceCardPrice=" + priceCardPrice +
                ", category='" + category + '\'' +
                ", sku='" + sku + '\'' +
                ", uniqueID='" + uniqueID + '\'' +
                '}';
    }
}
