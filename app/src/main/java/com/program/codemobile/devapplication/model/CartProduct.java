package com.program.codemobile.devapplication.model;

public class CartProduct {

    private String date;

    private String price_discount;

    private String cart_id;

    private String quantity;

    private String is_active;

    private String price_discount_ripley;

    private String price;

    private String product_id;

    private String description;

    private String sku;

    public CartProduct(String date, String price_discount, String cart_id, String quantity, String is_active, String price_discount_ripley, String price, String product_id, String description, String sku) {
        this.date = date;
        this.price_discount = price_discount;
        this.cart_id = cart_id;
        this.quantity = quantity;
        this.is_active = is_active;
        this.price_discount_ripley = price_discount_ripley;
        this.price = price;
        this.product_id = product_id;
        this.description = description;
        this.sku = sku;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrice_discount() {
        return price_discount;
    }

    public void setPrice_discount(String price_discount) {
        this.price_discount = price_discount;
    }

    public String getCart_id() {
        return cart_id;
    }

    public void setCart_id(String cart_id) {
        this.cart_id = cart_id;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getIs_active() {
        return is_active;
    }

    public void setIs_active(String is_active) {
        this.is_active = is_active;
    }

    public String getPrice_discount_ripley() {
        return price_discount_ripley;
    }

    public void setPrice_discount_ripley(String price_discount_ripley) {
        this.price_discount_ripley = price_discount_ripley;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    @Override
    public String toString() {
        return "CartProduct{" +
                "date='" + date + '\'' +
                ", price_discount='" + price_discount + '\'' +
                ", cart_id='" + cart_id + '\'' +
                ", quantity='" + quantity + '\'' +
                ", is_active='" + is_active + '\'' +
                ", price_discount_ripley='" + price_discount_ripley + '\'' +
                ", price='" + price + '\'' +
                ", product_id='" + product_id + '\'' +
                ", description='" + description + '\'' +
                ", sku='" + sku + '\'' +
                '}';
    }
}
