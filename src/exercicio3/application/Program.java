package exercicio3.application;

import exercicio3.entities.Aluno;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();


        System.out.print("Digite o nome do aluno: ");
        aluno.name = sc.nextLine();
        System.out.print("Digite a primeira nota do aluno: ");
        aluno.grade1 = sc.nextDouble();
        System.out.print("Digite a segunda nota do aluno: ");
        aluno.grade2 =sc.nextDouble();
        System.out.print("Digite a terceira nota do aluno: ");
        aluno.grade3 = sc.nextDouble();
        sc.close();

        aluno.approvation();

        System.out.println(aluno);
    }


}
