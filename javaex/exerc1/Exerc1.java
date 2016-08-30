
package exerc1;

import java.util.Scanner;
public class Exerc1 {


    public static void main(String[] args) {
        Scanner t = new Scanner(System.in,"latin1");
        int tam = 0;
        String palavra;
        
        System.out.print("Digite uma palavra: ");
        palavra = t.nextLine();
        tam = palavra.length();
        System.out.println(palavra+" possui tamanho em caracteres : "+tam);
        
        
    }
    
}
