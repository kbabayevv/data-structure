package corejavatasks.sellingproduct.productservice;

import java.io.*;
import java.util.Scanner;

import static corejavatasks.sellingproduct.config.ProductConfig.soldItems;


public class ProductConfigService implements Serializable {

    public void readFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Hp\\IdeaProjects\\Java folders\\Lesson2\\src\\main\\java\\sellingproduct\\infofile\\selling_info.txt.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                for (int i = 0; i < parts.length; i += 2) {
                    String item = parts[i];
                    int quantity = Integer.parseInt(parts[i + 1]);
                    soldItems.put(item, soldItems.getOrDefault(item, 0) + quantity);
                }
            }
            reader.close();
            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name: ");
        String newItem = sc.nextLine();
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Hp\\IdeaProjects\\Java folders\\Lesson2\\src\\main\\java\\sellingproduct\\infofile\\selling_info.txt.txt", true));
            writer.newLine();
            writer.write(newItem);
            writer.close();

            System.out.println("New selling entry added: " + newItem);
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void showAllProducts(){
        for (String item : soldItems.keySet()) {
            System.out.println("Sold " + soldItems.get(item) + " " + item);
        }
        System.out.println();
    }


    public void findProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name: ");
        String productName = sc.nextLine();
        if (soldItems.containsKey(productName)) {
            System.out.println("Total " + productName + " sold: " + soldItems.get(productName));
            System.out.println();
        } else {
            System.out.println(productName + " not found in the selling information.");
            System.out.println();
        }
    }


}

