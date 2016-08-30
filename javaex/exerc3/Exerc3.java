
package exerc3;

import java.util.Scanner;
public class Exerc3 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in,"latin1");
        String palavra;
        char[] vogais = {'A','E','I','O','U',' '};
        int i=0,pos=0,vog=0,espa=0;
        
        System.out.print("Digite uma palavra: ");
        palavra = t.nextLine();
        
        for (int j = 0; j < palavra.length(); j++) {
            System.out.println(palavra.charAt(j));
        }
        
        palavra = palavra.toUpperCase();
        for (int aux = 0; aux < vogais.length; aux++) {
            i=0;
            while(i<palavra.length()){
                pos=palavra.indexOf(vogais[aux],i);
                if (pos>=0) {              
                    if(vogais[aux] == ' '){
                        espa++;
                    }
                    else{
                        vog++;
                    }
                    i=pos+1;
                }
                else
                    break;
            }
            
        }
        System.out.println("Quantidade de vogais: "+vog);
        System.out.println("Quantidade de espaços: "+espa);
    }
}
   
