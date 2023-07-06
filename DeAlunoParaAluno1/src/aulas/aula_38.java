
package aulas;

import java.util.Scanner;

public class aula_38 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o valor da base: ");
        double base = input.nextDouble();
        
        System.out.println("Digite o valor da altura: ");
        double altura = input.nextDouble();
        
        
        //PASSANDO PARAMETROS E RECEBENDO
        double areaRetangulo=retangulo(base,altura);
        
        
        
        System.out.println(areaRetangulo);
    }
    
    public static double retangulo(double base,double altura){
       
       //O VALOR QUE IRA RETORNAR
        double areaRetangulo = base*altura;
        
        return areaRetangulo;
        
 
    }
    
    
}