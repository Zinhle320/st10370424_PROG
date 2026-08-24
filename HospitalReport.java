/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignmentprog;

/**
 *
 * @author Student
 */
import java.util.ArrayList;
import java.util.Scanner;

public class HospitalReport {
    private static ArrayList<Patient>
    patients = new ArrayList<>();
    String[][] beds = new String[4][5];
    Scanner input = new Scanner(System.in);
    
    public static void main(String[] args){
        initializeBeds();
        int choice;
        do{
            displayMenu();
            try{
                choice = scanner.nextInt();
            } catch
                    System.out.println("Invalid input,please enter a number.");
                    choice = -1;
                    continue;
        }
            switch(choice){
                case 1:registerPatient();
                break;
                case 2: searchPatient();
                break;
                case 3: updatePatient();
                break;
                case 4: deletePatient();
                break;
                case 5: displayAllPatients();
                break;
                case 6: allocatedBed();
                break;
                case 7: releaseBed();
                break;
                case 8: displayWardLayout();
                break;
                case 9: displayAvailableBeds();
                break;
                case 10: displayoccupiedBeds();
                break;
                case 11: generateReports();
                break;
                case 12:
                    System.out.println("Exiting....");
                default:
                    System.out.println("invalid choice.");
                        
            }
    }while(choice!=0);
        
        private static void initializeBeds(){
            int bedNumber = 1;
            for(int i=0; i<4;i++){
                for(int j=0; j<5;j++){
                    beds[i][j] = "B"+ bedNumber+ "Available";
                }
            }
        }
        private static Patient
                findPatientbyID(String ID){
                    for(patient p: patients){
                        if(p.getPatientID().equalsIgnoreCase(ID))
                            return p;
                    }
                    return null;
                }
                
        private static void registerPatient(){
            System.out.print("Enter Patients ID: ");
            String ID = input.nextLine();
            if(patientID(ID)!=null){
                System.out.println("Error,Patient Id already exists");
                return;
            }
            System.out.println("First Name: ");
            String name = input.nextLine();
            System.out.println("Surname: ");
            String Surname = input.nextLine();
            System.out.println("Age: ");
            int Age = input.nextInt();
            System.out.println("Gender: ");
            String Gender = input.nextLine();
            System.out.println("Medical Condition: ");
            String Medical Condition = input.nextLine();
            System.out.println("Category(INPATIENT/OUTPATIENT/EMERGENCY)");
          
        }
        private static void searchPatient(){
            System.out.println("Enter Patient ID: ");
            String ID =input.nextLine();
        }
        private static void updatePatient(){
            System.out.println("Enter Patient ID to update: ");
            String ID= input.nextLine();
            Patient p= findPatientByID(ID);
            if(p==null){
                System.out.println("Patient not found.");
                return;
            }
            System.out.println("Enter new first name: ");
            System.out.println("Enter new surname: ");
            System.out.println("Enter new age: ");
            System.out.println("Enter new medical condition: ");
            System.out.println("====PATIENT UPDATED====");  
        }
        
        private static void deletePatient(){
            System.out.println("Enter Patient ID to delete: ");
            String ID=input.nextLine();
            Patient p=findPatientByID(ID);
            if(p!=null){
                String bed=((Inpatient)p).getBedNumber();
                if(!bed.equals("Not Allocated"))releaseBedByNumber(bed);
                 patients.remove(p);
            System.out.println("Patient deleted.");
        } else System.out.println("Patient not found.");
   
    } 
        private static void displayAllPatients(){
            if(patients.isEmpty()){
                System.out.println("No patients registered,");
                return;
            } 
        }
        private static void allocatedBed(){
            System.out.println("Enter Inpatient ID: ");
            System.out.println("Patient already has a bed.");
            return;
        }
        private static boolean allocatedBedToPatient(String bedNumber,String patientID){
            for(int i=0; i<4; i++){
                for(int j=0; j<5; j++){
                  if(beds[i][j].startsWith(bedNumber)&& beds[i][j].endsWith("Available")){
                      beds[i][j]=bedNumber + "occupied by"+patientID;
                      return true;
                  }
                }
            }
            return false;
        }
        private static void releaseBed(){
            System.out.println("Enter Bed number to release: ");
            String bedNumber=input.nextLine().toUpperCase();
            if(releaseBedByNumber(bedNumber))
                System.out.println("Bed released.");
            else 
                System.out.println("Bed not found or already available");
        }
        private static boolean releaseBedByNumber(String bedNumber){
         for(int i=0; i<4; i++){
             for(int j=0; j<5; j++){
              if(beds[i][j].startsWith(bedNumber)& beds[i][j].contains("Occupied")){
                  beds[i][j]=bedNumber+"Available";
              }  
            }
             return true;
        }   
         return false;
    }
        private static void displayAvailableBed(){
            System.out.println("Available beds: ");
            for(String[] row:beds){
                for(String bed:row){
                    if(bed.endsWith("Available"))
                        System.out.println(bed.split(":")[0]+" ");
                }
            }
            System.out.println();
        }
        private static void displayOccupiedBeds(){
            System.out.println("Occupied beds: ");
            boolean found=false;
            for(String[]row:beds){
                for(String bed:row){
                    if(bed.contains("Occupied")){
                        System.out.println(bed.replace(":", "-"));
                        found true;
                    }
                }
            }
            if(!found)System.out.println("No beds occupied");
        }
        private static ArrayList<String>getAvailableBeds(){
            for(String[]row:beds){
                for(String bed:row){
                    if(bed.endsWith("Available"))available.add(bed);
                }
            }
            return available;
        }
                
                
     private static void displayMenu(){
         System.out.println("====Medicare Hospital System====");
         System.out.println("1.Register Patient");
         System.out.println("2.Search Patient");
         System.out.println("3.Update Patient");
         System.out.println("4.Delete Patient");
         System.out.println("5.Display all patients");
         System.out.println("6.Allocate beds");
         System.out.println("7.Release beds");
         System.out.println("8.Display ward layout");
         System.out.println("9.Display available beds");
         System.out.println("10.Display occupied beds");
         System.out.println("11.Generate reports");
         System.out.println("0.Exit");
         System.out.println("Please enter choice: ");
         
     }
     private static void generateReports(){
         System.out.println("===REPORTS===");
         System.out.println("Total Patients");
         System.out.println("Occupied Beds");
         System.out.println("Available Beds");
         System.out.println("Ward Occupancy");
     }
    
}
