package view;

import model.Product;
import service.product.ProductService;

import java.util.Scanner;

public class Main {
    private static final ProductService prService = new ProductService();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean condition = true;
        while(condition){
            Menu.showMenu();
            int userChoice = Menu.getUserChoice();
            switch (userChoice) {
                case 1: // Create
                    Product newProduct = Menu.getProductToAdd();
                    prService.addProduct(newProduct);
                    break;
                case 2: // Read all
                    System.out.println("---Show all products---");
                    prService.showAllProducts();
                    break;
                case 3: // Update
                    System.out.println("---Update a product---");
                    System.out.println("Enter product id");
                    int idToUpdate = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter new id");
                    int newId = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter new name");
                    String newName = sc.nextLine();
                    System.out.println("Enter new brand");
                    String newBrand = sc.nextLine();
                    System.out.println("Enter new price");
                    double newPrice = Double.parseDouble(sc.nextLine());
                    prService.updateProduct(idToUpdate, newId, newName, newBrand, newPrice);
                    break;
                case 4: // Delete
                    System.out.println("---Delete a product---");
                    System.out.println("Enter product id");
                    int idToDelete = Integer.parseInt(sc.nextLine());
                    prService.deleteProduct(idToDelete);
                    break;
                case 5: // Search for a product
                    System.out.println("---Search for a product---");
                    System.out.println("Enter product name");
                    String nameToShow = sc.nextLine();
                    prService.showProduct(nameToShow);
                    break;
                case 6: // Quit
                    System.out.println("Program closed!");
                    condition = false;
                    break;
                default: // When user fails to input 1-6
                    System.out.println("Invalid input. PLease enter a number 1-6 to select an option.");
            }
        }
    }
}
