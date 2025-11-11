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
            System.out.println("Digite a próxima altura:");
            arr[i] = sc.nextDouble();
            sum+=arr[i];
        }

        double average = sum/n;

        System.out.println("AVERAGE HEIGHT: " + average);


    }

}
