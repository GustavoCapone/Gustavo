//programa de notas de alunos SOLO

package aulas;

import java.util.Scanner;

public class aula35Sozinho {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
   
        
        final int ALUNOS = 4;
        final int BIMESTRES = 4;
        final double notaMinima = 70.0;
        
        String [] nomesAlunos = new String[ALUNOS];
        double [][] notasAlunos = new double [ALUNOS][BIMESTRES];
        double [] mediasAlunos = new double [ALUNOS];
        
         System.out.println("");
        
         //preenchimento do vetor alunos
        for(int i = 0; i < ALUNOS; ++i){
            System.out.println("Escreva o nome do "+(i+1)+"º aluno:");
            nomesAlunos[i] = input.nextLine();
        }
        System.out.println("");
        
        //adicionar nota para cada aluno
        for(int i = 0; i < ALUNOS; ++i){
            for(int j = 0; j < BIMESTRES; ++j){
               System.out.println("Escreva a nota do "+(j+1)+"º Bimestre cujo o aluno é "+nomesAlunos[i]+" :");
               notasAlunos[i][j] = input.nextDouble();
            }
            System.out.println("");
        }
        
        
        System.out.println("");
        
        for(int i = 0;i < ALUNOS; ++i){
            for(int j = 0;j < BIMESTRES; ++j){
                mediasAlunos[i] = mediasAlunos[i] + notasAlunos[i][j];  
            }
            mediasAlunos[i] /= BIMESTRES; 
        }
        
        //trazer todos alunos e suas notas
        System.out.println("");
        System.out.println("============Resultado================");
        for(int i = 0;i < ALUNOS; ++i){
            if(notaMinima > mediasAlunos[i]){
                System.out.println("Aluno: "+nomesAlunos[i]+"   "+"Nota final: "+mediasAlunos[i]+"Reprovado \n");
            }
            else
            System.out.println("Aluno: "+nomesAlunos[i]+"   "+"Nota final: "+mediasAlunos[i]+"Aprovado \n");
        }        
        
    }

    
}
