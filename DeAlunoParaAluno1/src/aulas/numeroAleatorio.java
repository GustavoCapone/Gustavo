
package aulas;

import java.util.Scanner;
import java.util.Random;

public class numeroAleatorio {
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        boolean acertou = false;
        int tentativas = 5;
        int numeroSecreto = random.nextInt();
        long chute = 0;
        
        while(tentativas > 0 && acertou == false){
            
            System.out.println("Qual seu chute?");
            chute = input.nextLong();
            if(chute == numeroSecreto){
                System.out.println("Você acertou o numero aleatorio");
                System.out.println("O numero secreto era: "+numeroSecreto);
                acertou = true;
                
            }else if(chute != numeroSecreto && tentativas > 0){
                System.out.println("Você errou o numero aleatorio");
                System.out.println();
                System.out.println("O numero secreto era: "+numeroSecreto);
                
            }else{
                System.out.println("O numero secreto era: "+numeroSecreto);
                
            }
            --tentativas;
            
            
        }
        System.out.println("Programa finalizado");
    }
}
