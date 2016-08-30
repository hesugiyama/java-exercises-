
package exerc8;

import java.util.Scanner;
public class Exerc8 {

    
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in,"latin1");
        String disciplina;
        
        System.out.print("Digite uma disciplina: ");
        disciplina = t.nextLine();
        disciplina=disciplina.toLowerCase();
        if(disciplina.indexOf("programação")!=-1)
        {
            System.out.println("É da categoria de programação");
        }
        else 
            System.out.println("Não é da categoria de programação");
    }
    
}
