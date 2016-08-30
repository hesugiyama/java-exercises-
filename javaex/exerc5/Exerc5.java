
package exerc5;

import java.util.Scanner;
public class Exerc5 {

    
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in,"latin1");
        String numero,result="";
        char recorte;
        int i=0;
        System.out.print("Digite um número: ");
        numero = t.nextLine();
        
        while(i<numero.length()){
            recorte=numero.charAt(i);
            switch(recorte){
                case '0':   
                    result=result+"Zero";
                    break;
                
                case '1': 
                    result=result+"Um";
                    break;
                       
                case '2':
                    result=result+"Dois";
                    break; 

                case '3': 
                    result=result+"Três";
                    break;
                       
                case '4':
                    result=result+"Quatro";
                    break;
                   
                case '5':
                    result=result+"Cinco";
                    break;
                   
                case '6':
                    result=result+"Seis";
                    break;
               
                case '7':
                    result=result+"Sete";
                    break;
                
                case '8':
                    result=result+"Oito";
                    break;
                
                case '9':
                    result=result+"Nove";
                    break;
            }    
            
            if(i==numero.length()-1)
                result = result + ".";
                else
                result = result + ", ";
            
            i++;
        }
        System.out.println(result);
        
       
        
    }
}

