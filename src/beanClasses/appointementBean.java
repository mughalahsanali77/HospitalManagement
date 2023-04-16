/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanClasses;

import java.util.Date;

/**
 *
 * @author Ammar
 */
public class appointementBean {
    private int appointmentId,patientId,staffId,appointementCharges;
    private String appointementTime ,remarks;
    private java.util.Date dateOfAppointement;
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public int getAppointementCharges() {
        return appointementCharges;
    }

    public void setAppointementCharges(int appointementCharges) {
        this.appointementCharges = appointementCharges;
    }

    public String getAppointementTime() {
        return appointementTime;
    }

    public void setAppointementTime(String appointementTime) {
        this.appointementTime = appointementTime;
    }

    public Date getDateOfAppointement() {
        return dateOfAppointement;
    }

    public void setDateOfAppointement(Date dateOfAppointement) {
        this.dateOfAppointement = dateOfAppointement;
    }
    @Override
    public String toString(){
        return ""+appointementTime+" ,  "+appointementCharges+"";
    }
}
