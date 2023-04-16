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
public class patientHistoryBean {
    private int patientId,patientHistoryId,staffId;
    private String symptoms,diagnosis,medicine,wardRequired,typeOfWard,remarks;
    private java.util.Date nextCheckUpDate,dateOfVisit;

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getPatientHistoryId() {
        return patientHistoryId;
    }

    public void setPatientHistoryId(int patientHistoryId) {
        this.patientHistoryId = patientHistoryId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getWardRequired() {
        return wardRequired;
    }

    public void setWardRequired(String wardRequired) {
        this.wardRequired = wardRequired;
    }

    public String getTypeOfWard() {
        return typeOfWard;
    }

    public void setTypeOfWard(String typeOfWard) {
        this.typeOfWard = typeOfWard;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getNextCheckUpDate() {
        return nextCheckUpDate;
    }

    public void setNextCheckUpDate(Date nextCheckUpDate) {
        this.nextCheckUpDate = nextCheckUpDate;
    }

    public Date getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(Date dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }
       public String toString(){
        return ""+nextCheckUpDate;
    }
} 
