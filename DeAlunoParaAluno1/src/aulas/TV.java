package aulas;


public class TV {
    
     String fabricante = "Sony";
     int polegadas = 32;
     int volume = 0;
     int canal = 1;
     boolean ligado = false;
     
     public void diminuirVolume(){
         if(volume == 0){
             System.out.println("O volume ja esta no minimo!");
         }
         else
             volume--;
     }
     public void aumentarVolume(){
         if(volume == 50){
             System.out.println("O volume ja esta no maximo!");
         }
         else
             volume++;
     }
     public void ligar(){
         ligado = true;
     }
     public void desligar(){
         ligado = false;
     }
     
    
}
