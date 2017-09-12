
package Exercicios;

import java.util.Scanner;


public class Ex01B {
    public static void main(String[] args) {
        int a,b,c, aux;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o primeiro valor");
        a = entrada.nextInt();
        System.out.println("Digite o segundo valor");
        b = entrada.nextInt();
        System.out.println("Digite o terceiro valor");
        c = entrada.nextInt();
        
        if( b < a || c < a ){
            if ( b < c ){
                aux = a; 
                a = b; 
                b = aux;
            }
            else{
                aux = a; 
                a = c; 
                c = aux;
            }
        }
        if ( b > c ) {
            aux = b; 
            b = c; 
            c = aux;
        }
        System.out.printf("Valores Ordenados %d, %d e %d",a,b,c);
    }
}
