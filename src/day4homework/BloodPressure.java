/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4homework;
/**
 *
 * @author Amilo
 */

public class BloodPressure {
    String patient[] = new String[8];
    String diagnose="";
    
    public static void Main (String[] args){
       
    }

    public BloodPressure(
            String name,
            String age,
            String up,
            String down,
            String weight//,
    )
    {
        patient[0]=name;
        patient[1]=age;
        patient[2]=up;
        patient[3]=down;
        patient[4]=weight;
        diagnose=diagnose+"Name: "+patient[0]+", Age: "+patient[1];
    
        double bpAge=Double.parseDouble(patient[1]);
        double bpUp=Double.parseDouble(patient[2]);
        double bpDown=Double.parseDouble(patient[3]);
        double bpWeight=Double.parseDouble(patient[4]);
        double systolic=109+(0.5*bpAge)+(0.1*bpWeight); 
        double diastolic=63+(0.1*bpAge)+(0.15*bpWeight);
                
    if (bpUp<systolic && bpDown>diastolic){
    diagnose=diagnose+", SN, DN ("+systolic+"/"+diastolic+")";
    } else if (bpUp>systolic && bpDown>diastolic) {
    diagnose=diagnose+", SH, DN ("+systolic+"/"+diastolic+")";
    } else if (bpUp>systolic && bpDown<diastolic) {
    diagnose=diagnose+", SH, DL ("+systolic+"/"+diastolic+")";
    } else {
    diagnose=diagnose+", SN, DL ("+systolic+"/"+diastolic+")";
    }
    }
}

