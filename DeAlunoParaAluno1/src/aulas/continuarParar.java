
package aulas;

import java.util.Scanner;

public class continuarParar {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um numero de 1 a 10");
        int numero = input.nextInt();
        
        for(int i = 0; i <=10; ++i){
            if(i == numero){
                System.out.println("O seu numero é "+ i);
                //quebra a execução no ciclo;
                //break;
            }
            else{
                System.out.println("O seu numero não é "+i);
                //ELE REINICIA A EXECUÇÃO
                //continue;
            }
            
            
            System.out.println("XXXXXXXXXXXXXX");
            
        }
    }
}
