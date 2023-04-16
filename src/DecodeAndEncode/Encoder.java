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
public class Encoder {
    
  public static String  staffDesignationEncode(String staffDesignation){
      
    switch (staffDesignation){
        
            case "NURSE"                               :return "NU";
            case "MADE"                                :return "MD";
            case "RECEPTIONIST"                        :return "RP";
            case "ANESTHESIOLOGISTS DOCTOR"            :return"ANA";
            case "CARDIOLOGISTS DOCTOR"                :return"CARDIOL";
            case "INFECTION DISEASE SPECIALISTS DOCTOR":return"IDS";
            case "NEUROLOGISTS DOCTOR"                 :return"NL";
            case "GYNECOLOGISTS DOCTOR"                :return"GC";
            case "PHYSIATRISTS DOCTOR"                 :return"PM&R";
            case "PSYCHIATRISTS DOCTOR"                :return"PSYCH";
            case "RADIOLOGISTS DOCTOR"                 :return"RL";
            case "EAR NOSE THROAT DOCTOR"              :return"ENT";
            case "SURGEONS DOCTOR"                     :return"SG";
            case "PHYSICIAN DOCTOR"                    :return"PS";
            case "CHEST SPECIALIST DOCTOR"             :return"CS"; 
           
          
                    
    }
    return staffDesignation;
}    // end accountTypeEncode
   
public static String  shiftEncode(String shift){
    
    switch (shift){
        
            case "MORNING" :return "M";
            case "EVENING" :return "E";
            
    }
    return shift;

}// end transactionsType
public static String  sexEncode(String sex){
    
    switch (sex){
        
            case "MALE"   :return "M";
            case "FEMALE" :return "F";
            
    }
    return sex;
}
public static String  wardTypeEncode(String wardType){
    
    switch (wardType){
        
            case "PRIVATE"      :return "P";
            case "SEMI PRIVATE" :return "SP";
            case "GENERAL WARD" :return "GW";          
    }
    return wardType;

}
//public static String  amountTypeEncode(String amountType){
//    
//    switch (amountType){
//        
//            case "CHECK":return "CK";
//            case "ONLINE":return "OL";
//            case "DEMAND DRAFT":return "DD";
//            case "PAY ORDER":return "PO";
//    }
//    return amountType;
//}    // end amountTypeEncode
    

//    public static Encoder TransactionsTypeEncode(Encoder transTpye) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
}
