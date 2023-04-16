/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import DatabaseManager.databaseManager;
import DecodeAndEncode.Decoder;
import DecodeAndEncode.Encoder;
import beanClasses.appointementBean;
import beanClasses.patientBean;
import beanClasses.staffBean;
import beanClasses.wardBean;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Ammar
 */
public class Appointement extends javax.swing.JFrame {

    /**
     * Creates new form Appointement
     */
    public Appointement() {
        initComponents();
        getPatient();
        getStaff();
    }
      public void getPatient(){

        try{
            Vector v=databaseManager.getPatient();
            
            for(int i=0; i<v.size(); i++){
             
                patientBean bean=(patientBean)v.elementAt(i);
                patientCB.addItem(bean);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this," Error: "+e.getMessage());
            e.printStackTrace();
        }
    }//
     
    public void getStaff(){

        try{
            Vector v=databaseManager.getStaff();
            
            for(int i=0; i<v.size(); i++){
             
                staffBean bean=(staffBean)v.elementAt(i);
                staffCB.addItem(bean);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this," Error: "+e.getMessage());
            e.printStackTrace();
        }
    }
//    private void getAppointement(){
//            patientBean bean = (patientBean)patientCB.getSelectedItem();
//            //staffBean bean1 = (staffBean)staffCB.getSelectedItem();
//           if(bean==null)return;
//           try{
//               Vector v = databaseManager.getAppointement(bean.getPatientId());
//               aCL.setListData(v);
//           }catch(Exception e){
//              e.printStackTrace();
//              JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
//           }
//           
//       }
//    private void getAppointement1(){
//            //patientBean bean = (patientBean)patientCB.getSelectedItem();
//            staffBean bean = (staffBean)staffCB.getSelectedItem();
//           if(bean==null)return;
//           try{
//               Vector v = databaseManager.getAppointement1(bean.getStaffId());
//               aCL.setListData(v);
//           }catch(Exception e){
//              e.printStackTrace();
//              JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
//           }
//           
//       }
     private void clear(){
        aITF.setText("");
        dATF.setText("");
        aCTF.setText("");
        aTTF.setText("");
        remarksTF.setText("");
        
    }// end clear
 private void addRecord(){
         patientBean bean=(patientBean)patientCB.getSelectedItem();
         staffBean bean1=(staffBean)staffCB.getSelectedItem();
       if(bean==null)return;  
            String  dateOfAppointement    =dATF.getText();
            int     appointementCharges   = Integer.parseInt(aCTF.getText());
            String     appointementTime   =aTTF.getText();
            String  remarks               = remarksTF.getText();
            try{
                int rows=databaseManager.addAppointement(bean.getPatientId(),bean1.getStaffId(),dateOfAppointement,appointementCharges,appointementTime,remarks);
                if(rows>=1)
                    JOptionPane.showMessageDialog(this, rows+"RECORD INSERTED ");
                clear();
//                getAppointement();
            }catch(Exception e){
                   JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
                   e.printStackTrace();
            }
    }//end addRecord
    private void updateRecord(){
         appointementBean bean=(appointementBean)aCL.getSelectedValue();
         patientBean bean1=(patientBean)patientCB.getSelectedItem();
         staffBean bean2=(staffBean)staffCB.getSelectedItem();
         if(bean==null)return ;
            String  dateOfAppointement    =dATF.getText();
            int     appointementCharges   = Integer.parseInt(aCTF.getText());
            String     appointementTime   =aTTF.getText();
            String  remarks               = remarksTF.getText();         try{
          int rows=databaseManager.updateAppointement(bean.getAppointmentId(),bean1.getPatientId(),bean2.getStaffId(),dateOfAppointement,appointementCharges,appointementTime,remarks);
            
                if(rows>=1)
                    JOptionPane.showMessageDialog(this, rows+"RECORD UPDATED ");
                clear();
//                getAppointement();
            }catch(Exception e){
                   JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
                   e.printStackTrace();
            }
         }
     private void deleteRecord(){
    appointementBean bean = (appointementBean)aCL.getSelectedValue();
    if(bean==null)return;
    try{
        int rows = databaseManager.deleteAppointement(bean.getAppointmentId());
          if(rows>=1)
                    JOptionPane.showMessageDialog(this, rows+" RECORD DELETED ");
//                getAppointement();
            }catch(Exception e){
                   JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
                   e.printStackTrace();
            }
         }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patientCB = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        staffCB = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        aITF = new javax.swing.JTextField();
        dATF = new javax.swing.JTextField();
        aCTF = new javax.swing.JTextField();
        aTTF = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        aCL = new javax.swing.JList();
        jLabel33 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        remarksTF = new javax.swing.JTextField();
        addButton1 = new javax.swing.JButton();
        updateButton1 = new javax.swing.JButton();
        deleteButton1 = new javax.swing.JButton();
        clearButton1 = new javax.swing.JButton();
        backButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        sNTF = new javax.swing.JTextField();
        sDTF = new javax.swing.JTextField();
        aTF = new javax.swing.JTextField();
        sex1TF = new javax.swing.JTextField();
        a1TF = new javax.swing.JTextField();
        bG1TF = new javax.swing.JTextField();
        s1TF = new javax.swing.JTextField();
        dHTF = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pITF = new javax.swing.JTextField();
        pNTF = new javax.swing.JTextField();
        sexTF = new javax.swing.JTextField();
        cnicTF = new javax.swing.JTextField();
        contactTF = new javax.swing.JTextField();
        addressTF = new javax.swing.JTextField();
        bGTF = new javax.swing.JTextField();
        dORTF = new javax.swing.JTextField();
        aDTF = new javax.swing.JTextField();
        rRTF = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        ageTF = new javax.swing.JTextField();
        sITF = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1600, 1600));
        setMinimumSize(new java.awt.Dimension(1600, 1600));
        getContentPane().setLayout(null);

        patientCB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        patientCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientCBActionPerformed(evt);
            }
        });
        getContentPane().add(patientCB);
        patientCB.setBounds(140, 90, 230, 40);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("           PATIENT ");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 90, 120, 40);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel3.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        jLabel3.setText("PATIENT ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 39, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(140, 10, 230, 50);

        staffCB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        staffCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffCBActionPerformed(evt);
            }
        });
        getContentPane().add(staffCB);
        staffCB.setBounds(520, 90, 230, 40);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setText("STAFF");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(470, 90, 60, 40);

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        jLabel24.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        jLabel24.setText("STAFF");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(64, 64, 64))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(520, 10, 230, 50);

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setText("DATE OF APPOINTEMENT");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(757, 140, 173, 40);

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setText("APPOINTEMENT CHARGES");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(750, 190, 190, 40);

        jLabel27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel27.setText("WARD TYPE");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(1180, 100, 110, 30);

        aITF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(aITF);
        aITF.setBounds(930, 90, 100, 40);

        dATF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(dATF);
        dATF.setBounds(930, 140, 240, 40);

        aCTF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(aCTF);
        aCTF.setBounds(930, 190, 240, 40);

        aTTF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(aTTF);
        aTTF.setBounds(930, 240, 240, 40);

        jLabel28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel28.setText("APPOINTEMENT ID");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(800, 90, 130, 40);

        aCL.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        aCL.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                aCLValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(aCL);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(1180, 130, 170, 290);

        jLabel33.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel33.setText("APPOINTEMENT TIME");
        getContentPane().add(jLabel33);
        jLabel33.setBounds(780, 240, 150, 40);

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));

        jLabel34.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        jLabel34.setText("APPOINTEMENT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(930, 10, 410, 50);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("REMARKS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(930, 280, 70, 20);

        remarksTF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(remarksTF);
        remarksTF.setBounds(930, 300, 240, 120);

        addButton1.setBackground(new java.awt.Color(255, 51, 255));
        addButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addButton1.setForeground(new java.awt.Color(255, 255, 255));
        addButton1.setText("ADD");
        addButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(addButton1);
        addButton1.setBounds(930, 430, 61, 40);

        updateButton1.setBackground(new java.awt.Color(255, 51, 255));
        updateButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        updateButton1.setForeground(new java.awt.Color(255, 255, 255));
        updateButton1.setText("UPDATE");
        updateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton1);
        updateButton1.setBounds(1000, 430, 87, 40);

        deleteButton1.setBackground(new java.awt.Color(255, 51, 255));
        deleteButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deleteButton1.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton1.setText("DELETE");
        deleteButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton1);
        deleteButton1.setBounds(1090, 430, 85, 40);

        clearButton1.setBackground(new java.awt.Color(255, 51, 255));
        clearButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clearButton1.setForeground(new java.awt.Color(255, 255, 255));
        clearButton1.setText("CLEAR");
        clearButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(clearButton1);
        clearButton1.setBounds(1180, 430, 79, 40);

        backButton1.setBackground(new java.awt.Color(255, 0, 0));
        backButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backButton1.setForeground(new java.awt.Color(255, 255, 255));
        backButton1.setText("BACK");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(backButton1);
        backButton1.setBounds(1270, 430, 80, 40);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("  STAFF DESIGNATION");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(360, 230, 170, 40);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setText(" AGE");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(480, 280, 50, 40);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setText(" SEX");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(480, 330, 50, 40);

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setText("  ADDRESS");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(440, 380, 90, 40);

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setText("  BLOOD GROUP");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(400, 430, 130, 40);

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setText("SHIFT");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(470, 480, 60, 40);

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setText("         DATE OF  HIRE");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(370, 530, 160, 40);

        sNTF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(sNTF);
        sNTF.setBounds(520, 180, 230, 40);

        sDTF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(sDTF);
        sDTF.setBounds(520, 230, 230, 40);

        aTF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(aTF);
        aTF.setBounds(520, 280, 230, 40);

        sex1TF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(sex1TF);
        sex1TF.setBounds(520, 330, 230, 40);

        a1TF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(a1TF);
        a1TF.setBounds(520, 380, 230, 40);

        bG1TF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(bG1TF);
        bG1TF.setBounds(520, 430, 230, 40);

        s1TF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(s1TF);
        s1TF.setBounds(520, 480, 230, 40);

        dHTF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(dHTF);
        dHTF.setBounds(520, 530, 230, 40);

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setText("   STAFF NAME");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(410, 180, 120, 40);

        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setText("       PATIENT ID");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(10, 150, 120, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("SEX");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 260, 50, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("CNIC");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 300, 50, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("CONTACT");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 340, 80, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("ADDRESS");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 380, 80, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("   BLOOD GROUP");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 420, 130, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("DATE OF RELEASE");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 460, 140, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("         ADMIT DATE");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 500, 130, 30);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("RELEASE REASON");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 540, 140, 30);

        pITF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(pITF);
        pITF.setBounds(140, 140, 230, 30);

        pNTF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(pNTF);
        pNTF.setBounds(140, 180, 230, 30);

        sexTF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(sexTF);
        sexTF.setBounds(140, 260, 230, 30);

        cnicTF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(cnicTF);
        cnicTF.setBounds(140, 300, 230, 30);

        contactTF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(contactTF);
        contactTF.setBounds(140, 340, 230, 30);

        addressTF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(addressTF);
        addressTF.setBounds(140, 380, 230, 30);

        bGTF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(bGTF);
        bGTF.setBounds(140, 420, 230, 30);

        dORTF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(dORTF);
        dORTF.setBounds(140, 460, 230, 30);

        aDTF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(aDTF);
        aDTF.setBounds(140, 500, 230, 30);

        rRTF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(rRTF);
        rRTF.setBounds(140, 540, 230, 30);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("PATIENT NAME");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(20, 180, 120, 30);

        jLabel35.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel35.setText("PATIENT NAME");
        getContentPane().add(jLabel35);
        jLabel35.setBounds(20, 180, 120, 30);

        jLabel36.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel36.setText("AGE");
        getContentPane().add(jLabel36);
        jLabel36.setBounds(90, 220, 50, 30);

        ageTF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(ageTF);
        ageTF.setBounds(140, 220, 230, 30);

        sITF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(sITF);
        sITF.setBounds(520, 140, 120, 30);

        jLabel37.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel37.setText("          STAFF ID");
        getContentPane().add(jLabel37);
        jLabel37.setBounds(410, 140, 110, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient+Staff", "Patient", "Staff" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(1180, 70, 160, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton1ActionPerformed
        // TODO add your handling code here:
        addRecord();
    }//GEN-LAST:event_addButton1ActionPerformed

    private void updateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButton1ActionPerformed
        updateRecord();
    }//GEN-LAST:event_updateButton1ActionPerformed

    private void deleteButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton1ActionPerformed
        deleteRecord();
    }//GEN-LAST:event_deleteButton1ActionPerformed

    private void clearButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButton1ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_clearButton1ActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        hide();
    }//GEN-LAST:event_backButton1ActionPerformed

    private void aCLValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_aCLValueChanged
        // TODO add your handling code here:
        appointementBean bean=(appointementBean)aCL.getSelectedValue();
    
       if(bean==null)return;
      
      
       aITF.setText(""+bean.getAppointmentId());
       dATF.setText(""+bean.getDateOfAppointement());
       aCTF.setText(""+bean.getAppointementCharges());
       aTTF.setText(""+bean.getAppointementTime());
       remarksTF.setText(bean.getRemarks());
    }//GEN-LAST:event_aCLValueChanged

    private void patientCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientCBActionPerformed
       patientBean bean=(patientBean)patientCB.getSelectedItem();
        
        if(bean==null)return;
        try{
       pITF.setText(""+bean.getPatientId());
       pNTF.setText(bean.getPatientName());
       ageTF.setText(""+bean.getAge());
       sexTF.setText(bean.getSex());
       cnicTF.setText(""+bean.getCnic());
       contactTF.setText(""+bean.getContact());
       addressTF.setText(""+bean.getAddress());
       bGTF.setText(bean.getBloodGroup());
       dORTF.setText(""+bean.getDateOfRelease());
       aDTF.setText(""+bean.getAdmitDate());
       rRTF.setText(""+bean.getReleaseReason());
       
        Vector v=databaseManager.getAppointement(bean.getPatientId());
        aCL.setListData(v);
       }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_patientCBActionPerformed

    private void staffCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffCBActionPerformed
        // TODO add your handling code here:
        staffBean bean=(staffBean)staffCB.getSelectedItem();
        
        if(bean==null)return;
       
        sITF.setText(""+bean.getStaffId());
        sNTF.setText(bean.getStaffName());
        sDTF.setText(""+bean.getStaffDesignation());
        aTF.setText(""+bean.getAge());
        sex1TF.setText(""+bean.getSex());
        a1TF.setText(""+bean.getAddress());
        bG1TF.setText(bean.getBloodGroup());
        s1TF.setText(""+bean.getStaffId());
        dHTF.setText(""+bean.getDateOfHire());
    }//GEN-LAST:event_staffCBActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
          appointementBean bean =(appointementBean)jComboBox1.getSelectedItem();
        
        if(bean ==null) return;
        try {
            Vector v=databaseManager.getAppointement(bean.getPatientId());
            aCL.setListData(v);
        } catch (Exception ex) {
           
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Appointement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appointement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appointement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a1TF;
    private javax.swing.JList aCL;
    private javax.swing.JTextField aCTF;
    private javax.swing.JTextField aDTF;
    private javax.swing.JTextField aITF;
    private javax.swing.JTextField aTF;
    private javax.swing.JTextField aTTF;
    private javax.swing.JButton addButton1;
    private javax.swing.JTextField addressTF;
    private javax.swing.JTextField ageTF;
    private javax.swing.JTextField bG1TF;
    private javax.swing.JTextField bGTF;
    private javax.swing.JButton backButton1;
    private javax.swing.JButton clearButton1;
    private javax.swing.JTextField cnicTF;
    private javax.swing.JTextField contactTF;
    private javax.swing.JTextField dATF;
    private javax.swing.JTextField dHTF;
    private javax.swing.JTextField dORTF;
    private javax.swing.JButton deleteButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pITF;
    private javax.swing.JTextField pNTF;
    private javax.swing.JComboBox patientCB;
    private javax.swing.JTextField rRTF;
    private javax.swing.JTextField remarksTF;
    private javax.swing.JTextField s1TF;
    private javax.swing.JTextField sDTF;
    private javax.swing.JTextField sITF;
    private javax.swing.JTextField sNTF;
    private javax.swing.JTextField sex1TF;
    private javax.swing.JTextField sexTF;
    private javax.swing.JComboBox staffCB;
    private javax.swing.JButton updateButton1;
    // End of variables declaration//GEN-END:variables
}
