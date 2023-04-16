/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanClasses;

/**
 *
 * @author Ammar
 */
public class wardBean {
    private int wardId,patientId,staffId,billId,patientDate;
    private String wardType,chargesPerDay,foodCharges,remarks;
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
   

    public int getWardId() {
        return wardId;
    }

    public void setWardId(int wardId) {
        this.wardId = wardId;
    }
   
    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getPatientDate() {
        return patientDate;
    }

    public void setPatientDate(int patientDate) {
        this.patientDate = patientDate;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getWardType() {
        return wardType;
    }

    public void setWardType(String wardType) {
        this.wardType = wardType;
    }

    public String getChargesPerDay() {
        return chargesPerDay;
    }

    public void setChargesPerDay(String chargesPerDay) {
        this.chargesPerDay = chargesPerDay;
    }

    public String getFoodCharges() {
        return foodCharges;
    }

    public void setFoodCharges(String foodCharges) {
        this.foodCharges = foodCharges;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
 
     public String toString(){
        return ""+wardType;
     }
}
