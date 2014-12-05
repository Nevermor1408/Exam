package lesson10_11;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
public class FruitArraylist extends javax.swing.JFrame {
    ArrayList fruit = new ArrayList();
    DefaultListModel model = new DefaultListModel();
    
    
    public FruitArraylist() {
    
        initComponents();
        fruit.add("Apple");
        fruit.add("Bananana");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Pineapple");
        for(int x=0; x<fruit.size();x++){
        model.addElement(fruit.get(x));
        lstfruit.setModel(model);
        
        }
        
    }
public static int findInsertPoint (ArrayList a, Object searchValue){
	   int left = 0;
	   int right =  a.size()-1;
	   int midpoint=0;
	   Object item=null;
	   while (left <= right){
	      midpoint = (left + right) / 2;
              item = a.get(midpoint);
	      int result = ((Comparable)a.get(midpoint)).compareTo(searchValue); 
	   
	     if (result < 0)
	         left = midpoint + 1;
	      else
	         right = midpoint-1;
	   }
	   if(((Comparable)a.get(midpoint)).compareTo(searchValue) < 0)
	   midpoint++;
	   return midpoint;	   
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnadd = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstfruit = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnadd.setText("Add Fruit");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnremove.setText("Remove Fruit");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstfruit);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnremove)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnadd)
                                .addGap(11, 11, 11))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnadd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnremove)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        String f = JOptionPane.showInputDialog(this, "Enter new: ");
        //where does it go
        int loc=findInsertPoint(fruit,f);
        fruit.add(loc,f);
        model.add(loc,f);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        int loc=lstfruit.getSelectedIndex();
        fruit.remove(loc);
        model.remove(loc);
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnremoveActionPerformed

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
            java.util.logging.Logger.getLogger(FruitArraylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FruitArraylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FruitArraylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FruitArraylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FruitArraylist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnremove;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstfruit;
    // End of variables declaration//GEN-END:variables
}
