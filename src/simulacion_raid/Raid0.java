/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion_raid;


import java.util.ArrayList;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

public class Raid0 extends Thread {

  private ArrayList[] Raid0;
  private int cantDiscos;
  private ArrayList<Character> buffer_caracter;//Aqui es donde se iran almacenando los caracteres que se almacenaran en los discos
  Semaphore   CaracterDisponible; 
  private int cont=0; 
  private boolean run=true; 
  private JTextArea[] Discos;

  public Raid0(int cantDiscos, ArrayList buffer_caracter,Semaphore CaracterDisponible,JTextArea[] Discos){
  Raid0= new ArrayList[cantDiscos];
  this.buffer_caracter=buffer_caracter;
  this.CaracterDisponible=CaracterDisponible;
  this.CaracterDisponible=CaracterDisponible; 
  this.cantDiscos=cantDiscos;
  this.Discos=Discos;
  for(int i=0; i<Raid0.length;i++){
      ArrayList<Character> Disco= new ArrayList<Character>();
      Raid0[i]=Disco;
  } 
  }
  
  @Override
     public void run(){
           
        while(true){
            
            if(run){
                try {
                    CaracterDisponible.acquire();
                    Raid0[cont].add(buffer_caracter.get(0));
                    buffer_caracter.remove(0);
                    String aux=Raid0[cont].toString();
                    Discos[cont].setText(aux);
                    cont++;
                      
                   
                } catch (InterruptedException ex) {
                    Logger.getLogger(Raid0.class.getName()).log(Level.SEVERE, null, ex);
                }
               if(cantDiscos==cont){
                        cont=0;    
                    }       
                
            }  
          
        }
    
     }
  
    
}   
