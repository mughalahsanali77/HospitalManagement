/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import DatabaseManager.databaseManager;
import DecodeAndEncode.Decoder;
import DecodeAndEncode.Encoder;
import beanClasses.patientBean;
import beanClasses.staffBean;
import java.awt.event.ActionEvent;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Ammar
 */
public class Staff extends javax.swing.JFrame {

    /**
     * Creates new form Staff
     */
    public Staff() {
        initComponents();
        getStaff();
        staffDCB.addItem("NURSE");
        staffDCB.addItem("MADE");
        staffDCB.addItem("RECEPTIONIST");
        staffDCB.addItem("ANESTHESIOLOGISTS DOCTOR");
        staffDCB.addItem("CARDIOLOGISTS DOCTOR");
        staffDCB.addItem("INFECTION DISEASE SPECIALISTS DOCTOR");
        staffDCB.addItem("NEUROLOGISTS DOCTOR");
        staffDCB.addItem("GYNECOLOGISTS DOCTOR");
        staffDCB.addItem("PHYSIATRISTS DOCTOR");
        staffDCB.addItem("PSYCHIATRISTS DOCTOR");
        staffDCB.addItem("RADIOLOGISTS DOCTOR");
        staffDCB.addItem("EAR NOSE THROAT DOCTOR");
        staffDCB.addItem("SURGEONS DOCTOR");
        staffDCB.addItem("PHYSICIAN DOCTOR");
        staffDCB.addItem("CHEST SPECIALIST DOCTOR");
        
        shiftCB.addItem("MORNING");
        shiftCB.addItem("EVENING");
        
        sexCB.addItem("MALE");
        sexCB.addItem("FEMALE");
        
        sITF.setEditable(false);
         
//        
//        doctorDCB.setVisible(false);
//        doctorDLA.setVisible(false);
        
    }
    private void getStaff(){
    try{
        Vector v=databaseManager.getStaff();
        staffDL.setListData(v);
    }catch(Exception e){
        e.printStackTrace ();
      JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
    }
    }//end Customer  
      public void actionPerformed(ActionEvent e){
        if(e.getSource()==addButton)
            addRecord();
        if(e.getSource()==backButton){
         hide();
         } 
        if(e.getSource()==clearButton)
            clear();
    }
    private void clear(){
        sITF.setText("");
        staffNTF.setText("");
        ageTF.setText("");
        addressTF.setText("");
        bGTF.setText("");
        dHTF.setText("");
        remarksTF.setText("");
        
    }// end clear
 private void addRecord(){
            String  staffName        = staffNTF.getText();
            String  staffDesignation =Encoder.staffDesignationEncode((String)staffDCB.getSelectedItem());
            int     age              = Integer.parseInt(ageTF.getText());
            String  sex              = Encoder.sexEncode((String)sexCB.getSelectedItem());
            String  address          = addressTF.getText();
            String  bloodGroup       = bGTF.getText();
            String  shift            = Encoder.shiftEncode((String)shiftCB.getSelectedItem());
            String  dateOfHire       = dHTF.getText();
            String  remarks          =remarksTF.getText();
            try{
                int rows=databaseManager.addStaff(staffName,staffDesignation,age,sex,address,bloodGroup,shift,dateOfHire,remarks);
                if(rows>=1)
                    JOptionPane.showMessageDialog(this, rows+"RECORD INSERTED ");
                clear();
                getStaff();
            }catch(Exception e){
                   JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
                   e.printStackTrace();
            }
    }//end addRecord
    private void updateRecord(){
         staffBean bean=(staffBean)staffDL.getSelectedValue();
         if(bean==null)return ;
            String  staffName        = staffNTF.getText();
            String  staffDesignation = Encoder.staffDesignationEncode((String)staffDCB.getSelectedItem());
            int     age              = Integer.parseInt(ageTF.getText());
            String  sex              = Encoder.sexEncode((String)sexCB.getSelectedItem());
            String  address          = addressTF.getText();
            String  bloodGroup       = bGTF.getText();
            String  shift            = Encoder.shiftEncode((String)shiftCB.getSelectedItem());
            String  dateOfHire       = dHTF.getText();
            String  remarks          =remarksTF.getText();
         try{
          int rows=databaseManager.updateStaff(bean.getStaffId(),staffName,staffDesignation,age,sex,address,bloodGroup,shift,dateOfHire,remarks);
            
                if(rows>=1)
                    JOptionPane.showMessageDialog(this, rows+"RECORD UPDATED ");
                clear();
                getStaff();
            }catch(Exception e){
                   JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
                   e.printStackTrace();
            }
         }//end updateRecord
    private void deleteRecord(){
    staffBean bean = (staffBean)staffDL.getSelectedValue();
    if(bean==null)return;
    try{
        int rows = databaseManager.deleteStaff(bean.getStaffId());
          if(rows>=1)
                    JOptionPane.showMessageDialog(this, rows+" RECORD DELETED ");
                clear();
                getStaff();
            }catch(Exception e){
                   JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
                   e.printStackTrace();
            }
         } //end deleteRecord
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        remarksTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        staffDL = new javax.swing.JList();
        sITF = new javax.swing.JTextField();
        staffNTF = new javax.swing.JTextField();
        ageTF = new javax.swing.JTextField();
        addressTF = new javax.swing.JTextField();
        bGTF = new javax.swing.JTextField();
        dHTF = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        shiftCB = new javax.swing.JComboBox();
        staffDCB = new javax.swing.JComboBox();
        sexCB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("REMARKS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 570, 70, 17);

        remarksTF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(remarksTF);
        remarksTF.setBounds(200, 570, 490, 80);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("STAFF DESIGNATION");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(500, 60, 160, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText(" AGE");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(330, 80, 50, 60);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText(" SEX");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(150, 290, 50, 60);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("  ADDRESS");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(110, 360, 90, 60);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("  BLOOD GROUP");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(70, 430, 130, 60);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("SHIFT");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(310, 290, 60, 60);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("         DATE OF  HIRE");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 500, 160, 60);

        staffDL.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        staffDL.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                staffDLValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(staffDL);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(500, 80, 190, 480);

        sITF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(sITF);
        sITF.setBounds(200, 80, 120, 60);

        staffNTF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(staffNTF);
        staffNTF.setBounds(200, 150, 290, 60);

        ageTF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(ageTF);
        ageTF.setBounds(380, 80, 110, 60);

        addressTF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(addressTF);
        addressTF.setBounds(200, 360, 290, 60);

        bGTF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(bGTF);
        bGTF.setBounds(200, 430, 290, 60);

        dHTF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(dHTF);
        dHTF.setBounds(200, 500, 130, 60);

        addButton.setBackground(new java.awt.Color(255, 51, 255));
        addButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton);
        addButton.setBounds(200, 660, 80, 40);

