package utils;

import bean.Beverage;
import bean.Food;
import bean.Product;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductUtils {

    public static List<Product> getProductsFromFile() {
        List<Product> products = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("/Users/CES/Desktop/Demo1/Kh-067-QA-02-JAVA/src/main/resources/menu.txt"));
            while (scanner.hasNextLine()) {
                String productLine = scanner.nextLine();
                String[] productInfo = productLine.split(" \\| ");
                if (productInfo[0].equals("F")) {
                    Product product = new Food(productInfo[1], Integer.parseInt(productInfo[2]));
                    products.add(product);
                } else if (productInfo[0].equals("B")) {
                    Product product = new Beverage(productInfo[1], Integer.parseInt(productInfo[2]));
                    products.add(product);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Exception while processing file");
            throw new RuntimeException(e);
        }
        return products;
    }

    public static Product getProductInfoByName(String name, List<Product> products) {
        for (Product product: products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public static boolean isWeightAvailable(int weight){
        return (weight > 0 && weight < 1000);
    }
}
