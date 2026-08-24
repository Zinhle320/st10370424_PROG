/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignmentprog;

/**
 *
 * @author Student
 */
public class Inpatient extends Patient{
    private String wardNumber;
    private String bedNumber;
    private String Inpatient;
    
    public Inpatient(String patientID,String name,String surname,int age,String gender,String medicalCondition,String wardNumber,String bedNumber){
        super(patientID,name,surname,age,gender,medicalCondition,patientCategory);
        this.wardNumber=wardNumber;
        this.bedNumber=bedNumber;
    }
    
    //setters
    public void setWardNumber(String wardNumber){
        this.wardNumber=wardNumber;
    }
    public void setBedNumber(String bedNumber){
        this.bedNumber=bedNumber;
    }
    
    //getters
    public String getWardNumber(){
        return wardNumber;
    }
    public String getBedNumber(){
        return bedNumber;
    }
    
    //Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Ward Number: "+ wardNumber);
        System.out.println("Bed Number: "+ bedNumber);
    }
}
