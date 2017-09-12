package Exercicios;

import java.util.Random;

public class Ex04 {
    public static void main(String[] args) {
        int respostas[] = new int[20];
        int quantidade[] = new int[6];
        Random ale = new Random();
        
        for (int contador = 1; contador < respostas.length; contador++) {
           respostas[contador] = ale.nextInt(6);
             System.out.print(respostas[contador] + " ");
        }
        for (int contResp = 0; contResp < respostas.length; contResp++){
            ++quantidade[respostas[contResp]];
        }
            System.out.println(" ");  
        
        for (int cont = 1; cont < quantidade.length; cont++) {
            if ( cont == 5) {
                System.out.printf("%d: %d \n", 5, quantidade[cont]);
            } else{
                System.out.printf("%d: %d \n", cont, quantidade[cont]);
            }
        }
    }
    
}
