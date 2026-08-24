/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignmentprog;

/**
 *
 * @author Student
 */
public class Patient {
    
    //variables 
    private String patientID;
    private String name;
    private String surname;
    private int age;
    private String gender;
    private String medicalCondition;
    String patientCategory;
    
    public Patient(String patientID,String name,String surname,int age,String gender,String medicalCondition,String patientCategory){
        this.patientID=patientID;
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.gender=gender;
        this.medicalCondition=medicalCondition;
        this.patientCategory=patientCategory;
        
    }
    
    //setters
    public void setPatientID(String patientID){
        this.patientID=patientID;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public void setMedicalCondition(String medicalCondition){
        this.medicalCondition=medicalCondition;
    }
    public void setPatientCategory(String patientCategory){
        this.patientCategory=patientCategory;
    }
    
    //getters
    public String getPatientID(){
        return patientID;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public String getMedicalCondition(){
        return medicalCondition;
    }
    public String getPatientCategory(){
        return patientCategory;
    }
    
     //polymorphism
    public void displayDetails(){
           System.out.println("===Patient Details===");
           System.out.println("Patient ID: "+ patientID);
           System.out.println("Surname: "+ surname);
           System.out.println("Age: "+ age);
           System.out.println("Gender: "+ gender);
           System.out.println("Medical Condition: "+ medicalCondition);
           System.out.println("Patient Category: "+ patientCategory);
           
    }
}
