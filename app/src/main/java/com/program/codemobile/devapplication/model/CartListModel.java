package com.program.codemobile.devapplication.model;

import java.util.Arrays;
import java.util.List;

public class CartListModel {

    private CartResponseModel cart;
    //private CartProduct[] products;
    private List<CartProduct> products;
    private String[] coupon;

    public CartResponseModel getCart() {
        return cart;
    }

    public void setCart(CartResponseModel cart) {
        this.cart = cart;
    }

    public List<CartProduct> getProducts() {
        return products;
    }

    public void setProducts(List<CartProduct> products) {
        this.products = products;
    }

    public String[] getCoupon() {
        return coupon;
    }

    public void setCoupon(String[] coupon) {
        this.coupon = coupon;
    }

    @Override
    public String toString() {
        return "CartListModel{" +
                "cart=" + cart +
                ", products=" + products +
                ", coupon=" + Arrays.toString(coupon) +
                '}';
    }
}
