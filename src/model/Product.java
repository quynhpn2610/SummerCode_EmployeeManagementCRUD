package model;

import java.io.Serializable;

public class Product implements Serializable {
    // Attributes
    private int id;
    private String name;
    private String brand;
    private double price;

    // Accessors and Transformers
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    // Constructors

    public Product() {
    }

    public Product(int id, String name, String brand, double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    // toString to display Product objects

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + id +
                ", productName='" + name + '\'' +
                ", productBrand='" + brand + '\'' +
                ", productCost=" + price +
                '}';
    }
}
