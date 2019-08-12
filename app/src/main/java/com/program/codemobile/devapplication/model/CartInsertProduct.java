package com.program.codemobile.devapplication.model;

public class CartInsertProduct {
    private String price;
    private Integer price_discount;
    private Integer price_discount_ripley;
    private String description;
    private Integer quantity;
    private String sku;

    public CartInsertProduct(String price, Integer price_discount, Integer price_discount_ripley, String description, Integer quantity, String sku) {
        this.price = price;
        this.price_discount = price_discount;
        this.price_discount_ripley = price_discount_ripley;
        this.description = description;
        this.quantity = quantity;
        this.sku = sku;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getPrice_discount() {
        return price_discount;
    }

    public void setPrice_discount(Integer price_discount) {
        this.price_discount = price_discount;
    }

    public Integer getPrice_discount_ripley() {
        return price_discount_ripley;
    }

    public void setPrice_discount_ripley(Integer price_discount_ripley) {
        this.price_discount_ripley = price_discount_ripley;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    @Override
    public String toString() {
        return "CartInsertProduct{" +
                "price='" + price + '\'' +
                ", price_discount=" + price_discount +
                ", price_discount_ripley=" + price_discount_ripley +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", sku='" + sku + '\'' +
                '}';
    }

}
