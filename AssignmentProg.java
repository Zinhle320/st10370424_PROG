/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignmentprog;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class AssignmentProg {
    
  public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
          
        System.out.println("Enter PatientID: ");
        String patientID=input.nextLine();
        System.out.println("Enter Patient's name: ");
        String name=input.nextLine();
         System.out.println("Enter Patient's surname: ");
        String surname=input.nextLine();
         System.out.println("Enter Patient's age: ");
        int age=input.nextInt();
         System.out.println("Enter Patient's gender: ");
        String gender=input.nextLine();
         System.out.println("Enter Patient's Medical Condition: ");
        String medicalCondition=input.nextLine();
         System.out.println("Enter Patient's Category: ");
        String patientCategory=input.nextLine();
      }
 
}
