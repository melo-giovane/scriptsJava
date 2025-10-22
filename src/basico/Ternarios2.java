package basico;

import java.util.Scanner;

public class Ternarios2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Digite o numero, ou 0 para sair");
            int numero = sc.nextInt();
            if(numero == 0)break;

            String resultado = (numero % 2 == 0) ? "par" : "Ímpar";

            System.out.println("--------------------");
            System.out.printf("O número %d é %s.%n", numero, resultado);
        }
            sc.close();
    }

}