
package aulas;


public class aula41 {
    public static void main(String[]args){
        
        double[] resultado= {10.2,34,2,58.7,7.1};
        double[] resultado2 = inverterVetor(resultado);
        for(int i = 0; i < resultado2.length; ++i){
        System.out.println(resultado2[i]);
        }
    }
        public static double[]inverterVetor(double[]numeros){
            
            double[]numericos = new double[numeros.length];
            
            for(int i = 0, j = numericos.length - 1; i < numeros.length;++i,--j){
                numericos[j] = numeros[i];
            }
            
        return numericos;
    }
    
}
