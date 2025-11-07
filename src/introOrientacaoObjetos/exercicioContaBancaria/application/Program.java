package introOrientacaoObjetos.exercicioContaBancaria.application;

import introOrientacaoObjetos.exercicioContaBancaria.entities.Conta;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char initialDeposit = sc.next().charAt(0);
        sc.nextLine();
        double initialDepositValue = 0;
        if(initialDeposit == 'y'){
            System.out.print("Enter initial deposit value: ");
            initialDepositValue = sc.nextDouble();
        }

        Conta conta = new Conta(name, initialDepositValue, accNumber);
        System.out.println("Account Data:");
        System.out.println(conta);

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        conta.deposit(deposit);
        System.out.println("Updated account data:");
        System.out.println(conta);
        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        conta.withdraw(withdraw);
        System.out.println("Updated account data:");
        System.out.println(conta);






        sc.close();
    }

}
