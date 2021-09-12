package com.dell.dfsd.p3.dfsdphase3project.models;

public class Product {

    public String name;
    public long productId;
    public double price;
    public String descriptiopn;
    public String brand;
    public String category;
    public String createDate;
    public String seller;

    public Product() {
    }

    public Product(String name, long productId, double price, String descriptiopn, String brand, String category, String createDate, String seller) {
        this.name = name;
        this.productId = productId;
        this.price = price;
        this.descriptiopn = descriptiopn;
        this.brand = brand;
        this.category = category;
        this.createDate = createDate;
        this.seller = seller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescriptiopn() {
        return descriptiopn;
    }

    public void setDescriptiopn(String descriptiopn) {
        this.descriptiopn = descriptiopn;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }
}
