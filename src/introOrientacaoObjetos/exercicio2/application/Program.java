package introOrientacaoObjetos.exercicio2.application;

import introOrientacaoObjetos.exercicio2.entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();


        System.out.print("Name: ");
        funcionario.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        funcionario.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        funcionario.tax = sc.nextDouble();

        System.out.println("Employee: " + funcionario);


        System.out.print("Which percentage to increase salary? ");
        double increase = sc.nextDouble();
        funcionario.increaseSalary(increase);

        System.out.println("Updated data: " + funcionario);

        sc.close();
    }
}
