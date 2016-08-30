package exerc7;

import java.util.Scanner;

public class Exerc7 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String nome, sobrenome;
        int i=0;
        System.out.print("Nome: ");
        nome = t.nextLine();
        while(i < nome.length())
        {
            if(nome.indexOf(' ',i) != -1){
                i = nome.indexOf(' ',i) + 1;
            }
            else{
                break;
            }
        }
        System.out.println(nome.substring(i));
      
      
    }
    
}
