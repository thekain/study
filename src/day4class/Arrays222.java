/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4class;

import java.util.Random;

/**
 *
 * @author Amilo
 */
public class Arrays222 extends javax.swing.JFrame {

    int massiv[] = new int [20];
    int rateArray[] = new int[massiv.length];
    int rateCounter[] = new int[massiv.length];
    Random rand = new Random();
    
    /**
     * Creates new form Arrays
     */
    public Arrays222() {
        initComponents();
        String mas="";
        int min=0,max=0;
        int rate=0;
            for (int i=0;i<massiv.length;i++){
                //massiv[i]=rand.nextInt((100-20)+20);
                massiv[i]=(int) (5*(Math.random())+1);
                mas=mas+massiv[i]+", ";
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
        labelMessage.setText(mas);
        labelMin.setText(""+min);
        labelMax.setText(""+max);
        labelRate.setText(""+rate);
    
    int n=0;
    rateArray[n]=massiv[n];
    //rateCounter[n]=1;
    n++;
    
    for (int i=0;i<massiv.length;i++){
        
        boolean switcher=false;
        
        for (int j=0;j<n;j++){
            if (rateArray[j]==massiv[i]){
                switcher=true;
                rateCounter[j]++;
                break;
            }
        }  
        
        if(switcher==false){
            rateArray[n]=massiv[i];
            rateCounter[n]=1;
            n++;
        }
    } 
    
    String allRate="";
    String allCounter="";
    for (int i=0;i<n;i++){
        allRate=allRate+rateArray[i]+", ";
        allCounter=allCounter+rateCounter[i]+", ";
    }
    labelAllRate.setText(allRate);
    labelCounter.setText(allCounter);
    
    
  /**  String allRate="";  
    for (int i=0;i<n;i++){
        allRate=allRate+rateArray[i]+", ";
    }
    labelAllRate.setText(allRate);
    
    for (int i=0;i<n;i++){
        int counter=0;
        for (int j=0;j<massiv.length;j++){
            if (rateArray[i]==massiv[j]){
                counter++;
            }
        }
        rateCounter[i]=counter;
    }
    allRate="";  
    for (int i=0;i<n;i++){
        allRate=allRate+rateCounter[i]+", ";
    }
    labelCounter.setText(allRate);
    
/**        int min=massiv[0],max=min;
        
        for (int i=0;i<10;i++){
            if (min>massiv[i]){
                min=massiv[i];
            }
            if (max<massiv[i]){
                max=massiv[i];
            }
        }
        labelMin.setText(""+min);
        labelMax.setText(""+max);
        
        
        /**for (int i=0;i<10;i++){
            if (temp>massiv[i]) {
                temp=massiv[i];
            }
        } 
        labelMin.setText(temp+"");
        
        //find maximum
        temp=massiv[0];
        for (int i=0;i<10;i++){
            if (temp<massiv[i]) {
                temp=massiv[i];
            }
        } 
        labelMax.setText(temp+"");**/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelMessage = new javax.swing.JLabel();
        labelMin = new javax.swing.JLabel();
        labelMax = new javax.swing.JLabel();
        labelRate = new javax.swing.JLabel();
        labelAllRate = new javax.swing.JLabel();
        labelCounter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelMessage.setText("jLabel1");

        labelMin.setText("jLabel1");

        labelMax.setText("jLabel2");

        labelRate.setText("jLabel1");

        labelAllRate.setText("jLabel1");

        labelCounter.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMin)
                            .addComponent(labelMax)
                            .addComponent(labelRate)
                            .addComponent(labelAllRate, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCounter))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(labelMin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMax)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelRate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAllRate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCounter)
                .addContainerGap(13, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(Arrays222.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arrays222.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arrays222.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arrays222.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arrays222().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelAllRate;
    private javax.swing.JLabel labelCounter;
    private javax.swing.JLabel labelMax;
    private javax.swing.JLabel labelMessage;
    private javax.swing.JLabel labelMin;
    private javax.swing.JLabel labelRate;
    // End of variables declaration//GEN-END:variables
}