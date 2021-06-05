package model;

public class Product {
    // Attributes
    private int productId;
    private String productName;
    private String productBrand;
    private double productCost;

    // Accessors and Transformers
    public int getProductId(){
        return productId;
    }

    public void setProductId(int productId){
        this.productId = productId;
    }

    public String getProductName(){
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public double getProductCost() {
        return productCost;
    }

    public void setProductCost(double productCost){
        this.productCost = productCost;
    }

    // Constructors

    public Product() {
    }

    public Product(int productId, String productName, String productBrand, double productCost) {
        this.productId = productId;
        this.productName = productName;
        this.productBrand = productBrand;
        this.productCost = productCost;
    }

    // toString to display Product objects

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productBrand='" + productBrand + '\'' +
                ", productCost=" + productCost +
                '}';
    }
}
