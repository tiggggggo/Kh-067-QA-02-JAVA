import bean.Beverage;
import bean.Food;
import bean.Product;
import utils.ProductUtils;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Get products from file
        List<Product> products = ProductUtils.getProductsFromFile();
       // System.out.println("Before");
       // for (Product product: products) {
            //System.out.println(product);
        //}
       // System.out.println();

        //Find product logic
        System.out.print("Enter product name: ");
        String productName = in.nextLine();
        Product product = ProductUtils.getProductInfoByName(productName, products);
        if (product == null) {
            System.out.println("Such product does not exist in our List. Please enter it again for Adding ");
        } else {
            System.out.println(product);
        }

        //Add food
        System.out.print("Enter product name: ");
        String foodName = in.nextLine();
        System.out.print("Enter product weight, grams: ");
        int foodWeight = in.nextInt();
        if (ProductUtils.isWeightAvailable(foodWeight)) {
            Product food = new Food(foodName, foodWeight);
            products.add(food);
        } else {
            System.out.println("Weight is not available");
        }

        //Add beverage
        System.out.print("Enter drink name: ");
        String beverageName = in.nextLine();
        System.out.print("Enter drink weight, ml: ");
        int beverageWeight = in.nextInt();
        if (ProductUtils.isWeightAvailable(beverageWeight)) {
            Product beverage = new Beverage(beverageName, beverageWeight);
            products.add(beverage);
        } else {
            System.out.println("Weight is not available");
        }

        System.out.println("After");
        for (Product item: products) {
            System.out.println(item);
        }
        System.out.println();

        in.close();
    }
}
