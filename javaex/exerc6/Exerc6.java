package exerc6;

import java.util.Scanner;

public class Exerc6 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in, "latin1");
        String palavra, letra;
        int i=0;
        System.out.print("Digite a frase: ");
        palavra = t.nextLine();
        System.out.print("Digite uma letra: ");
        letra = t.nextLine();
        palavra = palavra.toUpperCase();
        while(i< palavra.length()){
            if(palavra.indexOf(letra,i) > 0){
            System.out.println("Letra '" + letra + "' na posição "+ palavra.indexOf(letra,i));
            i = palavra.indexOf(letra, i) + 1;
            }
            else
                System.out.println("Não existe essa letra na frase.");
                break;
        }
            
        
        
        
        
        
        
    }
    
}
