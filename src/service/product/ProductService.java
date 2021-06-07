package service.product;

import io.FileHandle;
import model.Product;
import service.product.IProductService;

import java.util.ArrayList;
import java.util.Locale;

public class ProductService implements IProductService {
    // Attributes
    ArrayList<Product> productList = new ArrayList<>();
    FileHandle fileHandle = new FileHandle();
    // Methods
    @Override
    public void addProduct(Product p) {
        productList.add(p);
        try {
            fileHandle.writeFile(productList);
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Cannot write file");
        }
    }

    @Override
    public void showAllProducts() {
        try {
            productList = (ArrayList<Product>) fileHandle.readFile();
        }
        catch (Exception e) {
            System.out.println("Cannot read file");
        }


        if(productList.isEmpty()){
            System.out.println("No product to show");
        }
        for (int i = 0; i < productList.size(); i++){
            System.out.println(productList.get(i).toString());
        }
    }

    @Override
    public void updateProduct(int id, int newId, String newName, String newBrand, double newPrice) {
        try {
            productList = (ArrayList<Product>) fileHandle.readFile();
        }
        catch (Exception e) {
            System.out.println("Cannot read file");
        }
        int count = 0;
        if (productList.isEmpty()){
            System.out.println("Empty list. Cannot update.");
            return;
        }
        for (Product p:
             productList) {
            if (id == p.getId()){
                p.setId(newId);
                p.setName(newName);
                p.setBrand(newBrand);
                p.setPrice(newPrice);
            }
            count++;
        }
        if (count == 0){
            System.out.println("Cannot update.");
        }
        else {
            System.out.println("Successfully updated.");
            try {
                fileHandle.writeFile(productList);
            }
            catch (Exception e) {
                e.printStackTrace();
                System.out.println("Cannot write file");
            }
        }
    }

    @Override
    public void deleteProduct(int id) {
        int count = 0;
        if (productList.isEmpty()){
            System.out.println("Empty list. Cannot delete.");
            return;
        }
        for (int i = 0; i < productList.size(); i++) {
            if(id == productList.get(i).getId()){
                productList.remove(i);
            }
            count++;
        }
        if (count==0){
            System.out.println("Cannot delete.");
        } else{
            System.out.println("Successfully deleted.");
        }
    }

    @Override
    public void showProduct(String name) {
        if (productList.isEmpty()){
            System.out.println("Empty list. No product to show.");
            return;
        }
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(productList.get(i).toString());
            }
        }
    }
}
