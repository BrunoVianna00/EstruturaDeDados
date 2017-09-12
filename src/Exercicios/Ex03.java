
package Exercicios;


public class Ex03 {
    public static void main(String[] args) {
    int v1[] = new int [50]; 
    int v2[] = new int [50];
    
    System.out.printf("%s%8s%8s \n","Vetor","Index","Valor");//titulos da coluna
    
    for (int counter = 0; counter<v1.length;counter++){
        v1[counter] = 1 + 1 * counter;
        System.out.printf("V1");
        System.out.printf("%5d%8d\n",counter,v1[counter]);
    }
    for (int counter = 0; counter<v2.length;counter++){
       
        v2[counter] = v1[counter];
        
        System.out.printf("V2");
        System.out.printf("%5d%8d\n",counter,v2[counter]);
    }
   
    
    } 
}
