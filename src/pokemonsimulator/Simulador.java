/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonsimulator;

import java.awt.Color;
import javax.swing.ComponentInputMap;
import javax.swing.JPanel;
import sources.MotionPane;


/**
 *
 * @author pedro
 */
public class Simulador extends javax.swing.JFrame {

    /**
     * Creates new form Simulador
     */
    public Simulador() {
       this.setUndecorated(true);
        this.setBackground(new Color(0,0,0,0));
        this.pack();
        this.setVisible(true);

        initComponents();
        aposLoading();
    }
    
     private void aposLoading() {
           try{
                Thread.currentThread().sleep(1000*5);
                iniciarTelaBatalha();
           }catch(InterruptedException e) {
               e.printStackTrace();
           }
           
    }
    
    public void iniciarTelaBatalha() {
        this.dispose();
        new ArenaBatalha();
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new MotionPane(this);
        pokemon_loading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pokemon_loading.setBackground(new java.awt.Color(0,0,0));
        pokemon_loading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pokemon_loading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/153cfb7dcfb406a368a3dc4e35e37efb.gif"))); // NOI18N
        jPanel1.add(pokemon_loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pokemon_loading;
    // End of variables declaration//GEN-END:variables
}
