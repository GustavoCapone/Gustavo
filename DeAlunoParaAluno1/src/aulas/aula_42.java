/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas;


public class aula_42 {
    public static void main(String[]args){
      
        TV televisao1 = new TV();
        
        
        System.out.println("Esta televisao e da ,marca "+televisao1.fabricante+"A televisao esta "+(televisao1.ligado == true? " Ligado":"Desligado")+"O volume e"+televisao1.volume);
        televisao1.ligar();
        televisao1.aumentarVolume();
        televisao1.diminuirVolume();
        televisao1.diminuirVolume();
        televisao1.desligar();
        
        
         System.out.println("Esta televisao e da ,marca "+televisao1.fabricante+"A televisao esta "+(televisao1.ligado == true? " Ligado":"Desligado")+"O volume e"+televisao1.volume);
    }
    
}
