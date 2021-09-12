package com.dell.dfsd.p3.dfsdphase3project.models;

public class Order {

    public String name;
    public long orderId;
    public double totalPrice;
    public double subTotal;
    public String address;
    public String email;
    public String phone;
    public long userId;
    public long productId;

    public Order() {
    }

    public Order(String name, long orderId, double totalPrice, double subTotal, String address, String email, String phone, long userId, long productId) {
        this.name = name;
        this.orderId = orderId;
        this.totalPrice = totalPrice;
        this.subTotal = subTotal;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.userId = userId;
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }
}
