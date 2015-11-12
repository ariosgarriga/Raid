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
import java.awt.*;
import javax.swing.*;





/**
 *
 * @author smachta1
 */
public class InterfazRaid extends javax.swing.JFrame {
private ArrayList<Character> caracter_agregado= new ArrayList<>();//En Este vector se van almacenando las letras que el usuario va tecleando
private Raid0  r0;
private Raid1  r1;
Semaphore CaracterDisponible= new Semaphore(0);
private JTextArea[] TextAreasDiscos= new JTextArea[6];


/**
     * Creates new form InterfazRaid
     */
    public InterfazRaid() {
        initComponents();
    }

    public void EmpezarRaid(String tipo,int cantDiscos){
        TextAreasDiscos[0]=Area1; 
        TextAreasDiscos[1]=Area2; 
        TextAreasDiscos[2]=Area3; 
        TextAreasDiscos[3]=Area4; 
        TextAreasDiscos[4]=Area5; 
        TextAreasDiscos[5]=Area6; 
         
        for(int i=0; i<cantDiscos;i++){
            TextAreasDiscos[i].setVisible(true);
        }
        
        if(tipo.equalsIgnoreCase("Raid0")){
          r0= new Raid0(cantDiscos,caracter_agregado,CaracterDisponible,TextAreasDiscos);
          r0.start();  
        }
        else if(tipo.equalsIgnoreCase("Raid1") ){
           r1= new Raid1(cantDiscos,CaracterDisponible,TextAreasDiscos,caracter_agregado);
           r1.start();
           
        }
   
   
        
    
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EntradaTexto = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        Area5 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        Area4 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        Area1 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        Area2 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        Area6 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        Area3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        Discol1 = new javax.swing.JLabel();
        Discol2 = new javax.swing.JLabel();
        Discol3 = new javax.swing.JLabel();
        Discol5 = new javax.swing.JLabel();
        Discol6 = new javax.swing.JLabel();
        Discol4 = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JButton();

        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setBackground(new java.awt.Color(255, 204, 0));

        EntradaTexto.setBackground(new java.awt.Color(255, 153, 0));
        EntradaTexto.setColumns(20);
        EntradaTexto.setFont(new java.awt.Font("PT Serif", 1, 18)); // NOI18N
        EntradaTexto.setRows(5);
        EntradaTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EntradaTextoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(EntradaTexto);

        Area5.setVisible(false);
        Area5.setBackground(new java.awt.Color(102, 102, 102));
        Area5.setColumns(20);
        Area5.setFont(new java.awt.Font("PT Serif", 1, 14)); // NOI18N
        Area5.setForeground(new java.awt.Color(0, 255, 255));
        Area5.setRows(5);
        Area5.setBorder(null);
        Area5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Area5KeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(Area5);

        Area4.setBackground(new java.awt.Color(102, 102, 102));
        Area4.setColumns(20);
        Area4.setFont(new java.awt.Font("PT Serif", 1, 14)); // NOI18N
        Area4.setForeground(new java.awt.Color(0, 255, 255));
        Area4.setRows(5);
        Area4.setBorder(null);
        Area4.setSelectionColor(new java.awt.Color(255, 255, 255));
        Area4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Area4KeyReleased(evt);
            }
        });
        Area4.setVisible(false);
        jScrollPane6.setViewportView(Area4);

        Area1.setVisible(false);
        Area1.setBackground(new java.awt.Color(102, 102, 102));
        Area1.setColumns(20);
        Area1.setFont(new java.awt.Font("PT Serif", 1, 14)); // NOI18N
        Area1.setForeground(new java.awt.Color(0, 255, 255));
        Area1.setRows(5);
        Area1.setBorder(null);
        Area1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Area1KeyReleased(evt);
            }
        });
        jScrollPane7.setViewportView(Area1);

        Area2.setVisible(false);
        Area2.setBackground(new java.awt.Color(102, 102, 102));
        Area2.setColumns(20);
        Area2.setFont(new java.awt.Font("PT Serif", 1, 14)); // NOI18N
        Area2.setForeground(new java.awt.Color(0, 255, 255));
        Area2.setRows(5);
        Area2.setBorder(null);
        Area2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Area2KeyReleased(evt);
            }
        });
        jScrollPane8.setViewportView(Area2);

        Area6.setVisible(false);
        Area6.setBackground(new java.awt.Color(102, 102, 102));
        Area6.setColumns(20);
        Area6.setFont(new java.awt.Font("PT Serif", 1, 14)); // NOI18N
        Area6.setForeground(new java.awt.Color(0, 255, 255));
        Area6.setRows(5);
        Area6.setBorder(null);
        Area6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Area6KeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(Area6);

        Area3.setVisible(false);
        Area3.setBackground(new java.awt.Color(102, 102, 102));
        Area3.setColumns(20);
        Area3.setFont(new java.awt.Font("PT Serif", 1, 14)); // NOI18N
        Area3.setForeground(new java.awt.Color(0, 255, 255));
        Area3.setRows(5);
        Area3.setBorder(null);
        Area3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Area3KeyReleased(evt);
            }
        });
        jScrollPane10.setViewportView(Area3);

        jLabel1.setFont(new java.awt.Font("PT Serif", 1, 24)); // NOI18N
        jLabel1.setText("  Entrada De texto");

        Discol1.setFont(new java.awt.Font("PT Serif", 1, 14)); // NOI18N
        Discol1.setText("Disco 1");

        Discol2.setFont(new java.awt.Font("PT Serif", 1, 14)); // NOI18N
        Discol2.setText("Disco 2");

        Discol3.setFont(new java.awt.Font("PT Serif", 1, 14)); // NOI18N
        Discol3.setText("Disco 3");

        Discol5.setFont(new java.awt.Font("PT Serif", 1, 14)); // NOI18N
        Discol5.setText("Disco 5");

        Discol6.setFont(new java.awt.Font("PT Serif", 1, 14)); // NOI18N
        Discol6.setText("Disco 6");

        Discol4.setFont(new java.awt.Font("PT Serif", 1, 14)); // NOI18N
        Discol4.setText("Disco 4");

        BotonSalir.setFont(new java.awt.Font("PT Serif", 1, 18)); // NOI18N
        BotonSalir.setText("SALIR");
        BotonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(Discol1)
                        .addGap(150, 150, 150)
                        .addComponent(Discol2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Discol3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(Discol4)
                        .addGap(160, 160, 160)
                        .addComponent(Discol5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Discol6)))
                .addGap(99, 99, 99))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(Discol3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Discol2)
                            .addComponent(Discol1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Discol4)
                            .addComponent(Discol5)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Discol6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BotonSalir)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntradaTextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaTextoKeyReleased
    String aux=EntradaTexto.getText(); 
    char aux4[]=aux.toCharArray(); 
    caracter_agregado.add(aux4[aux4.length-1]);
    CaracterDisponible.release();
        
    }//GEN-LAST:event_EntradaTextoKeyReleased

    private void Area5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Area5KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Area5KeyReleased

    private void Area4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Area4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Area4KeyReleased

    private void Area1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Area1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Area1KeyReleased

    private void Area2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Area2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Area2KeyReleased

    private void Area6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Area6KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Area6KeyReleased

    private void Area3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Area3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Area3KeyReleased

    private void BotonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseClicked
    
    System.exit(0);
        
    }//GEN-LAST:event_BotonSalirMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazRaid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazRaid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazRaid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazRaid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazRaid().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area1;
    private javax.swing.JTextArea Area2;
    private javax.swing.JTextArea Area3;
    private javax.swing.JTextArea Area4;
    private javax.swing.JTextArea Area5;
    private javax.swing.JTextArea Area6;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel Discol1;
    private javax.swing.JLabel Discol2;
    private javax.swing.JLabel Discol3;
    private javax.swing.JLabel Discol4;
    private javax.swing.JLabel Discol5;
    private javax.swing.JLabel Discol6;
    private javax.swing.JTextArea EntradaTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables

}
