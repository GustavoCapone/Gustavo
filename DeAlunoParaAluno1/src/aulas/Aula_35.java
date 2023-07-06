package aulas;

import java.util.Scanner;

public class Aula_35{
    public static void main(String[] args){
        
        final int TOTAL_ALUNOS = 4;
        final int TOTAL_BIMESTRES = 4;
        final double NOTA_MINIMA = 70.0;
        
        Scanner input = new Scanner(System.in);
        String[] nomeAlunos = new String[TOTAL_ALUNOS];
        double[][] notaAlunos = new double[TOTAL_ALUNOS][TOTAL_BIMESTRES];
        double[] mediaAlunos = new double[TOTAL_ALUNOS];
        
        //Obter nome dos alunos
        for(int i = 0;i<TOTAL_ALUNOS;++i){
            System.out.println("Informe o nome do "+(i+1)+" aluno");
            nomeAlunos[i]=input.nextLine(); 
        }
        System.out.println("");
        
        //Obter notas dos alunos de todos os bimestres
        
        for(int i = 0;i<TOTAL_ALUNOS;++i){
            for(int j = 0;j<TOTAL_BIMESTRES;++j){
                System.out.println("Informe a nota do aluno "+nomeAlunos[i]+" para"
                        + " o "+(j+1)+" Bimestre");
                notaAlunos[i][j]=input.nextDouble();
            }
            System.out.println("");
        }
        
        //Calcular a media dos alunos
        
        for(int i = 0;i<TOTAL_ALUNOS;++i){
            for(int j = 0;j<TOTAL_BIMESTRES;++j){
                mediaAlunos[i]+= notaAlunos[i][j];
                
            }
            mediaAlunos[i] /= TOTAL_BIMESTRES;
        
        }
        
        //Mostrar a media de cada aluno
         System.out.println("==================Resultado=======================");
         
         for(int i = 0;i<TOTAL_ALUNOS;++i){
             if(mediaAlunos[i]>= NOTA_MINIMA){
                  System.out.println("A media do Aluno "+nomeAlunos[i]+" Teve a Media de:"+mediaAlunos[i]+" Aluno APROVADO");  
                  continue;
             }
            /*else{
                  System.out.println("A media do Aluno "+nomeAlunos[i]+" Teve a Media de:"+mediaAlunos[i]+" Aluno REPROVADO");  
             }*/
               System.out.println("A media do Aluno "+nomeAlunos[i]+" Teve a Media de:"+mediaAlunos[i]+" Aluno REPROVADO");  
    
         }
        
        
    }
}