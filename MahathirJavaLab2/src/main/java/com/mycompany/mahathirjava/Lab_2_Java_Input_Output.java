/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mahathirjava;
import java.util.Scanner;

/**
 *
 * @author mahat
 */
public class Lab_2_Java_Input_Output {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // String input for Name
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Name: " + name);

        // Double input for ID
        System.out.println("Enter ID (double): ");
        double id = sc.nextDouble();
        System.out.println("ID: " + id);

        // Float input for CGPA
        System.out.println("Enter CGPA (float): ");
        float cgpa = sc.nextFloat();
        System.out.println("CGPA: " + cgpa);

        // Boolean input for Passed
        System.out.println("Enter Passed (true/false): ");
        boolean passed = sc.nextBoolean();
        System.out.println("Passed: " + passed);

        sc.close();



//        System.out.println("Enter number : 2");
//        int b = sc.nextInt();
//        System.out.println("Enter the  a number :");
//        Float a = sc.nextFloat();
//        System.out.println("Enter the b number : " );
//        Float b = sc.nextFloat();
//        Float result = 2*(a+b);
//        
//        System.out.println("Print the result decimal uncontrol : "+result );
//        System.out.printf("Print the result decimal control : %.3f" ,result );
        
//        if(a%2==0){
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("ODD");
//        }
//        if(a>b){
//            System.out.println("A greater than B");
//        }
//        else{
//            System.out.println("B greater than A"); }

//         if(a%4==0 && a%100!=0 || a%400==0){
//             System.out.println("Leap Year"); }
//         else {
//             System.out.println("Not Leap Year"); }
   }
}
