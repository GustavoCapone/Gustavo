
package aulas;

import java.util.Scanner;

public class aula_37 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o valor da base: ");
        double base = input.nextDouble();
        
        System.out.println("Digite o valor da altura: ");
        double altura = input.nextDouble();
        
        double areaRetangulo=retangulo(base,altura);
        
        System.out.println(areaRetangulo);
    }
    
    public static double retangulo(double base,double altura){
       
       
        double areaRetangulo = base*altura;
        
        return areaRetangulo;
        
 
    }
    
    
}
