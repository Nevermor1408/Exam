package lesson10_11;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Sorting extends javax.swing.JFrame {
DefaultListModel model;
   int nums[]=new int[50000];
    public Sorting() {
        
        initComponents();
       
       model = new DefaultListModel();
       
       lstnum.setModel(model);
       
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstnum = new javax.swing.JList();
        btngen = new javax.swing.JButton();
        btnbubble = new javax.swing.JButton();
        btnselection = new javax.swing.JButton();
        btninsert = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnquit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(lstnum);

        btngen.setText("Generate Numbers");
        btngen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenActionPerformed(evt);
            }
        });

        btnbubble.setText("Bubble");
        btnbubble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbubbleActionPerformed(evt);
            }
        });

        btnselection.setText("Selection");
        btnselection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselectionActionPerformed(evt);
            }
        });

        btninsert.setText("Insertion");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });

        jLabel1.setText("String Methods");

        btnquit.setText("Quit");
        btnquit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btngen))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnselection)
                    .addComponent(btnbubble)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnquit)
                        .addComponent(btninsert)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btngen))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(58, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnbubble)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnselection)
                        .addGap(65, 65, 65)
                        .addComponent(btninsert)
                        .addGap(18, 18, 18)
                        .addComponent(btnquit)
                        .addGap(31, 31, 31))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenActionPerformed
    model.clear();
        for(int x=0;x<nums.length;x++){
            nums[x]=(int)(Math.random()*100000)+1;
            model.addElement(nums[x]);
        }
           // TODO add your handling code here:
    }//GEN-LAST:event_btngenActionPerformed

    private void btnbubbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbubbleActionPerformed
        model.clear();
        double stime=System.currentTimeMillis();
        bubbleSort(nums);
        double etime=System.currentTimeMillis()-stime;
        JOptionPane.showMessageDialog(this, "Time it took:" + etime+ " In miliseconds");
        for(int x=0;x<nums.length;x++){
             model.addElement(nums[x]);
        }
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbubbleActionPerformed

    private void btnselectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselectionActionPerformed
        model.clear();
        double stime=System.currentTimeMillis();
        selectionSort(nums);
        double etime=System.currentTimeMillis()-stime;
        JOptionPane.showMessageDialog(this, "Time it took: " + etime + " In miliseconds");
        
        for(int x=0;x<nums.length;x++){
             model.addElement(nums[x]);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnselectionActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
    model.clear();
        
        double stime=System.currentTimeMillis();
        insertionSort(nums);
        double etime=System.currentTimeMillis()-stime;
        JOptionPane.showMessageDialog(this, "Time it took:" + etime+ " In miliseconds");
        for(int x=0;x<nums.length;x++){
             model.addElement(nums[x]);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btninsertActionPerformed

    private void btnquitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquitActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnquitActionPerformed
public static void insertionSort(int a[]){
	int itemToInsert, j;
	boolean stillLooking;

	//on the kth pass, pass item k upwards in list
	//and insert it in its proper place amoung the
	//first k entries in an array

	for (int k=1; k<a.length; k++){
	//move backwards through list, looking for
	//the right place to insert a[k];
		itemToInsert = a[k];
		j=k-1;
		stillLooking=true;
		while(j >=0 && stillLooking){
			if (itemToInsert < a[j]){
				//move item higher
				a[j+1] = a[j];
				j--;
			}else{
				//we have found new home for a[k];
				stillLooking=false;
			}//end else// j+1 is where the item goes
			a[j+1]=itemToInsert;
		}//end while
  	}//end for
}//end method

    public static void bubbleSort(int[] a){
   	int k = 0;
   	boolean exchangeMade = true;
	// Make up to n - 1 passes through array, exit 
	//early if no exchanges are made on previous pass
  
 	while ((k < a.length - 1) && exchangeMade){
      		exchangeMade = false;
      		k++;
      		for (int j = 0; j < a.length - k; j++)  
         		if (a[j] > a[j + 1]){
            			swap(a, j, j + 1);		 
            			exchangeMade = true;
         		}//end if
		}//end for
	}//end while


//supporting swap method

public static void swap(int[] a, int x, int y){
   int temp = a[x];
   a[x] = a[y];
   a[y] = temp;
}
   public static void selectionSort(int[] a){
   for (int i = 0; i < a.length - 1; i++){
      int minIndex = findMinimum(a, i);
      if (minIndex != i)
	//if lowest is not already in place
         swap(a, i, minIndex);
   } //end for
}  

//supporting findMinimum method

public static int findMinimum(int[] a, int first){
   //first=where to start looking from
   //assume first is also the smallest for now
   int minIndex = first; 
   for (int i = first + 1; i < a.length; i++)
      if (a[i] < a[minIndex])
         minIndex = i;
   return minIndex;
}

//supporting swap method (same as bubble sort swap)



    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sorting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbubble;
    private javax.swing.JButton btngen;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnquit;
    private javax.swing.JButton btnselection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstnum;
    // End of variables declaration//GEN-END:variables
}