        updateButton.setBackground(new java.awt.Color(255, 51, 255));
        updateButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton);
        updateButton.setBounds(290, 660, 87, 40);

        deleteButton.setBackground(new java.awt.Color(255, 51, 255));
        deleteButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton);
        deleteButton.setBounds(390, 660, 85, 40);

        clearButton.setBackground(new java.awt.Color(255, 51, 255));
        clearButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("CLEAR");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(clearButton);
        clearButton.setBounds(490, 660, 79, 40);

        backButton.setBackground(new java.awt.Color(255, 0, 0));
        backButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(580, 660, 110, 40);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("   STAFF NAME");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(80, 150, 120, 60);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel3.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        jLabel3.setText("STAFF");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(200, 0, 290, 70);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("          STAFF ID");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(80, 80, 110, 60);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("  STAFF DESIGNATION");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(30, 220, 170, 60);

        shiftCB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        shiftCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftCBActionPerformed(evt);
            }
        });
        getContentPane().add(shiftCB);
        shiftCB.setBounds(360, 290, 130, 60);

        staffDCB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        staffDCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffDCBActionPerformed(evt);
            }
        });
        getContentPane().add(staffDCB);
        staffDCB.setBounds(200, 220, 290, 60);

        sexCB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(sexCB);
        sexCB.setBounds(200, 290, 110, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        addRecord();
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        updateRecord();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        deleteRecord();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        hide();
    }//GEN-LAST:event_backButtonActionPerformed

    private void shiftCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftCBActionPerformed
//     staffBean bean=(staffBean)staffDCB.getSelectedItem();
//        if(bean==null)return;
//       
//            
//        
//           
//            doctorDLA.setVisible(true);
//            doctorDCB.setVisible(true);
//        
//            doctorDLA.setVisible(false);
//            doctorDCB.setVisible(false);

        
    }//GEN-LAST:event_shiftCBActionPerformed

    private void staffDLValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_staffDLValueChanged
        staffBean bean=(staffBean)staffDL.getSelectedValue();
       if(bean==null)return;
        staffDCB.setSelectedItem(Decoder.staffDesignationDecode(bean.getStaffDesignation()));
        shiftCB.setSelectedItem(Decoder.shiftDecode(bean.getShift()));
        sexCB.setSelectedItem(Decoder.sexDecode(bean.getSex()));
      
       sITF.setText(""+bean.getStaffId());
       staffNTF.setText(bean.getStaffName());
       ageTF.setText(""+bean.getAge());
      
       addressTF.setText(""+bean.getAddress());
       bGTF.setText(bean.getBloodGroup());
      
       dHTF.setText(""+bean.getDateOfHire());
       remarksTF.setText(bean.getRemarks());
        
    }//GEN-LAST:event_staffDLValueChanged

    private void staffDCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffDCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffDCBActionPerformed

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
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField addressTF;
    private javax.swing.JTextField ageTF;
    private javax.swing.JTextField bGTF;
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField dHTF;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField remarksTF;
    private javax.swing.JTextField sITF;
    private javax.swing.JComboBox<String> sexCB;
    private javax.swing.JComboBox shiftCB;
    private javax.swing.JComboBox staffDCB;
    private javax.swing.JList staffDL;
    private javax.swing.JTextField staffNTF;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
