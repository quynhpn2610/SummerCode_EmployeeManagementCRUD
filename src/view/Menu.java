package view;

import model.Product;
import service.product.ProductService;

import java.util.Scanner;

public class Menu {

    private static final Scanner sc = new Scanner(System.in);
    private static final ProductService prService = new ProductService();

    static void showMenu() {
        System.out.println("Welcome to the Product Management program. Please select an option: ");
        System.out.println("1 - Create new products");
        System.out.println("2 - Show all products");
        System.out.println("3 - Update a product");
        System.out.println("4 - Delete a product");
        System.out.println("5 - Search for a product");
        System.out.println("6 - Quit program");
    }

    static int getUserChoice() {
        return Integer.parseInt(sc.nextLine());
    }

    static Product getProductToAdd() {
        System.out.println("---Create new product---");
        System.out.println("Enter product id");
        int idToAdd = Integer.parseInt(sc.nextLine());
        System.out.println("Enter product name");
        String nameToAdd = sc.nextLine();
        System.out.println("Enter product brand");
        String brandToAdd = sc.nextLine();
        System.out.println("Enter product price");
        double priceToAdd = Double.parseDouble(sc.nextLine());
        return new Product(idToAdd, nameToAdd, brandToAdd, priceToAdd);
    }

    static int getProductIdToUpdate() {
        System.out.println("---Update a product---");
        System.out.println("Enter product id");
        return Integer.parseInt(sc.nextLine());
    }

    static Product getNewProductInfo() {
        System.out.println("Enter new id");
        int newId = Integer.parseInt(sc.nextLine());
        System.out.println("Enter new name");
        String newName = sc.nextLine();
        System.out.println("Enter new brand");
        String newBrand = sc.nextLine();
        System.out.println("Enter new price");
        double newPrice = Double.parseDouble(sc.nextLine());
        return new Product(newId, newName, newBrand, newPrice);
    }

    static int getProductIdToDelete() {
        System.out.println("---Delete a product---");
        System.out.println("Enter product id");
        return Integer.parseInt(sc.nextLine());
    }

    static String getProductNameToSearch() {
        System.out.println("---Search for a product---");
        System.out.println("Enter product name to search");
        return sc.nextLine();
    }
}
