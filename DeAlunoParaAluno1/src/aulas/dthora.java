
package aulas;

public class dthora {
    
    public static void main(String[]args){
        //chama hora atual
        long totalMilisegundos =System.currentTimeMillis() - 10800000;
        
        long totalSegundos = totalMilisegundos / 1000;
        long segundoAtual = totalSegundos % 60;
        
        long totalMinutos = totalSegundos / 60;
        long minutoAtual = totalMinutos % 60;
        
        long totalHoras = totalMinutos / 60;
        long horaAtual = totalHoras % 24;
        
        System.out.println("Agora são exatamente : "+horaAtual +":"+minutoAtual+":"+segundoAtual);
        
        
    }
    
    
    
}
