/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9plus1homeworkv2;

import static com.sun.javafx.Utils.split;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author cnp.ak
 */
public class SearchForm extends javax.swing.JFrame {

    List<ArrayObject> arrayList = new ArrayList<>();
    ArrayObject arrayObject;

    /**
     * Creates new form SearchForm
     */
    public SearchForm() {
        initComponents();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Amilo\\Desktop\\Dropbox\\day9plus1\\price.txt"))) {
            String tempString;
            while ((tempString = br.readLine()) != null) {
                String priceR = "";
                String priceO = "";
                String splittedString[] = tempString.split("\t");
                try {

                    for (int i = 0; i < splittedString[3].length(); i++) {
                        if (splittedString[3].charAt(i) != ' ') {
                            priceR += splittedString[3].charAt(i);
                        }
                    }

                    for (int i = 0; i < splittedString[4].length(); i++) {
                        if (splittedString[4].charAt(i) != ' ') {
                            priceO += splittedString[4].charAt(i);
                        }
                    }
                } catch (Exception priceSpaceRemover) {

                }

                try {
                    arrayObject = new ArrayObject(
                            Integer.parseInt(splittedString[1]),
                            splittedString[2],
                            Integer.parseInt(priceR),
                            Integer.parseInt(priceO),
                            splittedString[5]);
                    arrayList.add(arrayObject);
                } catch (Exception outStringTry) {
                    //outStringTry.printStackTrace();
                }
            }
        } catch (Exception readFromFileException) {
        }

//        System.out.println(arrayList.get(1).description);
//        for (ArrayObject oneItem : arrayList) {
//            System.out.println();
//        }
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i).id+arrayList.get(i).description+arrayList.get(i).priceO);
//        }
//        }
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i).id+arrayList.get(i).description+arrayList.get(i).priceO);
//        }
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i).id +" "+ arrayList.get(i).description +" "+ arrayList.get(i).priceR+" "+arrayList.get(i).priceO+" "+arrayList.get(i).warranty);
//        }
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
        textField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputTable = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textField.setText("asus,<13000,>2000");

        jButton1.setText("Мне повезет!");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        outputTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(outputTable);

        jTextField1.setText("jTextField1");

        jButton2.setText("jButton2");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(0, 533, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    TableRowSorter<TableModel> sorter;
    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        outputTable.setAutoResizeMode(outputTable.AUTO_RESIZE_OFF);
        String parameter0 = "";
        String parameter1 = "";
        String parameter2 = "";
        String fullSearchString = textField.getText();
        String splittedSearchString[] = fullSearchString.split(",");
//        for (int i = 0; i < splittedSearchString.length; i++) {
//            System.out.println(splittedSearchString[i]);
//            System.out.println(splittedSearchString[i].charAt(0));
//        }
        String searchItem = splittedSearchString[0];
        try {
            for (int v = 0; v < splittedSearchString.length; v++) {
                if (splittedSearchString[v].charAt(0) == '<') {
                    for (int i = 1; i < splittedSearchString[v].length(); i++) {
                        parameter1 += splittedSearchString[v].charAt(i);
                    }
                    System.out.println("1<:" + parameter1);
                } else if (splittedSearchString[v].charAt(0) == '>') {
                    for (int i = 1; i < splittedSearchString[v].length(); i++) {
                        parameter2 += splittedSearchString[v].charAt(i);
                    }
                    System.out.println("2>:" + parameter2);
                } else if (splittedSearchString[v].charAt(0) != '>' && splittedSearchString[v].charAt(0) != '<') {
                    parameter0 += splittedSearchString[v];
                    System.out.println("0:" + parameter0);
                }
            }
        } catch (Exception uslovie) {

        }

        for (int i = 0; i < arrayList.size(); i++) {

//            if (arrayList.get(i).description.indexOf(searchItem)!=-1){
//                label.setText(label.getText() + arrayList.get(i).id + " " + arrayList.get(i).description + " " + arrayList.get(i).priceR + " " + arrayList.get(i).priceO + " " + arrayList.get(i).warranty);
//            }
//            if (arrayList.get(i).description.toLowerCase().indexOf(searchItem.toLowerCase()) != -1) {
//                label.setText(label.getText() + arrayList.get(i).id + " " + arrayList.get(i).description + " " + arrayList.get(i).priceR + " " + arrayList.get(i).priceO + " " + arrayList.get(i).warranty);
//            }
            //System.out.println(arrayList.get(i).id + " " + arrayList.get(i).description + " " + arrayList.get(i).priceR + " " + arrayList.get(i).priceO + " " + arrayList.get(i).warranty);
            //label.setText(label.getText()+arrayList.get(i).id + " " + arrayList.get(i).description + " " + arrayList.get(i).priceR + " " + arrayList.get(i).priceO + " " + arrayList.get(i).warranty);
            //label.setText(label.getText() + arrayList.get(i).id + " " + arrayList.get(i).description + " " + arrayList.get(i).priceR + " " + arrayList.get(i).priceO + " " + arrayList.get(i).warranty);
        }

        Object[] columnNames = {"ID", "Описание", "Цена Р", "Цена О", "Гарантия"};
        DefaultTableModel model = new DefaultTableModel(new Object[0][0], columnNames) {
            @Override
            public Class getColumnClass(int column) {
                Class returnValue;
                if ((column >= 0) && (column < getColumnCount())) {
                    returnValue = getValueAt(0, column).getClass();
                } else {
                    returnValue = Object.class;
                }
                return returnValue;
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        for (int i = 0; i < arrayList.size(); i++) {

            if (!parameter1.equals("") && !parameter2.equals("")) {
                if (arrayList.get(i).description.toLowerCase().indexOf(parameter0.toLowerCase()) != -1 && arrayList.get(i).priceR > Integer.parseInt(parameter2) && arrayList.get(i).priceR < Integer.parseInt(parameter1)) {
                    Object[] o = new Object[5];
                    o[0] = arrayList.get(i).id;
                    o[1] = arrayList.get(i).description;
                    o[2] = arrayList.get(i).priceR;
                    o[3] = arrayList.get(i).priceO;
                    o[4] = arrayList.get(i).warranty;
                    model.addRow(o);
                }
            } else if (!parameter1.equals("") && parameter2.equals("")) {
                if (arrayList.get(i).description.toLowerCase().indexOf(parameter0.toLowerCase()) != -1 && arrayList.get(i).priceR < Integer.parseInt(parameter1)) {
                    Object[] o = new Object[5];
                    o[0] = arrayList.get(i).id;
                    o[1] = arrayList.get(i).description;
                    o[2] = arrayList.get(i).priceR;
                    o[3] = arrayList.get(i).priceO;
                    o[4] = arrayList.get(i).warranty;
                    model.addRow(o);
                }
            } else if (parameter1.equals("") && !parameter2.equals("")) {
                if (arrayList.get(i).description.toLowerCase().indexOf(parameter0.toLowerCase()) != -1 && arrayList.get(i).priceR > Integer.parseInt(parameter2)) {
                    Object[] o = new Object[5];
                    o[0] = arrayList.get(i).id;
                    o[1] = arrayList.get(i).description;
                    o[2] = arrayList.get(i).priceR;
                    o[3] = arrayList.get(i).priceO;
                    o[4] = arrayList.get(i).warranty;
                    model.addRow(o);
                }
            } else if (parameter1.equals("") && parameter2.equals("")) {
                if (arrayList.get(i).description.toLowerCase().indexOf(parameter0.toLowerCase()) != -1) {
                    Object[] o = new Object[5];
                    o[0] = arrayList.get(i).id;
                    o[1] = arrayList.get(i).description;
                    o[2] = arrayList.get(i).priceR;
                    o[3] = arrayList.get(i).priceO;
                    o[4] = arrayList.get(i).warranty;
                    model.addRow(o);
                }
            } else if (parameter0.equals("") && !parameter1.equals("") && !parameter2.equals("")) {
                if (arrayList.get(i).priceR > Integer.parseInt(parameter2) && arrayList.get(i).priceR < Integer.parseInt(parameter1)) {
                    Object[] o = new Object[5];
                    o[0] = arrayList.get(i).id;
                    o[1] = arrayList.get(i).description;
                    o[2] = arrayList.get(i).priceR;
                    o[3] = arrayList.get(i).priceO;
                    o[4] = arrayList.get(i).warranty;
                    model.addRow(o);
                }
            } 
            outputTable.setModel(model);
          
            this.sorter = new TableRowSorter<TableModel>(model);
            outputTable.setRowSorter(sorter);
    }//GEN-LAST:event_jButton1MouseClicked
    }
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        String field2=jTextField1.getText();
        try {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)"+field2));
        } catch(Exception lalala){
            
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked
    
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
            java.util.logging.Logger.getLogger(SearchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel label;
    private javax.swing.JTable outputTable;
    private javax.swing.JTextField textField;
    // End of variables declaration//GEN-END:variables
}
