package com.program.codemobile.devapplication.model;

public class CartCreateModel {

    private String customer_id;

    public CartCreateModel(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    @Override
    public String toString() {
        return "CartCreateModel{" +
                "customer_id='" + customer_id + '\'' +
                '}';
    }
}
