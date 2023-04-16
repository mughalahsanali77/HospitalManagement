/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecodeAndEncode;

/**
 *
 * @author Ntech
 */
public class Decoder {
    
    public static String staffDesignationDecode(String staffDesignation){
        switch (staffDesignation){
            case "NU"          :return "NURSE";
            case "MD"          :return "MADE";
            case "RP"          :return "RECEPTIONIST";
            case "ANA"         :return "ANESTHESIOLOGISTS DOCTOR";
            case "CARDIOL"     :return "CARDIOLOGISTS DOCTOR";
            case "IDS"         :return "INFECTION DISEASE SPECIALISTS DOCTOR";
            case "NL"          :return "NEUROLOGISTS DOCTOR";
            case "GC"          :return "GYNECOLOGISTS DOCTOR";
            case "PM&R"        :return "PHYSIATRISTS DOCTOR";
            case "PSYCH"       :return "PSYCHIATRISTS DOCTOR";
            case "RL"          :return "RADIOLOGISTS DOCTOR";
            case "ENT"         :return "EAR NOSE THROAT DOCTOR";
            case "SG"          :return "SURGEONS DOCTOR";
            case "PS"          :return "PHYSICIAN DOCTOR";
            case "CS"          :return "CHEST SPECIALIST DOCTOR";
            }
       
  
    return staffDesignation;   
}// end AccountTypeDecode
    
 public static String shiftDecode(String shift){
        switch (shift){
            case "M":return "MORNING";
            case "E":return "EVENING";
            }
    return shift;   
 } // end transactionsType
 

 public static String sexDecode(String sex){
        switch (sex){
            case "M":return "MALE";
            case "F":return "FEMALE";
            }
    return sex;   
 }
 public static String wardTypeDecode(String wardType){
        switch (wardType){
            case "P" :return "PRIVATE";
            case "SP":return "SEMI PEIVATE";
            case "GW":return "GENERAL WARD";

            }
    return wardType;   
 } 
//    public static String amountTypeDecode(String amountType){
//        switch (amountType){
//            case "CK":return "CHECK";
//            case "OL":return "ONLINE";
//            case "DD":return "DEMAND DRAFT";
//            case "PO":return "PAY ORDER";
//            }
//    return amountType;   
}// end transactionsType

