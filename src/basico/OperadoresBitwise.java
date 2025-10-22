package basico;

import java.util.Scanner;

public class OperadoresBitwise {
    // o Operador ^ representa o xor -> que chamamos de ou exclusivo, onde só resulta verdadeiro
    // derivando-se de afirmações diferentes, exemplo (V, F) ou (F, V)

    // Esse operador faz o cálcuo bit a bit, ex:
    // 0101 1001 -> afirmação 1 (89 em decimal)
    // 0011 1100 -> afrimação 2 (60 em decimal)
    // 0110 0101 -> resultado (101 em decimal)

    //mesmo exemplo com o operador &
    // 0101 1001 -> afirmação 1
    // 0011 1100 -> afirmação 2
    // 0001 1000 -> resultado (24 em decimal)

    //mesmo exemplo com o operador |
    // 0101 1001 -> afirmação 1
    // 0011 1100 -> afirmação 2
    // 0111 1101 -> resultado (125 em decimal)


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mask = 0b100000;
        int n = sc.nextInt();

        if((n & mask) != 0){
            System.out.println("6th bit is true!");
        }
        else{
            System.out.println("6th bit is false");
        }
    }
}
