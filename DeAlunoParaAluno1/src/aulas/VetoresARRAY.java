
package aulas;

import java.util.Scanner;

public class VetoresARRAY {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int numeroAlunos = 3;
        double[] notasAlunos = new double[numeroAlunos];
        
        for(int i = 0;i < numeroAlunos; ++i){
            System.out.println("Insira a nota do "+ (i+1)+ " aluno");
            notasAlunos[i] = input.nextDouble();
        }
        for(int i = 0;i < numeroAlunos; ++i){
            System.out.println(notasAlunos[i]);
            
        }
    }
}
