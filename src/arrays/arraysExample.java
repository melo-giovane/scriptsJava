package arrays;

import java.util.Locale;
import java.util.Scanner;

public class arraysExample {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();

        double[] arr = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter next height");
            arr[i] = sc.nextDouble();
            sum+=arr[i];
        }

        double average = sum/n;

        System.out.printf("AVERAGE HEIGHT: %.2f%n", average);


    }

}
