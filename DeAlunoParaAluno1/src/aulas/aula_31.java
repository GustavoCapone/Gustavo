
package aulas;

    import java.util.Scanner;

public class aula_31 {
    public static void main(String[]args){
     
        int i;
        int[] x = new int[5];
        int[] y = {1,2,3,4,5,6,7,8,9};
        
        java.util.Arrays.fill(x,2,5,3);
        
        for(i = 0;i <x.length ;++i){
            
         System.out.println(x[i]);
        }   
    }
}
