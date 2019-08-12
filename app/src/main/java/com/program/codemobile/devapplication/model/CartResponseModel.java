package com.program.codemobile.devapplication.model;

public class CartResponseModel {

    private String customer_id;
    private String cart_id;
    private String total_price = null;
    private String date;
    private String customer_rut = null;
    private String payment_method = null;
    private String state;
    private String is_active;

    public CartResponseModel(String customer_id, String cart_id, String total_price, String date, String customer_rut, String payment_method, String state, String is_active) {
        this.customer_id = customer_id;
        this.cart_id = cart_id;
        this.total_price = total_price;
        this.date = date;
        this.customer_rut = customer_rut;
        this.payment_method = payment_method;
        this.state = state;
        this.is_active = is_active;
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

    public String getTotal_price() {
        return total_price;
    }

    public void setTotal_price(String total_price) {
        this.total_price = total_price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomer_rut() {
        return customer_rut;
    }

    public void setCustomer_rut(String customer_rut) {
        this.customer_rut = customer_rut;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getIs_active() {
        return is_active;
    }

    public void setIs_active(String is_active) {
        this.is_active = is_active;
    }

    @Override
    public String toString() {
        return "CartResponseModel{" +
                "customer_id='" + customer_id + '\'' +
                ", cart_id='" + cart_id + '\'' +
                ", total_price='" + total_price + '\'' +
                ", date='" + date + '\'' +
                ", customer_rut='" + customer_rut + '\'' +
                ", payment_method='" + payment_method + '\'' +
                ", state='" + state + '\'' +
                ", is_active='" + is_active + '\'' +
                '}';
    }
}
