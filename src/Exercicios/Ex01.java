package Exercicios;

import java.util.Scanner;


public class Ex01 {
    public static void main(String[] args) {
        int a, b, c, aux;
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite o primeiro numero: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = scan.nextInt();
        System.out.println("Digite o terceiro numero: ");
        c = scan.nextInt();
        
        if( a > b ){
            aux = a;
            a = b;
            b = aux;   
        }
        if ( a > c ){
            aux = a;
            a = c;
            c = aux;
        }
        if ( b > c){
            aux = b;
            b = c;
            c = aux;
        }
        System.out.printf("Valores Ordenados %d, %d e %d",a,b,c);
    }
}
