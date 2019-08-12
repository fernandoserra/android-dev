package com.program.codemobile.devapplication.model;

import java.util.Arrays;
import java.util.List;

public class CartInserModel {

    private String customer_id;
    private String cart_id;
    private List<CartInsertProduct> products;


    //private CartInsertProduct[] products;


    public CartInserModel(String customer_id, String cart_id, List<CartInsertProduct> products) {
        this.customer_id = customer_id;
        this.cart_id = cart_id;
        this.products = products;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCart_id() {
        return cart_id;
    }

    public void setCart_id(String cart_id) {
        this.cart_id = cart_id;
    }

    public List<CartInsertProduct> getProducts() {
        return products;
    }

    public void setProducts(List<CartInsertProduct> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "CartInserModel{" +
                "customer_id='" + customer_id + '\'' +
                ", cart_id='" + cart_id + '\'' +
                ", products=" + products +
                '}';
    }
}

