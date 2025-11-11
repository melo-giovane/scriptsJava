package arrays.mediaPreco.application;

import arrays.mediaPreco.product.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of products");
        int n = sc.nextInt();

        Product[] products = new Product[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of the product");
            String name = sc.nextLine();
            sc.next();
            System.out.println("Enter the price");
            double price = sc.nextDouble();
            products[i] = new Product(name, price);
        }

        double sum = 0;

        for(int i = 0; i < n; i++){
            sum += products[i].getPrice();
        }

        double avg = sum/n;

        System.out.printf("AVERAGE PRICE: %.2f", avg);

        sc.close();
    }
}
