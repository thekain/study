/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4class;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Amilo
 */
public class Sort extends javax.swing.JFrame {

    int massiv[] = new int [20];
    int rateArray[] = new int[massiv.length];
    int rateCounter[] = new int[massiv.length];
    Random rand = new Random();
    
    /**
     * Creates new form Soprt
     */
    public Sort() {
        initComponents();
        String mas="";
        int min=0,max=0;
        int rate=0;
            for (int i=0;i<massiv.length;i++){
                //massiv[i]=rand.nextInt((100-20)+20);
                massiv[i]=(int) (5*(Math.random())+1);
                
                if (i==0){
                    min=massiv[i];
                    max=min;
                }
                if (min>massiv[i]){
                min=massiv[i];
            }
            if (max<massiv[i]){
                max=massiv[i];
            }                
            if (massiv[i]==massiv[0]){
                rate++;
            }
        }
        Arrays.sort(massiv);
         for (int i=0;i<massiv.length;i++){
        mas=mas+massiv[i]+", ";
         }
         massiv[massiv.length-1]=9;
        label.setText(mas);
        String someString="";
        int count=1;
        for (int i=0;i<massiv.length;i++){
            if (i!=massiv.length-1){
                if (massiv[i]==massiv[i+1]){
                    count++;
                } else {
                    someString=someString+count+"!, \n";
                    count=1;
                }
            } else{
                if (massiv[i]==massiv[i-1]){
                    someString=someString+count+"+, ";
                } else {
                    someString=someString+count+"-, ";
                    count=1;
                    //someString=someString+count+"_, ";
                }
                
                
                
                
                
            }

        }
        answer.setText(someString);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label = new javax.swing.JLabel();
        answer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label.setText("jLabel1");

        answer.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label)
                    .addComponent(answer))
                .addContainerGap(356, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label)
                .addGap(28, 28, 28)
                .addComponent(answer)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Sort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sort().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel answer;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
}
