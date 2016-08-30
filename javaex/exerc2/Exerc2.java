
package exerc2;

import java.util.Scanner;
public class Exerc2 {

   
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in,"latin1");
        String palavra;
        
        System.out.print("Digite uma palavra: ");
        palavra = t.nextLine();
        
        for (int i = 0; i < palavra.length(); i++) {
            System.out.println(palavra.charAt(i));
        }
        
    }
    
}
