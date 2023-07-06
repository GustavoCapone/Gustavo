/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas;

import java.util.Scanner;

public class switchComoUsar {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Selecione um numero de 1 a 5");
        int num = input.nextInt();
        
        switch(num){
            case 1:
               System.out.println("Você escolheu 1");
               break;
               
            case 2:
               System.out.println("Você escolheu 2");
               break;
               
            case 3:
               System.out.println("Você escolheu 3");
               break;
               
            case 4:
               System.out.println("Você escolheu 4");
               break;
            
            case 5:
               System.out.println("Você escolheu 5");
               break;
            case 6:
            case 7:
            case 8:
                  System.out.println("Pe de moleque"); 
                break;
               
               //caso ele nao caiu em nenhuma das condiçoes acima
            default:
                System.out.println("Resposta não corresponde");
               
                
        }
               
        
        
    }
    
}
