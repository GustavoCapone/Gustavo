package aulas;


public class aula_41 {
    
    
    
    public static void main(String[]args){
        
        double[] aaa = {10,2,34,2,45,6,43,56};
        double[] ccc = inverter(aaa); 
        
        for(int i = 0;i< ccc.length;i++){
            System.out.println(ccc[i]);
            }
        }
        
    
    public static double[] inverter(double[] abc){
        
        double[]xyz = new double[abc.length];
        
        for(int i = 0, j = xyz.length -1; i < abc.length;++i, --j){
            xyz[j] = abc[i];
        }
        return xyz;
    }
}
