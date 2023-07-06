package aulas;

import java.util.Scanner;
import java.util.*; // importa todas as classes dentro de um pacote exclusivo


public class aprendizagem{

    public static void main(String[]args){
        //Todos sao capasses de armazenar vareais inteiras
        byte a; //8 bits
        short b; // 16 bits
        int c;  //32 bits
        long d; // 64 bits
        
        //São para valores decimais
        float e; //precisao menor
        double f; // precisao melhor
        
        // boolean 1 ou 0 verdadeiro ou falso
        boolean g;
        
        //um unico caractere
        char h;
                        
        
        
        int x;
        double y = 5.5;
        x = 4;
        
        System.out.println("Olá \n quebra de linha \n mundo"+ x+ ",," +y);
        
        // aprendendo a ultilizar o (Scanner)
        Scanner input =  new Scanner(System.in);
        // fez a importação do input
        double base;
        double altura;
        
        base = input.nextDouble();
        
        altura = input.nextDouble();
        
        
        
    }
    
}


