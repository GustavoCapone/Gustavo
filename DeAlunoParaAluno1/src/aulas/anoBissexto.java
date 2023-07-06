
package aulas;

import java.util.Scanner;


public class anoBissexto {
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Insira um ano:");
        int ano = input.nextInt();
        
        if((ano % 40 == 0)||(ano %4 == 0 && ano % 100!=0)){
            System.out.println("O ano e Bissexto");
        }
        else{
            System.out.println("O ano não foi Bissexto");
        }
    }
    
}
