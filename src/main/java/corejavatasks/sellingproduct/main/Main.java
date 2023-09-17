package corejavatasks.sellingproduct.main;

import sellingproduct.productservice.ProductConfigService;

import java.util.Scanner;

public class Main {
    static ProductConfigService product = new ProductConfigService();

    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter operation please: " +
                    "\n1.Read file and show products: " +
                    "\n2.Write file new products: " +
                    "\n3.Which product you want to get info: " +
                    "\n4.Exit system");
            int menu = sc.nextInt();
            if (menu == 1) {
                product.readFile();
                product.showAllProducts();
                break;
            } else if (menu == 2) {
                product.writeToFile();
            } else if (menu == 3) {
                product.findProduct();
            } else if (menu == 4) {
                System.exit(0);
                break;
            } else {
                System.out.println("Invalid operation");
                break;
            }

        }

    }
}
