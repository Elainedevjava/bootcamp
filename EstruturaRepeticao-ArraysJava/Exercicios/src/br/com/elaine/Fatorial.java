package br.com.elaine;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de número inteiro fornecido pelo usuário.
*/
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial + "! = ");
        for(int i = fatorial; i >=1 ; i--) {
            multiplicacao = multiplicacao * i;
        }
        System.out.println(multiplicacao);
    }
}
