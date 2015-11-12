
package simulacion_raid;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;


public class Raid1 extends Thread {
private ArrayList[] Raid1; 
Semaphore CaracterDisponible; 
private ArrayList<Character> buffer_caracter;
private int cont=0; 
private boolean run=true; 
private JTextArea[] Discos;  

  

public Raid1(int cantDiscos,Semaphore CaracterDisponible,JTextArea[] Discos,ArrayList buffer_caracter){
Raid1= new ArrayList[cantDiscos]; 
this.CaracterDisponible=CaracterDisponible;
this.Discos=Discos; 
this.buffer_caracter=buffer_caracter;    
for(int i=0; i<cantDiscos;i++){
ArrayList<Character> Disco= new ArrayList<Character>();
Raid1[i]=Disco;
}

}


public void run(){
    
     while(true){
            
            if(run){
                try { 
                    CaracterDisponible.acquire();
                    Raid1[0].add(buffer_caracter.get(0)); 
                    buffer_caracter.remove(0); 
                    String aux=Raid1[0].toString();
                    for(int i=0; i<Raid1.length;i++){
                        Raid1[i]=Raid1[0];
                        Discos[i].setText(aux);
                    }
                    
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(Raid1.class.getName()).log(Level.SEVERE, null, ex);
                }
              
                
                
                
                
                
            }  
          
        }
    
     }
 




}










