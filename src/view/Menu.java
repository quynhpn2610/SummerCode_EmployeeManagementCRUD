package view;

import service.product.ProductService;

import java.util.Scanner;

public class Menu {

    private static final Scanner sc = new Scanner(System.in);

    static void showMenu(){
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
}
