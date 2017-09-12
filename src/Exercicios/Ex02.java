package Exercicios;
import java.util.Random;
public class Ex02 {
    public static void main(String[] args) {
         int notas[] = new int [20];
         int quant[] = new int [11];
         Random ale = new Random();
         
         System.out.printf("%s%8s \n","Notas ","Quantidade de notas");
         
         for (int contador = 0; contador < notas.length; contador++) {
            notas[contador] = ale.nextInt(101);
             System.out.print(notas[contador] + " ");
        }
         for (int i = 0; i < notas.length; i++) {
            ++quant[notas[i]/10];
        }
         System.out.println("");
         
         for (int contador = 0; contador < quant.length; contador++) {
            if ( contador == 10) {
                System.out.printf("%5d: %d \n", 100, quant[contador]);
            } else{
                System.out.printf("%02d-%02d: %d \n", contador*10,contador*10+9,quant[contador]);
            }
        }
    }
}
