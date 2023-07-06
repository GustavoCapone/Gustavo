
package aulas;

import java.util.Scanner;

public class aula35_02 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        final int TOTAL_ALUNOS = 3;
        final int TOTAL_BIMESTRES = 4;
        final double NOTA_MINIMA = 70.0;
        
        String [] nomeAlunos = new String[TOTAL_ALUNOS];
        double [][] notaAlunos = new double[TOTAL_ALUNOS][TOTAL_BIMESTRES];
        double [] mediaAlunos = new double[TOTAL_ALUNOS];
        
        //Obter o nome dos alunos
        for(int i = 0; i < TOTAL_ALUNOS; ++i){
            System.out.println("Informe o nome do "+(i+1)+" aluno:");
            nomeAlunos[i] = input.nextLine();
        }
        System.out.println("");
        
        
        //Obter notas dos alunos todos os bimestres
        for(int i = 0;i < TOTAL_ALUNOS;++i){
            for(int j = 0;j< TOTAL_BIMESTRES; ++j){
            System.out.println("Informe a nota do aluno "+nomeAlunos[i]+" para o "+
             (j+1)+" Bimestre");
            notaAlunos [i][j] = input.nextDouble();
            
            }
            System.out.println("");
        }
            
            //Calcular media alunos
            for(int i =0;i < TOTAL_ALUNOS; ++i){
                for(int j = 0;j <TOTAL_BIMESTRES;++j){
                    mediaAlunos[i] += notaAlunos[i][j];
                    
                }
                mediaAlunos[i] /= TOTAL_BIMESTRES;
         }
            
            //MOSTRAR SITUAÇÃO DE CADA ALUNO
            System.out.println("============== Resultafo final ===========================");
            for(int i= 0;i<TOTAL_ALUNOS;++i){
                
                if(mediaAlunos[i] >= NOTA_MINIMA){
                    System.out.println("Nome: "+nomeAlunos[i]+" Media: "+mediaAlunos[i]+ " Situação : Aprovado");
                }
                else
                    System.out.println("Nome: "+nomeAlunos[i]+" Media: "+mediaAlunos[i]+ " Situação : Reprovado");
        }
    }
}
