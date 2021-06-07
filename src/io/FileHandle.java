package io;

import model.Product;

import java.io.*;
import java.util.ArrayList;

public class FileHandle {

    private final String filePath = System.getenv("fileSource");

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

    public Object readFile() throws IOException, ClassNotFoundException {
        File file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Object o = objectInputStream.readObject();

        fileInputStream.close();
        objectInputStream.close();

        return o;
    }
}
