
package Exercicios;

import java.util.Random;


public class Ex04B {
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
        System.out.println("");
        System.out.printf("%s%10s","Resp","Quant");
            
            
            for (int cont = 1; cont < quantidade.length; cont++){
                System.out.printf("%d %10d",cont,quantidade[cont]); 
            }
                

    }
    
    
    
}
