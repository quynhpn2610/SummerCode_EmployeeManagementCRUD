package service.product;

import model.Product;

public interface IProductService {
    // Create products
    void addProduct(Product p);

    // Read all products
    void showAllProducts();

    // Update products
    void updateProduct(int id, int newId, String newName, String newBrand, double newPrice);

    // Delete products
    void deleteProduct(int id);

    // Read a product
    void showProduct(int id);
}
