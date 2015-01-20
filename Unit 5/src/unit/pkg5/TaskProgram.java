
package unit.pkg5;

import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JOptionPane;

public class TaskProgram extends javax.swing.JFrame {
    ArrayList list;
    ListIterator li;
    int curtask,tottask;
    Task t;
    Task somethingelse;
    public TaskProgram() {
        initComponents();
        list = new ArrayList();
        li = list.listIterator();
        curtask=0;
        tottask=0;
    }
    
    /**
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdesc = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        lblcurrent = new javax.swing.JLabel();
        btnfirst = new javax.swing.JButton();
        btnprev = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnushow = new javax.swing.JMenuItem();
        mnuexit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnureplace = new javax.swing.JMenuItem();
        mnuremove = new javax.swing.JMenuItem();
        mnurestore = new javax.swing.JMenuItem();
        mnuclear = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnubefore = new javax.swing.JMenuItem();
        mnuafter = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name: ");

        jLabel2.setText("Description: ");

        txtdesc.setColumns(20);
        txtdesc.setRows(5);
        jScrollPane1.setViewportView(txtdesc);

        jLabel3.setText("Current Task:");

        jLabel4.setText("Total Task");

        lbltotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblcurrent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcurrent.setText("NA");
        lblcurrent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnfirst.setText("<<");
        btnfirst.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstActionPerformed(evt);
            }
        });

        btnprev.setText("<");
        btnprev.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnprev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprevActionPerformed(evt);
            }
        });

        btnnext.setText(">");
        btnnext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnlast.setText(">>");
        btnlast.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        jMenu1.setText("Program");

        mnushow.setText("Show All Tasks");
        mnushow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnushowActionPerformed(evt);
            }
        });
        jMenu1.add(mnushow);

        mnuexit.setText("Exit");
        mnuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuexitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuexit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        mnureplace.setText("Replace This as Current Task");
        mnureplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnureplaceActionPerformed(evt);
            }
        });
        jMenu2.add(mnureplace);

        mnuremove.setText("Remove Current Task");
        mnuremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuremoveActionPerformed(evt);
            }
        });
        jMenu2.add(mnuremove);

        mnurestore.setText("Restore Current Task to Screen");
        mnurestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnurestoreActionPerformed(evt);
            }
        });
        jMenu2.add(mnurestore);

        mnuclear.setText("Clear Screen");
        mnuclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuclearActionPerformed(evt);
            }
        });
        jMenu2.add(mnuclear);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Insert");

        mnubefore.setText("Before Current Task");
        mnubefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnubeforeActionPerformed(evt);
            }
        });
        jMenu3.add(mnubefore);

        mnuafter.setText("After Current Task");
        mnuafter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuafterActionPerformed(evt);
            }
        });
        jMenu3.add(mnuafter);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(lblcurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(btnprev, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(240, 240, 240))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(266, 266, 266)
                                .addComponent(btnnext, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnlast, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnfirst)
                    .addComponent(btnprev)
                    .addComponent(btnnext)
                    .addComponent(btnlast))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnprevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprevActionPerformed
        
                        t=(Task)li.previous();
    			curtask--;
    			lblcurrent.setText("" + curtask);
    			txtname.setText(t.getName());
    			txtdesc.setText(t.getDescription());
                        
        // TODO add your handling code here:
                        
    }//GEN-LAST:event_btnprevActionPerformed

    private void mnuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuexitActionPerformed
        this.dispose();
        System.exit(0);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuexitActionPerformed

    private void mnureplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnureplaceActionPerformed
        //this one
        if(tottask==0){
            JOptionPane.showMessageDialog(this, "No task to replace this with, use insert instead");
            return;
        }
        String nm = txtname.getText();
        String d = txtdesc.getText();
        Task t = new Task(nm,d);
        if(t.validate()==false){
            JOptionPane.showMessageDialog(this, "Error - must enter all information");
        return;
        }
        li.next();
        li.set(t);
        li.previous();
        // TODO add your handling code here:
    }//GEN-LAST:event_mnureplaceActionPerformed

    private void mnuremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuremoveActionPerformed
        if(tottask==0) return;
        li.next();
        li.remove();
        tottask--;
        lbltotal.setText("" +tottask);
        if(tottask==0){
            txtname.setText("");
            txtdesc.setText("");
            curtask=0;
            lblcurrent.setText("n/a");
            return;
        }
        if(tottask>1){
            li.next();
            t=(Task)li.previous();
        }
        else if(tottask==1){
            t=(Task)li.previous();
            curtask=1;
            lblcurrent.setText(""+curtask);
        }
        txtname.setText(t.getName());
        txtdesc.setText(t.getDescription());
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuremoveActionPerformed

    private void mnuclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuclearActionPerformed
        String nm = txtname.getText();
        String d = txtdesc.getText();
        somethingelse = new Task(nm,d);        
        txtname.setText("");
        txtdesc.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuclearActionPerformed

    private void mnuafterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuafterActionPerformed
        String nm = txtname.getText();
        String d = txtdesc.getText();
        Task t = new Task(nm,d);
        if(t.validate()==false){
            JOptionPane.showMessageDialog(this, "Error - Must enter all information");
        return;
        }
        if(tottask>0) li.next();
        li.add(t);
        li.previous();
        curtask++;
        tottask++;
        lbltotal.setText(""+tottask);
        lblcurrent.setText(""+curtask);
        JOptionPane.showMessageDialog(this, "Task Added");
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuafterActionPerformed

    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstActionPerformed
        while(li.hasPrevious())t=(Task)li.previous();
    			curtask=1;
    			lblcurrent.setText("" + curtask);
    			txtname.setText(t.getName());
    			txtdesc.setText(t.getDescription());
// TODO add your handling code here:
    }//GEN-LAST:event_btnfirstActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        if(curtask==tottask) return;
        while(li.hasNext())
            li.next();
        t = (Task) li.previous();
        curtask=tottask;
        lblcurrent.setText(""+curtask);
        txtname.setText(t.getName());
        txtdesc.setText(t.getDescription());
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlastActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        if(curtask ==tottask) return;
        curtask++;
        lblcurrent.setText("" +curtask);
        li.next();
        li.next();
        t=(Task) li.previous();
        txtname.setText(t.getName());
        txtdesc.setText(t.getDescription());
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnnextActionPerformed

    private void mnushowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnushowActionPerformed
        String result="";
        for(int x=0;x<list.size();x++){
            t=(Task)list.get(x);
            result+="TASK "+(x+1)+":\n"+t.toString()+"\n";
            
        }
        JOptionPane.showMessageDialog(this,result);
    }//GEN-LAST:event_mnushowActionPerformed

    private void mnurestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnurestoreActionPerformed
        
        
        txtname.setText(somethingelse.getName());
        txtdesc.setText(somethingelse.getDescription());  
        // TODO add your handling code here:
    }//GEN-LAST:event_mnurestoreActionPerformed

    private void mnubeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnubeforeActionPerformed
        String nm = txtname.getText();
        String d = txtdesc.getText();
        Task t = new Task(nm,d);
        
        if(t.validate()==false){
            JOptionPane.showMessageDialog(this, "Error - Must enter all information");
        return;
        }
        
        li.add(t);
        li.previous();
        
        tottask++;
        lbltotal.setText(""+tottask);
        lblcurrent.setText(""+curtask);
        JOptionPane.showMessageDialog(this, "Task Added");  
        // TODO add your handling code here:
    }//GEN-LAST:event_mnubeforeActionPerformed

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
            java.util.logging.Logger.getLogger(TaskProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfirst;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcurrent;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JMenuItem mnuafter;
    private javax.swing.JMenuItem mnubefore;
    private javax.swing.JMenuItem mnuclear;
    private javax.swing.JMenuItem mnuexit;
    private javax.swing.JMenuItem mnuremove;
    private javax.swing.JMenuItem mnureplace;
    private javax.swing.JMenuItem mnurestore;
    private javax.swing.JMenuItem mnushow;
    private javax.swing.JTextArea txtdesc;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
