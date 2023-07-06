
package aulas;

import java.util.Scanner;

public class aula_40 {
    
    public static void main(String[] args){
        
      int[]abc = {1,2,3,4,5};
      int xyz = 10;
      
      vetor(abc);
      variavelPrimitiva(xyz);
      
      System.out.println(abc[0]);
      System.out.println(xyz);
    }
    
    public static void vetor(int[]x){
        
        x[0]= 200;
    }
    
   
    public static void variavelPrimitiva(int x) {
      
       x= 200;
    }
    
    
}
