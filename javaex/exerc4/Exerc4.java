package exerc4;

import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {
        Scanner t = new Scanner (System.in, "latin1");
        String palavra1, palavra2;
        int compar, tam1, tam2;
        System.out.print("Digite a primeira palavra: ");
        palavra1 = t.nextLine();
        System.out.print("Digite a segunda palavra: ");
        palavra2 = t.nextLine();
        compar = palavra1.compareToIgnoreCase(palavra2);
        tam1 = palavra1.length();
        tam2 = palavra2.length();
        if (tam1 == tam2){
            if(compar == 0){
                if(palavra1.compareTo(palavra2) == 0){
                    System.out.println("As palavras são exatamente iguais");
                }
                else{
                    System.out.println("As palavras não são exatamente iguais");
                }
            }
            else{
                System.out.println("As palavras não são iguais, mesmo comparando só os caracteres");
                    }
        }
        else
        {
            System.out.println("As palavras possuem tamanhos diferentes.");
        }
        
            
       
    }
    
}
