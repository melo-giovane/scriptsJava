package membrosEstaticos1.exercicio2.application;

import membrosEstaticos1.exercicio2.util.CurrencyConverter;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double price = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollars = sc.nextDouble();
        double reais = CurrencyConverter.finalValue(dollars, price);
        System.out.print("Amount to be paid in reais = " + reais);
    }
}
