/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseManager;

import beanClasses.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
//import java.util.beanClasses.*;
/**
 *
 * @author Ammar
 */
public class databaseManager {
   private static Connection con;
    
    static{
        
        try{
            
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            System.out.println("Successfully connection with Database 1");
            String file="E:\\NetBeansProjects\\HospitalManagement\\HospitalManagement.accdb";
            con=DriverManager.getConnection("jdbc:ucanaccess://"+file);
            System.out.println("Successfully connection with Database 2");
            
        }catch(Exception e){JOptionPane.showMessageDialog(null," Error: "+e.getMessage()); e.printStackTrace();}
    }
public static Vector  getPatient() throws Exception{
String  query = "select * from patient";
System.out.println(query);
Statement st = null;
ResultSet result=null;

try{
st=con.createStatement();
result=st.executeQuery(query);
Vector v= new Vector();

while(result.next()){
    patientBean bean = new patientBean();
    bean.setPatientId(result.getInt("patient_id"));
    bean.setPatientName(result.getString("patient_name"));
    bean.setAge(result.getInt("age"));
    bean.setSex(result.getString("sex"));
    bean.setCnic(result.getInt("cnic"));
    bean.setContact(result.getInt("contact"));
    bean.setAddress(result.getString("address"));
    bean.setBloodGroup(result.getString("blood_group"));
    bean.setDateOfRelease(result.getDate("date_of_release"));
    bean.setAdmitDate(result.getDate("admit_date"));
    bean.setReleaseReason(result.getString("release_reason"));
    bean.setRemarks(result.getString("remarks"));
    v.addElement(bean);
}
return v;
    
        }finally{
    if (result!=null)
        result.close();
    if(st!=null)
        st.close();
    }
 }
public static Vector  getStaff() throws Exception{
String  query = "select * from staff";
System.out.println(query);
Statement st = null;
ResultSet result=null;

try{
st=con.createStatement();
result=st.executeQuery(query);
Vector v= new Vector();

while(result.next()){
    staffBean bean = new staffBean();
    bean.setStaffId(result.getInt("staff_id"));
    bean.setStaffName(result.getString("staff_name"));
    bean.setStaffDesignation(result.getString("staff_designation"));
    bean.setAge(result.getInt("age"));
    bean.setSex(result.getString("sex"));
    bean.setAddress(result.getString("address"));
    bean.setBloodGroup(result.getString("blood_group"));
    bean.setShift(result.getString("shift"));
    bean.setDateOfHire(result.getDate("date_of_hire"));
    bean.setRemarks(result.getString("remarks"));
    v.addElement(bean);
}
return v;
        
        }finally{
    if (result!=null)
        result.close();
    if(st!=null)
        st.close();
    }

 }
// public static Vector getPatientHistory1(int staffId)throws Exception{
//        String query= "select * from  patienthistory where staff_id="+staffId;
//        //String query= "select patient_id,staff_id from  patienthistory where patient_id = "+patientId+" AND staff_id.staff_id = "+staffId  ;
//       //String query=  "select * from patient , staff where patient_id = "+patientId+" AND staff_id.staff_id = "+staffId  ;
//        System.out.println(query);
//        Statement st = null;
//        ResultSet result = null ;
//        ResultSet result1 = null ;
//        try{
//            st=con.createStatement();
//            result=st.executeQuery(query);
//        Vector v = new Vector();
//         //Vector v1 = new Vector();
//        while(result.next()  ){
//            patientHistoryBean bean = new patientHistoryBean();
//            bean.setPatientHistoryId(result.getInt("patient_history_id"));
//            bean.setPatientId(result.getInt("patient_id"));
//            bean.setStaffId(result.getInt("staff_id"));
//            bean.setSymptoms(result.getString("symptoms"));
//            bean.setDiagnosis(result.getString("diagnosis"));
//            bean.setMedicine(result.getString("medicine"));
//            bean.setWardRequired(result.getString("ward_required"));
//            bean.setTypeOfWard(result.getString("type_of_ward"));
//            bean.setNextCheckUpDate(result.getDate("next_check_up_date"));
//            bean.setDateOfVisit(result.getDate("date_of_visit"));
//            bean.setRemarks(result.getString("remarks"));
//            v.addElement(bean);
//        }
//        return v ;
//        }finally{
//            if(result!=null)
//                result.close();
//            if(st!=null)
//                st.close();
//        }
//    }
//  public static Vector getPatientHistory(int patientId)throws Exception{
//        String query= "select * from  patienthistory where patient_id="+patientId;
////        //String query= "select patient_id,staff_id from  patienthistory where patient_id = "+patientId+" AND staff_id.staff_id = "+staffId  ;
////       //String query=  "select * from patient , staff where patient_id = "+patientId+" AND staff_id.staff_id = "+staffId  ;
//        System.out.println(query);
//        Statement st = null;
//        ResultSet result = null ;
//        ResultSet result1 = null ;
//        try{
//            st=con.createStatement();
//            result=st.executeQuery(query);
//        Vector v = new Vector();
//         //Vector v1 = new Vector();
//        while(result.next()  ){
//            patientHistoryBean bean = new patientHistoryBean();
//            bean.setPatientHistoryId(result.getInt("patient_history_id"));
//            bean.setPatientId(result.getInt("patient_id"));
//            bean.setStaffId(result.getInt("staff_id"));
//            bean.setSymptoms(result.getString("symptoms"));
//            bean.setDiagnosis(result.getString("diagnosis"));
//            bean.setMedicine(result.getString("medicine"));
//            bean.setWardRequired(result.getString("ward_required"));
//            bean.setTypeOfWard(result.getString("type_of_ward"));
//            bean.setNextCheckUpDate(result.getDate("next_check_up_date"));
//            bean.setDateOfVisit(result.getDate("date_of_visit"));
//            bean.setRemarks(result.getString("remarks"));
//            v.addElement(bean);
//        }
//        return v ;
//        }finally{
//            if(result!=null)
//                result.close();
//            if(st!=null)
//                st.close();
//        }
//    }
 public static Vector getPatientHistory(int patientId)throws Exception{
       String query= "select * from  patienthistory   INNER JOIN patient ON patienthistory.patient_Id  =  patient.patient_id"+"  INNER JOIN staff ON patienthistory.staff_Id  =  staff.staff_id";
//        //String query= "select patient_id,staff_id from  patienthistory where patient_id = "+patientId+" AND staff_id.staff_id = "+staffId  ;
//       //String query=  "select * from patient , staff where patient_id = "+patientId+" AND staff_id.staff_id = "+staffId
           //String query="SELECT patient.patient_id, staff.staff_id" +"FROM patienthistory" +"FULL OUTER JOIN patienthistory ON patient.patient_id=staff.staff_id";
        System.out.println(query);
        Statement st = null;
        ResultSet result = null ;
        ResultSet result1 = null ;
        try{
            st=con.createStatement();
            result=st.executeQuery(query);
        Vector v = new Vector();
         //Vector v1 = new Vector();
        while(result.next()  ){
            patientHistoryBean bean = new patientHistoryBean();
            bean.setPatientHistoryId(result.getInt("patient_history_id"));
            bean.setPatientId(result.getInt("patient_id"));
            bean.setStaffId(result.getInt("staff_id"));
            bean.setSymptoms(result.getString("symptoms"));
            bean.setDiagnosis(result.getString("diagnosis"));
            bean.setMedicine(result.getString("medicine"));
            bean.setWardRequired(result.getString("ward_required"));
            bean.setTypeOfWard(result.getString("type_of_ward"));
            bean.setNextCheckUpDate(result.getDate("next_check_up_date"));
            bean.setDateOfVisit(result.getDate("date_of_visit"));
            bean.setRemarks(result.getString("remarks"));
            v.addElement(bean);
        }
        return v ;
        }finally{
            if(result!=null)
                result.close();
            if(st!=null)
                st.close();
        }
    }
 public static Vector getPatientHistory1(int staffId)throws Exception{
       String query= "select * from  patienthistory   INNER JOIN patient ON patienthistory.patient_Id  =  patient.patient_id"+"  INNER JOIN staff ON patienthistory.staff_Id  =  staff.staff_id";
//        //String query= "select patient_id,staff_id from  patienthistory where patient_id = "+patientId+" AND staff_id.staff_id = "+staffId  ;
//       //String query=  "select * from patient , staff where patient_id = "+patientId+" AND staff_id.staff_id = "+staffId  ;
        System.out.println(query);
        Statement st = null;
        ResultSet result = null ;
        ResultSet result1 = null ;
        try{
            st=con.createStatement();
            result=st.executeQuery(query);
        Vector v = new Vector();
         //Vector v1 = new Vector();
        while(result.next()  ){
            patientHistoryBean bean = new patientHistoryBean();
            bean.setPatientHistoryId(result.getInt("patient_history_id"));
            bean.setPatientId(result.getInt("patient_id"));
            bean.setStaffId(result.getInt("staff_id"));
            bean.setSymptoms(result.getString("symptoms"));
            bean.setDiagnosis(result.getString("diagnosis"));
            bean.setMedicine(result.getString("medicine"));
            bean.setWardRequired(result.getString("ward_required"));
            bean.setTypeOfWard(result.getString("type_of_ward"));
            bean.setNextCheckUpDate(result.getDate("next_check_up_date"));
            bean.setDateOfVisit(result.getDate("date_of_visit"));
            bean.setRemarks(result.getString("remarks"));
            v.addElement(bean);
        }
        return v ;
        }finally{
            if(result!=null)
                result.close();
            if(st!=null)
                st.close();
        }
    } 



 
public static Vector  getWard(int patientId) throws Exception{
String  query = "select * from ward where patient_id= "+patientId;
System.out.println(query);
Statement st = null;
ResultSet result=null;

try{
st=con.createStatement();
result=st.executeQuery(query);
Vector v= new Vector();

while(result.next()){
    wardBean bean = new wardBean();
    
    bean.setWardId(result.getInt("ward_id"));
    bean.setPatientId(result.getInt("patient_id"));
    bean.setStaffId(result.getInt("staff_id"));
    bean.setWardType(result.getString("ward_type"));
    bean.setChargesPerDay(result.getString("charges_per_day"));
    bean.setFoodCharges(result.getString("food_charges"));
    bean.setRemarks(result.getString("remarks"));
    v.addElement(bean);
}
return v;
        
        }finally{
    if (result!=null)
        result.close();
    if(st!=null)
        st.close();
    }

 }
public static Vector  getWard1(int staffId) throws Exception{
String  query = "select * from ward where staff_id= "+staffId;
System.out.println(query);
Statement st = null;
ResultSet result=null;

try{
st=con.createStatement();
result=st.executeQuery(query);
Vector v= new Vector();

while(result.next()){
    wardBean bean = new wardBean();
    
    bean.setWardId(result.getInt("ward_id"));
    bean.setPatientId(result.getInt("patient_id"));
    bean.setStaffId(result.getInt("staff_id"));
    bean.setWardType(result.getString("ward_type"));
    bean.setChargesPerDay(result.getString("charges_per_day"));
    bean.setFoodCharges(result.getString("food_charges"));
    bean.setRemarks(result.getString("remarks"));
    v.addElement(bean);
}
return v;
        
        }finally{
    if (result!=null)
        result.close();
    if(st!=null)
        st.close();
    }

 }
public static Vector  getAppointement(int patientId) throws Exception{
String  query = "select * from appointementcounter where patient_id= "+patientId;
System.out.println(query);
Statement st = null;
ResultSet result=null;

try{
st=con.createStatement();
result=st.executeQuery(query);
Vector v= new Vector();

while(result.next()){
    appointementBean bean = new appointementBean();
    
    bean.setAppointmentId(result.getInt("appointment_id"));
    bean.setPatientId(result.getInt("patient_id"));
    bean.setStaffId(result.getInt("staff_id"));
    bean.setDateOfAppointement(result.getDate("date_of_appointement"));
    bean.setAppointementCharges(result.getInt("appointement_charges"));
    bean.setAppointementTime(result.getString("appointement_time"));
    bean.setRemarks(result.getString("remarks"));
    v.addElement(bean);
}
return v;
        
        }finally{
    if (result!=null)
        result.close();
    if(st!=null)
        st.close();
    }

 }
public static Vector  getAppointement1(int staffId) throws Exception{
String  query = "select * from appointementcounter where staff_id= "+staffId;
System.out.println(query);
Statement st = null;
ResultSet result=null;

try{
st=con.createStatement();
result=st.executeQuery(query);
Vector v= new Vector();

while(result.next()){
    appointementBean bean = new appointementBean();
    
    bean.setAppointmentId(result.getInt("appointment_id"));
    bean.setPatientId(result.getInt("patient_id"));
    bean.setStaffId(result.getInt("staff_id"));
    bean.setDateOfAppointement(result.getDate("date_of_appointement"));
    bean.setAppointementCharges(result.getInt("appointement_charges"));
    bean.setAppointementTime(result.getString("appointement_time"));
    bean.setRemarks(result.getString("remarks"));
    v.addElement(bean);
}
return v;
        
        }finally{
    if (result!=null)
        result.close();
    if(st!=null)
        st.close();
    }

 }
public static Vector  getBill(int patientId) throws Exception{
String  query = "select * from bill where patient_id= "+patientId;
System.out.println(query);
Statement st = null;
ResultSet result=null;

try{
st=con.createStatement();
result=st.executeQuery(query);
Vector v= new Vector();

while(result.next()){
    billBean bean = new billBean();
    
    bean.setBillId(result.getInt("bill_id"));
    bean.setPatientId(result.getInt("patient_id"));
    bean.setAppointementId(result.getInt("appointement_id"));
    bean.setWardId(result.getInt("ward_id"));
    bean.setTotalBill(result.getInt("total_bill"));
    bean.setDateOfPayment(result.getDate("date_of_payment"));
    bean.setRemarks(result.getString("remarks"));
    v.addElement(bean);
}
return v;
        
        }finally{
    if (result!=null)
        result.close();
    if(st!=null)
        st.close();
    }

 }
public static int  deletePatient (int patientId) throws Exception{
    String query= "delete from patient where patient_id=" +patientId ;
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}

public static int  deleteStaff(int staffId) throws Exception{
    String query= "delete from staff where staff_id=" +staffId ;
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}

public static int  deletePatientHistory(int patientHistoryId) throws Exception{
    String query= "delete from patienthistory where patient_history_id = " + patientHistoryId;
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}
public static int  deleteWard (int wardId) throws Exception{
    String query= "delete from ward where ward_id=" +wardId ;
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}
public static int  deleteAppointement(int appointementId) throws Exception{
    String query= "delete from appointementcounter where appointement_id=" +appointementId ;
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}
public static int  deleteBill(int billId) throws Exception{
    String query= "delete from bill where bill_id=" +billId ;
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}
public static int  updatePatient (int patientId, String patientName,int age,String sex,int cnic ,int contact,String address,String bloodGroup,String dateOfRelease,String admitDate,String releaseReason,String remarks) throws Exception{
    String query= "update  patient set patient_name ='"+patientName+"',age ="+age+",sex ='"+sex+"',cnic ="+cnic+",contact ="+contact+",address ='"+address+"',blood_group ='"+bloodGroup+"',date_of_release ='"+dateOfRelease+"',admit_date ='"+admitDate+"',release_reason ='"+releaseReason+"',remarks ='"+remarks+"' where patient_id= " +patientId ;
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}

public static int  updateStaff (int staffId, String staffName,String staffDesignation,int age,String sex,String address,String bloodGroup ,String shift,String dateOfHire,String remarks) throws Exception{
    String query= "update  staff set staff_name ='"+staffName+"',staff_designation ='"+staffDesignation+"',age ="+age+",sex ='"+sex+"',address ='"+address+"',blood_group ='"+bloodGroup+"',shift ='"+shift+"',date_of_hire ='"+dateOfHire+"',remarks ='"+remarks+"' where staff_id= " +staffId ;
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}

public static int  updatePatientHistory (int patientHistoryId,int patientId,int staffId, String symptoms,String diagnosis,String medicine,String wardRequired ,String typeOfWard,String nextCheckUpDate,String dateOfVisit,String remarks) throws Exception{
    String query= "update  patienthistory set symptoms ='"+symptoms+"',diagnosis ='"+diagnosis+"',medicine ='"+medicine+"',ward_required ='"+wardRequired+"',type_of_ward ='"+typeOfWard+"',next_check_up_date ='"+nextCheckUpDate+"',date_of_visit ='"+dateOfVisit+"',remarks ='"+remarks+"' where patient_history_id= " +patientHistoryId ;
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}
public static int  updateWard(int wardId,int patientId,int staffId,String wardType,int chargesPerDay,int foodCharges,String remarks) throws Exception{
    String query= "update  ward set ward_type ='"+wardType+"', charges_per_day="+chargesPerDay+",  food_charges ="+foodCharges+",  remarks='"+remarks+"'where ward_id =" +wardId ;
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}
public static int  updateAppointement(int appointmentId,  int patientId,  int staffId,  String dateOfAppointement,  int appointementCharges, String appointementTime, String remarks) throws Exception{
    String query= "update  appointementcounter set date_of_appointement ='"+dateOfAppointement+"',  appointement_charges="+appointementCharges+",  appointement_time ='"+appointementTime+"', remarks='"+remarks+"' where appoitement_id =" +appointmentId ;
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}
public static int  updateBill(int billId,  int patientId,  int appointementId,int wardId,  int totalBill, Date dateOfPayment, String remarks) throws Exception{
    String query= "update  bill set total_bill ="+totalBill+",  date_of_payment="+dateOfPayment+",  remarks='"+remarks+"' where bill_id =" +billId ;
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}
public static int  addPatient(String patientName,int age,String sex,int cnic,int contact,String address,String bloodGroup,String dateOfRelease,String admitDate,String releaseReason,String remarks) throws Exception{
    String query= "insert into patient (patient_name,age,sex,cnic,contact,address,blood_group,date_of_release,admit_date,release_reason,remarks) values('"+patientName+"',"+age+",'"+sex+"',"+cnic+","+contact+",'"+address+"','"+bloodGroup+"','"+dateOfRelease+"','"+admitDate+"','"+releaseReason+"','"+remarks+"')"; 
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}

public static int  addStaff(String staffName,String staffDesignation,int age,String sex,String address,String bloodGroup,String shift,String dateOfHire,String remarks) throws Exception{
  
    String query= "insert into staff (staff_name,staff_designation,age,sex,address,blood_Group,shift,date_of_hire,remarks) values('"+staffName+"','"+staffDesignation+"',"+age+",'"+sex+"','"+address+"','"+bloodGroup+"','"+shift+"','"+dateOfHire+"','"+remarks+"')"; 
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}
public static int  addPatientHistory(int patientId,int staffId,String symptoms,String diagnosis,String medicine,String wardRequired,String typeOfWard,String nextCheckUpDate,String dateOfVisit,String remarks) throws Exception{
    String query= "insert into patienthistory (patient_id,staff_id,symptoms,diagnosis,medicine,ward_required,type_of_ward,next_check_up_date,date_of_visit,remarks) values("+patientId+","+staffId+",'"+symptoms+"','"+diagnosis+"','"+medicine+"','"+wardRequired+"','"+typeOfWard+"','"+nextCheckUpDate+"','"+dateOfVisit+"','"+remarks+"')"; 
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}
public static int  addWard(int patientId,int staffId,String wardType,int chargesPerDay,int foodCharges,String remarks) throws Exception{
    String query= "insert into ward (patient_id,staff_id,ward_type,charges_per_day,food_charges,remarks) values('"+patientId+"',"+staffId+",'"+wardType+"','"+chargesPerDay+"','"+foodCharges+"','"+remarks+"')"; 
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}
public static int  addAppointement(int patientId,int staffId,String dateOfAppointement,int appointementCharges,String appointementTime,String remarks) throws Exception{
    String query= "insert into appointementcounter (patient_id,staff_id,date_of_appointement,appointement_charges, appointement_time,remarks) values("+patientId+","+staffId+",'"+dateOfAppointement+"',"+appointementCharges+",'"+appointementTime+"','"+remarks+"')"; 
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}
public static int  addBill(int patientId,int staffId,int wardId,int totalBill,Date dateOfPayment,String remarks) throws Exception{
    String query= "insert into bill (patient_id,staff_id,ward_id,total_bill,date_of_payment,remarks) values('"+patientId+"',"+staffId+","+wardId+","+totalBill+",'"+dateOfPayment+"','"+remarks+"')"; 
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}

public static void main(String arg[]){
}

//    public static int addPatient(String patientName, int age, String sex, int cnic, int contact, String address, String bloodGroup, String dateOfRelease, String admitDate, String releaseReason, String remarks) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    public static int updatePatient(int patientId, String patientName, int age, String sex, int cnic, int contact, String address, String bloodGroup, String dateOfRelease, String admitDate, String releaseReason, String remarks) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    
}