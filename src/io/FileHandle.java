package io;

import model.Product;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileHandle {
    private final String filePath = "/Users/quynhpn2610/Desktop/SummerCode/Java/ProductManagementCRUD/product.txt";

    public void writeFile(ArrayList<Product> productList) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(productList);

        objectOutputStream.close();
        fileOutputStream.close();
    }
}
