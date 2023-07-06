
package aulas;

import java.util.Scanner;

public class aula_36 {
    
    public static void main(String[] args){
        double areaRetangulo=retangulo();
        
        System.out.println(areaRetangulo);
    }
    
    public static double retangulo(){
        Scanner input = new Scanner(System.in);
        double base, altura, areaRetangulo, areaTotal = 0;
        
        System.out.println("Informe a base do retangulo: ");
        base = input.nextDouble();
        System.out.println("Informe a altura do retangulo: ");
        altura = input.nextDouble();
        areaRetangulo = base*altura;
        System.out.println("A area do retangulo é  "+areaRetangulo);
        
        
        
        return areaRetangulo;
        
 
    }
    
    
}
